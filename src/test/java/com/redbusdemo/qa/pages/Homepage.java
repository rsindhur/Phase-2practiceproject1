package com.redbusdemo.qa.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.redbusdemo.qa.base.Testbase;

public class Homepage  extends Testbase{
	
	Actions a = new Actions(driver);
	// Create PageFactory
	// this code will find the element using xpath locator and store it in webelement object myaccount
	
	@FindBy(xpath = "//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")
	WebElement Source;
	
	@FindBy(xpath = "//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")
	WebElement Destination;
	
	@FindBy(xpath="/html/body/section/div[2]/main/div[3]/div/div[1]/div[2]/div/div/div[5]/label")
	WebElement date;
	
	@FindBy(xpath="/html/body/section/div[2]/main/div[3]/div/div[1]/div[2]/div/button")
	WebElement search;
	
	
	// create constructor of current class to initaiate the elements
	// every page class will ahve a constructor initiating the elements
	
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		// driver can now work with your elements and methods of this class
		
	}

	
	// We will now write action methods, that will perform action on these elements
	//but these methods will not be executed here.
	
	public void gettitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	
	// method name is similar to action to be done
	
	public void clickonsource()
	{
		Source.click();
	}
	
	public void clickondestination()
	{
		Destination.click();
	}
	
	public void clickondate()
	{
		date.click();
	}
	
	public void clickonsearch()
	{
		search.click();
	}
	
	
	
	
	
}



