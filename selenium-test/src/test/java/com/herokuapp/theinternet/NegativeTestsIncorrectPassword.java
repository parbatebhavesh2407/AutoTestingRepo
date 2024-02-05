package com.herokuapp.theinternet;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class NegativeTestsIncorrectPassword {

	public void loginTest() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		driver.manage().window().maximize();

		// Enter user name
		WebElement element = driver.findElement(By.id("username"));
		element.sendKeys("tomsmith");

		// Enter password
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("incorrect!");

		// click login button
		WebElement loginButton = driver.findElement(By.tagName("button"));
		loginButton.click();

		String expMessage = "Your password is invalid!";
		WebElement dispMessage = driver.findElement(By.xpath("//div[@class='flash error']"));
		String actMessage = dispMessage.getText();
		Assert.assertTrue(actMessage.contains(expMessage),
				"Actual error message does not contain expected error message. \nActual:" + actMessage + "\nExpected:"
						+ expMessage);
		driver.close();
	}
}