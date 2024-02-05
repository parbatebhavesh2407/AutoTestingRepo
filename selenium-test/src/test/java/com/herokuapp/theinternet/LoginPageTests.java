package com.herokuapp.theinternet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test(priority = 2, groups = { "Positive", "smokeTest" })
public class LoginPageTests {
	private WebDriver driver;
	
	@BeforeMethod
	private void setup()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();
	}

	public void loginTest() throws InterruptedException {


		// Verification actual and expected url
		String expectedUrl = "https://the-internet.herokuapp.com/login";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl, "Actual page url is not as Expected");

		// Enter user name
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("tomsmith");

		// Enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("SuperSecretPassword!");

		// click login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();

		// Verify Success Message is displayed
		WebElement successMsg = driver.findElement(By.xpath("//div[@class='flash success']"));
		Assert.assertTrue(successMsg.isDisplayed(), "Success Message Displayed Successfully");
		String expMessage = "You logged into a secure area!";
		String actMessage = successMsg.getText();
		// Assert.assertEquals(actMessage, expMessage);
		Assert.assertTrue(actMessage.contains(expMessage),
				"Actual message does not contain expected message.\nactMessage:  " + actMessage + "\nExpected Message: "
						+ expMessage);

		// click logout button
		WebElement ele = createWebElement(driver, "//a[@class='button secondary radius']");

		// WebElement logout = driver.findElement(By.xpath("//a[@class='button secondary
		// radius']"));
		Assert.assertTrue(ele.isDisplayed(), "Logout Button is not visible");

		ele.click();

		// Verification if Logout button is True
		// ele.click();
		// close driver
		driver.close();
	}

	@Test
	public class NegativeTests {
		@Parameters({ "username", "password", "expectedMessage" })
		@Test(priority = 2, groups = { "NegativeTests", "smokeTest" })
		public void negativeLoginTest(String username, String password, String expectedMessage)
				throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/login");
			driver.manage().window().maximize();

			// Enter user name
			WebElement element = driver.findElement(By.id("username"));
			element.sendKeys(username);

			// Enter password
			WebElement passwordElement = driver.findElement(By.name("password"));
			passwordElement.sendKeys(password);

			// click login button
			WebElement loginButton = driver.findElement(By.tagName("button"));
			loginButton.click();
		}
	}

	public static WebElement createWebElement(WebDriver driver, String xPathValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xPathValue)));
		return ele;
	}
}
