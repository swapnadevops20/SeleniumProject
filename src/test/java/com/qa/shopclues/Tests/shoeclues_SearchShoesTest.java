package com.qa.shopclues.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.shopclues.Base.shopclues_Base;
import com.qa.shopclues.Pages.shoeclues_SearchShoesPage;
import com.qa.shopclues.Pages.shopclues_LoginPage;

public class shoeclues_SearchShoesTest extends shopclues_Base{
	
shoeclues_SearchShoesPage sp1;
	
	@BeforeClass
	public void startBrowser()
	{
		initialization();
		sp1=new shoeclues_SearchShoesPage();
	}
			
	@Test(priority='1', description="Validating Title Test")
	public void ValidateTitleTest()
	{
		sp1.ValidateTitle();
	}
	
	@Test(priority='2', description="Validating Login Input Values")
	public void LoginTest() throws InterruptedException
	{
		sp1.searchshoes();
	}
	
	@AfterClass
	public void closeTest()
	{
		driver.close();
	}


}
