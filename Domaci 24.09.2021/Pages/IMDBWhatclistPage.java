package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDBWhatclistPage {

	WebDriver driver;
	WebElement emptyList;
	WebElement createANewList;

	public IMDBWhatclistPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getEmptyList() {
		return driver.findElement(By.className("empty-watchlist-text"));
	}

	public WebElement getCreateANewList() {
		return driver.findElement(By.cssSelector(".position_bottom.supplemental"));
	}

	public void isListEmpty() {
        this.getEmptyList().getText();
        System.out.println(this.getEmptyList().getText());
	}

	public void createANewList() {
		this.getCreateANewList().click();
	}

}
