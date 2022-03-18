package methods;


import java.util.Hashtable;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumOperations {
	public static WebDriver driver=null;

	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	public static Hashtable<String,Object> browserLaunch(Object[] inputParameters)
	{
		try 
		{
		String browserName=(String) inputParameters[0];
		String exe=(String) inputParameters[1];
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",exe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",exe);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data : " + inputParameters[1].toString());
		
		}
		
		catch (Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data : " + inputParameters[1].toString());
		}
		return outputParameters;

		
	}
	
	public static Hashtable<String,Object> openApplication(Object[] inputParameters)
	{
		try 
		{ 
		String url=(String) inputParameters[0];
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:openApplication, Input_Data : " + inputParameters[0].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:openApplication, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;

		
	}
	
	public static Hashtable<String,Object> clickMethod(Object[] inputParameters)
	{
		try 
		{
		String xpath=(String) inputParameters[0];
		driver.findElement(By.xpath(xpath)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:clickMethod, Input_Data : " + inputParameters[0].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:clickMethod, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;

		
	} 
	
	public static Hashtable<String,Object> mouseHover(Object[] inputParameters)
	{
		try 
		{ 
		String xpath=(String) inputParameters[0];
		Actions act=new Actions(driver);
		WebElement trg=driver.findElement(By.xpath(xpath));
		act.moveToElement(trg).build().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:mouseHover, Input_Data : " + inputParameters[0].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:mouseHover, Input_Data : " + inputParameters[0].toString());
		}
		return outputParameters;

		
	} 
		
	
	
	public static Hashtable<String,Object> sendText(Object[] inputParameters)
	{
		try 
		{
		String xpath=(String) inputParameters[0];
		String text=(String) inputParameters[1];
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:sendText, Input_Data : " + inputParameters[1].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:sendText, Input_Data : " + inputParameters[1].toString());
		}
		return outputParameters;

	
	}
		
	
	
	public static Hashtable<String,Object> validationForLogin(Object[] inputParameters)
	{
		try 
		{
		String givenText=(String) inputParameters[0];
		String xpath=(String) inputParameters[1];
		
		String actualText=driver.findElement(By.xpath(xpath)).getText();
		
		if(givenText.equalsIgnoreCase(actualText))
		{
			System.out.println("Test case Has Been Passed");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else
		{
			System.out.println("Test case Has Been Failed");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "methodUsed:validationForLogin, Input_Data : " + inputParameters[0].toString());
		}
		catch (Exception e)
		{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "methodUsed:validationForLogin, Input_Data : " + inputParameters[0].toString());
		}	
		return outputParameters;

	}
	
	public static void main(String[] args) throws InterruptedException
	{
		//Launch Browser
		Object[] input=new Object[2];
		input[0]="chrome";
		input[1]="D:\\Software Testing\\Selenium Real Flipkart Project\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe";
		SeleniumOperations.browserLaunch(input);
		
		//open application
		Object[] input1=new Object[1];
		input1[0]="http://www.flipkart.com";
		SeleniumOperations.openApplication(input1);
		
		//close initial window
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		SeleniumOperations.clickMethod(input2);
		
		//mouse hover on Login
		Object[] input3=new Object[1];
		input3[0]="//*[text()='Login']";
		SeleniumOperations.mouseHover(input3);
		
		//click on MyProfile
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		SeleniumOperations.clickMethod(input4);
		
		//enter MobileNumber
		Object[] input5=new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]="7276836672";
		SeleniumOperations.sendText(input5);
		
		//enter password
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1]="7276836675@123";
		SeleniumOperations.sendText(input6);
	
		
		//click on Login
		Object[] input7=new Object[1];
		input7[0]="(//*[text()='Login'])[3]";
		SeleniumOperations.clickMethod(input7);
		
		//validation for login
		Object[] input8=new Object[2];
		input8[0]="Ravi Bhalerao";
		input8[1]="//*[text()='Ravi Bhalerao']";
		SeleniumOperations.validationForLogin(input8);
		
	    Thread.sleep(5000);
	    driver.quit();
		
	    
	}

}
