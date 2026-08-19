package com.calculator.calculator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FinancialCalculators {
	EdgeDriver driver;
	
@BeforeClass
  void Launch()
   {
	  driver=new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.calculator.net/"); 
   }
@Test
  void financialCalculators_link()
   {
      driver.findElement(By.linkText("Financial Calculators")).click();
      String actualUrl=driver.getCurrentUrl();
      String expectedUrl="https://www.calculator.net/financial-calculator.html";
      
      if(actualUrl.equals(expectedUrl))
      {
          System.out.println("Financial Calculators URL is verified");
      }
      else
      {
          System.out.println("Financial Calculators URL is not verified");
      }

      driver.navigate().back();

   }
}
