package practiceSelenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElements(By.tagName("a")).size()); // to get link count on page

		// to get count of link in footer session (1st go into footer session and then
		// use it instead of driver)
		WebElement footerLinks = driver.findElement(By.id("gf-BIG")); // limiting WebDriver scope
		System.out.println(footerLinks.findElements(By.tagName("a")).size());

		// getting link from footer under specific columns

		WebElement colDriver = footerLinks.findElement(By.xpath("//table[@class='gf-t'] //ul"));
		System.out.println(colDriver.findElements(By.tagName("a")).size());

		// click on each link and check if windows are working

		for (int i = 1; i < colDriver.findElements(By.tagName("a")).size(); i++) {
			String clickonLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			colDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinks);
			Thread.sleep(5000);
		}
		// to get title of all open tabs
		Set<String> abc = driver.getWindowHandles();
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}
	}

}
