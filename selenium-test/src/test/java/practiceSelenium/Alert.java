package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys("Bhavesh");
		driver.findElement(By.id("alertbtn")).click();
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(1111);
		driver.switchTo().alert().accept();
		Thread.sleep(1111);
		// confirm alert
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText()); 
		 driver.switchTo().alert().dismiss();
	}

}