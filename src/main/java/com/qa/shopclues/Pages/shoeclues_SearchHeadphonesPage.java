package com.qa.shopclues.Pages;

import java.util.ArrayList;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.shopclues.Base.shopclues_Base;

public class shoeclues_SearchHeadphonesPage extends shopclues_Base{
	
	// Locate elements 
	// WebElement e =driver.findelement(By.locatorname("value") 
	// Creating a Object repository 
	 	
	@FindBy(xpath="//*[@id='autocomplete']")
	WebElement searchText;
	@FindBy(xpath="//*[@id='search']/input[2]")
	WebElement e37;
	@FindBy(xpath="//*[@id='instdcnt']")
	WebElement result;
	@FindBy(xpath="//*[@id='product_list']/div[3]/div[2]/a")
	WebElement disppage;
	@FindBy(xpath="//*[@id='main_data']/div[2]/div[2]/h1")
	WebElement disp1;
	@FindBy(xpath="//*[@id='main_data']/div[2]/div[2]/div[3]/span[1]")
	WebElement disp2;
	
	// initialize the elements that are located 
	 // use class PageFactory and method initElements, driver object 
	 	
	public shoeclues_SearchHeadphonesPage()    //this is not a method , it is a constructor
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
	public void headphoneNamePrice() throws InterruptedException
	{
		 //Entering data into search box
		// WebElement searchText=driver.findElement(By.xpath("//*[@id='autocomplete']"));
		searchText.clear();
		 searchText.sendKeys("headphones");
		Thread.sleep(5000);

     //clicking on search Button
		
		
		//WebElement e37= driver.findElement(By.xpath("//*[@id=\"search\"]/input[2]"));
   // WebElement e37= driver.findElement(By.xpath("//*[@id='search']/a"));
     e37.click();
     
     //WebElement result=driver.findElement(By.xpath("//*[@id=\"instdcnt\"]"));
     
     System.out.println("\n" + "TestCase#1 - The Results of the HeadPhones :" +result.getText());
     
     
    String ts=result.getText();
     if(ts.equalsIgnoreCase("O"))
     {
     	System.out.println("\n" + "TestCase#2 - The result is O,So it is not Displaying any Product ");
     }


     System.out.println("\n" + "TestCase#2 - The result of the Page is Greater than 0 " );
     Thread.sleep(3000);
     
//WebElement disppage=driver.findElement(By.xpath("//*[@id='product_list']/div[3]/div[2]/a"));
disppage.click();
System.out.println("\n" + "TestCase#3 - Displaying the Selected Product Page :\n" +disppage.getText() );


ArrayList<String> tabs=	new ArrayList<String> (driver.getWindowHandles());

System.out.println("\n" + "TestCase#4 - Names Of Windows :" +tabs );
Thread.sleep(5000);

//Navigating to 2nd tab ie 1st index
driver.switchTo().window(tabs.get(1));
Thread.sleep(5000);

//displaying product name
//WebElement disp1=driver.findElement(By.xpath("//*[@id='main_data']/div[2]/div[2]/h1"));

System.out.println("\n" + "TestCase#5 - The Name of the Product :" +disp1.getText() );

//displaying price of the product
//WebElement disp2= driver.findElement(By.xpath("//*[@id='main_data']/div[2]/div[2]/div[3]/span[1]"));

System.out.println("\n" + "TestCase#6 - The Price of the Product : Rs" +disp2.getText() +"\n" );

			Thread.sleep(3000);
							
				//Navigating to 2nd tab ie 1st index
			driver.switchTo().window(tabs.get(1)).close();
			driver.switchTo().window(tabs.get(0));
					

}


}
