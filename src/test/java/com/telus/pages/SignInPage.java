package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class SignInPage {

	public WebDriver driver;
	//	  String signInLinkXpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]";
	//		String pageTitleSignInXpath = "//span[@class='base']";
	//		String emailIdSignINXpath = "//input[@id='email']";
	//		String passwordSignInXpath = "//fieldset[@class='fieldset login']//input[@id='pass']";
	//		String signInBtnXpath = "//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]";
	//		String signInWelcomeMsgXpath = "/html/body/div[2]/header/div[1]/div/ul/li[1]/span";
	
	@FindBy(how=How.XPATH,using = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
	@CacheLookup
	WebElement signInLinkXpath;

	@FindBy(how=How.XPATH,using = "//span[@class='base']")
	@CacheLookup
	WebElement pageTitleSignInXpath;

	@FindBy(how=How.XPATH,using = "//input[@id='email']")
	@CacheLookup
	WebElement emailIdSignINXpath;
	
	@FindBy(how=How.XPATH,using = "//div[@id='email-error']")
	@CacheLookup
	WebElement emailIdErrorMsgXpath;

	@FindBy(how=How.XPATH,using = "//fieldset[@class='fieldset login']//input[@id='pass']")
	@CacheLookup
	WebElement passwordSignInXpath;
	
	@FindBy(how=How.XPATH,using = "//div[@id='pass-error']")
	@CacheLookup
	WebElement passwordErrorMsgXpath;

	@FindBy(how=How.ID,using = "send2")
	@CacheLookup
	WebElement signInBtnId;
	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}
    
	public void getSignInPage()  {
		if(signInLinkXpath.isSelected()) {

			Reporter.log("SignIn button is displayeded successfully");
		}
		else {
			Reporter.log("SignIn button is not displayed successfully");
		}
		//verify SignUp btn is enabled are not
		if(signInLinkXpath.isEnabled()) {
			Reporter.log("SignIn button is enabled successfully");
			signInLinkXpath.click();
			Reporter.log("SignUp button is clicked");
		}
		else {
			Reporter.log("SignIn button is not enabled successfully");
		}
	}
	
	public void getSignInPageTitle() {
		if(pageTitleSignInXpath.isDisplayed()) {
			String msg = pageTitleSignInXpath.getText();
			Reporter.log(msg);
			Reporter.log("Title is displayed as :"+ msg);
		}else {
			Reporter.log("Title is not displayed successfully");

		}
	}
	public void signInEmail(String emailInput) {
		if(emailIdSignINXpath.isDisplayed()) {
			emailIdSignINXpath.sendKeys(emailInput);
			Reporter.log("email is displayed successfully as "+emailInput);
		}
		else
		{
			Reporter.log("email is not displayed successfully");
		}
	}
	
	public void getEmailErrorMsg() throws Exception {
		if(emailIdErrorMsgXpath.isDisplayed()) {
			Reporter.log("emailError Msg is displayed successfully");

			String actRegPageTitle = emailIdErrorMsgXpath.getText();
			String expRegPageTitle = "This is a required field.";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				Reporter.log("Actual and Expected title is same");
				Reporter.log("The emailError Msg is displayed as " + actRegPageTitle);
			}
			else {
				Reporter.log("Actual and Expected result is not same");
				Reporter.log("The Actual emailError Msg title is : "+ actRegPageTitle);
				Reporter.log("The Expected emailError Msg title is : "+ expRegPageTitle);
			}
		}
	}
	
	public void signInPassword(String passwordInput) {
		if(passwordSignInXpath.isDisplayed()) {
			passwordSignInXpath.sendKeys(passwordInput);
			Reporter.log("password is displayed successfully as "+ passwordInput);
		}
		else
		{
			Reporter.log("password is not displayed successfully");
		}
	}
	
	public void getPasswordErrorMsg() throws Exception {
		if(passwordErrorMsgXpath.isDisplayed()) {
			Reporter.log("passwordError Msg is displayed successfully");

			String actRegPageTitle = passwordErrorMsgXpath.getText();
			String expRegPageTitle = "This is a required field.";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				Reporter.log("Actual and Expected title is same");
				Reporter.log("The passwordError Msg is displayed as " + actRegPageTitle);
			}
			else {
				Reporter.log("Actual and Expected result is not same");
				Reporter.log("The Actual passwordError Msg title is : "+ actRegPageTitle);
				Reporter.log("The Expected passwordError Msg title is : "+ expRegPageTitle);
			}
		}
	}
	
	public void clickSignInBtn() {
	
		if(signInBtnId.isSelected()) {

			Reporter.log("SignIn button is Selected successfully");
		}
		else {
			Reporter.log("SignIn button is not Selected successfully");
		}
		//verify SignUp btn is enabled are not
		if(signInBtnId.isEnabled()) {
			signInBtnId.click();
			Reporter.log("SignUp button is clicked");
			Reporter.log("SignIn button is enabled successfully");
		}
		else {
			Reporter.log("SignIn button is not enabled successfully");
		}
}

}