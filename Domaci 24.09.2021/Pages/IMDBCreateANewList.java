package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDBCreateANewList {

	WebDriver driver;
	WebElement listTitle;
	WebElement createButton;
	public IMDBCreateANewList(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getListTitle() {
		return driver.findElement(By.id("list-create-name"));
	}
	public WebElement getCreateButton() {
		return driver.findElement(By.cssSelector(".btn-raised.btn-raised--primary.list-create-button"));
	}
	
	public void insertNameOfList(String nameOfList) {
		this.getListTitle().sendKeys(nameOfList);
	}
	
	public void clickOnCreateButton() {
		this.getCreateButton().click();
	}
}
