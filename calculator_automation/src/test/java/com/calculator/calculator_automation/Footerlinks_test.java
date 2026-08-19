package com.calculator.calculator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Footerlinks_test {

EdgeDriver driver;
	
@BeforeClass
 void Launch()
  {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.calculator.net/"); 
  }
 
 @Test(priority=1)
 void about_us()
 {
	 driver.findElement(By.linkText("about us")).click();
	
	 String actual_url=driver.getCurrentUrl();
	 String expected_url="https://www.calculator.net/about-us.html";
	
	if(actual_url.equals(expected_url)) 
	 {
		 System.out.println("About Us URL is verified");
	 }
	 else
	 {
		 System.out.println("About Us URL is not verified");
	 }
	 
	 driver.navigate().back();
 }
 @Test(priority=2)
 void sitemap()
 {
	 driver.findElement(By.linkText("sitemap")).click();
	 
	 String actual_url=driver.getCurrentUrl();
	 String expected_url="https://www.calculator.net/sitemap.html";
	 
	 if(actual_url.equals(expected_url))
	 {
		  System.out.println("Sitemap URL is verified");
	 }
	 else
	 {
		 System.out.println("Sitemap URL is not verified");
	 }
	 driver.navigate().back();
 }
 
 @Test(priority=3)
 void termsOfUse()
 {
	 driver.findElement(By.linkText("terms of use")).click();
	 
	 String actual_url=driver.getCurrentUrl();
	 String expected_url="https://www.calculator.net/about-us.html#terms";
	 
	 if(actual_url.equals(expected_url))
	 {
		 System.out.println("Terms of Use URL is verified");
	 }
	 else
	 {
		 System.out.println("Terms of Use URL is not verified");
	 }
	 driver.navigate().back();
	 
 }
 @Test(priority=4)
 void privacyPolicy()
   {
	   driver.findElement(By.linkText("privacy policy")).click();
        
	   String actual_url=driver.getCurrentUrl();
	   String expected_url="https://www.calculator.net/about-us.html#privacy";
		 
	  if(actual_url.equals(expected_url))
		{
			System.out.println("Privacy Policy URL is verified");
		 }
		 else
		 {
			System.out.println("Privacy Policy URL is not verified");
		 }
		 driver.navigate().back();
    }
 
  @Test(priority=5)
  void calculatorNet()
  {
	  driver.findElement(By.linkText("calculator.net")).click();
	  
	  String actualUrl = driver.getCurrentUrl();
	    String expectedUrl = "https://www.calculator.net/";

	    if(actualUrl.equals(expectedUrl))
	    {
	        System.out.println("Calculator.net URL is verified");
	    }
	    else
	    {
	        System.out.println("Calculator.net URL is not verified");
	    }
	    
	    driver.navigate().back();
	}
  @AfterClass
  void closeBrowser()
  {
	  driver.quit();
  }
}

