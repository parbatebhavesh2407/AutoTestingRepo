package testNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_HomeLoan {

	@AfterTest
	public void WebLoginHomeLoan() {
		System.out.println("I am after Test Annotation -  Home");
	}

	@BeforeTest
	public void runbeforeTest() {
		System.out.println("I am before test");
	}

	@Test(groups = { "smoke" })
	public void MobileLoginHomeLoan() {
		System.out.println("MobileLogin Home - Smoke Group");
	}

	@Test(groups = { "smoke" })
	public void LoginAPIHomeLoan() {
		System.out.println("LoginAPI Home - Smoke Group");
	}

	@AfterSuite
	public void bfsuite() {
		System.out.print("I am at End - AfterSuite");
	}
}
