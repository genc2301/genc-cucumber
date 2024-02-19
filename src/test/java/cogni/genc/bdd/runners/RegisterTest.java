package cogni.genc.bdd.runners;
	
	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
//	import io.cucumber.testng.AbstractTestNGCucumberTests;
//	import io.cucumber.junit.CucumberOptions;
//	import org.testng.annotations.DataProvider;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features={"src/test/resources/cogni/genc/bdd/features"},
			glue= {"com.cogni.bdd.stepDefinition","cogni.genc.bdd.global"},
			plugin = {"pretty",
							"html:target/cucumber-reports",
							"json:target/cucumber.json",
							},
			tags = "@datatable",
			monochrome = true,  /* True -Console output for the Cucumber test are much more readable.False- Console output is not as readable as it should be.*/
//			dryRun=true  /*True- Cucumber will only check that every Step mentioned in the Feature File has corresponding code written in Step Definition file or not*/
			publish = true
			)

	public class RegisterTest {
	
			
		}
	



