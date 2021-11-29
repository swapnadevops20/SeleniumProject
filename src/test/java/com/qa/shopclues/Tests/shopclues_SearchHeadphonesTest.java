package com.qa.shopclues.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.shopclues.Base.shopclues_Base;
import com.qa.shopclues.Pages.shopclues_SearchHeadphonesPage;


public class shopclues_SearchHeadphonesTest extends shopclues_Base{
	
	shopclues_SearchHeadphonesPage sp3;
	
	@BeforeClass
	public void startBrowser()
	{
		initialization();
		sp3=new shopclues_SearchHeadphonesPage();
	}
			
	@Test(priority='1', description="Validating Title Test")
	public void ValidateTitleTest()
	{
		sp3.ValidateTitle();
	}
	
	@Parameters({"headphoneInput"})
	@Test(priority='2', description="Validating Login Input Values")
	public void headphoneTest(String headphoneInput) throws InterruptedException
	{
		sp3.headphoneNamePrice(headphoneInput);
	}
	
	@AfterClass
	public void closeTest()
	{
		driver.close();
	}




}
