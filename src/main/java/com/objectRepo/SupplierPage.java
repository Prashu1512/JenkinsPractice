package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtil.WebDriverUtils;

public class SupplierPage extends WebDriverUtils 
{
	@FindBy(xpath="//a[@data-target='#supplierModal']")
	private WebElement createSupLookupImage;
	
	@FindBy(xpath="//form[@action='sup_transac.php?action=add']/descendant::input[@name='companyname']")
	private WebElement companyNameTF;
	
	@FindBy(xpath="//form[@action='sup_transac.php?action=add']/descendant::select[@name='province']")
	private WebElement provinceDD;
	
	@FindBy(xpath="//form[@action='sup_transac.php?action=add']/descendant::select[@name='city']")
	private WebElement cityDD;
	
	@FindBy(xpath="//form[@action='sup_transac.php?action=add']/descendant::input[@name='phonenumber']")
	private WebElement phoneNumTF;
	
	@FindBy(xpath="//form[@action='sup_transac.php?action=add']/descendant::button[@class='btn btn-success']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//form[@action='sup_transac.php?action=add']/descendant::button[@class='btn btn-secondary']")
	private WebElement cancelBtn;
	
	@FindBy(xpath="//form[@action='sup_transac.php?action=add']/descendant::button[@class='btn btn-danger']")
	private WebElement resetBtn;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchTF;
	
	//initialization
	public SupplierPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateSupLookupImage() {
		return createSupLookupImage;
	}
	
	public WebElement getCompanyNameTF() {
		return companyNameTF;
	}

	public WebElement getProvinceDD() {
		return provinceDD;
	}

	public WebElement getCityDD() {
		return cityDD;
	}

	public WebElement getPhoneNumTF() {
		return phoneNumTF;
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

	public WebElement getSearchTF() {
		return searchTF;
	}
	
	//business logic
	public void createSupplier(String name, String province, String city, String phnnumber )
	{
		createSupLookupImage.click();
		companyNameTF.sendKeys(name);
		handleDropdown(province, provinceDD);
		handleDropdown(city, cityDD);
		phoneNumTF.sendKeys(phnnumber);
		saveBtn.click();
	}
}
