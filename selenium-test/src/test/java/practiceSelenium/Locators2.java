package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Bhavesh");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(4000);
		String actualMessage = driver.findElement(By.tagName("p")).getText();
		System.out.println(actualMessage);
		Assert.assertEquals(actualMessage, "You are successfully logged in.");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();
	}
}
