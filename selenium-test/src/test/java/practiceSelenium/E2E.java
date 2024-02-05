package practiceSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='AMD']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[@value='GOI']) [2]")).click();
		Thread.sleep(500);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(500);
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(300);
		WebElement dp = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select option = new Select(dp);
		Thread.sleep(300);
		option.selectByIndex(2);
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		System.out.println("Booking Success");
	}
}
