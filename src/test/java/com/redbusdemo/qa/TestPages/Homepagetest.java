package com.redbusdemo.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.redbusdemo.qa.base.Testbase;
import com.redbusdemo.qa.pages.Homepage;

public class Homepagetest extends Testbase {
    Homepage hp;
	
	@BeforeMethod
	public void OpenApp()
	{
		openBrowser();
		hp = new Homepage(driver);
	}
	
	
	@AfterMethod
	public void CloseApp()
	{
		driver.quit();
	}
	
	@Test(priority='1')
	public void testTitle()
	{
		hp.gettitle();
	}
	

	@Test(priority='2')
	public void testsource()
	{
		hp.clickonsource(); 
		hp.gettitle();  
	}

	@Test(priority='3')
	public void testdestination()
	{
		hp.clickondestination(); 
		hp.gettitle(); 
	}
	
	
	@Test(priority='4')
	public void testdate() throws InterruptedException
	{
		hp.clickondate();
		hp.gettitle();
	}
	
	@Test(priority='5')
	public void testsearch() 
	{
		hp.clickonsearch();
		hp.gettitle();
	}
	
}



