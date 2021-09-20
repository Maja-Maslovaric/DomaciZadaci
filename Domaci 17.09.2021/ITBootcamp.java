package SeleniumOsnove;
/*
Neobavezni domaci (ko resi, okacite na drive):

Pomocu jave i seleniuma
Otvoriti novi prozor u pretrazivacu i otici na stranicu  IT Bootcamp-a
Primeniti metode- get URL i Title, navigate - refresh, to, back, forward
U kodu treba da se prozor maksimizuje, a pre zatvaranja drajvera vrati na prvobitnu velicinu (hint: koristite smernice okruzenja, ako to ne pomaze, guglajte =) )
Dokazati da li prilikom koriscenja reci “testiranje” u search-u (i trazanja jelte) dobijamo rezultat shodno trazenom tako sto cete napraviti screenshot stranice. nakon pretrage.
Proveriti da li bilo koje dugme (proizvoljno) radi i odvodi vas na zeljenu stranicu.
*/

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ITBootcamp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url = "https://google.com";
		driver.get(url);

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("itbootcamp.rs");
		searchBox.sendKeys(Keys.ENTER);

		WebElement itbootcamp = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3"));
		itbootcamp.click();
		driver.getTitle();
		System.out.println("Naslov stranice je " + driver.getTitle());

		WebElement vesti = driver.findElement(By.className("dropdown-toggle"));
		vesti.click();

		WebDriverWait wdwait = new WebDriverWait(driver, 25);
		wdwait.until(ExpectedConditions.elementToBeClickable(By.className("dropdown-toggle")));

		WebElement dostupnoZnanje = driver.findElement(By.xpath("//*[@id=\"menu-item-5376\"]/a"));
		dostupnoZnanje.click();

		driver.navigate().back();

		WebElement kursevi = driver.findElement(By.xpath("//*[@id=\"menu-item-5362\"]/a"));
		kursevi.click();

		WebElement testiranjeSoftvera = driver.findElement(By.xpath("//*[@id=\"menu-item-5363\"]/a"));

		testiranjeSoftvera.click();
		driver.navigate().back();

		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();

		// Provera za search

		WebElement search = driver.findElement(By.className("open-search"));
		search.click();

		WebElement searchBox1 = driver.findElement(By.className("form-control"));
		wdwait.until(ExpectedConditions.elementToBeClickable(By.className("form-control")));
		searchBox1.sendKeys("testiranje");
		searchBox1.sendKeys(Keys.ENTER);

		// proveri da li bilo koje proizvoljno dugme radi i vodi na zeljenu stranicu
		// proveravam da li me logo vodi na naslovnu stranu
		WebElement IT_Bootcamp = driver.findElement(By.className("custom-logo"));
		wdwait.until(ExpectedConditions.elementToBeClickable(By.className("custom-logo")));
		IT_Bootcamp.click();

		// minimizuj prozor
		driver.manage().window().setPosition(new Point(0, -1000));

		// zatvori drajver
		driver.close();
	}
}