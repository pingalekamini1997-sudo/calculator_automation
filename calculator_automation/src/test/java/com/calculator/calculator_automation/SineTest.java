package com.calculator.calculator_automation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SineTest extends setup{
	
	@Test(priority=1)
	public void sin_0() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		
		System.out.println("Executing sin_0");
		
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void sin_30() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		
		 System.out.println("Executing sin_30");
		 
		Thread.sleep(1000);
	}
	@Test(priority=3)
	public void sin_45() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
        Thread.sleep(1000);
    	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
    	 System.out.println("Executing sin_45");

    	Thread.sleep(1000);
	}
	@Test(priority=4)
	public void sin_60() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		 System.out.println("Executing sin_60");
		Thread.sleep(1000);
	}
	@Test(priority=5)
	public void sin_90() throws InterruptedException 
	{
		driver.findElement(By.xpath("//*[@id=\"homefunbtn\"]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[3]")).click();
		System.out.println("Executing sin_90");
		Thread.sleep(1000);
	}

}
