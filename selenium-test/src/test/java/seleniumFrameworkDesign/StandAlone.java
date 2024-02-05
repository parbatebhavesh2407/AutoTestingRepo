package seleniumFrameworkDesign;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StandAlone {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/");

		// login using id and password
		driver.findElement(By.id("userEmail")).sendKeys("bhavesh@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Nvidia@2407");
		driver.findElement(By.id("login")).click();
		
		//get multiple prod
		List<WebElement> products = driver.findElements(By.cssSelector(".mb-3"));
		
		products.stream().filter(product-> product.findElement(By.xpath("//b[text()='ZARA COAT 3']")).getText().equalsIgnoreCase(""));

	}

}
