package cucumbermap;

import java.util.Hashtable;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.HTMLReportGenerator;
import methods.SeleniumOperations;

public class ManageAddress {
	
	
	@Given("user click on manage addresses")
	public void user_click_on_manage_addresses() throws InterruptedException {
		Thread.sleep(5000);
		Object[] input9=new Object[1];
		input9[0]="//*[text()='Manage Addresses']";
		Hashtable<String, Object> output9= SeleniumOperations.clickMethod(input9);
		HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(), "user click on manage addresses", output9.get("MESSAGE").toString());
	}
	
	@Given("user click on Add a New Address")
	public void user_click_on_add_a_new_address() {
		Object[] input10=new Object[1];
		input10[0]="//*[text()=\"ADD A NEW ADDRESS\"]";
		Hashtable<String, Object> output10= SeleniumOperations.clickMethod(input10);
		HTMLReportGenerator.StepDetails(output10.get("STATUS").toString(), "user click on Add a New Address", output10.get("MESSAGE").toString());
		
	}

	@When ("^user enter (.*) as name$")
	public void user_enter_name_as(String text) {
		Object[] input11=new Object[2];
		input11[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
		input11[1]= text;
		Hashtable<String, Object> output11= SeleniumOperations.sendText(input11);
		HTMLReportGenerator.StepDetails(output11.get("STATUS").toString(), "^user enter (.*) as name$", output11.get("MESSAGE").toString());
	}
	
	@When ("^user enter (.*) as MobNumber$")
	public void user_enter_mobile_number_as(String text) {
		Object[] input12=new Object[2];
		input12[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
		input12[1]=text;
		Hashtable<String, Object> output12= SeleniumOperations.sendText(input12);
		HTMLReportGenerator.StepDetails(output12.get("STATUS").toString(), "^user enter (.*) as MobNumber$", output12.get("MESSAGE").toString());
	}

	@When ("^user enter (.*) as Pincode$")
	public void user_enter_pincode_as(String text) {
		Object[] input13=new Object[2];
		input13[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
		input13[1]=text;
		Hashtable<String, Object> output13= SeleniumOperations.sendText(input13);
		HTMLReportGenerator.StepDetails(output13.get("STATUS").toString(), "^user enter (.*) as Pincode$", output13.get("MESSAGE").toString());
		
	}

	@When ("^user enter (.*) as Locality$")
	public void user_enter_locality_as(String text) {
		Object[] input14=new Object[2];
		input14[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
		input14[1]=text;
		Hashtable<String, Object> output14= SeleniumOperations.sendText(input14);
		HTMLReportGenerator.StepDetails(output14.get("STATUS").toString(), "^user enter (.*) as Locality$", output14.get("MESSAGE").toString());
	}
	
	@When ("^user enter (.*) as Address$")
	public void user_enter_address_as(String text) {
		Object[] input15=new Object[2];
		input15[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
		input15[1]=text;
		Hashtable<String, Object> output15= SeleniumOperations.sendText(input15);
		HTMLReportGenerator.StepDetails(output15.get("STATUS").toString(), "^user enter (.*) as Address$", output15.get("MESSAGE").toString());
	}

	@When("user select address type as Home")
	public void user_select_address_type_as_home() throws InterruptedException {
		Thread.sleep(2000);
		Object[] input16=new Object[1];
		input16[0]="//*[text()='Home']";
		Hashtable<String, Object> output16= SeleniumOperations.clickMethod(input16);
		HTMLReportGenerator.StepDetails(output16.get("STATUS").toString(), "user select address type as Home", output16.get("MESSAGE").toString());
	}

	
	@When("user click on save")
	public void user_click_on_save() {
		Object[] input17=new Object[1];
		input17[0]="//*[text()='Save']";
		Hashtable<String, Object> output17= SeleniumOperations.clickMethod(input17);
		HTMLReportGenerator.StepDetails(output17.get("STATUS").toString(), "user click on save", output17.get("MESSAGE").toString());
	}
	
	@Then("validate for address")
	public void validate_for_address() {
		Object[] input18=new Object[2];
		input18[0]="A/P Chetna colony,Ahmednagar, Chetna colony, Ahmadnagar,";
		input18[1]="//*[@class='_2adSi5 WlNme0']";
		Hashtable<String, Object> output18= SeleniumOperations.validationForAddress(input18);
		HTMLReportGenerator.StepDetails(output18.get("STATUS").toString(), "validate for address", output18.get("MESSAGE").toString());
	}

}
