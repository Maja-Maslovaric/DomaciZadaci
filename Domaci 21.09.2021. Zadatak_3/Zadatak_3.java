package SeleniumOsnove;
/*
 * Zadatak 3) Otici na sajt demoqa, kliknuti na Elements, 
 * kliknuti na Text Box, popuniti podatke i kliknuti na Submit.
 *  Sa leve strane kliknuti na Checkbox. Cekirati samo "Desktop" i utvrditi da je samo taj checkbox cekiran.
 *   Kliknuti na Radio Button sa leve strane, kliknuti na "Yes" pa na "Impressive" i 
 *   utvrditi da se radio button promenio.
 *   
 *   Dodatak, proveriti da li je uneta adresa u Current address i Permanent address ista i ispisati u konzoli. 

 */

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zadatak_3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/");
		WebDriverWait wdwait = new WebDriverWait(driver, 10);

		wdwait.until(ExpectedConditions.elementToBeClickable(By.className("card-up")));
		WebElement elements = driver.findElement(By.className("card-up"));
		elements.click();

		WebElement textBox = driver.findElement(By.id("item-0"));
		textBox.click();

		WebElement fullName = driver.findElement(By.id("userName"));
		fullName.sendKeys("q12a");

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("q12a@gmail.com");

		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		currentAddress.sendKeys("Igmanska 4, Beograd");

		WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		permanentAddress.sendKeys("Igmanska 2, Beograd");

		WebElement element = driver.findElement(By.id("submit"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".btn.btn-primary")));
		WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-primary"));
		submitButton.click();

		String ca = currentAddress.getAttribute("value");
		String pa = permanentAddress.getAttribute("value");
		if (ca.equals(pa)) {
			System.out.println("Adrese su iste");
		} else {
			System.out.println("Adrese su razlicite");
		}

		WebElement checkBox = driver.findElement(By.id("item-1"));
		checkBox.click();

		WebElement pointer = driver.findElement(By.cssSelector(".rct-collapse.rct-collapse-btn"));
		pointer.click();

		wdwait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".rct-icon.rct-icon-parent-close")));
		WebElement desktop = driver.findElement(By.cssSelector(".rct-icon.rct-icon-parent-close"));
		desktop.click();
//		
//		WebElement poruka = driver.findElement(By.id("result"));
//		System.out.println(poruka.getText());

		WebElement document = driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck"));
		WebElement download = driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck"));
		if (document.isSelected() || download.isSelected()) {
			System.out.println("Nije cekiran samo desktop!");
		} else {
			System.out.println("Cekiran je samo desktop");
		}

		WebElement radioButton = driver.findElement(By.id("item-2"));
		radioButton.click();

		WebElement yes = driver.findElement(By.className("custom-control-label"));
		yes.click();

		WebElement tekst2 = driver.findElement(By.className("mt-3"));
		System.out.println(tekst2.getText());

		WebElement impressive = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]"));
		impressive.click();

		WebElement tekst3 = driver.findElement(By.className("mt-3"));
		System.out.println(tekst3.getText());

		driver.close();
	}

}
