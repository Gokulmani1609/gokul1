package org.test;

import org.base.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sample extends Baseclass{
	public static void main(String[] args) {
		WebDriver driver = browserLaunch();
		
		urlLanuch();
		
		maximize();
		timee();
		
		WebElement txtuser = driver.findElement(By.id("email"));
        sendkeys(txtuser, "Gokul");
        
        WebElement txdpass = driver.findElement(By.id("pass"));
        sendkeys(txdpass, "gokul123");
        
        WebElement btnclick = driver.findElement(By.name("login"));
        loginclick(btnclick);
        
        String a = getAttribute(txtuser);
        System.out.println(a);
		
        String b = getAttribute(txdpass);
        System.out.println(b);
        
      //WebElement doubleclick = driver.findElement(By.xpath("(//a[text()='Forgotten password?'])[2]"));
       // WebElement btnclick = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
       // moveToElement(btnclick);
        
        
        
	}     
  

}
