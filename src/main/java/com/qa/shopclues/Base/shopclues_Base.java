package com.qa.shopclues.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shopclues_Base {
	
	public static WebDriver driver;
	
	public static void initialization()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//Thread.sleep(3000);
		driver.get("https://www.shopclues.com/");
	
		//Implicit wait for five seconds
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
}
		
		/*
		//Declaring variables
		 String baseUrl;
		System.setProperty("webdriver.chrome.driver","E:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.out.println("\n" + "TestCase#1 - Opening ChromeDriver" + "\n");
		WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		//Create a new instance of ChromeDriver and redirect to the
		//Base URL

		 // Assign the URL to be invoked to a String variable
		 System.out.println("\n" + "TestCase#2 - Opening URL" + "\n");
		 baseUrl = "https://www.shopclues.com/";
		driver.get(baseUrl);
	
		//Implicit wait for five seconds
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
*/
		
	
		

}
