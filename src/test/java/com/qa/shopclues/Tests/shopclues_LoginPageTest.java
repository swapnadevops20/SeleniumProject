package com.qa.shopclues.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.shopclues.Base.shopclues_Base;
import com.qa.shopclues.Pages.shopclues_LoginPage;
//import com.qa.shopclues.Pages.Parameters;
import com.qa.shopclues.Pages.shopclues_LoginPage;

public class shopclues_LoginPageTest extends shopclues_Base{
	
	shopclues_LoginPage sp;
	
	@BeforeClass
	public void startBrowser()
	{
		initialization();
		sp=new shopclues_LoginPage();
	}
			
	@Test(priority='1', description="Validating Title Test")
	public void ValidateTitleTest()
	{
		sp.ValidateTitle();
	}
	
	@Parameters({"uname1Input","uname2Input","uname3Input"})
	@Test(priority='2', description="Validating Login Input Values")
	public void LoginTest(String uname1Input,String uname2Input,String uname3Input) throws InterruptedException
	{
		sp.login(uname1Input,uname2Input,uname3Input);
	}
	
	@AfterClass
	public void closeTest()
	{
		driver.close();
	}
	
}
