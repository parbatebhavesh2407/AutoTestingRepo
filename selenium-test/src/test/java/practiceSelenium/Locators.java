package practiceSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("Bhavesh");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy2");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahulb@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("3322112233");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("rahulbpoi@gmail.com");
		// driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		Thread.sleep(3333);
		driver.findElement(By.xpath("//button[contains(@class,'to')]")).click();
		Thread.sleep(3333);
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@name='inputPassword']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
