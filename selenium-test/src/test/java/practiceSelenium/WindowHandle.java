package practiceSelenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> window = driver.getWindowHandles(); // [parentid , child id]

		Iterator<String> it = window.iterator();
		String parentID = it.next();
		String childID = it.next();

		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText());
		driver.close();
	}
}