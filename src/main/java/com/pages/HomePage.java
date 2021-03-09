package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	public WebDriver driver;
	
	private By title = By.xpath("/html/body/div[3]/div[2]/div/h3");
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getTitle()
	{
		return driver.findElement(title).getText();
	}

}
