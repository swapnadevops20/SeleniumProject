package com.qa.shopclues.Tests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.shopclues.Base.shopclues_Base;
import com.qa.shopclues.Pages.shopclues_SearchHeadphonesPage;
import com.qa.shopclues.Pages.shopclues_SearchShoesPage;
import com.qa.shopclues.Pages.shopclues_LoginPage;
import com.qa.shopclues.Pages.shopclues_MainPage;
import com.qa.shopclues.Pages.shopclues_ShoeNamePricePage;

public class shopclues_MainTest extends shopclues_Base{

	shopclues_LoginPage sp;
	shopclues_SearchShoesPage sp1;
	shopclues_ShoeNamePricePage sp2;
	shopclues_SearchHeadphonesPage sp3;
	shopclues_MainPage sp4;
	
	@Parameters({"uname1Input","headphoneInput"})
	@Test(priority='1',description="Login,SearchingShoes,ShoeNamePrice,HeadphoneNamePrice")
	public void setup() throws InterruptedException
	{
		initialization();
		
		/*
		 * sp=new shopclues_LoginPage(String uname1Input,String uname2Input,String
		 * uname3Input); sp.login(uname1Input,uname2Input,uname3Input);
		 * 
		 * sp1=new shopclues_SearchShoesPage(); sp1.searchshoes();
		 * 
		 * sp2=new shopclues_ShoeNamePricePage(); sp2.shoesNamePrice();
		 * 
		 * sp3=new shopclues_SearchHeadphonesPage(); sp3.headphoneNamePrice();
		 */
		Thread.sleep(3000);
	}
	
	@Test(priority='2',description="Closing the Driver")
	public void closeTest()
	{
		driver.close();
	}

}
