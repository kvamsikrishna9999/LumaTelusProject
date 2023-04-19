package com.telus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class RegisterSignInPage {
//	String CreateAccountXpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']";
//	String succAccountPageMsgXpath = "//span[@class='base']";
//	String firstNameXpath = "//input[@id='firstname']";
//	String lastNameXpath = "//input[@id='lastname']";
//	String signUpCheckBoxXpath = "//input[@id='is_subscribed']";
//	String emailXpath = "//input[@id='email_address']";
//	String passwordXpath = "//input[@id='password']";
//	String conformPasswordXpath = "//input[@id='password-confirmation']";
//	String createAccountButtonXpath = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]";
//	String successRegistrationMsgXpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div";
	public WebDriver driver;
  public RegisterSignInPage(WebDriver driver) {
	  this.driver=driver;
  }
	@FindBy(how=How.XPATH,using = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
	@CacheLookup
	WebElement CreateAccountXpath;
	
	@FindBy(how=How.XPATH,using = "//span[@class='base']")
	@CacheLookup
	WebElement succAccountPageMsgXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='firstname']")
	@CacheLookup
	WebElement firstNameXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='lastname']")
	@CacheLookup
	WebElement lastNameXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='is_subscribed']")
	@CacheLookup
	WebElement signUpCheckBoxXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='email_address']")
	@CacheLookup
	WebElement emailXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='password']")
	@CacheLookup
	WebElement passwordXpath;
	
	@FindBy(how=How.XPATH,using = "//input[@id='password-confirmation']")
	@CacheLookup
	WebElement conformPasswordXpath;
	
	@FindBy(how=How.XPATH,using = "//div[@id='firstname-error']")
	@CacheLookup
	WebElement firstNameErrorMsg;
    @FindBy(how=How.XPATH,using =  "//div[@id='lastname-error']")
	@CacheLookup
	WebElement lastNameErrorMsg;
    @FindBy(how=How.XPATH,using = "//div[@id='email_address-error']")
	@CacheLookup
	WebElement emailErrorMsg;
    @FindBy(how=How.XPATH,using = "//div[@id='password-error']")
	@CacheLookup
	WebElement passwordErrorMSg;
    @FindBy(how=How.XPATH,using = "//div[@id='password-confirmation-error']")
	@CacheLookup
	WebElement conformPasswordErrorMSg;
	
	@FindBy(how=How.XPATH,using = "//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")
	@CacheLookup
	WebElement createAccountButtonXpath;
	
	@FindBy(how=How.XPATH,using = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div")
	@CacheLookup
	WebElement successRegistrationMsgXpath;
	
	public void getCretePage() {
		if(CreateAccountXpath.isDisplayed()) {
			 CreateAccountXpath.click();
			Reporter.log("Create account link is clicked successfully");
		}
		else
		{
			Reporter.log("Create account link is not clicked successfully");
		}
	}
	
	public void setFirstName(String firstNameInput) {
			if(firstNameXpath.isDisplayed()) {
				firstNameXpath.sendKeys(firstNameInput);
				Reporter.log("FirstName is displayed successfully as "+firstNameInput);
			}
			else
			{
				Reporter.log("FirstName is not displayed successfully");
			}
		}
	
	public void getFirstNameErrorMsg() throws Exception {
		if(firstNameErrorMsg.isDisplayed()) {
			Reporter.log("FirstNameError Msg is displayed successfully");

			String actRegPageTitle = firstNameErrorMsg.getText();
			String expRegPageTitle = "This is a required field.";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				Reporter.log("Actual and Expected title is same");
				Reporter.log("The FirstNameError Msg is displayed as " + actRegPageTitle);
			}
			else {
				Reporter.log("Actual and Expected result is not same");
				Reporter.log("The Actual FirstNameError Msg title is : "+ actRegPageTitle);
				Reporter.log("The Expected FirstNameError Msg title is : "+ expRegPageTitle);
			}
		}
	}
	
	public void setLastName(String lastNameInput) {
		if(lastNameXpath.isDisplayed()) {
			lastNameXpath.sendKeys(lastNameInput);
			Reporter.log("LastName is displayed successfully as "+lastNameInput);
		}
		else
		{
			Reporter.log("LastName is not displayed successfully");
		}
	}
	
	public void getLastNameErrorMsg() throws Exception {
		if(lastNameErrorMsg.isDisplayed()) {
			Reporter.log("lastNameError Msg is displayed successfully");

			String actRegPageTitle = lastNameErrorMsg.getText();
			String expRegPageTitle = "This is a required field.";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				Reporter.log("Actual and Expected title is same");
				Reporter.log("The lastNameError Msg is displayed as " + actRegPageTitle);
			}
			else {
				Reporter.log("Actual and Expected result is not same");
				Reporter.log("The Actual lastNameError Msg title is : "+ actRegPageTitle);
				Reporter.log("The Expected lastNameError Msg title is : "+ expRegPageTitle);
			}
		}
	}
	
	public void clickRegisterBtn() {
		if(signUpCheckBoxXpath.isDisplayed()) {

			Reporter.log("SignUp button is displayeded successfully");
		}
		else {
			Reporter.log("SignUp button is not displayed successfully");
		}
		//verify SignUp btn is enabled are not
		if(signUpCheckBoxXpath.isEnabled()) {
			Reporter.log("SignUp button is enabled successfully");
			signUpCheckBoxXpath.click();
			Reporter.log("SignUp button is clicked");
		}
		else {
			Reporter.log("SignUp button is not enabled successfully");
		}
	}
	public void email(String emailInput) {
		if(emailXpath.isDisplayed()) {
			emailXpath.sendKeys(emailInput);
			Reporter.log("email is displayed successfully as "+emailInput);
		}
		else
		{
			Reporter.log("FirstName is not displayed successfully");
		}
	}
	
	public void getEmailErrorMsg() throws Exception {
		if(emailErrorMsg.isDisplayed()) {
			Reporter.log("emailError Msg is displayed successfully");

			String actRegPageTitle = emailErrorMsg.getText();
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
	
	public void password(String passwordInput) {
		if(passwordXpath.isDisplayed()) {
			passwordXpath.sendKeys(passwordInput);
			Reporter.log("email is displayed successfully as "+ passwordInput);
		}
		else
		{
			Reporter.log("FirstName is not displayed successfully");
		}
	}
	
	public void getPasswordErrorMsg() throws Exception {
		if(passwordErrorMSg.isDisplayed()) {
			Reporter.log("passwordError Msg is displayed successfully");

			String actRegPageTitle = passwordErrorMSg.getText();
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
	
	public void conformPassword(String conformPasswordInput) {
		if(conformPasswordXpath.isDisplayed()) {
			conformPasswordXpath.sendKeys(conformPasswordInput);
			Reporter.log("email is displayed successfully as "+conformPasswordInput);
		}
		else
		{
			Reporter.log("FirstName is not displayed successfully");
		}
	}
	
	public void getConfirmPasswordErrorMsg() throws Exception {
		if(conformPasswordErrorMSg.isDisplayed()) {
			Reporter.log("conformPasswordError Msg is displayed successfully");

			String actRegPageTitle = conformPasswordErrorMSg.getText();
			String expRegPageTitle = "This is a required field.";
			if(actRegPageTitle.equals(expRegPageTitle)) {
				Reporter.log("Actual and Expected title is same");
				Reporter.log("The conformPasswordError Msg is displayed as " + actRegPageTitle);
			}
			else {
				Reporter.log("Actual and Expected result is not same");
				Reporter.log("The Actual conformPasswordError Msg title is : "+ actRegPageTitle);
				Reporter.log("The Expected conformPasswordError Msg title is : "+ expRegPageTitle);
			}
		}
	}
	
	public void creteAccountBtn() {
		if(createAccountButtonXpath.isSelected()) {

			Reporter.log("CreteAccount button is Selected successfully");
		}
		else {
			Reporter.log("CreteAccount button is not Selected successfully");
		}
		//verify CreteAccount btn is enabled are not
		if(createAccountButtonXpath.isEnabled()) {
			Reporter.log("CreteAccount button is enabled successfully");
			createAccountButtonXpath.click();
			Reporter.log("CreteAccount button is clicked");
		}
		else {
			Reporter.log("SignUp button is not enabled successfully");
		}
}
}
