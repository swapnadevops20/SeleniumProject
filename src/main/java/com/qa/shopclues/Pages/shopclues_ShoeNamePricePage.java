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
		 	
			//@Parameters({"username1Input","username2Input","username3Input"})
			//public void login(String username1Input,String username2Input,String username3Input) throws InterruptedException
			public void shoesNamePrice() throws InterruptedException
			{
				//Entering data into search box
				 WebElement searchText=driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
				searchText.clear();
				 searchText.sendKeys("Nike Shoes");
					
				//displaying 3rd item in the list box and selecting  on the item
			       WebElement e36=driver.findElement(By.xpath("//*[@id=\"search-result\"]/li[3]"));
			       e36.click();
			       Thread.sleep(3000);
			       
			       //Displaying Results of the product
			       WebElement resultcount=driver.findElement(By.xpath("//*[@id='instdcnt']"));
			       System.out.println("\n" +"TestCase#1 - Results of the NikeShoes : " +resultcount.getText() );
			       Thread.sleep(3000);

			       /*
			       //opening the product list page
			       WebElement did=driver.findElement(By.xpath("//*[@id='product_list']/div[3]/div[3]"));
			       System.out.println(did.getText() +"\n");
			       */
			  
			
			   //displaying product name
			   WebElement disp1=driver.findElement(By.xpath("//*[@id='product_list']/div[3]/div[3]/a/h2"));
			   System.out.println("\n" + "TestCase#2 - The Name of the Product : " +disp1.getText());
			   Thread.sleep(3000);

			   //displaying price of the product
			  WebElement disp2= driver.findElement(By.xpath("//*[@id='product_list']/div[3]/div[3]/a/div[2]/div[1]/span[1]"));
			  System.out.println("\n" + "TestCase#3 - The Price of the Product : Rs" +disp2.getText() +"\n");
			  Thread.sleep(3000);

			  driver.findElement(By.xpath("//*[@id=\"product_list\"]/div[3]/div[3]/a")).click();
			  
			  Thread.sleep(3000);
			  ArrayList<String> tabs=	new ArrayList<String> (driver.getWindowHandles());
			  
			  System.out.println("Names Of Windows :" +tabs +"\n");
				Thread.sleep(5000);
				
				//Navigating to 2nd tab ie 1st index
			driver.switchTo().window(tabs.get(1)).close();
			driver.switchTo().window(tabs.get(0));
			  

		}


}
