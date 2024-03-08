package com.objectRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.*;

import com.genericUtil.WebDriverUtils;

public class ProductPage extends WebDriverUtils
{
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement productLookupImg;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::input[@name='prodcode']")
	private WebElement prodcodeTF;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::input[@name='name']")
	private WebElement nameTF;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::textarea[@name='description']")
	private WebElement descriptionTF;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::input[@name='quantity']")
	private WebElement quantityTF;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::input[@name='onhand']")
	private WebElement onhandTF;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::input[@name='price']")
	private WebElement priceTF;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::select[@name='category']")
	private WebElement categoryDD;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::select[@name='supplier']")
	private WebElement supplierDD;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::input[@name='datestock']")
	private WebElement datestockTF;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::button[@class='btn btn-success']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::button[@class='btn btn-secondary']")
	private WebElement cancelBtn;
	
	@FindBy(xpath="//form[@action='pro_transac.php?action=add']/descendant::button[@class='btn btn-danger']")
	private WebElement resetBtn;
	
	@FindBy(xpath="//input[@class='form-control form-control-sm']")
	private WebElement searchTF;
	
	@FindBy(xpath="//a[@class='btn btn-primary bg-gradient-primary dropdown no-arrow']")
	private WebElement elipseBtn;
	
	@FindBy(xpath="//a[@class='btn btn-warning bg-gradient-warning btn-block']")
	private WebElement editBtn;
	
	@FindBy(xpath="//form[@action='pro_edit1.php']/descendant::input[@name='price']")
	private WebElement updatedPrice;
	
	@FindBy(xpath="//form[@action='pro_edit1.php']/descendant::select[@name='category']")
	private WebElement upCatBtn;
	
	@FindBy(xpath="//i[@class='fa fa-edit fa-fw']")
	private WebElement updateBtn;
	
	@FindBy(xpath="//i[@class='fas fa-fw fa-list-alt']")
	private WebElement detailsBtn;
	
	@FindBy(xpath="(//div[@id='content' and contains(.,' Back')]//div[@class='col-sm-9'])[4]")
	private WebElement priceup;
	
	//initialization
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getProductLookupImg() {
		return productLookupImg;
	}


	public WebElement getProdcodeTF() {
		return prodcodeTF;
	}


	public WebElement getNameTF() {
		return nameTF;
	}


	public WebElement getDescriptionTF() {
		return descriptionTF;
	}


	public WebElement getQuantityTF() {
		return quantityTF;
	}


	public WebElement getOnhandTF() {
		return onhandTF;
	}


	public WebElement getPriceTF() {
		return priceTF;
	}


	public WebElement getCategoryDD() {
		return categoryDD;
	}


	public WebElement getSupplierDD() {
		return supplierDD;
	}


	public WebElement getDatestockTF() {
		return datestockTF;
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


	public WebElement getElipseBtn() {
		return elipseBtn;
	}


	public WebElement getEditBtn() {
		return editBtn;
	}
	
	public WebElement getUpdatedPrice() {
		return updatedPrice;
	}
	
	public WebElement getupCatBtn() {
		return upCatBtn;
	}
	
	public WebElement getUpdateBtn() {
		return updateBtn;
	}
	
	public WebElement getDetailsBtn() {
		return detailsBtn;
	}
	
	public WebElement getPriceup()
	{
		return priceup;
	}


	//Business Logic
	public void createProd(String pcode, String name, String desc, String quant, String onhand, String price,String cat, String sup, String stockdate)
	{
		productLookupImg.click();
		prodcodeTF.sendKeys(pcode);
		nameTF.sendKeys(name);
		descriptionTF.sendKeys(desc);
		quantityTF.sendKeys(quant);
		onhandTF.sendKeys(onhand);
		priceTF.sendKeys(price);
		categoryDD.sendKeys(cat);
		supplierDD.sendKeys(sup);
		datestockTF.click();
		datestockTF.sendKeys(stockdate);
		saveBtn.click();
	}
	
	public void editProd(String pcode, String upprice, String cat, WebDriver driver) throws InterruptedException
	{
		searchTF.sendKeys(pcode);
		elipseBtn.click();
		editBtn.click();
		updatedPrice.clear();
		updatedPrice.sendKeys(upprice);
		upCatBtn.sendKeys(cat);
		updateBtn.click();
		Thread.sleep(1000);
		acceptAlert(driver);
	}
	
	public void validateProd(String pcode, String expdata)
	{
		searchTF.sendKeys(pcode, Keys.ENTER);
		detailsBtn.click();
		String data = priceup.getText();
		//String adata =data.replaceAll(":", "") ;
		String actdata = data.replaceAll("[^0-9]", "");
		//System.out.println(actdata);
		assertEquals(actdata, expdata, "validated");
//		if(actdata.equals(expdata))
//		{
//			System.out.println("----validated-----");
//		}
//		else
//		{
//			System.out.println("----not validated-----");
//		}
	}
	
	
}
