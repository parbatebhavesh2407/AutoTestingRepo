package practiceSelenium;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.intuit.karate.FileUtils;

public class NewWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		
		WebElement name = driver.findElement(By.xpath("//input[@name='name']"));
		// get screenshot of particular element
		File filename = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copy(filename, new File("ss.png"));

		//getHeight and width of element
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

		// open new window
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> id = driver.getWindowHandles();
		Iterator<String> it = id.iterator();
		String parentwindow = it.next(); // will find 0th Index
		String childwindow = it.next();

		driver.switchTo().window(childwindow);
		driver.get("https://rahulshettyacademy.com/");

	}

	private static void getScreenshotAs(OutputType<File> file) {
		// TODO Auto-generated method stub

	}

}
