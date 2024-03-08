package testNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.genericUtil.BaseClass;
import com.genericUtil.ExcelUtils;
import com.genericUtil.FileUtils;
import com.genericUtil.WebDriverUtils;
import com.objectRepo.HomePage;
import com.objectRepo.LoginPage;
import com.objectRepo.SupplierPage;

@Listeners(com.genericUtil.ListImpClass.class)
public class AddSupplierSmokeTest extends BaseClass
{
	@Test(groups = "smokesuite", retryAnalyzer = com.genericUtil.RetryImpclass.class)
	public void addSupplierSmokeTest() throws Throwable
	{
//		/*FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
//		Properties pobj = new Properties();
//		pobj.load(fis);*/
//		FileUtils flib = new FileUtils();
//		ExcelUtils elib = new ExcelUtils();
//		WebDriverUtils wlib = new WebDriverUtils();
		
	//	
//		String browser = flib.readDataFromPropertyFile("browser");
//		String url = flib.readDataFromPropertyFile("url");
		String admin_un = flib.readDataFromPropertyFile("admin_un");
		String admin_pass = flib.readDataFromPropertyFile("admin_pass");
//		String emp_un = flib.readDataFromPropertyFile("emp_un");
//		String emp_pass = flib.readDataFromPropertyFile("emp_pass");
		
//		//launch browser
//		WebDriver driver=null;
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			driver=new ChromeDriver();
//		}
		
//		//driver.manage().window().maximize();
//		wlib.maximizeWindow(driver);
	//	
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		wlib.waitForPageLoad(driver, 20);
	//	
//		driver.get(url);
		
		//login as admin
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(admin_un, admin_pass, driver);
		//driver.findElement(By.name("user")).sendKeys(admin_un,Keys.TAB,admin_pass,Keys.TAB,Keys.ENTER);
		
//		//alert popup
//		/*Alert alt=driver.switchTo().alert();
//		alt.accept();*/
//		wlib.acceptAlert(driver);
		
		//click on Supplier major tab
		HomePage hp = new HomePage(driver);
		
		hp.supplierTab();
		fail();
		
		//create supplier
		SupplierPage sp = new SupplierPage(driver);
		String compname = elib.readDataFromExcel("Supplier", 1, 1);
		String province = elib.readDataFromExcel("Supplier", 0, 6);
		String city = elib.readDataFromExcel("Supplier", 1, 6);
		String phn = elib.readDataFromExcel("Supplier", 2, 1);
		
		sp.createSupplier(compname, province, city, phn);
//		driver.findElement(By.xpath("//span[text()='Supplier']")).click();
//		driver.findElement(By.xpath("//a[@class='btn btn-primary bg-gradient-primary']")).click();
	}
}
