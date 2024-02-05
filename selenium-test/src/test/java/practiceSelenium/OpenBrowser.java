package practiceSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {

	public static void main(String[] args) {
		// Invoking a browser
		//System.setProperty("webdriver.chrome.driver", "Users/bhavesh.parbate/OneDrive - Happiest Minds Technologies Limited/Learn/Selenium/chromedriver.exe");
		//Chrome browser - use chrome driver
		//WebDriver driver = new ChromeDriver();
		
		//firefox browser - use gecko driver
		//WebDriver driver = new FirefoxDriver();
		
		//Edge Browser
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.getTitle();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
