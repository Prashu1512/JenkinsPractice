package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericUtil.WebDriverUtils;

public class HomePage 
{
	//declaration
	@FindBy(linkText="Customer")
	private WebElement customerLink;
	
	@FindBy(linkText = "Employee")
	private WebElement employeeLink;
	
	@FindBy(linkText = "Product")
	private WebElement productLink;
	
	@FindBy(linkText="Inventory")
	private WebElement inventoryLink;
	
	@FindBy(linkText="Transaction")
	private WebElement transactionLink;
	
	@FindBy(linkText="Supplier")
	private WebElement supplierLink;
	
	@FindBy(linkText="Accounts")
	private WebElement accountsLink;
	
	@FindBy(linkText="POS")
	private WebElement posLink;
	
	@FindBy(id="userDropdown")
	private WebElement adminDD;

	@FindBy(xpath="//i[contains(.,'Profile')]")
	private WebElement profileBtn;
	
	@FindBy(xpath="//i[contains(.,'Settings')]")
	private WebElement settingsBtn;
	
	@FindBy(xpath="//a[@data-target='#logoutModal']")
	private WebElement logoutLink;
	
	@FindBy(xpath="//h5[text()='Ready to Leave?']/ancestor::div[@class='modal fade show']/descendant::a[text()='Logout']")
	private WebElement logoutBtn;
	
	//initialization
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getCustomerLink() {
		return customerLink;
	}


	public WebElement getEmployeeLink() {
		return employeeLink;
	}


	public WebElement getProductLink() {
		return productLink;
	}


	public WebElement getInventoryLink() {
		return inventoryLink;
	}


	public WebElement getTransactionLink() {
		return transactionLink;
	}


	public WebElement getSupplierLink() {
		return supplierLink;
	}


	public WebElement getAccountsLink() {
		return accountsLink;
	}


	public WebElement getPosLink() {
		return posLink;
	}


	public WebElement getAdminDD() {
		return adminDD;
	}


	public WebElement getProfileBtn() {
		return profileBtn;
	}


	public WebElement getSettingsBtn() {
		return settingsBtn;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}


	public WebElement getLogoutBtn() {
		return logoutBtn;
	}


	//BusinessLogic
	public void customerTab()
	{
		customerLink.click();
	}
	
	public void employeeTab()
	{
		employeeLink.click();
	}
	
	public void supplierTab()
	{
		supplierLink.click();
	}
	
	public void transactionTab()
	{
		transactionLink.click();
	}
	
	public void productTab()
	{
		productLink.click();
	}
	
	public void inventoryTab()
	{
		inventoryLink.click();
	}
	
	public void accountsTab()
	{
		accountsLink.click();
	}
	
	public void POSTab()
	{
		posLink.click();
	}
	
	public void adminLogout()
	{
		adminDD.click();
		logoutLink.click();
		logoutBtn.click();
	}
	
}
