package cucumbermap;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;

public class Login
{
	public static WebDriver driver;
	
	@Given("user open {string} browser with exe as {string}")
	public void user_open_browser_with_exe_as(String browserName, String exe) {
		Object[] input=new Object[2];
		input[0]=browserName;
		input[1]=exe;
		Hashtable<String, Object> output= SeleniumOperations.browserLaunch(input);
		
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "user open {string} browser with exe as {string}", output.get("MESSAGE").toString());
	}

	@Given("user open url as {string}")
	public void user_open_url_as(String url) {
		Object[] input1=new Object[1];
		input1[0]=url;
		Hashtable<String, Object> output1= SeleniumOperations.openApplication(input1);
		HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(), "user open url as {string}", output1.get("MESSAGE").toString());

	}

	@Given("user close initial window")
	public void user_close_initial_window() {
		Object[] input2=new Object[1];
		input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		Hashtable<String, Object> output2= SeleniumOperations.clickMethod(input2);
		HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(), "user close initial window", output2.get("MESSAGE").toString());

	}

	@Given("user mouse hover on Login")
	public void user_mouse_hover_on_login() {
		Object[] input3=new Object[1];
		input3[0]="//*[text()='Login']";
		Hashtable<String, Object> output3= SeleniumOperations.mouseHover(input3);
		HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(), "user mouse hover on Login", output3.get("MESSAGE").toString());
	}

	@Given("user click on My Profile")
	public void user_click_on_my_profile() throws InterruptedException {
		Object[] input4=new Object[1];
		input4[0]="(//*[@class='_3vhnxf'])[1]";
		Hashtable<String, Object> output4= SeleniumOperations.clickMethod(input4);
		HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(), "user click on My Profile", output4.get("MESSAGE").toString());

		Thread.sleep(2000);
	}
	
	@When("user enter {string} as Mobile Number")
	public void user_enter_as_mobile_number(String text) {
		Object[] input5=new Object[2];
		input5[0]="//*[@class='_2IX_2- VJZDxU']";
		input5[1]=text;
		Hashtable<String, Object> output5= SeleniumOperations.sendText(input5);
		HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(), "user enter {string} as Mobile Number", output5.get("MESSAGE").toString());

	}

	@When("user enter {string} as Password")
	public void user_enter_as_password(String text) {
		Object[] input6=new Object[2];
		input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
		input6[1]=text;
		Hashtable<String, Object> output6= SeleniumOperations.sendText(input6);
		HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(), "user enter {string} as Password", output6.get("MESSAGE").toString());

	}

	@When("user click on Login")
	public void user_click_on_login() {
		Object[] input7=new Object[1];
		input7[0]="(//*[text()='Login'])[3]";
		Hashtable<String, Object> output7= SeleniumOperations.clickMethod(input7);
		HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(), "user click on Login", output7.get("MESSAGE").toString());

	}
	
	@Then("application shows logged in successfully")
	public void application_shows_logged_in_successfully() throws InterruptedException {
		Thread.sleep(3000);
	    Object[] input8=new Object[2];
	    input8[0]="Ravi Bhalerao";
	    input8[1]="//*[text()='Ravi Bhalerao']";
	    Hashtable<String, Object> output8= SeleniumOperations.validationForLogin(input8);
		HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(), "application shows logged in successfully", output8.get("MESSAGE").toString());

	}
	
	
	
}