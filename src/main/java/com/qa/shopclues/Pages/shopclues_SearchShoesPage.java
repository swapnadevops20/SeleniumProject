package com.qa.shopclues.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.shopclues.Base.shopclues_Base;

public class shopclues_SearchShoesPage extends shopclues_Base{

//public void login(String username1Input,String username2Input,String username3Input) throws InterruptedException 
		
		// Locate elements 
		// WebElement e =driver.findelement(By.locatorname("value") 
		// Creating a Object repository 
		 	
	@FindBy(xpath="/html/body/div[1]/div/div/div[3]/div[1]/button[1]")
	WebElement pwin;
	
		@FindBy(xpath="//*[@id='autocomplete']")
		WebElement searchText;
		@FindBy(xpath="//*[@id='search-result']")
		WebElement e33;
		@FindBy(xpath="//*[@id='search-result']/li[1]")
		WebElement e34;
		@FindBy(xpath="//*[@id='search-result']/li[2]")
		WebElement e35;
		@FindBy(xpath="//*[@id='search-result']/li[3]")
		WebElement e36;
		@FindBy(xpath="//*[@id='search']/a")
		WebElement e37;
		
		// initialize the elements that are located 
		 // use class PageFactory and method initElements, driver object 
		 	
		public shopclues_SearchShoesPage()    //this is not a method , it is a constructor
		{
			PageFactory.initElements(driver, this); //driver is coming from Base class and this is used to initialize current Elements
		}
		
		//Action Methods on every element
		
		public void ValidateTitle() 
	 	{ 
	 		String title= driver.getTitle(); 
	 		System.out.println(title); 
	 	} 
	 	
		
		
		public void searchshoes(String shoenameInput) throws InterruptedException
		{
			Thread.sleep(2000);
			pwin.click();            //popup close
			
			 //Entering data into search box
			 //WebElement searchText=driver.findElement(By.xpath("//*[@id=\"autocomplete\"]"));
			 System.out.println("\n" + "TestCase#1 - Entering Nike Shoes in Input box " );
			 searchText.clear();
			 searchText.sendKeys(shoenameInput);
			
				Thread.sleep(5000);
			
				//displaying all items in the list box
				//WebElement e33=driver.findElement(By.xpath("//*[@id=\"search-result\"]"));
				System.out.println("\n" + "TestCase#2 - Displaying all items in the list box :\n" +e33.getText());
					
				
				//displaying 1st item in the list box
		       // WebElement e34=driver.findElement(By.xpath("//*[@id=\"search-result\"]/li[1]"));
		        System.out.println("\n" + "TestCase#3 - Selecting 1st item in the list box : " +e34.getText());
		        //System.out.println(e34.isEnabled());
		        	
		        
		      //displaying 2nd item in the list box
		       // WebElement e35=driver.findElement(By.xpath("//*[@id=\"search-result\"]/li[2]"));
		        System.out.println("\n" + "TestCase#3 - Selecting 2nd item in the list box : " +e35.getText());
		       // e35.isDisplayed();
		        	
		        
		      //displaying 3rd item in the list box and selecting  on the item
		       // WebElement e36=driver.findElement(By.xpath("//*[@id=\"search-result\"]/li[3]"));
		        System.out.println("\n" + "TestCase#3 - Selecting 3rd item in the list box : " +e36.getText());
		       // System.out.println(e36.isEnabled());
		        e36.click();
		        Thread.sleep(8000);
		        //clicking on search Button
		      // WebElement e37= driver.findElement(By.xpath("//*[@id=\"search\"]/a"));
		        System.out.println("\n" + "TestCase#4 - Selecting the given product and Searching on the app : " +e37.getText() +"\n");
		        e37.click();
		        Thread.sleep(3000);
		        
		    //    driver.close();


	}


}
