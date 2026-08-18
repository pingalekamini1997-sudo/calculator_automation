package com.calculator.calculator_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ArithmeticOperations {

	EdgeDriver driver;
	
@BeforeClass
void Launch()
{
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.calculator.net/");
}

@Test(priority=1)
void Addition() throws InterruptedException
{
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();   //addition
	driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	
	String add_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();//remove unwanted space
	System.out.println("addition result is:" + add_act_result);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
}

@Test(priority=2)
void Substraction() throws InterruptedException
{
	driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();  //substraction
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
	driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	
	String sub_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();
	System.out.println("substraction result is:" +sub_act_result);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
}

@Test(priority=3)
void Multiplication() throws InterruptedException
{
	driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();       //multiplication
	driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	
	String m_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();
	System.out.println("multiplication result is:"+m_act_result);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
}

@Test(priority=4)
void Division() throws InterruptedException
{
	driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();     //division
	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
	driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
	driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
	driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	
	String d_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();
	System.out.println("division is:"+d_act_result);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
}

@AfterClass
void closebrowser()
{
	driver.quit();

}
}
