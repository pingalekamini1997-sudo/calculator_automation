package com.calculator.calculator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Math_Calculators {

	EdgeDriver driver;

@BeforeClass
void Launch()
{
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/"); 
}

@Test
void Math_calculator()
{
	driver.findElement(By.linkText("Math Calculators")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void scientific_cal()
{
	driver.findElement(By.linkText("Scientific Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void fraction_calculator()
{
	driver.findElement(By.linkText("Fraction Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}


@Test
void percentage_calculator()
{
	driver.findElement(By.linkText("Percentage Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@Test
void Random_num_generator()
{
	driver.findElement(By.linkText("Random Number Generator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void triangle_cal()
{
	driver.findElement(By.linkText("Triangle Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}

@Test
void standard_deviation()
{
	driver.findElement(By.linkText("Standard Deviation Calculator")).click();
	driver.navigate().back();
	System.out.println("back to main page:"+driver.getCurrentUrl());
}
@AfterClass
void close()
{
	driver.quit();
}
}
