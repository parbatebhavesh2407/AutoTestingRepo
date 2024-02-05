package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_CarLoan {

	@Parameters({ "URL", "API/Keys" })
	@Test
	public void testParameters(String url, String Key) {
		System.out.println("parameters :" + url);
		System.out.println("API Keys :" + Key);

	}

	@BeforeClass
	public void bfclass() {
		System.out.println("--- Before Classp---");
	}

	@Test
	public void WebLoginCarLoan() {
		System.out.println("Ddepends on bfclass method(Before Classp) - WebLogin Car");
	}

	@Test(dependsOnMethods = { "WebLoginCarLoan" })
	public void MobileLoginCarLoan() {
		System.out.println("MobileLogin Car");
	}

	@Test(enabled = false)
	public void LoginAPICarLoan() {
		System.out.println("LoginAPI Car");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("I will execute before every test");
	}

	@BeforeSuite
	public void bfsuite() {
		System.out.print("I am at 1st - BeforeSuite");
	}

	// passing Data from Data Provider
	@Test(dataProvider = "getData")
	public void dataPro(String username, String password) {

		// System.out.print("I am inside test data provider");
		System.out.println(username);
		System.out.println(password);

	}

	// Data Provider Example
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "firstUsername";
		data[0][1] = "password";

		data[1][0] = "secondUsername";
		data[1][1] = "password";

		data[2][0] = "thirdUsername";
		data[2][1] = "password";
		return data;
	}
}
