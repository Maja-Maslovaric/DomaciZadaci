package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDBHomePage {

	WebDriver driver;

	WebElement watchlistButton;

	public IMDBHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getWatchlistButton() {
		return driver
				.findElement(By.cssSelector(".ipc-icon.ipc-icon--watchlist.ipc-button__icon.ipc-button__icon--pre"));
	}

	public void watchlistButton() {

		this.getWatchlistButton().click();
	}

}
