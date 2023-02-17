package com.Trello.Keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class KeyWord {
	public static WebDriver driver;

	public static void openBrowser(String browsername) {
		System.setProperty("WebDriver.Chrome.driver",
				"C:\\Users\\Admin\\eclipse-workspace\\seleniumProj\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://trello.com/home");
         //driver.get("https://trello.com/u/pushpajadhav0811/boards");
	
	}

	
public static void close() {
		driver.quit();

	}
}
