 package com.telus.testcases;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.telus.pages.AddressPage;
import com.telus.pages.CartPage;
import com.telus.pages.CompanyLogoPage;
import com.telus.pages.DropDownPage;
import com.telus.pages.MenProductsNamesPages;
import com.telus.pages.PaymentPage;
import com.telus.pages.ProductPage;
import com.telus.pages.RegisterSignInPage;
import com.telus.pages.SignInPage;
import com.telus.pages.SignOutPage;
import com.telus.pages.SuccessfulValidationPage;
import com.telus.pages.WomenProductsNamesPages;
import com.telus.seleniumframework.base.BaseClass;

public class EndToEndTestFlow extends BaseClass{
	String url = "https://magento.softwaretestingboard.com/";
	String firstNameInput = "vijay";
	String lastNameInput = "Antony";
	Random random = new Random(); 
	int em = random.nextInt(1000);
	String emailInput ="krish"+em+"@gamil.com";
	String passwordInput = "Antony@143";
	String confirmPasswordInput = "Antony@143";
	String welcome="Thank you for registering with Fake Online Clothing Store.";
    String ExcpectedMsg ="You added Cruise Dual Analog Watch to your shopping cart.";
	String companyInput = "Telus";
	String streetAddressInput = "1-4 main Street ,sanampudi";
	String cityInput = "Singarayakonda";
	String postalCodeInput = "523101";
	String phoneNumInput = "9999999999";
	String countryInput = "India";
	String stateInput = "Andhra Pradesh";
//	@Test(priority = 1)
//	public void launchApplicationUrl() {
//		// Set the system properties for the chromedriver.
//		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
//		// Creating the driver instance to the webdriver interface.
//		driver = new ChromeDriver();
//		// launching url application.
//		driver.get(url);
//		// maximing the webpage.
//		driver.manage().window().maximize();
//		Reporter.log("Application is launched successfully");
//}
	@Test(priority = 1)
	public void logoPageValidation() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		CompanyLogoPage logopage = PageFactory.initElements(driver, CompanyLogoPage.class );
		logopage.companyLogo();
	}
	
	@Test(priority = 2)

	public void customerLogin1() throws Exception {
		RegisterSignInPage registerPage = PageFactory.initElements(driver, RegisterSignInPage.class);
		registerPage.getCretePage();
		registerPage.creteAccountBtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		registerPage.setFirstName(firstNameInput);
//		registerPage.setLastName(lastNameInput);
//		registerPage.clickRegisterBtn();
//		registerPage.email(emailInput);
//		registerPage.password(passwordInput);
//		registerPage.conformPassword(confirmPasswordInput);
		registerPage.getFirstNameErrorMsg();
		registerPage.getLastNameErrorMsg();
		registerPage.getEmailErrorMsg();
		registerPage.getPasswordErrorMsg();
		registerPage.getConfirmPasswordErrorMsg();	
	}
	
	@Test(priority = 3)

	public void customerLogin2() throws Exception {
		RegisterSignInPage registerPage = PageFactory.initElements(driver, RegisterSignInPage.class);
		registerPage.getCretePage();
//		registerPage.setFirstName(firstNameInput);
		registerPage.setLastName(lastNameInput);
		registerPage.clickRegisterBtn();
		registerPage.email(emailInput);
		registerPage.password(passwordInput);
		registerPage.conformPassword(confirmPasswordInput);
		registerPage.creteAccountBtn();
		registerPage.getFirstNameErrorMsg();
//		registerPage.getLastNameErrorMsg();
//		registerPage.getEmailErrorMsg();
//		registerPage.getPasswordErrorMsg();
//		registerPage.getConfirmPasswordErrorMsg();	
	}
	@Test(priority = 4)
	public void customerLogin3() throws Exception {
		RegisterSignInPage registerPage = PageFactory.initElements(driver, RegisterSignInPage.class);
		registerPage.getCretePage();
		registerPage.setFirstName(firstNameInput);
//		registerPage.setLastName(lastNameInput);
		registerPage.clickRegisterBtn();
		registerPage.email(emailInput);
		registerPage.password(passwordInput);
		registerPage.conformPassword(confirmPasswordInput);
		registerPage.creteAccountBtn();
//		registerPage.getFirstNameErrorMsg();
		registerPage.getLastNameErrorMsg();
//		registerPage.getEmailErrorMsg();
//		registerPage.getPasswordErrorMsg();
//		registerPage.getConfirmPasswordErrorMsg();	
	}
	@Test(priority = 5)
	public void customerLogin4() throws Exception {
		RegisterSignInPage registerPage = PageFactory.initElements(driver, RegisterSignInPage.class);
		registerPage.getCretePage();
		registerPage.setFirstName(firstNameInput);
		registerPage.setLastName(lastNameInput);
		registerPage.clickRegisterBtn();
//		registerPage.email(emailInput);
		registerPage.password(passwordInput);
		registerPage.conformPassword(confirmPasswordInput);
		registerPage.creteAccountBtn();
//		registerPage.getFirstNameErrorMsg();
//		registerPage.getLastNameErrorMsg();
		registerPage.getEmailErrorMsg();
//		registerPage.getPasswordErrorMsg();
//		registerPage.getConfirmPasswordErrorMsg();	
	}
	@Test(priority = 6)
	public void customerLogin5() throws Exception {
		RegisterSignInPage registerPage = PageFactory.initElements(driver, RegisterSignInPage.class);
		registerPage.getCretePage();
		registerPage.setFirstName(firstNameInput);
		registerPage.setLastName(lastNameInput);
		registerPage.clickRegisterBtn();
		registerPage.email(emailInput);
//		registerPage.password(passwordInput);
		registerPage.conformPassword(confirmPasswordInput);
		registerPage.creteAccountBtn();
//		registerPage.getFirstNameErrorMsg();
//		registerPage.getLastNameErrorMsg();
//		registerPage.getEmailErrorMsg();
		registerPage.getPasswordErrorMsg();
//		registerPage.getConfirmPasswordErrorMsg();	
	}
	@Test(priority = 7)
	public void customerLogin6() throws Exception {
		RegisterSignInPage registerPage = PageFactory.initElements(driver, RegisterSignInPage.class);
		registerPage.getCretePage();
		registerPage.setFirstName(firstNameInput);
		registerPage.setLastName(lastNameInput);
		registerPage.clickRegisterBtn();
		registerPage.email(emailInput);
		registerPage.password(passwordInput);
//		registerPage.conformPassword(confirmPasswordInput);
		registerPage.creteAccountBtn();
//		registerPage.getFirstNameErrorMsg();
//		registerPage.getLastNameErrorMsg();
//		registerPage.getEmailErrorMsg();
//		registerPage.getPasswordErrorMsg();
		registerPage.getConfirmPasswordErrorMsg();	
	}
	
	@Test(priority = 8)

	public void customerLogin() {
		RegisterSignInPage registerPage = PageFactory.initElements(driver, RegisterSignInPage.class);
		registerPage.getCretePage();
		registerPage.setFirstName(firstNameInput);
		registerPage.setLastName(lastNameInput);
		registerPage.clickRegisterBtn();
		registerPage.email(emailInput);
		registerPage.password(passwordInput);
		registerPage.conformPassword(confirmPasswordInput);
		registerPage.creteAccountBtn();
	}
	
	@Test(priority = 9)

	public void signOutOption() throws Exception{
		SignOutPage registerPage = PageFactory.initElements(driver, SignOutPage.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		registerPage.clickForSignOutOption();
		registerPage.signOut();
	}
   
	@Test(priority = 10)

	public void signInFunctionality() throws Exception{
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		SignInPage signInPage1 = PageFactory.initElements(driver, SignInPage.class);
		signInPage1.getSignInPage();
		signInPage1.getSignInPageTitle();
//		signInPage1.signInEmail(emailInput);
//		signInPage1.signInPassword(passwordInput);
		signInPage1.clickSignInBtn();
		signInPage1.getEmailErrorMsg();
		signInPage1.getPasswordErrorMsg();	
	}
	
	@Test(priority = 11)

	public void signInFunctionality1() throws Exception{
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		SignInPage signInPage1 = PageFactory.initElements(driver, SignInPage.class);
		signInPage1.getSignInPage();
		signInPage1.getSignInPageTitle();
//		signInPage1.signInEmail(emailInput);
		signInPage1.signInPassword(passwordInput);
		signInPage1.clickSignInBtn();
		signInPage1.getEmailErrorMsg();
//		signInPage1.getPasswordErrorMsg();	
	}
	
	@Test(priority = 12)

	public void signInFunctionality2() throws Exception{
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		SignInPage signInPage1 = PageFactory.initElements(driver, SignInPage.class);
		signInPage1.getSignInPage();
		signInPage1.getSignInPageTitle();
		signInPage1.signInEmail(emailInput);
//		signInPage1.signInPassword(passwordInput);
		signInPage1.clickSignInBtn();
//		signInPage1.getEmailErrorMsg();
		signInPage1.getPasswordErrorMsg();	
	}
	
	@Test(priority = 13)

	public void signInFunctionality3() throws Exception{
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		SignInPage signInPage1 = PageFactory.initElements(driver, SignInPage.class);
		signInPage1.getSignInPage();
		signInPage1.getSignInPageTitle();
		signInPage1.signInEmail(emailInput);
		signInPage1.signInPassword(passwordInput);
		signInPage1.clickSignInBtn();
//		signInPage1.getEmailErrorMsg();
//		signInPage1.getPasswordErrorMsg();	
	}

//	
//	@Test(priority = 5)
//	public void getDropdownList() throws Exception {
//		DropDownPage dropdownList = PageFactory.initElements(driver,DropDownPage.class); 
//		driver.navigate().refresh();
//		dropdownList.womenTops();
//		dropdownList.womemBottoms();
//		dropdownList.menTops();
//		dropdownList.menBottoms();
//		dropdownList.gears();
//	}
//	
//	@Test(priority = 6)
//	public void getMenProduct() throws Exception {
//		MenProductsNamesPages menProduct = PageFactory.initElements(driver,MenProductsNamesPages.class); 
//		menProduct.productNames();
//	}
//	
//	@Test(priority = 7)
//	public void getWomenProduct() throws Exception {
//		WomenProductsNamesPages womenProduct = PageFactory.initElements(driver,WomenProductsNamesPages.class); 
//		womenProduct.productNames();
//	}
//	
//	@Test(priority = 8)
//
//	public void productFunctionality() throws InterruptedException{
//		ProductPage productPage1 = PageFactory.initElements(driver, ProductPage.class);
//		productPage1.getGearDropDown();
//		productPage1.getWatchesLink();
//		productPage1.getWatchPageTitle();
//		productPage1.getCategoryDropDown();
//		productPage1.getFashionDropDown();
//		productPage1.getPriceDropDown();
//		productPage1.getcostDropDown();
//		productPage1.getActivityDropDown();
//		productPage1.getReactionDropDown();
//		productPage1.getMaterialDropDown();
//		productPage1.getleatherDropDown();
//		productPage1.getGenderDropDown();
//		productPage1.getMenDropDown();
//		productPage1.getNewDropDown();
//		productPage1.getCruiseWatchProduct();	
//}
//	@Test(priority = 9)
//
//	public void productCart() throws Exception {
//		CartPage productCart = PageFactory.initElements(driver, CartPage.class);
//		Thread.sleep(10000);
//		productCart.clickAddToCartBtn();
//		//productCart.cartSuccfulValidMsg(ExcpectedMsg);
//		Thread.sleep(5000);
//		productCart.clickCartOptionBtn();
//		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
//		productCart.clickproceedToCheckOutBtn();
//	}
//	@Test(priority = 10)
//
//	public void setShippingAddress() throws Exception {
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		AddressPage address = PageFactory.initElements(driver, AddressPage.class);
//		address.setCompanyName(companyInput);
//		address.setCityName(cityInput);
//		address.setStreetAddress(streetAddressInput);
//		Thread.sleep(5000);
//		address.setCountry(countryInput);
//		Thread.sleep(5000);
//		address.setStateDropdown(stateInput);
//		address.setPostalCode(postalCodeInput);
//		address.setPhoneNumber(phoneNumInput);
//		address.clickShipingBtn();
//		address.clickNextBtn();
//	}
//	@Test(priority = 11)
//
//	public void setCartItem() throws Exception {
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		PaymentPage cart = PageFactory.initElements(driver, PaymentPage.class);
//		cart.getCartAmmount();
//		cart.getCartCharges();
//		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
//		cart.getTotalCost();
//		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
//		cart.clickPlaceOrderBtn();
//	}
//	@Test(priority = 12)
//
//	public void getSuccessValidation() {
//		SuccessfulValidationPage success = PageFactory.initElements(driver, SuccessfulValidationPage.class);
//		success.getSuccessValid();
//		success.getSuccessOrderId();
//		success.clickContinueOrderBtn();
//	}
//	
//		@Test(priority = 13)
//
//		public void signOutOption1() throws Exception{
//			SignOutPage registerPage = PageFactory.initElements(driver, SignOutPage.class);
//			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//			registerPage.clickForSignOutOption();
//			registerPage.signOut();
//		}	
//	
		
		
		
		
		
		
		
	
}