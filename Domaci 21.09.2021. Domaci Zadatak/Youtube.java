package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * DOMACI:
Pomocu jave i selenijuma
1) otici na sajt youtube
2) u search-u pronaci Rick Astley i pustiti pesmu Never gonna give you up
// voditi racuna da ako postoje reklame da ih preskocite
3) Nakon sto je pustena pesma, iz liste sa desne strane (watch next) pustiti drugi predlozen video
 */
public class Youtube {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.youtube.com");
		driver.manage().window().maximize();
		WebDriverWait wdwait = new WebDriverWait(driver, 10);

		wdwait.until(ExpectedConditions.elementToBeClickable(By.name("search_query")));
		WebElement searchField = driver.findElement(By.name("search_query"));
		searchField.sendKeys("Rick Astley");

		wdwait.until(ExpectedConditions.elementToBeClickable(By.id("search-icon-legacy")));
		WebElement searchButton = driver.findElement(By.id("search-icon-legacy"));
		searchButton.click();

		wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]")));
		WebElement playSong = driver.findElement(By.xpath(
				"/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[2]/ytd-item-section-renderer/div[3]/ytd-video-renderer[1]/div[1]"));
		playSong.click();
		
		wdwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"items\"]/ytd-compact-video-renderer[2]")));
		WebElement nextSong = driver.findElement(By.xpath("//*[@id=\"items\"]/ytd-compact-video-renderer[2]"));
		nextSong.click();
		
		
		//wdwait.until(ExpectedConditions.elementToBeClickable(By.className("ytp-ad-skip-button-icon")));
		Thread.sleep(10000); // ovde sam stavila thread_sleep jer nije htelo da radi sa wdwait-om
		WebElement skip = driver.findElement(By.className("ytp-ad-skip-button-icon"));
		skip.click();
		
		
		wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".style-scope.ytd-mealbar-promo-renderer.style-text.size-default")));
		WebElement dismiss = driver.findElement(By.cssSelector(".style-scope.ytd-mealbar-promo-renderer.style-text.size-default"));
		dismiss.click();

		
		//driver.close();
		
	}

}
