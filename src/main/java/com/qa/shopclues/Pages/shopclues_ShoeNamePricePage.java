package com.qa.shopclues.Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.shopclues.Base.shopclues_Base;

public class shopclues_ShoeNamePricePage extends shopclues_Base{
	
	//public void login(String username1Input,String username2Input,String username3Input) throws InterruptedException 
	
			// Locate elements 
			// WebElement e =driver.findelement(By.locatorname("value") 
			// Creating a Object repository 
			 	
	@FindBy(xpath="/html/body/div[1]/div/div/div[3]/div[1]/button[1]")
	WebElement pwin;
	
			@FindBy(xpath="//*[@id='autocomplete']")
			WebElement searchText;
			@FindBy(xpath="//*[@id='search-result']/li[3]")
			WebElement e36;
			@FindBy(xpath="//*[@id='instdcnt']")
			WebElement resultcount;
			@FindBy(xpath="//*[@id='product_list']/div[3]/div[3]/a/h2")
			WebElement disp1;
			@FindBy(xpath="//*[@id='product_list']/div[3]/div[3]/a/div[2]/div[1]/span[1]")
			WebElement disp2;
			@FindBy(xpath="//*[@id='product_list']/div[3]/div[3]/a")
			WebElement plist;
			
			// initialize the elements that are located 
			 // use class PageFactory and method initElements, driver object 
			 	
			public shopclues_ShoeNamePricePage()    //this is not a method , it is a constructor
			{
				PageFactory.initElements(driver, this); //driver is coming from Base class and this is used to initialize current Elements
			}
			
			//Action Methods on every element
			
			public void ValidateTitle() 
		 	{ 
		 		String title= driver.getTitle(); 
		 		System.out.println(title); 
		 	} 
		 	
			
			
			public void shoesNamePrice(String shoenameInput1) throws InterruptedException
			{
				Thread.sleep(2000);
				pwin.click();            //popup close
				
				 System.out.println("\n" + "TestCase#1 - Entering Nike Shoes in Input box " );
				 searchText.clear();
				 searchText.sendKeys(shoenameInput1);
				
					Thread.sleep(5000);
					
				   e36.click();
			       Thread.sleep(3000);
			       
			       System.out.println("\n" +"TestCase#1 - Results of the NikeShoes : " +resultcount.getText() );
			       Thread.sleep(3000);

			      
			
			   //displaying product name
			  
			   System.out.println("\n" + "TestCase#2 - The Name of the Product : " +disp1.getText());
			   Thread.sleep(3000);

			   //displaying price of the product
			 
			  System.out.println("\n" + "TestCase#3 - The Price of the Product : Rs" +disp2.getText() +"\n");
			  Thread.sleep(3000);

			  //driver.findElement(By.xpath("//*[@id=\"product_list\"]/div[3]/div[3]/a"));
			  plist.click();
			  
			  Thread.sleep(3000);
			  ArrayList<String> tabs=	new ArrayList<String> (driver.getWindowHandles());
			  
			  System.out.println("Names Of Windows :" +tabs +"\n");
				Thread.sleep(5000);
				
				//Navigating to 2nd tab ie 1st index
			driver.switchTo().window(tabs.get(1)).close();
			driver.switchTo().window(tabs.get(0));
			  

		}


}
