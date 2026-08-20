package com.calculator.calculator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Fitness_Health_calculators {
       
	EdgeDriver driver;
	
@BeforeClass
void Launch()
  {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/"); 
  }
@Test
void fitnes_health_cal()
{
	driver.findElement(By.linkText("Fitness & Health Calculators")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());

}
@Test
void BMI_calculator()
{
	driver.findElement(By.linkText("BMI Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
	
}
@Test
void calorie_calculator()
{
	driver.findElement(By.linkText("Calorie Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void body_fat_cal()
{
	driver.findElement(By.linkText("Body Fat Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void BMR_calculator()
{
	driver.findElement(By.linkText("BMR Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void ideal_wait_cal()
{
	driver.findElement(By.linkText("Ideal Weight Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void pace_calculator()
{
	driver.findElement(By.linkText("Pace Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void pregnancy_calculator()
{
	driver.findElement(By.linkText("Pregnancy Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void pregnancy_conception_cal()
{
	driver.findElement(By.linkText("Pregnancy Conception Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void due_date_cal()
{
	driver.findElement(By.linkText("Due Date Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@AfterClass
void close()
{
	driver.quit();
}
}

