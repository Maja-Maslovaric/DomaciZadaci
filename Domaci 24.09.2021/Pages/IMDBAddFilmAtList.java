package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IMDBAddFilmAtList {

	WebDriver driver;
	WebElement addFilmSearchField;
	WebElement addFilmSearchButton;
	WebElement done;
	WebElement checkAdd;
	WebElement watchlistNewStatus;
	public IMDBAddFilmAtList(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public WebElement getAddFilmSearchField() {
		return driver.findElement(By.cssSelector(".search-bar-input.ipl-input__input"));
	}
	
	public WebElement getAddFilmSearchButton() {
		return driver.findElement(By.id("add-to-list-search-results"));
	}
	public WebElement getDone() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/button"));
	}

	public WebElement getCheckAdd() {
		return driver.findElement(By.cssSelector(".wl-ribbon.poster.retina.not-inWL"));
	}
	
	public WebElement getWatchlistNewStatus() {
		return driver
				.findElement(By.cssSelector(".NavWatchlistButton-sc-1b65w5j-0.kaVyhF.imdb-header__watchlist-button"));
	}
	public void insertFilmTitle(String title) {
		this.getAddFilmSearchField().sendKeys(title);
	}
	
	public void addTitle() {
		this.getAddFilmSearchButton().click();
	}
	
	public void clickDoneButton() {
		this.getDone().click();
	}
	
	public void clickCheckInToAddFilmOnWatchlist() {
		this.getCheckAdd().click();
	}
	
	public void watchListNewStatus() {
		this.getWatchlistNewStatus().getText();
		System.out.println(this.getWatchlistNewStatus().getText());
	}
}
