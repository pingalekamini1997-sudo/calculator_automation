package com.calculator.calculator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Other_calculators {

	EdgeDriver driver;
	
@BeforeClass	
void Launch()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/"); 
	}
@Test
void other_calculators()
{
	driver.findElement(By.linkText("Other Calculators")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void age_calculator()
{
	driver.findElement(By.linkText("Age Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void date_calculator()
{
	driver.findElement(By.linkText("Date Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void time_calculator()
{
	driver.findElement(By.linkText("Time Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void hours_calculator()
{
	driver.findElement(By.linkText("Hours Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void GPA_calculator()
{
	driver.findElement(By.linkText("GPA Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void grade_calculator()
{
	driver.findElement(By.linkText("Grade Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void concrete_calculator()
{
	driver.findElement(By.linkText("Concrete Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void subnet_calculator()
{
	driver.findElement(By.linkText("Subnet Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void password_generator()
{
	driver.findElement(By.linkText("Password Generator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void conversion_calculator()
{
	driver.findElement(By.linkText("Conversion Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@AfterClass
void close()
{
	driver.quit();
}
}
