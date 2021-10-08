package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Pages.IMDBAddFilmAtList;
import Pages.IMDBCreateANewList;
import Pages.IMDBHomePage;
import Pages.IMDBSignInPage;
import Pages.IMDBSign_In;
import Pages.IMDBWhatclistPage;


public class IMDBBase {
	
	public WebDriver driver;
	public IMDBHomePage imdbHomePage;
	public IMDBSignInPage imdbSignInPage;
	public IMDBSign_In imdbSign_In;
	public IMDBWhatclistPage imdbWhatchlist;
	public IMDBCreateANewList imdbCreateANewList;
	public IMDBAddFilmAtList imdbAddFilmAtList;

	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.imdb.com/");
		imdbHomePage = new IMDBHomePage(driver);
		imdbSignInPage = new IMDBSignInPage(driver);
		imdbSign_In = new IMDBSign_In(driver);
		imdbWhatchlist = new IMDBWhatclistPage(driver);
		imdbCreateANewList = new IMDBCreateANewList(driver);
		imdbAddFilmAtList = new IMDBAddFilmAtList(driver);
	}
	
//	@AfterClass
//	public void TearDown() {
//	driver.close();	
//}
}

