package com.calculator.calculator_automation;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class setup {

	 EdgeDriver driver;
	
	@BeforeSuite
	public void setup_launch()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.calculator.net/");
	}
	
	@AfterSuite
    public void closeBrowser() {

        driver.quit();
    }
}
