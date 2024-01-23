package com.Selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Navigation {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver_new.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Selenium%20Software/Offline%20Website/index.html");

		// by link text locator
		driver.findElement(By.linkText("Register a new membership")).click();

		// by partial link text locator
		//	driver.findElement(By.partialLinkText("Register")).click();

		// by name locator
		driver.findElement(By.name("name")).sendKeys("Sumit");

		// by id locator
		driver.findElement(By.id("mobile")).sendKeys("1234567890");

		// by tag name
		//	driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com");
		List<WebElement> list= driver.findElements(By.tagName("input"));
		System.out.println("====="+list.size());
		for(int i=0; i<list.size();i++) {
			if (list.get(i).getAttribute("placeholder").compareTo("Email")==0) {
				System.out.println("===email find===");
				list.get(i).sendKeys("sumit@gmail.com");
			}else if(list.get(i).getAttribute("type").compareTo("Password")==0);
			list.get(i).sendKeys("Sumit123");
		}
		driver.findElement(By.className("btn btn-primary")).click();

		// alert 
		Alert alert=driver.switchTo().alert();
        alert.accept();
        driver.switchTo().defaultContent();
        
        // navigation command
        
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().back();
        driver.navigate().refresh();



	}
}
