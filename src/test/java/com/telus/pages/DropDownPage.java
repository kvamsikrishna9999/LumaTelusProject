package com.telus.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.telu.logs.Log;
import com.telus.seleniumframework.base.BaseClass;

public class DropDownPage extends BaseClass {


	By women = By.xpath("//*[@id=\"ui-id-4\"]/span[2]");
	By Wtop = By.xpath("//*[@id=\"ui-id-9\"]");
	By Wjackets = By.xpath("//*[@id=\"ui-id-11\"]/span");
	By Whoodies = By.xpath("//*[@id=\"ui-id-12\"]/span");
	By Wtees = By.xpath("//*[@id=\"ui-id-13\"]/span");
	By Wbars = By.xpath("//*[@id=\"ui-id-14\"]/span");
	By Wbottoms = By.xpath("//*[@id=\"ui-id-10\"]/span[2]");
	By Wpants = By.xpath("//a[@id='ui-id-15']");
	By Wshorts = By.xpath("//*[@id=\"ui-id-16\"]/span");

	By Men = By.xpath("//*[@id=\"ui-id-5\"]/span[2]");
	By Mtop = By.xpath("//*[@id=\"ui-id-17\"]/span[2]");
	By Mjackets = By.xpath("//*[@id=\"ui-id-19\"]/span");
	By Mhoodies = By.xpath("//*[@id=\"ui-id-20\"]/span");
	By Mtees = By.xpath("//*[@id=\"ui-id-21\"]/span");
	By Mtanks = By.xpath("//*[@id=\"ui-id-22\"]/span");
	By Mbottoms = By.xpath("//*[@id=\"ui-id-18\"]/span[2]");
	By Mpants = By.xpath("//*[@id=\"ui-id-23\"]/span");
	By Mshorts = By.xpath("//*[@id=\"ui-id-24\"]/span");

	By Gear = By.xpath("//*[@id=\"ui-id-6\"]/span[2]");
	By Bags = By.xpath("//*[@id=\"ui-id-25\"]/span");
	By Fitness = By.xpath("//*[@id=\"ui-id-26\"]/span");
	By Watches = By.xpath("//*[@id=\"ui-id-27\"]/span");

	public void womenTops() throws InterruptedException  {
		driver.navigate().refresh();
		org.testng.asserts.SoftAssert softassert=new org.testng.asserts.SoftAssert();
		Thread.sleep(5000);
		Actions action = new Actions(driver);
		WebElement w = driver.findElement(women);
		action.moveToElement(w).perform();
		boolean a1=w.isDisplayed();
		boolean a2=w.isEnabled();
		softassert.assertTrue(a1, "Women Drop is Not Enabled");
		softassert.assertTrue(a2, "Women Drop is Not Displayed");
		Log.info("Women Drop Enabled");



		WebElement wt = driver.findElement(Wtop);
		action.moveToElement(wt).perform();
		boolean a11=wt.isDisplayed();
		boolean a22=wt.isEnabled();
		softassert.assertTrue(a11, "Women Top Drop is Not Enabled");
		softassert.assertTrue(a22, "Women Top Drop is Not Displayed");

		WebElement wj = driver.findElement(Wjackets);
		action.moveToElement(wj).click().perform();
		Thread.sleep(5000);
		boolean a111=wj.isDisplayed();
		boolean a222=wj.isEnabled();
		softassert.assertTrue(a111, "Jacket Drop is Not Enabled");
		softassert.assertTrue(a222, "Jacket Drop is Not Displayed");


		WebElement w1 = driver.findElement(women);
		action.moveToElement(w1).perform();
		WebElement wt1 = driver.findElement(Wtop);
		action.moveToElement(wt1).perform();
		WebElement wh = driver.findElement(Whoodies);
		action.moveToElement(wh).click().perform();
		boolean a122=wh.isDisplayed();
		boolean a221=wh.isEnabled();
		softassert.assertTrue(a122, "Hoodies Drop is Not Enabled");
		softassert.assertTrue(a221, "Hoodies Drop is Not Displayed");
		Thread.sleep(5000);


		WebElement w2 = driver.findElement(women);
		action.moveToElement(w2).perform();
		WebElement wt2 = driver.findElement(Wtop);
		action.moveToElement(wt2).perform();
		WebElement wte = driver.findElement(Wtees);
		action.moveToElement(wte).click().perform();
		boolean a12=wte.isDisplayed();
		boolean a21=wte.isEnabled();
		softassert.assertTrue(a12, "Tees Drop is Not Enabled");
		softassert.assertTrue(a21, "Tess Drop is Not Displayed");
		Thread.sleep(5000);


		WebElement w3 = driver.findElement(women);
		action.moveToElement(w3).perform();
		WebElement wt3 = driver.findElement(Wtop);
		action.moveToElement(wt3).perform();
		WebElement wb = driver.findElement(Wbars);
		action.moveToElement(wb).click().perform();
		Thread.sleep(5000);
		boolean a1222=wb.isDisplayed();
		boolean a1111=wb.isEnabled();
		softassert.assertTrue(a1222, "Bars Drop is Not Enabled");
		softassert.assertTrue(a1111, "Bars Drop is Not Displayed");
		softassert.assertAll();


	}

	public void womemBottoms() throws InterruptedException  {
		org.testng.asserts.SoftAssert softassert=new org.testng.asserts.SoftAssert();
		Actions action = new Actions(driver);
		WebElement w = driver.findElement(women);
		action.moveToElement(w).perform();
		boolean a1=w.isDisplayed();
		boolean a2=w.isEnabled();
		softassert.assertTrue(a1, "Women Drop is Not Enabled");
		softassert.assertTrue(a2, "Women Drop is Not Displayed");

		WebElement wb = driver.findElement(Wbottoms);
		action.moveToElement(wb).perform();
		boolean a11=wb.isDisplayed();
		boolean a22=wb.isEnabled();
		softassert.assertTrue(a11, "Women bottoms Drop is Not Enabled");
		softassert.assertTrue(a22, "Women bottoms Drop is Not Displayed");

		WebElement wp = driver.findElement(Wpants);
		action.moveToElement(wp).click().perform();
		boolean a13=wp.isDisplayed();
		boolean a23=wp.isEnabled();
		softassert.assertTrue(a13, "Women Pants Drop is Not Enabled");
		softassert.assertTrue(a23, "Women Pants Drop is Not Displayed");
		Thread.sleep(5000);


		WebElement w1 = driver.findElement(women);
		action.moveToElement(w1).perform();
		WebElement wb1 = driver.findElement(Wbottoms);
		action.moveToElement(wb1).perform();
		WebElement ws = driver.findElement(Wshorts);
		action.moveToElement(ws).click().perform();
		boolean a14=ws.isDisplayed();
		boolean a24=ws.isEnabled();
		softassert.assertTrue(a14, "Women Shorts Drop is Not Enabled");
		softassert.assertTrue(a24, "Women Shorts Drop is Not Displayed");
		Thread.sleep(5000);


	}

	public void menTops() throws InterruptedException  {
		org.testng.asserts.SoftAssert softassert=new org.testng.asserts.SoftAssert();
		Actions action = new Actions(driver);
		WebElement m = driver.findElement(Men);
		action.moveToElement(m).perform();
		boolean a1=m.isDisplayed();
		boolean a2=m.isEnabled();
		softassert.assertTrue(a1, "Men Drop is Not Enabled");
		softassert.assertTrue(a2, "Men Drop is Not Displayed");


		WebElement mt = driver.findElement(Mtop);
		action.moveToElement(mt).perform();
		boolean a11=mt.isDisplayed();
		boolean a21=mt.isEnabled();
		softassert.assertTrue(a11, "Men Top Drop is Not Enabled");
		softassert.assertTrue(a21, "Men Top Drop is Not Displayed");

		WebElement mj = driver.findElement(Mjackets);
		action.moveToElement(mj).click().perform();
		boolean a12=mj.isDisplayed();
		boolean a22=mj.isEnabled();
		softassert.assertTrue(a12, "Jackets Drop is Not Enabled");
		softassert.assertTrue(a22, "Jackets Drop is Not Displayed");
		Thread.sleep(1000);


		WebElement m1 = driver.findElement(Men);
		action.moveToElement(m1).perform();
		WebElement mt1 = driver.findElement(Mtop);
		action.moveToElement(mt1).perform();
		WebElement mh = driver.findElement(Mhoodies);
		action.moveToElement(mh).click().perform();
		boolean a13=mh.isDisplayed();
		boolean a23=mh.isEnabled();
		softassert.assertTrue(a13, "Hoodies Drop is Not Enabled");
		softassert.assertTrue(a23, "Hoodies Drop is Not Displayed");
		Thread.sleep(5000);


		WebElement m2 = driver.findElement(Men);
		action.moveToElement(m2).perform();
		WebElement mt2 = driver.findElement(Mtop);
		action.moveToElement(mt2).perform();
		WebElement mte = driver.findElement(Mtees);
		action.moveToElement(mte).click().perform();
		boolean a14=mte.isDisplayed();
		boolean a24=mte.isEnabled();
		softassert.assertTrue(a14, "Tees Drop is Not Enabled");
		softassert.assertTrue(a24, "Tees Drop is Not Displayed");
		Thread.sleep(5000);


		WebElement m3 = driver.findElement(Men);
		action.moveToElement(m3).perform();
		WebElement mt3 = driver.findElement(Mtop);
		action.moveToElement(mt3).perform();
		WebElement mta = driver.findElement(Mtanks);
		action.moveToElement(mta).click().perform();
		boolean a15=mta.isDisplayed();
		boolean a25=mta.isEnabled();
		softassert.assertTrue(a15, "Tanks Drop is Not Enabled");
		softassert.assertTrue(a25, "Tanks Drop is Not Displayed");
		Thread.sleep(5000);


	}

	public void menBottoms() throws InterruptedException {
		org.testng.asserts.SoftAssert softassert=new org.testng.asserts.SoftAssert();
		Actions action = new Actions(driver);
		WebElement m = driver.findElement(Men);
		boolean a1=m.isDisplayed();
		boolean a2=m.isEnabled();
		softassert.assertTrue(a1, "Man Drop is Not Enabled");
		softassert.assertTrue(a2, "Man Drop is Not Displayed");
		action.moveToElement(m).perform();
		WebElement mb = driver.findElement(Mbottoms);
		boolean a11=mb.isDisplayed();
		boolean a22=mb.isEnabled();
		softassert.assertTrue(a11, "Bottoms Drop is Not Enabled");
		softassert.assertTrue(a22, "Bottoms Drop is Not Displayed");
		action.moveToElement(mb).perform();
		WebElement mp = driver.findElement(Mpants);
		action.moveToElement(mp).click().perform();
		boolean a12=mp.isDisplayed();
		boolean a23=mp.isEnabled();
		softassert.assertTrue(a12, "Pants Drop is Not Enabled");
		softassert.assertTrue(a23, "Pants Drop is Not Displayed");
		Thread.sleep(5000);


		WebElement m1 = driver.findElement(Men);
		action.moveToElement(m1).perform();
		WebElement mb1 = driver.findElement(Mbottoms);
		action.moveToElement(mb1).perform();
		WebElement ms = driver.findElement(Mshorts);
		action.moveToElement(ms).click().perform();
		boolean a15=ms.isDisplayed();
		boolean a25=ms.isEnabled();
		softassert.assertTrue(a15, "Shorts Drop is Not Enabled");
		softassert.assertTrue(a25, "Shorts Drop is Not Displayed");
		Thread.sleep(5000);


	}

	public void gears() throws InterruptedException  {
		org.testng.asserts.SoftAssert softassert=new org.testng.asserts.SoftAssert();
		Actions action = new Actions(driver);
		WebElement g = driver.findElement(Gear);
		action.moveToElement(g).perform();
		boolean a1=g.isDisplayed();
		boolean a2=g.isEnabled();
		softassert.assertTrue(a1, "Gear Drop is Not Enabled");
		softassert.assertTrue(a2, "Gear Drop is Not Displayed");
		WebElement b = driver.findElement(Bags);
		action.moveToElement(b).click().perform();
		boolean a11=b.isDisplayed();
		boolean a21=b.isEnabled();
		softassert.assertTrue(a11, "Bags Drop is Not Enabled");
		softassert.assertTrue(a21, "Bags Drop is Not Displayed");
		Thread.sleep(6000);

		WebElement g1 = driver.findElement(Gear);
		action.moveToElement(g1).perform();
		WebElement f = driver.findElement(Fitness);
		action.moveToElement(f).click().perform();
		boolean a12=f.isDisplayed();
		boolean a22=f.isEnabled();
		softassert.assertTrue(a12, "Fitness Drop is Not Enabled");
		softassert.assertTrue(a22, "Fitness Drop is Not Displayed");
		Thread.sleep(5000);


		WebElement g2 = driver.findElement(Gear);
		action.moveToElement(g2).perform();
		WebElement w = driver.findElement(Watches);
		action.moveToElement(w).click().perform();
		boolean a13=w.isDisplayed();
		boolean a23=w.isEnabled();
		softassert.assertTrue(a13, "Watches Drop is Not Enabled");
		softassert.assertTrue(a23, "Watches Drop is Not Displayed");
		Thread.sleep(5000);


	}

}
