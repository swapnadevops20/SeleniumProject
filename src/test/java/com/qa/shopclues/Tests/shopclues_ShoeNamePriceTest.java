package com.qa.shopclues.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.shopclues.Base.shopclues_Base;

import com.qa.shopclues.Pages.shopclues_ShoeNamePricePage;

public class shopclues_ShoeNamePriceTest extends shopclues_Base{
	
	shopclues_ShoeNamePricePage sp2;
	
	@BeforeClass
	public void startBrowser()
	{
		initialization();
		sp2=new shopclues_ShoeNamePricePage();
	}
			
	@Test(priority='1', description="Validating Title Test")
	public void ValidateTitleTest()
	{
		sp2.ValidateTitle();
	}
	
	@Test(priority='2', description="Validating Login Input Values")
	public void shoeNamePriceTest() throws InterruptedException
	{
		sp2.shoesNamePrice();
	}
	
	@AfterClass
	public void closeTest()
	{
		driver.close();
	}



}
