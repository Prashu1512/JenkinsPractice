package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EmployeePage 
{
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement createEmp;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::input[@name='firstname']")
	private WebElement firstnameTF;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::input[@name='lastname']")
	private WebElement lastnameTF;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::select[@name='gender']")
	private WebElement genderDD;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::input[@name='email']")
	private WebElement emailTF;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::input[@name='phonenumber']")
	private WebElement phnNumTF;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::select[@name='jobs']")
	private WebElement jobDD;

	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::input[@name='hireddate']")
	private WebElement hiredDateTF;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::select[@name='province']")
	private WebElement provinceDD;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::select[@name='city']")
	private WebElement cityDD;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::button[@class='btn btn-success']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::button[@class='btn btn-secondary']")
	private WebElement cancelBtn;
	
	@FindBy(xpath="//form[@action='emp_transac.php?action=add']/descendant::button[@class='btn btn-danger']")
	private WebElement resetBtn;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchTF;
	
	//initialization
	public EmployeePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCreateEmp() {
		return createEmp;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getGenderDD() {
		return genderDD;
	}

	public WebElement getEmailTF() {
		return emailTF;
	}

	public WebElement getPhnNumTF() {
		return phnNumTF;
	}

	public WebElement getJobDD() {
		return jobDD;
	}

	public WebElement getHiredDateTF() {
		return hiredDateTF;
	}

	public WebElement getProvinceDD() {
		return provinceDD;
	}

	public WebElement getCityDD() {
		return cityDD;
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
	
	public WebElement getSearchTF()
	{
		return searchTF;
	}
	
	//
	
	
	
}
