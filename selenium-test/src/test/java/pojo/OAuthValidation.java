package pojo;

import io.restassured.RestAssured;

//import io.restassured.RestAssured;
//import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;

public class OAuthValidation {
	
	private static GETCourse gCourse;

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://rahulshettyacademy.com/";

		String Response = RestAssured.given()
				.formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
				.formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
				.formParam("grant_type", "client_credentials")
				.formParam("scope", "trust").when().log().all()
				.post("oauthapi/oauth2/resourceOwner/token").asString();
		System.out.println(Response);

		JsonPath js = new JsonPath(Response);
		String accessToken1 = js.getString("access_token");
		System.out.println(accessToken1);
		
		
		GETCourse getc =  (GETCourse) RestAssured.given().queryParams("access_token", accessToken1)
				.when().log().all()
				.get("https://rahulshettyacademy.com/oauthapi/getCourseDetails").as(GETCourse.class);
				System.out.println(getc.getInstructor());;
				System.out.println(getc.getLinkedIn());
	
				getc.getCourses().getApi().
	}
}
