package com.objectRepo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.*;

import com.genericUtil.WebDriverUtils;

public class POSPage extends WebDriverUtils 
{
	@FindBy(linkText="Keyboard")
	private WebElement keyboardLink;
	
	@FindBy(linkText="Mouse")
	private WebElement mouseLink;
	
	@FindBy(linkText="Headset")
	private WebElement headsetLink;
	
	@FindBy(linkText="CPU")
	private WebElement cpuLink;
	
	@FindBy(linkText="Monitor")
	private WebElement monitorLink;
	
	@FindBy(xpath="//div[@class='products' and contains(.,'LG')]/descendant::input[@name='quantity']")
	private WebElement LGMonitorQuant;
	
	@FindBy(xpath="//form[@action='pos.php?action=add&id=249']//input[@name='addpos']")
	private WebElement addBtn;
	
	@FindBy(xpath="//table[@class='table']/tbody/tr[contains(.,'LG')]/td[4]")
	private WebElement price;
	
	@FindBy(linkText="Motherboard")
	private WebElement motherboardLink;
	
	@FindBy(linkText="Processor")
	private WebElement processorBtn;
	
	@FindBy(linkText="Powersupply")
	private WebElement powerSupplyLink;
	
	@FindBy(linkText="Others")
	private WebElement othersbtn;
	
	@FindBy(xpath="//i[@class='fas fa-fw fa-trash']")
	private WebElement deleteBtn;
	
	@FindBy(xpath="//select[@name='customer']")
	private WebElement selectCustDD;
	
	@FindBy(xpath="//i[@class='fas fa-fw fa-plus']")
	private WebElement createCust;
	
	@FindBy(xpath="//div[@id='poscustomerModal' and contains(.,'Add Customer')]/descendant::input[@name='firstname']")
	private WebElement firstnameTF;
	
	@FindBy(xpath="//div[@id='poscustomerModal' and contains(.,'Add Customer')]/descendant::input[@name='lastname']")
	private WebElement lastnameTF;
	
	@FindBy(xpath="//div[@id='poscustomerModal' and contains(.,'Add Customer')]/descendant::input[@name='phonenumber']")
	private WebElement phnNumTF;
	
	@FindBy(xpath="//div[@id='poscustomerModal' and contains(.,'Save')]/descendant::button[@class='btn btn-success']")
	private WebElement saveBtn;
	
	@FindBy(xpath="//div[@id='customerModal' and contains(.,'Cancel')]/descendant::button[@class='btn btn-secondary']")
	private  WebElement cancelBtn;
	
	@FindBy(xpath="//div[@id='customerModal' and contains(.,'Reset')]/descendant::button[@class='btn btn-danger']")
	private  WebElement resetBtn;
	
	@FindBy(xpath="//button[text()='SUBMIT']")
	private WebElement submitBtn;
	
	@FindBy(name="cash")
	private WebElement enterPriceTF;
	
	@FindBy(xpath="//button[text()='PROCEED TO PAYMENT']")
	private WebElement paymentBtn;
	
	@FindBy(id="userDropdown")
	private WebElement empDD;

	@FindBy(xpath="//a[contains(.,'Profile')]")
	private WebElement profileBtn;
	
	@FindBy(xpath="//a[contains(.,'Settings')]")
	private WebElement settingsBtn;
	
	@FindBy(xpath="//h5[text()='Edit User Info']/ancestor::div[@id='settingsModal']/descendant::select[@name='gender']")
	private WebElement genderDD;
	
	@FindBy(xpath="//h5[text()='Edit User Info']/ancestor::div[@id='settingsModal']/descendant::input[@name='password']")
	private WebElement passwordTF;
	
	@FindBy(xpath="//h5[text()='Edit User Info']/ancestor::div[@id='settingsModal']/descendant::input[@name='phone']")
	private WebElement phoneTF;
	
	@FindBy(xpath="//h5[text()='Edit User Info']/ancestor::div[@id='settingsModal']/descendant::button[@class='btn btn-success']")
	private WebElement updateBtn;
	
	@FindBy(xpath="//a[@data-target='#logoutModal']")
	private WebElement logoutLink;
	
	@FindBy(xpath="//h5[text()='Ready to Leave?']/ancestor::div[@class='modal fade show']/descendant::span[text()='×']")
	private WebElement closeBtn;
	
	@FindBy(xpath="//h5[text()='Ready to Leave?']/ancestor::div[@class='modal fade show']/descendant::button[text()='Cancel']")
	private WebElement cancelLink;
	
	@FindBy(xpath="//h5[text()='Ready to Leave?']/ancestor::div[@class='modal fade show']/descendant::a[text()='Logout']")
	private WebElement logoutBtn;

	
	//initialization
	public POSPage(WebDriver driver)   
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getKeyboardLink() {
		return keyboardLink;
	}

	public WebElement getMousedLink() {
		return mouseLink;
	}

	public WebElement getHeadsetLink() {
		return headsetLink;
	}

	public WebElement getCPULink() {
		return cpuLink;
	}

	public WebElement getMonitorLink() {
		return monitorLink;
	}
	
	public WebElement getMotherboardLink() {
		return motherboardLink;
	}

	public WebElement getProcessorBtn() {
		return processorBtn;
	}

	public WebElement getPowerSupplyLink() {
		return powerSupplyLink;
	}

	public WebElement getOthersbtn() {
		return othersbtn;
	}

	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getSelectCustDD() {
		return selectCustDD;
	}

	public WebElement getCreateCust() {
		return createCust;
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

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public WebElement getEnterPriceTF() {
		return enterPriceTF;
	}

	public WebElement getPaymentBtn() {
		return paymentBtn;
	}

	public WebElement getEmpDD() {
		return empDD;
	}

	public WebElement getGenderDD() {
		return genderDD;
	}

	public WebElement getPasswordTF() {
		return passwordTF;
	}

	public WebElement getPhoneTF() {
		return phoneTF;
	}
	
	public WebElement getUpdateBtn()
	{
		return updateBtn;
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

	public WebElement getCloseBtn() {
		return closeBtn;
	}

	public WebElement getCancelLink() {
		return cancelLink;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	
	
//Business logic
	public void EditEmp(String gen, String password, String phn, WebDriver driver)
	{
		empDD.click();
		settingsBtn.click();
		waitUntilEleToBeClickable(driver, 10, genderDD);
		handleDropdown(gen, genderDD);
		passwordTF.sendKeys(password);
		phoneTF.clear();
		phoneTF.sendKeys(phn);
		scrollByAmount(driver, 500);
		updateBtn.click();
		acceptAlert(driver);
		
	}
	
	public void validatePhnNum(String expPhnNum)
	{
		String actPhnNum = phoneTF.getText();
		assertNotEquals(actPhnNum, expPhnNum, "phone number validated");
//		if(actPhnNum.equals(expPhnNum))
//		{
//			System.out.println("----phone number not validated");
//		}
//		else
//		{
//			System.out.println("----phone number validated");
//		}
	}
	
	public void empLogout()
	{
		empDD.click();
		logoutLink.click();
		logoutBtn.click();
	}
	
	public void ProdQuant()
	{
		monitorLink.click();
		//LGMonitorQuant.clear();
		//LGMonitorQuant.sendKeys(quant,Keys.ENTER);
		addBtn.click();
	}
	
	public void addCustomer(String fn, String ln, String phn, WebDriver driver) throws InterruptedException
	{
		
//		createCust.click();
//		waitUntilEleToBeClickable(driver, 20, firstnameTF);
		firstnameTF.sendKeys(fn);
		lastnameTF.sendKeys(ln);
		phnNumTF.sendKeys(phn);
		saveBtn.click();
	}
	
	public void payment(WebDriver driver, String text, String value)
	{
		handleDropdown(text, selectCustDD);
		scrollByAmount(driver, 500);
		submitBtn.click();
		enterPriceTF.sendKeys(value);
		paymentBtn.click();
		acceptAlert(driver);
	}
	
	
	
	
}
