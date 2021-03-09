package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPwdPage {

	public WebDriver driver;
	public static String url = "http://qldt.vnec02:8890/password/reset";
	private By emailTxt = By.id("email");
	private By resetBtn = By.xpath("//*[@id='app']/main/div/div/form/div[2]/button");
	private By errorMessage = By.xpath("//div[contains(@class,'alert alert-danger header-message')]");
	
	public ForgotPwdPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public void enterEmail(String email)
	{
		driver.findElement(emailTxt).sendKeys(email);
	}
	
	public void clickForgotBtn()
	{
		driver.findElement(resetBtn).click();
	}
	
	public String getErrorMessage()
	{
		return driver.findElement(errorMessage).getText().trim();
	}
}
