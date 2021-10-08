package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDBSignInPage {

	WebDriver driver;
	WebElement SignInWithImdb;
	
	public IMDBSignInPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getSignInWithImdb() {
		return driver.findElement(By.className("auth-provider-text"));
	}
	
	public void clickOnSignInWithImdb() {
		this.getSignInWithImdb().click();
	}
	
	
}
