package com.qa.phantom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSHeadLessBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		// phantomJSdriver internally uses ghost driver
		// ghostdriver-----> is used as JSON wire protocol --- HTTP REST calls
		// headless browser testing
		// no browser will be launched
		// testing is happening behind the scene
		// its very fast
		// it directly interface with your app HTML DOM
		
		
		System.setProperty("phantomjs.binary.path", "C:\\Selenium Drivers\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://classic.freecrm.com");
		
		String title = driver.getTitle();
		System.out.println("Titile before login---->" + title);
		
		
		driver.findElement(By.name("username")).sendKeys("Ravikumar@9999");
        driver.findElement(By.name("password")).sendKeys("test@9999");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(3000);
        
        System.out.println("after login title is :---->" + driver.getTitle());
		

	}

}
