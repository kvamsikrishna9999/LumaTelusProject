package com.telus.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.telus.seleniumframework.base.BaseClass;

public class WomenProductsNamesPages extends BaseClass {


	By women = By.xpath("//*[@id=\"ui-id-4\"]/span[2]");
	By Wtop = By.xpath("//*[@id=\"ui-id-9\"]");
	By totalCount=By.xpath("//*[@id=\"toolbar-amount\"]/span[3]");
	By nextButton=By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[4]/div[2]/ul/li[3]/a");
	By productLink=By.xpath("//*[@class='product-item-link']");
	By select=By.xpath("//div[4]//div[3]//div[1]//select[1]");


	public void productNames() throws InterruptedException {

		Actions action=new Actions(driver);
		System.out.println("ProductNames **************** ");
		driver.navigate().refresh();
		Thread.sleep(5000);
		WebElement m = driver.findElement(women);
		action.moveToElement(m).perform();
		WebElement mt = driver.findElement(Wtop);
		action.moveToElement(mt).click().perform();

		String displayedcont =driver.findElement(totalCount).getText();

		Select objSelect=new Select(driver.findElement(select));
		objSelect.selectByVisibleText("24");

		WebElement next=driver.findElement(nextButton);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");
		List<WebElement> products =driver.findElements(productLink);

		List<String> productNames = new ArrayList<>();
		for (WebElement name : products) {
			Thread.sleep(500);
			productNames.add(name.getText());
			String pro=name.getText();
			System.out.println("Products :" + pro);

		}
		System.out.println("***************************************");
		while (true) {
			Thread.sleep(1000);
			next.click();
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,5000)");
			Thread.sleep(1000);
			products = driver.findElements(productLink);
			for (WebElement name : products) {
				Thread.sleep(500);
				productNames.add(name.getText());
				System.out.println("Products :" + name.getText());
			}

			System.out.println("***************************************");
			try {
				next = driver.findElement(nextButton);
			} catch (Exception e) {
				System.out.println("No More Products");
				break;

			}
		}
		System.out.println("***************************************");
		System.out.println("My Number of Products are :" + productNames.size());
		System.out.println("Total display Count: " + displayedcont);

	}

}

