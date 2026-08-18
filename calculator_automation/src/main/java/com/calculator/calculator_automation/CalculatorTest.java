package com.calculator.calculator_automation;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.*;

public class CalculatorTest {

	EdgeDriver driver;
	
	public static void main(String[] args) {
		CalculatorTest T=new CalculatorTest();
		T.Launch();
		T.Addition();
		T.Substraction();
		T.Multiplication();
		T.Division();
		//T.driver.quit();
		T.percentage();
		T.square();
		T.squareroot();
		T.cube();
		T.Reciprocal();
		T.Backspace();
		T.Parentheses();
		T.factorial();
		T.Sin();
		T.Cosine();
		T.tangent();
		T.inverseSine();
		T.inverseCosine();
		T.inverseTangent();
		T.naturalLog();
		T.eulerNumber();
		T.randomNumber();
		T.cuberoot();
		T.powerc();
		T.exponential();
		T.powerOfTen();
		T.ythRoot();
		T.exponent();
		T.plusMinus();
		T.memoryPlus();
		T.memoryRecall();
		T.memoryMinus();
		T.answer();
		T.signdeg();
		T.rad();
		T.percentageCalculator();
	}
	
  void Launch()
	{
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
        //System.out.println(driver.getTitle());
        //System.out.println(driver.getCurrentUrl());
	}
	
  void Addition()
	{
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();   //addition
		driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		String add_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();//remove unwanted space
		System.out.println("addition is:"+add_act_result);
		
		if(add_act_result.equals("8"))                  //verification
		{
			System.out.println("addition is correct");
		}
		else
		{
			System.out.println("addition is wrong");
		}
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
  void Substraction()
	{
		driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();  //substraction
		driver.findElement(By.xpath("//span[@onclick=\"r('-')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		String sub_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();
		System.out.println("substraction is:"+sub_act_result);
		
		String sub_exp_result="5";
		
		if(sub_act_result.equals(sub_exp_result))
		{
			System.out.println("substraction is correct");
		}
		else
		{
			System.out.println("substraction is wrong");
		}
		
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
  void Multiplication()
	{
		driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();       //multiplication
		driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		String m_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();
		System.out.println("multiplication is:"+m_act_result);
		String m_exp_result="24";
		
		if(m_act_result.equals(m_exp_result))
		{
			System.out.println("multiplication is correct");
		}
		else
		{
			System.out.println("multiplication is wrong");
		}
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
  void Division()
	{
		driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();                //division
		driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		String d_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();
		System.out.println("division is:"+d_act_result);
		
		String d_expect_result="4";
		
		if(d_act_result.equals(d_expect_result)) 
		{
			System.out.println("division is correct");
		}
		else
		{
			System.out.println("division is wrong");
		}
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
   void percentage()
    {
    	driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
    	driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
    	driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
    	driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
    	driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
    	driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
    	driver.findElement(By.xpath("//span[@onclick=\"r('pc')\"]")).click();
    	
    	String pc_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();
    	System.out.println("percentage is:"+pc_act_result);
    	String pc_exp_result="20";
    	
    	if(pc_act_result.equals(pc_exp_result))
    	{
    		System.out.println("percentage is correct");
    	}
    	else
    	{
    		System.out.println("percentage is wrong");
    	}
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
    }
   void square()
    {
    	driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();        //Square
    	driver.findElement(By.xpath("//span[@onclick=\"r('x2')\"]")).click();
    	
    	String power_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();
    	String power_exp_result="25";
    	if(power_act_result.equals(power_exp_result))
    	{
    		System.out.println("power is correct:"+power_act_result);
    	}
    	else
    	{
    		System.out.println("power is wrong");
    	}
    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
    }
    
   void squareroot()
    {
        driver.findElement(By.xpath("//span[@onclick=\"r('sqrt')\"]")).click();
 	    driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
   	    driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
   	    
   	    String sqrroot_act_result=driver.findElement( By.id("sciOutPut")).getText().trim();
   	    String sqrroot_exp_result="5";
   	    
   	    if(sqrroot_act_result.equals(sqrroot_exp_result)) 
   	    {
   	    	System.out.println("squareroot is correct:"+sqrroot_act_result);
   	    }
   	    else
   	    {
   	    	System.out.println("squareroot is wrong");
   	    }
   	 driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
   }
    void cube()
      {
    	   driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
    	   driver.findElement(By.xpath("//span[@onclick=\"r('x3')\"]")).click();
    	  
    	  String cube_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();
    	  String cube_exp_result="27";
    	  
    	  if(cube_act_result.equals(cube_exp_result))
    	  {
    		  System.out.println("cube is correct:"+cube_act_result);
    	  }
    	  else
    	  {
    		  System.out.println("cube is wrong");
    	  }
    	  driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
      }
	 void cuberoot()
	    {
	    	driver.findElement(By.xpath("//span[@onclick=\"r('3x')\"]")).click();
	    	driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
	    	String cubeRootResult=driver.findElement(By.id("sciOutPut")).getText().trim();
	    	System.out.println("cuberoot result is:" + cubeRootResult);
	    	driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	    }
    void Reciprocal()
      {
    	  driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();  
    	  driver.findElement(By.xpath("//span[@onclick=\"r('1/x')\"]")).click();
    	  
    	  String Recipro_act_result=driver.findElement(By.id("sciOutPut")).getText().trim();
    	  String recipro_exp_result="0.25";
    	  
    	  if(Recipro_act_result.equals(recipro_exp_result))
    	  {
    		  System.out.println("Reciprocal result is correct:"+Recipro_act_result);
    	  }
    	  else
    	  {
    		  System.out.println("Reciprocal result is wrong");
    	  }
    	  driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
      }
    void Backspace()
      {
    	  driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
    	  driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
    	  driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
    	  driver.findElement(By.xpath("//span[@onclick=\"r('bk')\"]")).click();
    	  
    	  String backspace_result=driver.findElement(By.id("sciOutPut")).getText().trim();
    	  System.out.println("backspace is correct:"+backspace_result);
    	  driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
      }
    void Parentheses()
      {
    	  driver.findElement(By.xpath("//span[@onclick=\"r('(')\"]")).click();
    	  driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
    	  driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
    	  driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
    	  driver.findElement(By.xpath("//span[@onclick=\"r(')')\"]")).click();
    	  driver.findElement(By.xpath("//span[@onclick=\"r('*')\"]")).click();
    	  driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
    	  
    	  String parenthesis_result=driver.findElement(By.id("sciOutPut")).getText().trim();
    	  System.out.println("parentheses is:"+parenthesis_result);
    	  driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
     }
    void factorial()
      {
    	  driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
    	  driver.findElement(By.xpath("//span[@onclick=\"r('n!')\"]")).click();
    	  
    	  String factorial_result=driver.findElement(By.id("sciOutPut")).getText().trim();
    	  System.out.println("factorial is:"+factorial_result);
    	  driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
      }
    void Sin()
      {
    	  driver.findElement(By.xpath("//span[@onclick=\"r('sin')\"]")).click();
    	  driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
    	  driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
    	  
    	  String sineResult = driver.findElement(By.id("sciOutPut")).getText().trim();
    	  System.out.println("Sine Result: " + sineResult);
    	  driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
      }
	void Cosine()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('cos')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(6)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		 
		 String cosineResult = driver.findElement(By.id("sciOutPut")).getText();
		 System.out.println("Cosine Result: " + cosineResult);
		 driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void tangent()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('tan')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(4)']")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		
		String tangentResult = driver.findElement(By.id("sciOutPut")).getText().trim();
		System.out.println("Tangent Result: " + tangentResult);
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void inverseSine()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('asin')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('.')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		 
		 String inverseSineResult = driver.findElement(By.id("sciOutPut")).getText().trim();
		 System.out.println("Inverse Sine Result: " + inverseSineResult);
		 driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void inverseCosine()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('acos')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('.')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		
		String inverseCosineResult = driver.findElement(By.id("sciOutPut")).getText().trim();
		System.out.println("Inverse Cosine Result: " + inverseCosineResult);
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void inverseTangent()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('atan')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		
		String inverseTangentResult=driver.findElement(By.id("sciOutPut")).getText().trim();
		System.out.println("Inverse Tangent Result: " + inverseTangentResult);
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void naturalLog()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('ln')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		
		String naturalLogResult = driver.findElement(By.id("sciOutPut")).getText().trim();
		System.out.println("Natural Log Result: " + naturalLogResult);
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void eulerNumber()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('e')\"]")).click();
		String eulerResult=driver.findElement(By.id("sciOutPut")).getText().trim();
		System.out.println("eulernumber result is:" +eulerResult);
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
    }
	void pi()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('pi')\"]")).click();
		String piResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("Pi Result: " + piResult);
	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
		
	}
	void randomNumber()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('RND')\"]")).click();
		String randomResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("Random Number Result: " + randomResult);
      driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void powerc()
	{
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('pow')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		
		String powerResult12 = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("Power Result: " + powerResult12);
	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void exponential()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('ex')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		
		String exponentialResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("Exponential Result: " + exponentialResult);
	    
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void powerOfTen()
	{
		driver.findElement(By.xpath("//span[@onclick=\"r('10x')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
		
		String powerOfTenResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("poweroften Result is: " + powerOfTenResult);

	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void ythRoot()
	{
		driver.findElement(By.xpath("//span[@onclick='r(8)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('apow')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		//driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
		
		String ythRootResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("yth Root Result: " + ythRootResult);
	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void exponent()
	{
		driver.findElement(By.xpath("//span[@onclick='r(1)']")).click();       //10 च्या power चा exponent enter
		driver.findElement(By.xpath("//span[@onclick=\"r('EXP')\"]")).click();
		driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
		
		String exponentResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("Exponent Result is: " + exponentResult);
	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	void plusMinus()
	{
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
		driver.findElement(By.xpath("//span[@onclick=\"r('+/-')\"]")).click();
		
		String plusMinusResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("Plus Minus Result is: " + plusMinusResult);
	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	
   void memoryPlus()
	{
		driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();     
		driver.findElement(By.xpath("//span[@onclick=\"r('M+')\"]")).click();         //memory madhe add
		
		String memoryPlusResult=driver.findElement(By.id("sciOutPut")).getText().trim();
		System.out.println("memoryPlus result is:" +memoryPlusResult);
		driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
	}
	
   void memoryRecall()
   {
	    driver.findElement(By.xpath("//span[@onclick=\"r('MR')\"]")).click();          //memoryRecall
	   
	    String memoryRecallResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("Memory Recall Result is: " + memoryRecallResult);
	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
   }
   
   void memoryMinus()
    {	   
	    driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\"r('M+')\"]")).click();

	    // Clear display only
	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();

	    // Subtract 2 from memory
	    driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\"r('M-')\"]")).click();

	    // Clear display
	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();

	    // Recall memory
	    driver.findElement(By.xpath("//span[@onclick=\"r('MR')\"]")).click();
	    
	    String memoryMinusResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("Memory Minus Result: " + memoryMinusResult);
	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
    }
  
   void answer()
   {
	    driver.findElement(By.xpath("//span[@onclick='r(5)']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\"r('+')\"]")).click();
	    driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
	    driver.findElement(By.xpath("//span[@onclick=\"r('=')\"]")).click();
	    driver.findElement(By.xpath("//span[@onclick=\"r('ans')\"]")).click();
	    
	    String answerResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("Answer Result is : " + answerResult);
        driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
   }
   void signdeg()                                    
   {
	    driver.findElement(By.id("scirdsettingd")).click(); //Degree mode,sin 30, Deg mode on asl tr sin(30°) = 0.5

	    driver.findElement(By.xpath("//span[@onclick=\"r('sin')\"]")).click();
	    driver.findElement(By.xpath("//span[@onclick='r(3)']")).click();
	    driver.findElement(By.xpath("//span[@onclick='r(0)']")).click();

	    String sinedegResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	    System.out.println("Sinedeg Result is: " + sinedegResult);
	    driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
   }
   
   void rad()
   {
	   driver.findElement(By.id("scirdsettingr")).click();         //sign pi/2=1
	   driver.findElement(By.xpath("//span[@onclick=\"r('sin')\"]")).click();
	   driver.findElement(By.xpath("//span[@onclick=\"r('pi')\"]")).click();
	   driver.findElement(By.xpath("//span[@onclick=\"r('/')\"]")).click();
	   driver.findElement(By.xpath("//span[@onclick='r(2)']")).click();
	   
	   String radSinResult = driver.findElement(By.id("sciOutPut")).getText().trim();
	   System.out.println("Rad Sin Result: " + radSinResult);
	   driver.findElement(By.xpath("//span[@onclick=\"r('C')\"]")).click();//clear
   }
   void percentageCalculator()
   {
	   driver.findElement(By.linkText("Percentage Calculator")).click(); //Percentage Calculator
	   driver.findElement(By.id("cpar1")).sendKeys("20");
	   driver.findElement(By.id("cpar2")).sendKeys("100");
	   driver.findElement(By.xpath("//input[@value='Calculate']")).click();
	   driver.findElement(By.id("cpar3")).getAttribute("value");
	   
	   String percentageResult=driver.findElement(By.className("h2result")).getText().trim();
	   System.out.println("Percentage Calculator Result is: " + percentageResult);
	   driver.findElement(By.xpath("//input[@value='Clear']")).click();
	   
	   driver.findElement(By.name("c21par1")).sendKeys("20");   //Percentage Calculator in Common Phrases, 1st
	   driver.findElement(By.name("c21par2")).sendKeys("100");
	   driver.findElement(By.xpath("//input[@name='ctype' and @value='21']/following-sibling::input[@name='x']")).click();
	   
	   String percentageResult1=driver.findElement(By.className("h2result")).getText().trim();
	   System.out.println("percentageCalculator result of 1st function is:" +percentageResult1);
	   driver.findElement(By.xpath("//input[@value='Clear']")).click();
	  
	   
   }
   
}
