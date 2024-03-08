package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtil.WebDriverUtils;

public class LoginPage extends WebDriverUtils
{
	//declaration
	@FindBy(name="user")
	private WebElement usernameEdt;
	
	@FindBy(name="password")
	private WebElement passwordEdt;
	
	@FindBy(name="btnlogin")
	private WebElement loginBtn;
	
	@FindBy(id="customCheck")
	private WebElement remPass;
	
	
	//initilization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getUsernameEdt() 
	{
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	public WebElement getRemPass() {
		return remPass;
	}
	
	//business logic
	public void loginToApp(String USERNAME, String PASSWORD, WebDriver driver)
	{
		usernameEdt.sendKeys(USERNAME);
		passwordEdt.sendKeys(PASSWORD);
		loginBtn.click();
		acceptAlert(driver);
	}
	
	
	
}
