package com.calculator.calculator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Footer_links {
	EdgeDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		  
		Footer_links foot=new Footer_links();
		foot.Launch();
		foot.about_us();
		Thread.sleep(1000);
		foot.sitemap();
		Thread.sleep(1000);
		foot.privacyPolicy();
		Thread.sleep(1000);
		foot.termsOfUse();
		Thread.sleep(1000);
		foot.calculatorNet();
		foot.closeBrowser();

	}
	
 void Launch()
  {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.calculator.net/"); 
  }
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
  void closeBrowser()
  {
	  driver.quit();
  }
}
