package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mvnbas {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement txtuser = driver.findElement(By.id("email"));
		txtuser.sendKeys("Gokul");
		
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("gokul123");
		
		WebElement btnlog = driver.findElement(By.name("login"));
		btnlog.click();
	}

}


