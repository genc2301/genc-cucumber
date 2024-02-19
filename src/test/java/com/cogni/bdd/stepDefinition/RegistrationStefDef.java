package com.cogni.bdd.stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import cogni.genc.bdd.global.BaseClass;
import cogni.genc.bdd.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import cogni.genc.bdd.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStefDef {
	
	WebDriver driver;
	private LoginPage loginPage;
	private RegisterPage register;
	

	@Given("I am on the register account page")
	public void i_am_on_the_register_account_page() throws InterruptedException {
		driver = BaseClass.getDriver();
		register = new RegisterPage(driver);
		register.clickContinue();
		
	}

	@When("I enter my personal details and continue")
	public void i_enter_my_personal_details_and_continue(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<Map<String, String>> userData = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> user : userData) {
            String fname = user.get("FName");
            String lname = user.get("LName");
            String email = user.get("Email");
            String phone = user.get("Telephone");
            // Process the details
            
            register.enterFname(fname);
            register.enterLName(lname);
            register.enterEmail(email);
            register.enterPhone(phone);
        }
		
		
	}

	@Then("new user account should get created")
	public void new_user_account_should_get_created() {
	    
		System.out.println("**** New User Account Created *****");
		
	}

	
}
