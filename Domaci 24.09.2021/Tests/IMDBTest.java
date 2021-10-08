package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.IMDBBase;

public class IMDBTest extends IMDBBase {

//	@BeforeMethod
//	public void preMetode() {
//		driver.navigate().refresh();
//	}

	@Test(priority = 10)
	public void homepage() {
		imdbHomePage.getWatchlistButton().click();

	}

	@Test(priority = 20)
	public void signInWithIMDB() {
		imdbSignInPage.clickOnSignInWithImdb();
	}

	@Test(priority = 30)
	public void inputData() {

		imdbSign_In.insertEmail("qa905610@gmail.com");
		imdbSign_In.insertPassword("Sifraq12a");
		imdbSign_In.clickSignInButton();
	}

	@Test(priority = 40)
	public void watchlist() {
		imdbWhatchlist.isListEmpty();
		imdbWhatchlist.createANewList();
	}

	@Test(priority = 50)
	public void createNewList() {
		imdbCreateANewList.insertNameOfList("My Films");
		imdbCreateANewList.clickOnCreateButton();
	}

	@Test(priority = 60)
	public void addFilmAtList() throws InterruptedException {
		Thread.sleep(5000);
		imdbAddFilmAtList.insertFilmTitle("Escape room");
		Thread.sleep(2000);
		imdbAddFilmAtList.addTitle();
		Thread.sleep(2000);

		imdbAddFilmAtList.insertFilmTitle("Shrek");
		Thread.sleep(2000);
		imdbAddFilmAtList.addTitle();

		imdbAddFilmAtList.clickDoneButton();
		Thread.sleep(2000);
		imdbAddFilmAtList.clickCheckInToAddFilmOnWatchlist();
		imdbAddFilmAtList.clickCheckInToAddFilmOnWatchlist();

		driver.navigate().refresh();

		imdbAddFilmAtList.watchListNewStatus();

	}

	@Test(priority = 70)
	public void inputIncorrectDataForSignIn() {
		imdbSign_In.insertEmail("a");
		imdbSign_In.insertPassword("b");
		imdbSign_In.clickSignInButton();
	}

//	@AfterMethod
//	public void kraj() {
//		driver.close();
//	}
}
