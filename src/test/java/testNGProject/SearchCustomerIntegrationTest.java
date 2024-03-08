package testNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.genericUtil.BaseClass;
import com.genericUtil.ExcelUtils;
import com.genericUtil.FileUtils;
import com.genericUtil.WebDriverUtils;
import com.objectRepo.CustomerPage;
import com.objectRepo.HomePage;
import com.objectRepo.LoginPage;

public class SearchCustomerIntegrationTest extends BaseClass
{
	@Test(groups = "regressionsuite")
	public void searchCustomerIntegrationTest() throws Throwable
	{
//		FileUtils flib = new FileUtils();
//		ExcelUtils elib=new ExcelUtils();
//		WebDriverUtils wlib=new WebDriverUtils();
		
		//Read data from properties file
		/*FileInputStream fir=new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties pobj=new Properties();
		pobj.load(fir);*/
//		String browser=flib.readDataFromPropertyFile("browser");
//		String url = flib.readDataFromPropertyFile("url");
		String admin_un = flib.readDataFromPropertyFile("admin_un");
		String admin_pass = flib.readDataFromPropertyFile("admin_pass");
		
		//launch browser
//		WebDriver driver=null;
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			driver=new ChromeDriver();
//		}
		
		//maximize window
		//driver.manage().window().maximize();
//		wlib.maximizeWindow(driver);
	//	
//		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
//		wlib.waitForPageLoad(driver, 20);
	//	
//		driver.get(url);
	//	
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(admin_un, admin_pass, driver);
		//driver.findElement(By.name("user")).sendKeys(admin_un, Keys.TAB, admin_pass, Keys.TAB, Keys.ENTER);
		
		//handle popup
		//Alert alt=driver.switchTo().alert();
		//alt.accept();
		//wlib.acceptAlert(driver);
		
		//click on customer module
		HomePage hp = new HomePage(driver);
		hp.customerTab();
		//driver.findElement(By.xpath("//span[text()='Customer']")).click();
		
		//create customer
		CustomerPage cp = new CustomerPage(driver);
		
		//driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
		//Thread.sleep(3000);
		
		//fetching data from excel
		/*FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\ExcelSales.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Customer");
		int rowCount = sh.getLastRowNum();
		int celCount = sh.getRow(0).getLastCellNum();
		for(int i=1;i<=rowCount;i++)
		{
			for(int j=1;j<celCount;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		
		}
		String fn = sh.getRow(1).getCell(1).getStringCellValue();
		String ln = sh.getRow(2).getCell(1).getStringCellValue();
		String phn = sh.getRow(3).getCell(1).getStringCellValue();*/
		String fn = elib.readDataFromExcel("Customer", 1, 1);
		String ln = elib.readDataFromExcel("Customer", 2, 1);
		String phn = elib.readDataFromExcel("Customer", 3, 1);
		
		
		//Enter data into Add customer
		cp.createCustomer(fn, ln, phn);
		//driver.findElement(By.name("firstname")).sendKeys(fn, Keys.TAB, ln, Keys.TAB, phn, Keys.TAB, Keys.ENTER );
		
		//Handling web table
//		WebElement ele = driver.findElement(By.xpath("//table[@class='table table-bordered dataTable no-footer']/tbody/tr[contains(.,fn)]/td[1]"));
//		String fname = ele.getText();
//		System.out.println(fname);
		
		//search and validate
		cp.searchCustomer(fn);
	}
}

