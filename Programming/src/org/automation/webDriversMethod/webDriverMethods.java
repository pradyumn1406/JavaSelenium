package org.automation.webDriversMethod;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethods {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	/*1. get(String url): void
	 driver.get("https://www.amazon.in/ref=nav_logo");
	
	 2. getTitle(): String 
	 driver.get("https://www.flipkart.com/");
	 String title = driver.getTitle();
	 System.out.println(title);
	 
	 3. getCurrentUrl():String
	 driver.get("https://www.amazon.in/ref=nav_logo");
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 
	 4.getPageSource(): String
	 driver.get("https://www.amazon.in/ref=nav_logo");
	 String ps =  driver.getPageSource();
	 System.out.println(ps);
	      
	 5. getWindowHandle(): String
	 driver.get("https://www.amazon.in/ref=nav_logo");
	 String wh = driver.getWindowHandle();
	 System.out.println(wh);
	 
    6. navigate : Navigation <<I>>
	        1.back(): void
	        2.forward(): void
	        3.refresh(): void
	        4.to(String url): void
	        5.to(Url url): void
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(2000);
	   driver.get("https://www.amazon.in/ref=nav_logo");
	   Navigation nav= driver.navigate();
	   nav.back();
	   Thread.sleep(2000);
	   nav.forward();
	   Thread.sleep(2000);
	   nav.refresh();
	   driver.navigate().to("https://in.bookmyshow.com/"); 
	   
	   7. manage(): Options<<I>> methods:
	   		1.window(): Window<<I>> -> manage windows
	   			-maximize(): void
	   			-fullscreen(): void
	   			-minimize(): void
	   			-getSize(): Dimension<<I>>
	   				-getHeight(): int
	   				-getWidth(): int
	   			-getSize(Dimension targetSize)
	   			-getPosition() : Point<<I>>
	   			-setPosition(Point targetPosition)
	   	       */
		//8. switchTo:TargetLocator<<I>>

	   
	   
	   
	   
	   
	   
}
}
