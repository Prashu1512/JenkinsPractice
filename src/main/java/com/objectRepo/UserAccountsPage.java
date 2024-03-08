package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserAccountsPage 
{
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement userAccountBtn;
	
	@FindBy(xpath="//form[@action='us_transac.php?action=add']/descendant::select[@name='empid']")
	private WebElement empDD;
	
	@FindBy(xpath="//form[@action='us_transac.php?action=add']/descendant::input[@name='username']")
	private WebElement usernameTF;
	
	@FindBy(xpath="//form[@action='us_transac.php?action=add']/descendant::select[@name='password']")
	private WebElement passTF;
	
	@FindBy(xpath="//form[@action='us_transac.php?action=add']/descendant::button[@class='btn btn-success']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//form[@action='us_transac.php?action=add']/descendant::button[@class='btn btn-secondary']")
	private WebElement cancelBtn;
	
	@FindBy(xpath="//form[@action='us_transac.php?action=add']/descendant::button[@class='btn btn-danger']")
	private WebElement resetBtn;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement adminsearchTF;
	
	public UserAccountsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getUserAccountBtn() {
		return userAccountBtn;
	}

	public WebElement getEmpDD() {
		return empDD;
	}

	public WebElement getUsernameTF() {
		return usernameTF;
	}

	public WebElement getPassTF() {
		return passTF;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getResetBtn() {
		return resetBtn;
	}

	public WebElement getAdminsearchTF() {
		return adminsearchTF;
	}
	
	
}
