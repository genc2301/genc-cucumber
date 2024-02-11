package cogni.genc.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cogni.genc.CommomMethods.CommonHelperActions;

public class LoginPage {
	
	private WebDriver driver;
	
	public static final By txtEmail = By.xpath(".//input[@name='email']");
	public static final By txtPassword = By.id("input-password");
	public static final By btnLogin = By.xpath(".//input[@type='submit']");
	public static final By lnkFrgtnPwd = By.xpath("(.//a[text()='Forgotten Password'])[1]");
	public static final By lnkChkLogut = By.xpath(".//div[@class='list-group']//child::a[text()='Logout']");
	public static final By txtWarning = By.xpath(".//div[@class='alert alert-danger alert-dismissible']");
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Page Method/Actions
	public void enterEmail(String email) {
		CommonHelperActions.sendKeys(driver,txtEmail,email);
	}
	
	public void enterPassword(String password) {
		CommonHelperActions.sendKeys(driver,txtPassword,password);
	}
	
	public void clickLoginButton() throws InterruptedException {
		CommonHelperActions.click(driver, btnLogin);
	}
	
	public void clickForgottenPassword() {
		driver.findElement(lnkFrgtnPwd).click();	
	}
	
	public boolean checkForgotPasswordLink() {
		return driver.findElement(lnkFrgtnPwd).isDisplayed();
	}
	
	public boolean checkLogoutLink() {
		return CommonHelperActions.isDisplayed(driver, lnkChkLogut);
	}
	
	public void login(String email , String password) throws InterruptedException {
		enterEmail(email);
		enterPassword(password);
		clickLoginButton();
	}
}

