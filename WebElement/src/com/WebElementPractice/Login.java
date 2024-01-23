package com.WebElementPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver_new.exe");

		WebDriver driver=new ChromeDriver();

		driver.get("file:///E:/Selenium%20Software/Offline%20Website/index.html");

       WebElement email_element= driver.findElement(By.xpath("//*[@id=\"email\"]"));
       email_element.sendKeys("kiran@gmail.com");
       
      // driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Snehal");
       String pwd="123456";
       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pwd);
       
       driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div/button")).click();

       // access DASHBOARD text
   //   String dashboard_str= driver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1")).getText();
  //     System.out.println(dashboard_str);
       
       // access user from side bar
       driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
       
       // access add user
       driver.findElement(By.xpath("/html/body/div[1]/div[1]/section[2]/div/div/div/div[1]/a/button")).click();
      
       // username
       driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Sumit");
       
       // password
       driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("1234567890");
       
       // email
       driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("snehal@gmail.com");
       
      // courses
       driver.findElement(By.xpath("//*[@id=\"course\"]")).sendKeys("Selenium");
       
       // gender radio button
       driver.findElement(By.xpath("//*[@id=\"Female\"]")).click();
       
       // dropDown method
//      WebElement dropDown_element= driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select"));
//       @SuppressWarnings("unused")
//	Select dropDown = new Select(dropDown_element);
   //    dropdown.selectByIndex(2);
     //  dropdown.selectByVisibleText("Delhi");
     //  dropdown.selectByValue("HP");
       Select dropselect=new Select(driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[1]/div[6]/div/select")));
       dropselect.selectByVisibleText("Delhi");
       
       // password
       driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Selenium");
       
       // friend mobile
       driver.findElement(By.xpath("/html/body/div/div[1]/section[2]/div/div/div/form/div[3]/div/input")).sendKeys("9922446996");
       
       // submit
       driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
       
       // handle alert
      Alert alert= driver.switchTo().alert();
      System.out.println(alert.getText());
       
       alert.accept();
       
       // access user again
       
       driver.switchTo().defaultContent();
       driver.findElement(By.xpath("/html/body/div[1]/aside/section/ul/li[3]/a/span")).click();
       
	}

}
