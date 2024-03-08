package com.objectRepo;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.*;

import com.genericUtil.ExcelUtils;

public class CustomerPage extends ExcelUtils
{
	//declaration
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement createCust;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement searchCust;
	
	@FindBy(xpath="//form[@action='cust_transac.php?action=add']/descendant::input[@name='firstname']")
	private WebElement firstnameTF;
	
	@FindBy(xpath="//form[@action='cust_transac.php?action=add']/descendant::input[@name='lastname']")
	private WebElement lastnameTF;
	
	@FindBy(xpath="//form[@action='cust_transac.php?action=add']/descendant::input[@name='phonenumber']")
	private WebElement phnNumTF;
	
	@FindBy(xpath="//div[@id='customerModal' and contains(.,'Save')]/descendant::button[@class='btn btn-success']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//div[@id='customerModal' and contains(.,'Cancel')]/descendant::button[@class='btn btn-secondary']")
	private  WebElement cancelBtn;
	
	@FindBy(xpath="//div[@id='customerModal' and contains(.,'Reset')]/descendant::button[@class='btn btn-danger']")
	private  WebElement resetBtn;
	
	@FindBy(xpath="//table[@class='table table-bordered dataTable no-footer']/tbody/tr[contains(.,fn)]/td[1]")
	private WebElement tabledata;
	
	//initialization
	public CustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getCreateCust() {
		return createCust;
	}

	public WebElement getSearchCust() {
		return searchCust;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getPhnNumTF() {
		return phnNumTF;
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
	
	//business logic
	public void createCustomer(String fn, String ln, String phn)
	{
		createCust.click();
		firstnameTF.sendKeys(fn);
		lastnameTF.sendKeys(ln);
		phnNumTF.sendKeys(phn);
		saveBtn.click();
	}
	
	public void searchCustomer(String expname)
	{
		searchCust.sendKeys(expname, Keys.ENTER);
		String actdata = tabledata.getText();
		assertEquals(actdata, expname, "search is validated");
//		if(actdata.contains(expname))
//		{
//			System.out.println("---search is validated----");
//		}
//		else
//		{
//			System.out.println("---search is not validated----");
//		}
		
	}
	
}
