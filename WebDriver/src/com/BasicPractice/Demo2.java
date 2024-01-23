package com.BasicPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver_new.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///E:/Selenium%20Software/Offline%20Website/index.html");
		
//		driver.manage().window().maximize(); 
//		
//		String title_string= driver.getTitle();
//		System.out.println("Title is"+title_string);
//		
//		String Current_Url =driver.getCurrentUrl();
//		System.out.println(Current_Url);
//		
//		String pageSource_str=driver.getPageSource();
//		System.out.println(pageSource_str);
		
		//driver.close();
	}

}
