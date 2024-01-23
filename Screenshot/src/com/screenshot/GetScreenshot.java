package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class GetScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver_new.exe");
		WebDriver driver=new ChromeDriver();
				driver.get("https://m.facebook.com/login/?locale=en_GB");

				driver.findElement(By.xpath("//*[@id=\"login_password_step_element\"]/button")).click();
		
				File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File target = new File("E:\\Selenium_TestCases\\Screenshot\\Login\\login2.png");
				
				try {
					FileHandler.copy(source, target);
			   } catch (IOException e) {
					e.printStackTrace();
			 }
	       }
         }