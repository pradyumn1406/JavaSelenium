package practiceAutomatioTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUsForm {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		driver.findElement(By.partialLinkText("Contact us")).click();
		driver.findElement(By.xpath("//input[@data-qa=\"name\"]")).sendKeys("Pradyumn", Keys.TAB , "paddy.14.rudra@gmail.com" , Keys.TAB, "Na", Keys.TAB, "NA");
		driver.findElement(By.xpath("//input[@value ='Submit']")).click();
		
	}
}