package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		// assertFalse
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected();
		Thread.sleep(1000);
		// assertTrue
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		// count no of checkbox present
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		// assertEquals
		Assert.assertEquals(driver.findElement(By.xpath("//div[@class='paxinfo']")).getText(), "1 Adult");
	}
}
