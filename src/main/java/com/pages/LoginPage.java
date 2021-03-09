package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	public WebDriver driver;
	private By title = By.xpath("//*[@id='app']/main/div/div/p");
	private By username = By.id("email");
	private By password = By.id("password");
	private By loginBtn = By.xpath("//*[@id='app']/main/div/div/form/button");
	private By forgotLink = By.linkText("Quên mật khẩu?");
	private By errorMessage = By.xpath("//button[@class='close']");
	
	public LoginPage(WebDriver driver)
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
	
	public String getErrorMessage()
	{
		return driver.findElement(errorMessage).getAttribute("innerHTML");
	}
	
	public void enterUsername(String userName)
	{
		driver.findElement(username).sendKeys(userName);
	}
	
	public void enterPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickLoginBtn()
	{
		driver.findElement(loginBtn).click();
	}
	
	public ForgotPwdPage clickForgotLink()
	{
		driver.findElement(forgotLink).click();
		return new ForgotPwdPage(driver);
	}
	
	public void doLogin(String userName, String pwd)
	{
		this.enterUsername(userName);
		this.enterPassword(pwd);
		this.clickLoginBtn();
	}
	
}
