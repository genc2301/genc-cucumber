package cogni.genc.bdd.global;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
	
	WebDriver driver;
	
// Runs before each scenario
	@Before
	public void setup() throws IOException {
		
		driver = BaseClass.launchBrowser();
			
	}
	
	// Run before each step of the scenario
	@BeforeStep
	public void beforeEachStep(Scenario sc) {
			System.out.println("*****Inside Before Each Step*****");
	}
	
	/* Must follow the specified signature only - beforeAll()
	 *  Doesnot works with other method signatures
	 */
	@BeforeAll
	public static void beforeFeatureStep() { 
		System.out.println("********** Scenario Execution Started***********");
	}
	
	@After
	public void tearDown() {
		if(driver!=null) {
			driver.quit();
		}
	}
	
	//Conditional Hooks-execution based on the tags of the scenario works only with Before and After Hooks
	@After("@smoke")
	public void afterLoginScenario() {
		System.out.println("Inside Conditional Hooks>>>>>>>>");
	}
	
	@AfterStep
	public void afterEachStep(Scenario sc) {
		if(sc.isFailed()) {
			System.out.println(sc.getName()+" scenario Failed");
			
			TakesScreenshot ts=(TakesScreenshot) driver;
        	byte[] screenshot=ts.getScreenshotAs(OutputType.BYTES);
        	sc.attach(screenshot, "image/png",sc.getName());
			
		}
		
	}
	
	/* Must follow the specified signature only - afterall()
	 *  Doesnot works with other method signatures
	 */
	@AfterAll
	public static void afterAll() { // 
		System.out.println("********** All Scenario Execution Completed***********");
	}
	
	
	
	
}
