package practiceAutomatioTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyAllProductsAndProductDetailPage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.findElement(By.partialLinkText("Products")).click();

		// Verify user is navigated to ALL PRODUCTS page successfully
		WebElement allProducts = driver.findElement(By.xpath("//h2[text() = 'All Products']"));
		if (allProducts.isDisplayed()) {
			System.out.println("PASS: Navigated to All Products page");
		} else {
			System.out.println("FAIL: All Products page not displayed");
		}

		// Verify the products list is visible
		WebElement productList = driver.findElement(By.xpath("//h2[text() = 'Brands']"));
		if (productList.isDisplayed()) {
			System.out.println("PASS: Products list is visible");
		} else {
			System.out.println("FAIL: Products list is not visible");
		}

		Actions act = new Actions(driver);
		WebElement scroll = driver.findElement(By.xpath("//a[text() = 'Biba']"));
		act.scrollToElement(scroll).pause(2000).perform();

		driver.findElement(By.xpath("//p[text()='Blue Top']/../../..//a[text()='View Product']")).click();

		WebElement productName = driver.findElement(By.xpath("//h2[text() = 'Blue Top']"));
		if (productName.isDisplayed()) {
			System.out.println("Product Name is Correct");
		} else {
			System.out.println("Product Name is Incorrect");
		}

		WebElement category = driver.findElement(By.xpath("//p[text() = 'Category: Women > Tops']"));
		if (category.isDisplayed()) {
			System.out.println("Product Category is Correct");
		} else {
			System.out.println("Product Category is Incorrect");
		}

		WebElement price = driver.findElement(By.xpath("//span[text() = 'Rs. 600']"));
		if (price.isDisplayed()) {
			System.out.println("Product price is Correct");
		} else {
			System.out.println("Product price is Incorrect");
		}

	}

}
