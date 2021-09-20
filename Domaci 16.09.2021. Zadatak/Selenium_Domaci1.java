package SeleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Domaci zadatak:
Napisati program koji ucitava https://practicetestautomation.com/ stranicu,
 klikne na "Practice" i klikne na "Test login page", 
 popunjava username i password (student/Password123), 
 loguje se na stranicu klikom na dugme Submit i zatim se odjavljuje klikom na dugme Logout.
  Na kraju zatvoriti program.

Koristite sto manje xpath mozete, pre unosa u polje odradite akciju clear i
 kreirajte web elemente za svaki element koji trazite.
 */

public class Selenium_Domaci1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.navigate().to(" https://practicetestautomation.com/");

		WebElement practice = driver.findElement(By.id("menu-item-20"));
		practice.click();

		WebElement testLoginPage = driver
				.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div[1]/div[1]/p/a"));
		testLoginPage.click();

		WebElement username = driver.findElement(By.id("username"));
		username.clear();
		username.sendKeys("student");

		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Password123");

		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();

		WebElement logout = driver.findElement(By.cssSelector(
				".wp-block-button__link.has-text-color.has-background.has-very-dark-gray-background-color"));
		logout.click();

		driver.close();
	}

}
