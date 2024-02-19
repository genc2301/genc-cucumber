package com.cogni.bdd.stepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cogni.genc.bdd.global.BaseClass;
import cogni.genc.bdd.global.Hooks;
import cogni.genc.bdd.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	WebDriver driver;
	private LoginPage loginPage;
	
	@Given("I am on the OpenCart login page")
	public void i_am_on_the_open_cart_login_page() {
		driver = BaseClass.getDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    loginPage = new LoginPage(driver);
	}

	@Given("I have entered a vald username and password")
	public void i_have_entered_a_vald_username_and_password() {
	   loginPage.enterEmail("rohit123@gmail.com");
	   loginPage.enterPassword("rohit123");
	}

	@When("I click on login button")
	public void i_click_on_login_button() throws InterruptedException {
	   loginPage.clickLoginButton();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
	    Assert.assertEquals(loginPage.checkLogoutLink(), true);
	}

	@Given("I have entered invalid {string} and {string}")
	public void i_have_entered_invalid_and(String username, String password) {
	   loginPage.enterEmail(username);
	   loginPage.enterEmail(password);
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() throws InterruptedException {
	    
	   loginPage.clickLoginButton(); 
	}

	@When("I click on the {string} link")
	public void i_click_on_the_link(String string) {
	    
	}
	
	@Then("I should see an error message indicating {string}")
	public void i_should_see_an_error_message_indicating(String string) {
	  Assert.assertEquals(driver.findElement(By.xpath(".//div[@class='alert alert-danger alert-dismissible']")).isDisplayed(), true);  
	}

	@Then("I should be redirected to the password reset page")
	public void i_should_be_redirected_to_the_password_reset_page() {
	   
	}


}
