package com.DemoOnWait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitConcept {

	WebDriver driver;


	public void ConfigueSetting(String url) {
		System.setProperty("webdriver.chrome.driver", "chromedriver_new.exe");
		driver =new ChromeDriver();
		driver.get(url);
	}

	public void Search() {
		driver.findElement(By.name("q")).sendKeys("Java by kiran"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a")).click();
		
		
	}
















}
