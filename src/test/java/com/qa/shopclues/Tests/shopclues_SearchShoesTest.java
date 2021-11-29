package com.qa.shopclues.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.shopclues.Base.shopclues_Base;
import com.qa.shopclues.Pages.shopclues_SearchShoesPage;
import com.qa.shopclues.Pages.shopclues_LoginPage;

public class shopclues_SearchShoesTest extends shopclues_Base{
	
shopclues_SearchShoesPage sp1;
	
	@BeforeClass
	public void startBrowser()
	{
		initialization();
		sp1=new shopclues_SearchShoesPage();
	}
			
	@Test(priority='1', description="Validating Title Test")
	public void ValidateTitleTest()
	{
		sp1.ValidateTitle();
	}
	
	@Parameters({"shoenameInput"})
	@Test(priority='2', description="Validating Login Input Values")
	public void LoginTest(String shoenameInput) throws InterruptedException
	{
		sp1.searchshoes(shoenameInput);
	}
	
	@AfterClass
	public void closeTest()
	{
		driver.close();
	}


}
