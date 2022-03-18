package cucumbermap;



import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import methods.HTMLReportGenerator;

public class Hookable {
	
	@Before
	public void before(Scenario scenario) throws UnknownHostException 
	{
		HTMLReportGenerator.TestSuiteStart("D:\\Software Testing\\Tution Videos etc\\Autoamtion Project\\9.Extend Report\\flipkart.html", "FlipkartProject");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		System.out.println("------------------------------Scenario starts----------------------------------");
	}
	
	
	@After
	public void after(Scenario scenario)
	{
		System.out.println("------------------------------Scenario ends----------------------------------");
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	}

}
