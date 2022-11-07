package org.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	private static final String String = null;
	private static final WebElement WebElement = null;
	public static WebDriver driver;

	public static WebDriver browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public static void urlLanuch() {

		driver.get("https://www.facebook.com/");
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void timee() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public static void sendkeys(WebElement e, String value) {
		e.sendKeys(value);
	}
	
	public static void loginclick(WebElement e) {
		e.click();
	}
	
	public static String getAttribute(WebElement e) {
		String s = e.getAttribute("value");
		return s;	
	}
	
	public static void moveToElement(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
	
	private void dropDown() {
		Select s = new Select(WebElement);
		s.selectByIndex(0);
	}

}
	