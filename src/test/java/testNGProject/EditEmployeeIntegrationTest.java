package testNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.genericUtil.BaseClass;
import com.genericUtil.ExcelUtils;
import com.genericUtil.FileUtils;
import com.genericUtil.WebDriverUtils;
import com.objectRepo.LoginPage;
import com.objectRepo.POSPage;

public class EditEmployeeIntegrationTest extends BaseClass
{
	@Test(groups = "regressionsuite")
	public void editEmployeeIntegrationTest() throws Throwable
	{
//		//creating object for generic utilities
//		FileUtils flib = new FileUtils();
//		ExcelUtils elib = new ExcelUtils();
//		WebDriverUtils wlib = new WebDriverUtils();
		
		//Read data from properties file
			/*	FileInputStream fir=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
				Properties pobj=new Properties();
				pobj.load(fir);*/
//				String browser = flib.readDataFromPropertyFile("browser");
//				String url = flib.readDataFromPropertyFile("url");
//				String admin_un = flib.readDataFromPropertyFile("admin_un");
//				String admin_pass = flib.readDataFromPropertyFile("admin_pass");
				String emp_un = flib.readDataFromPropertyFile("emp_un");
				String emp_pass = flib.readDataFromPropertyFile("emp_pass");
				
//				//Launch the browser
//				WebDriver driver=null;
//				if(browser.equalsIgnoreCase("chrome"))
//				{
//					driver=new ChromeDriver();
//				}
				
				//maximize window
				//driver.manage().window().maximize();
//				wlib.maximizeWindow(driver);
//				
//				//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//				wlib.waitForPageLoad(driver, 10);
//				
//				driver.get(url);
				
				//login as employee
				LoginPage lp = new LoginPage(driver);
				lp.loginToApp(emp_un, emp_pass, driver);
				//driver.findElement(By.name("user")).sendKeys(emp_un, Keys.TAB, emp_pass, Keys.TAB, Keys.ENTER);
				
				//handle popup
				//wlib.acceptAlert(driver);
				String gender = elib.readDataFromExcel("POS", 1, 6);
				String password = elib.readDataFromExcel("POS", 2, 6);
				String phn = elib.readDataFromExcel("POS", 3, 6);
	
				
				//Edit employee details
				POSPage pos = new POSPage(driver);
				pos.EditEmp(gender, password, phn, driver);
//				driver.findElement(By.xpath("//img[@class='img-profile rounded-circle']")).click();
//				driver.findElement(By.xpath("//a[@data-target='#settingsModal']")).click();
//				Thread.sleep(4000);
				
				//WebElement dd = driver.findElement(By.xpath("//div[@id='settingsModal']/descendant::select[@name='gender']"));
				/*Select sel=new Select(dd);
				sel.selectByVisibleText("Male");*/
				//String text=elib.readDataFromExcel("Employee", 0, 6);
				//wlib.handleDropdown(text, dd);
				
//				driver.findElement(By.name("password")).sendKeys(emp_pass);
//				WebElement ele = driver.findElement(By.name("phone"));
//				ele.clear();
//				ele.sendKeys(value);
				/*Actions act=new Actions(driver);
				act.scrollByAmount(0, 500).perform();*/
				//wlib.scrollByAmount(driver, 500);
				
//				driver.findElement(By.xpath("//form[@action='settings_edit.php']/descendant::button[@class='btn btn-success']")).submit();
//				Thread.sleep(2000);
//				wlib.acceptAlert(driver);
//				Thread.sleep(2000);
				

				
				//validation
				pos.validatePhnNum(phn);
				
//				driver.findElement(By.xpath("//img[@class='img-profile rounded-circle']")).click();
//				driver.findElement(By.xpath("//a[@data-target='#settingsModal']")).click();
//				WebElement ele1 = driver.findElement(By.xpath("(//h4[contains(.,'Employee')]/ancestor::div[@id='content-wrapper']/descendant::h5)[8]"));
//				String mob = ele1.getText();
//				System.out.println(mob);
//				if(mob.contains(value))
//				{
//					System.out.println("phonenumber updated");
//				}
//				else
//				{
//					System.out.println("phonenumber not updated");
//				}
//				Thread.sleep(2000);
//				wlib.scrollByAmount(driver, 500);
//				driver.findElement(By.xpath("//h5[text()='Edit User Info']/ancestor::div[@id='settingsModal']/descendant::button[@class='btn btn-secondary']")).click();

				
				//logout
				pos.empLogout();
	}
}
