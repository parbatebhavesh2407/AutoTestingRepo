package practiceSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("first_date_picker")).click();
		Thread.sleep(2000);

		List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']//a"));
		//int count = driver.findElements(By.xpath("//td[@data-handler='selectDay']")).size();
System.out.print("enter into code");
		for (int i = 0; i < dates.size(); i++) {
			String text = dates.get(i).getText();
			if (text.equals("30")) {
				driver.findElements(By.xpath("//td[@data-handler='selectDay']")).get(i).click();
				break;
			}
		}
		System.out.println("---");
	}

}
