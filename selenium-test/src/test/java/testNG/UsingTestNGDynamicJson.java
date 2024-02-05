package testNG;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingTestNGDynamicJson {
	@Test(dataProvider = "BooksData")
	public void adBook(String isbn, String aisle) {
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().header("Content-Type", "application/json")
				.body(payload.addBook(isbn, aisle)) // adding value in payload dynamically
				.when().post("/Library/Addbook.php").then().log().all().assertThat().statusCode(200).extract()
				.response().asString();

		JsonPath js = ReUsableMethods.rawToJson(response);
		String id = js.get("ID");
		System.out.println("ID: " + id);
	}

	@DataProvider(name = "BooksData")
	public Object getData() {
		return new Object[][] { { "aaa", "1233" }, { "bbb", "54321" }, { "vvvv", "432134" } };
	}
}