package plainTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UnitTestCase {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\Selenium Real Flipkart Project\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");
		driver.findElementByXPath("//*[@class='_2KpZ6l _2doB4z']").click();
		
		//mouse hover on Login
		Actions act=new Actions(driver);
		WebElement trg=driver.findElement(By.xpath("//*[text()='Login']"));
		act.moveToElement(trg).build().perform();
		
		driver.findElementByXPath("(//*[@class='_3vhnxf'])[1]").click();
		
		driver.findElement(By.xpath("//*[@class='_2IX_2- VJZDxU']")).sendKeys("7276836672");
		driver.findElement(By.xpath("//*[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("7276836672@123");
		driver.findElement(By.xpath("(//*[text()='Login'])[3]")).click();
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
