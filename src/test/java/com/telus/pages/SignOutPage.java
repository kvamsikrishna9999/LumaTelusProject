package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignOutPage {

//	String welcomeNameDropdownXpath = "//button[@class='action switch']";
//	String signOutXpath = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']";
	public WebDriver driver;
	  public SignOutPage(WebDriver driver) {
		  this.driver=driver;
	  }
		@FindBy(how=How.XPATH,using = "//div[@class='panel header']//button[@type='button']")
		@CacheLookup
		WebElement welcomeNameDropdownXpath;
		@FindBy(how=How.XPATH,using = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")
		@CacheLookup
		WebElement signOutXpath;
     
		public void clickForSignOutOption() throws InterruptedException {
			if(welcomeNameDropdownXpath.isDisplayed()) {

				System.out.print("welcomeName button is displayeded successfully");
			}
			else {
				System.out.print("welcomeName button is not displayed successfully");
			}
			//verify CreteAccount btn is enabled are not
			if(welcomeNameDropdownXpath.isEnabled()) {
				Actions action = new Actions(driver);
				action.moveToElement(welcomeNameDropdownXpath).build().perform();
				System.out.print("welcomeName button is enabled successfully");
				welcomeNameDropdownXpath .click();
				System.out.print("welcomeName button is clicked");
			}
			else {
				System.out.print("welcomeName button is not enabled successfully");
			}
		}
		 public void signOut() {
			 if(signOutXpath.isSelected()) {
	
				 System.out.println("SignOut button is enabled successfully");

			 }else {
				 System.out.println("SignOut button is clicked successfully");
			 }
				//verify SignUp btn is enabled are not
				if(signOutXpath.isEnabled()) {
					System.out.print("SignIn button is enabled successfully");
					 Actions action = new Actions(driver);
						action.moveToElement(signOutXpath).build().perform();
					signOutXpath.click();
					 System.out.println("SignOut button is clicked successfully");
				}
				else {
					System.out.print("SignOut button is not enabled successfully");
				}
		 }
		
}
