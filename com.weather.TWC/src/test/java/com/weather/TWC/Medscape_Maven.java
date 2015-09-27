package com.weather.TWC;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Medscape_Maven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver = new FirefoxDriver();
/*		System.setProperty("webdriver.chrome.driver", "D:\\Selenium_Stuff\\Selenium\\Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
*/		
	    //Accessing the Medscape URL
	    	driver.get("http://www.medscape.com/");
	    	
	     //Maximizing the window
		    driver.manage().window().maximize();
	   //Implicit wait method
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 
			//Assertion for Log In text on splash page
			//Assert.assertEquals("Log In",driver.findElement(By.xpath("//*[@id='rightheaderlinks']/div[1]/a")).getText());

			//Clicking on Login Link
			driver.findElement(By.linkText("Log In")).click();
			
			//Getting link text of "Create a free account" using getAttribute method
			System.out.println(driver.findElement(By.linkText("Create a free account")).getAttribute("href"));
			
			// clearing the text in Username field
		     driver.findElement(By.id("userId")).clear();
		    
		    // entering the text in Username field
		     driver.findElement(By.id("userId")).sendKeys("pavanlive"); //sateeshlive
		    
		     // Capturing/Getting text from the Username field 
		     WebElement x = driver.findElement(By.id("userId"));
		     String y = x.getAttribute("value");
		     System.out.println(y);
			
			//System.out.println(driver.findElement(By.id("userId")).getAttribute("value"));

				// clearing the text in password field
		     driver.findElement(By.id("password")).clear();
       
		      // entering the text in Password field
		     driver.findElement(By.id("password")).sendKeys("pavanlive"); //123456

		     // Capturing/Getting text from the password field 
		     System.out.println(driver.findElement(By.id("password")).getAttribute("value"));
		
		    //Clicking on login button
			driver.findElement(By.id("loginbtn")).click();
	    	
		    //Getting text of the Username 
			
			String userInfo =driver.findElement(By.xpath("//*[@id='userinfo']/span")).getText();
			
			System.out.println(userInfo);
			

	}

}
