package com.herokuapp.theinternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class NegativeTests {
	@Parameters({ "username", "password", "expectedMessage" })
	@Test(priority = 2, groups = { "NegativeTests", "smokeTest" })
	public void negativeLoginTest(String username, String password, String expectedMessage) throws InterruptedException {
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
		/*
		 * //String expMessage = "Your password is invalid!"; WebElement dispMessage =
		 * driver.findElement(By.xpath("//div[@class='flash error']")); String
		 * actMessage = dispMessage.getText();
		 * Assert.assertTrue(actMessage.contains(expectedMessage),
		 * "Actual error message does not contain expected error message. \nActual:" +
		 * actMessage + "\nExpected:" + expectedMessage);
		 */
		driver.close();
	}

	/*
	 * @Test(priority = 1,groups= {"NegativeTests"}) public void loginTest2() throws
	 * InterruptedException { WebDriver driver = new ChromeDriver();
	 * driver.get("https://the-internet.herokuapp.com/login");
	 * driver.manage().window().maximize();
	 * 
	 * // Enter user name WebElement element =
	 * driver.findElement(By.id("username")); element.sendKeys("incorrect");
	 * 
	 * // Enter password WebElement password =
	 * driver.findElement(By.name("password"));
	 * password.sendKeys("SuperSecretPassword!");
	 * 
	 * // click login button WebElement loginButton =
	 * driver.findElement(By.tagName("button")); loginButton.click();
	 * 
	 * String expMessage = "Your username is invalid!"; WebElement dispMessage =
	 * driver.findElement(By.xpath("//div[@class='flash error']")); String
	 * actMessage = dispMessage.getText();
	 * Assert.assertTrue(actMessage.contains(expMessage),
	 * "Actual error message does not contain expected error message. \nActual:" +
	 * actMessage + "\nExpected:" + expMessage); driver.close(); }
	 */
}