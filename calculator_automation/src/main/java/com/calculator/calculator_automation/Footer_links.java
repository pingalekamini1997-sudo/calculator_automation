package com.calculator.calculator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Footer_links {
	EdgeDriver driver;
	
	public static void main(String[] args) {
		  
		Footer_links foot=new Footer_links();
		foot.Launch();
		foot.about_us();

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
	
	 
 }

}
