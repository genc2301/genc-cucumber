package cogni.genc.bdd.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cogni.genc.CommomMethods.CommonHelperActions;

public class RegisterPage {
	
private WebDriver driver;
	
	public static final By txtFname = By.xpath(".//input[@name='firstname']");
	public static final By txtLname = By.xpath(".//input[@name='lastname']");
	public static final By txtEmail = By.xpath(".//input[@name='email']");
	public static final By txtPhone = By.xpath(".//input[@name='telephone']");
	public static final By btnContinue = By.xpath(".//a[text()='Continue']");
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Page Method/Actions
	public void clickContinue() throws InterruptedException {
		CommonHelperActions.click(driver, btnContinue);
	}
	
	
	public void enterFname(String email) {
		CommonHelperActions.sendKeys(driver,txtFname,email);
	}
	
	public void enterLName(String email) {
		CommonHelperActions.sendKeys(driver,txtLname,email);
	}
	
	public void enterEmail(String email) {
		CommonHelperActions.sendKeys(driver,txtEmail,email);
	}
	public void enterPhone(String email) {
		CommonHelperActions.sendKeys(driver,txtPhone,email);
	}

}
