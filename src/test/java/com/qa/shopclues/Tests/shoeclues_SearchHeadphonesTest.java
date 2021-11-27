package com.qa.shopclues.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.shopclues.Base.shopclues_Base;
import com.qa.shopclues.Pages.shoeclues_SearchHeadphonesPage;


public class shoeclues_SearchHeadphonesTest extends shopclues_Base{
	
	shoeclues_SearchHeadphonesPage sp3;
	
	@BeforeClass
	public void startBrowser()
	{
		initialization();
		sp3=new shoeclues_SearchHeadphonesPage();
	}
			
	@Test(priority='1', description="Validating Title Test")
	public void ValidateTitleTest()
	{
		sp3.ValidateTitle();
	}
	
	@Test(priority='2', description="Validating Login Input Values")
	public void shoeNamePriceTest() throws InterruptedException
	{
		sp3.headphoneNamePrice();
	}
	
	@AfterClass
	public void closeTest()
	{
		driver.close();
	}




}
