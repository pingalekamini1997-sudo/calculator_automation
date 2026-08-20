package com.calculator.calculator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
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
  void financialCalculators_link() throws InterruptedException
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
      Thread.sleep(1000);

   }
@Test
  void mortage_calculator()
  {
	  driver.findElement(By.linkText("Mortgage Calculator")).click();
	  driver.navigate().back();
	  System.out.println("back to main page:"+driver.getCurrentUrl());
  }
@Test
void Loan_calculator()
{
	driver.findElement(By.linkText("Loan Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
 void autoloan_calculator()
 {
	 driver.findElement(By.linkText("Auto Loan Calculator")).click();
	 driver.navigate().back();
	 System.out.println("back to main page:"+driver.getCurrentUrl());
 }
@Test
void interest_calculator()
{
	driver.findElement(By.linkText("Interest Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void payment_calculator()
{
	driver.findElement(By.linkText("Payment Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void Retirement_calculator()
{
	driver.findElement(By.linkText("Retirement Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void amortization_calculator()
{
	driver.findElement(By.linkText("Amortization Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void investment_calculator()
{
	driver.findElement(By.linkText("Investment Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void inflation_calculator()
{
	driver.findElement(By.linkText("Inflation Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void finance_calculator()
{
	driver.findElement(By.linkText("Finance Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void incometax_calculator()
{
	driver.findElement(By.linkText("Income Tax Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void compoundtinterest_calculator()
{
	driver.findElement(By.linkText("Compound Interest Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void salary_calculator()
{
	driver.findElement(By.linkText("Salary Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void intersetrate_calculator()
{
	driver.findElement(By.linkText("Interest Rate Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void salestax_calculator()
{
	driver.findElement(By.linkText("Sales Tax Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@AfterClass
void close()
{
	driver.quit();
}
}
