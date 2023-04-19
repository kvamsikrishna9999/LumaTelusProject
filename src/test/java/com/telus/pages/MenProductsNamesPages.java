package com.telus.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.telus.seleniumframework.base.BaseClass;

public class MenProductsNamesPages extends BaseClass {


	By Men = By.xpath("//*[@id=\"ui-id-5\"]/span[2]");
	By Mtop = By.xpath("//*[@id=\"ui-id-17\"]/span[2]");
	By totalCount=By.xpath("//div[@class='page-wrapper']//div[2]//p[1]//span[3]");
	By nextButton=By.xpath("//div[4]//div[2]//ul[1]//li[5]//a[1]");
	By productLink=By.xpath("//*[@class='product-item-link']");
	By select=By.xpath("//div[4]//div[3]//div[1]//select[1]");

	public void productNames() throws InterruptedException {
		Actions action=new Actions(driver);
		System.out.println("ProductNames **************** ");
		driver.navigate().refresh();
		Thread.sleep(1000);
		WebElement m = driver.findElement(Men);
		action.moveToElement(m).perform();
		WebElement mt = driver.findElement(Mtop);
		action.moveToElement(mt).click().perform();

		String displayedcont =driver.findElement(totalCount).getText();


		WebElement next=driver.findElement(nextButton);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,5000)");

		List<WebElement> products =driver.findElements(productLink);


		List<String> productNames = new ArrayList<>();
		for (WebElement name : products) {
			Thread.sleep(500);
			productNames.add(name.getText());
			System.out.println(name.getText());
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

