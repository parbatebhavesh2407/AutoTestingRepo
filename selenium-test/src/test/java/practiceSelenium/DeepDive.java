package practiceSelenium;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeepDive {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		int j = 3;
		// String[] productAdd = {"Beetroot - 1 Kg","Cucumber - 1 Kg","Brocolli - 1 Kg"};
		String[] productAdd = { "Beetroot", "Cucumber", "Brocolli" };
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List prod = Arrays.asList(productAdd);
			if (prod.contains(formattedName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action'] /button")).get(i).click();
				if (j == productAdd.length) {
					break;
				}
			}
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		//explicit wait
		//WebDriverWait w = new WebDriverWait(driver,5);
		//w.until(ExpectedConditions.visibilityOfElementLocated(null));
		
		System.out.println(driver.findElement(By.xpath("//span[@class='promoInfo']")).getText());
		System.out.println("----");
	}

}
