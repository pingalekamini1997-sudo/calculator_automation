package com.calculator.calculator_automation;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class setup {

	EdgeDriver driver;
	
	@BeforeClass
	public void setup_launch()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();	
		driver.get("https://www.calculator.net/");
	}
	
	@AfterClass
    public void closeBrowser() {

        driver.quit();
    }
}
