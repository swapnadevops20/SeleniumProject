package com.qa.shopclues.Tests;


import org.testng.annotations.Test;

import com.qa.shopclues.Base.shopclues_Base;
import com.qa.shopclues.Pages.shoeclues_SearchHeadphonesPage;
import com.qa.shopclues.Pages.shoeclues_SearchShoesPage;
import com.qa.shopclues.Pages.shopclues_LoginPage;
import com.qa.shopclues.Pages.shopclues_MainPage;
import com.qa.shopclues.Pages.shopclues_ShoeNamePricePage;

public class shopclues_MainTest extends shopclues_Base{

	shopclues_LoginPage sp;
	shoeclues_SearchShoesPage sp1;
	shopclues_ShoeNamePricePage sp2;
	shoeclues_SearchHeadphonesPage sp3;
	shopclues_MainPage sp4;
	
	@Test(priority='2',description="Login,SearchingShoes,ShoeNamePrice,HeadphoneNamePrice")
	public void setup() throws InterruptedException
	{
		initialization();
		sp=new shopclues_LoginPage();
		sp.login();
		sp1=new shoeclues_SearchShoesPage();
		sp1.searchshoes();
		sp2=new shopclues_ShoeNamePricePage();
		sp2.shoesNamePrice();
		sp3=new shoeclues_SearchHeadphonesPage();
		sp3.headphoneNamePrice();
		Thread.sleep(3000);
	}
	
	@Test(priority='2',description="Closing the Driver")
	public void closeTest()
	{
		driver.close();
	}

}
