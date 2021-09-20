package Login;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://the-internet.herokuapp.com/login");

		Happy_path path1;
		Sad_path path2;
		int izbor;
		Scanner s = new Scanner(System.in);
		System.out.println("Izaberite: \n " + "1. Happy path \n" + " 2. Sad path");
		izbor = s.nextInt();
		switch (izbor) {
		case 1:
			path1 = new Happy_path("tomsmith", "SuperSecretPassword!");

			WebElement username1 = driver.findElement(By.id("username"));
			username1.sendKeys(path1.getUsername());

			WebElement password1 = driver.findElement(By.id("password"));
			password1.sendKeys(path1.getPassword());

			WebElement loginButton1 = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
			loginButton1.click();

			WebElement success1 = driver.findElement(By.cssSelector(".flash.success"));
			String login = success1.getText();
			System.out.println(login);
			System.out.println(path1);

			break;

		case 2:
			path2 = new Sad_path("abc", "pass");

			WebElement username2 = driver.findElement(By.id("username"));
			username2.sendKeys(path2.getUsername());

			WebElement password2 = driver.findElement(By.id("password"));
			password2.sendKeys(path2.getPassword());

			WebElement loginButton2 = driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
			loginButton2.click();

			WebElement success2 = driver.findElement(By.cssSelector(".flash.error"));
			String notlogin = success2.getText();
			System.out.println(notlogin);
			System.out.println(path2);

			break;
		}

		s.close();
		driver.close();
	}

}
