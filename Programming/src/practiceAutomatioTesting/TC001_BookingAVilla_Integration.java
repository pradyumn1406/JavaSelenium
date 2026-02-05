package practiceAutomatioTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TC001_BookingAVilla_Integration {
	 public static void main(String[] args) {

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        driver.get("https://www.stayvista.com/");
	        driver.findElement(By.xpath("//span[text()='Our Brands']")).click();
	        
	        Actions act =new Actions(driver); 
	        act.moveByOffset(300,156).click().perform();
	        
	        driver.findElement(By.xpath("//button[text()='Explore The Collection']")).click();
	        
	        driver.findElement( By.xpath("//p[text()='Magnolia Villa']"));

//	        
//		    WebElement verifyVilla = driver.findElement(By.xpath("//h2[text() = 'Magnolia Villa']"));
//		    if (verifyVilla.isDisplayed()) {
//		    	System.out.println("Villa Is displayed ");
//			}else {
//				System.out.println("Villa is not displayed");
//			}
//	       
//	        driver.quit();

	    }

}
