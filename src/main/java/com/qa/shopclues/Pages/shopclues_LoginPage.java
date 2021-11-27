package com.qa.shopclues.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.shopclues.Base.shopclues_Base;

public class shopclues_LoginPage extends shopclues_Base{
	

//public void login(String username1Input,String username2Input,String username3Input) throws InterruptedException 
	
	// Locate elements 
	// WebElement e =driver.findelement(By.locatorname("value") 
	// Creating a Object repository 
	 	
	
	@FindBy(xpath="//*[@id='sign-in']/a")
	WebElement newWindowBtn;
	@FindBy(xpath="//*[@id='loginModelBox']/div/div[2]/div[1]/div[1]/h2[2]")
	WebElement e1;
	@FindBy(xpath="//*[@id='login_tab']")
	WebElement e2;
	@FindBy(xpath="/html/body/div[1]/div/div/div[3]/div[1]/button[1]")
	WebElement pwin;
	
	@FindBy(xpath="//*[@id='main_user_login']")
	WebElement ulogin1;
	@FindBy(xpath="//*[@id='login_via_otp']")
	WebElement lotp1;
	@FindBy(xpath="//*[@id='login']/form/fieldset/div[2]/div[1]/span")
	WebElement errorMsg1;
	
	@FindBy(xpath="//*[@id='main_user_login']")
	WebElement ulogin2;
	@FindBy(xpath="//*[@id='login_via_otp']")
	WebElement lotp2;
	@FindBy(xpath="//*[@id='login']/form/fieldset/div[2]/div[5]/span")
	WebElement errorMsg2;
	
	@FindBy(xpath="//*[@id='main_user_login']")
	WebElement ulogin3;
	@FindBy(xpath="//*[@id='login_via_otp']")
	WebElement lotp3;
	@FindBy(xpath="//*[@id='login']/form/fieldset/div[2]/div[1]/span")
	WebElement errorMsg3;
	
	@FindBy(xpath="//*[@id='a_close_id']")
	WebElement sclose;

	// initialize the elements that are located 
	 // use class PageFactory and method initElements, driver object 
	 	
		
	public shopclues_LoginPage()    //this is not a method , it is a constructor
	{
		PageFactory.initElements(driver, this); //driver is coming from Base class and this is used to initialize current Elements
	}
	
	//Action Methods on every element
	
	public void ValidateTitle() 
 	{ 
 		String title= driver.getTitle(); 
 		System.out.println(title); 
 	} 
 	
	//@Parameters({"username1Input","username2Input","username3Input"})
	//public void login(String username1Input,String username2Input,String username3Input) throws InterruptedException
	public void login() throws InterruptedException
	{
		Thread.sleep(2000);
		pwin.click();            //popup close
		Thread.sleep(2000);
		 //Click the Sign-in button to open a new window
		newWindowBtn.click();
		Thread.sleep(3000);
		
		
    //Click on Register Button	
	System.out.println("\n" + "TestCase#1 - Testing Register Button : " +e1.getText());
	e1.click();
	Thread.sleep(5000);
	
	//Click on Login Button
	System.out.println("\n" + "TestCase#2 - Testing Login Button : " +e2.getText());
		Thread.sleep(3000);
		e2.click();
				
		//Enter wrong input with 6 digits
		
		ulogin1.clear();
		//ulogin1.sendKeys(username1Input);
		ulogin1.sendKeys("123456");
		Thread.sleep(2000);
		
		lotp1.click();
		Thread.sleep(2000);
		
		System.out.println("\n" + "TestCase#3 - Displaying Error When Entering Wrong Input(123456) : " +errorMsg1.getText());	
		Thread.sleep(2000);
				
		//Enter wrong mobile number input with 10 digits
		
		ulogin2.clear();
		//ulogin2.sendKeys(username2Input);
		ulogin1.sendKeys("1234567890");
		Thread.sleep(2000);
		
		lotp2.click();
		Thread.sleep(2000);
		
		System.out.println("\n" + "TestCase#4 - Displaying Error When Entering Wrong Input(1234567890) : " +errorMsg2.getText());	
		Thread.sleep(2000);
		
		//Enter Correct Phone number but Account is not register
		
		ulogin3.clear();
		//ulogin3.sendKeys(username3Input);
		ulogin1.sendKeys("9704584916");
		Thread.sleep(2000);
		
		lotp3.click();
		Thread.sleep(2000);
		
		System.out.println("\n" + "TestCase#5 - Displaying Error When Entering Correct Input(9704584916) : " +errorMsg3.getText());	
		Thread.sleep(3000);
		//Closing Sign-in App
		
		sclose.click();
		Thread.sleep(3000);
		

}
	
}