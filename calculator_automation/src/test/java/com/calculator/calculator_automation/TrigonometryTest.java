package com.calculator.calculator_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TrigonometryTest {
 
	EdgeDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	void Launch()
	{
		
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	@Test(priority=1)
	void sine()
	{
		WebElement sinbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('sin')\"]")));
		 sinbutton.click();
		 
		WebElement threebutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(3)']")));
		 threebutton.click();
		 
		WebElement zerobutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(0)']")));
		zerobutton.click();
		
		WebElement result=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sciOutPut")));
		
		String signresult=result.getText().trim();
		System.out.println("signresult is:" + signresult);
		
		WebElement clearbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('C')\"]")));
		clearbutton.click();
	}
	
	@Test(priority=2)
	void cosine()
	{
		WebElement cosbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('cos')\"]")));
		cosbutton.click();
		
		WebElement sixbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(6)']")));
		sixbutton.click();
		
		WebElement zerobutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(0)']")));
		zerobutton.click();
		
		WebElement result=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sciOutPut")));
		
		String cosresult=result.getText().trim();
		System.out.println("cosine result is:" +cosresult);
		
		WebElement clearbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('C')\"]")));
		clearbutton.click();
	}
	
	@Test(priority=3)
	void tangent()
	{
		WebElement tanbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('tan')\"]")));
		tanbutton.click();
		
		WebElement fourbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(4)']")));
		fourbutton.click();
		
		WebElement fivebutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(5)']")));
		fivebutton.click();
		
		WebElement result=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sciOutPut")));
		
		String tanresult=result.getText().trim();
		System.out.println("tangent result is:" +tanresult);
		
		WebElement clearbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('C')\"]")));
		clearbutton.click();
}
	@Test(priority=4)
   void inverseSine()
   {
	    WebElement asinbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('asin')\"]")));
	    asinbutton.click();
	   
	    WebElement zerobutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(0)']")));
	    zerobutton.click();
	   
	    WebElement decimal=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('.')\"]")));
	    decimal.click();
	   
	    WebElement fivebutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(5)']")));
		fivebutton.click();
		
		WebElement result=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sciOutPut")));
		
		String inverseSineResult=result.getText().trim();
		System.out.println("inversesine result is:" +inverseSineResult);
		
		WebElement clearbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('C')\"]")));
		clearbutton.click();
   }
	@Test(priority = 5)
	void inverseCosine()
	{
	    WebElement acosbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('acos')\"]")));
         acosbutton.click();

	    WebElement zerobutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(0)']")));
         zerobutton.click();

	    WebElement decimalbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('.')\"]")));
         decimalbutton.click();

	    WebElement fivebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(5)']")));
         fivebutton.click();

	    WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sciOutPut")));

	    String inverseCosineResult = result.getText().trim();
         System.out.println("Inverse Cosine Result: " + inverseCosineResult);
          
        WebElement clearbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('C')\"]")));
  		 clearbutton.click();

	}
	
	@Test(priority = 6)
	void inverseTangent()
	{
	    WebElement atanbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('atan')\"]")));
          atanbutton.click();

	    WebElement onebutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick='r(1)']")));
          onebutton.click();

	    WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sciOutPut")));

	    String inverseTangentResult = result.getText().trim();
         System.out.println("Inverse Tangent Result: " + inverseTangentResult);

         WebElement clearbutton=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@onclick=\"r('C')\"]")));
  		 clearbutton.click();
	}
	
	
	
	

	
	
	
	
}
