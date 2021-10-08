package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDBSign_In {

	WebDriver driver;
	WebElement emailField;
	WebElement passwordField;
	WebElement signInButton;

	public IMDBSign_In(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmailField() {
		return driver.findElement(By.id("ap_email"));
	}

	public WebElement getPasswordField() {
		return driver.findElement(By.id("ap_password"));
	}

	public WebElement getSignInButton() {
		return driver.findElement(By.id("signInSubmit"));
	}

	public void insertEmail(String data) {
		this.getEmailField().clear();
		this.getEmailField().sendKeys(data);
	}

	public void insertPassword(String pass) {
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(pass);
	}

	public void clickSignInButton() {
		this.getSignInButton().click();
	}

}
