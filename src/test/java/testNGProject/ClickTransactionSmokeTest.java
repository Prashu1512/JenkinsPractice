package testNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.genericUtil.BaseClass;
import com.genericUtil.ExcelUtils;
import com.genericUtil.FileUtils;
import com.genericUtil.WebDriverUtils;
import com.objectRepo.HomePage;
import com.objectRepo.LoginPage;

public class ClickTransactionSmokeTest extends BaseClass
{
	@Test(groups = "smokesuite")
	public void clickTransactionSmokeTest() throws Throwable
	{
//		FileUtils flib = new FileUtils();
//		ExcelUtils elib = new ExcelUtils();
//		WebDriverUtils wlib=new WebDriverUtils();
		/*FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\CommonData.properties");
		Properties pobj = new Properties();
		pobj.load(fis);*/
		
		//read data from property file
//		String browser = flib.readDataFromPropertyFile("browser");
//		String url = flib.readDataFromPropertyFile("url");
		String admin_un = flib.readDataFromPropertyFile("admin_un");
		String admin_pass = flib.readDataFromPropertyFile("admin_pass");
	
		//launch browser
//		WebDriver driver=null;
//		if(browser.equalsIgnoreCase("chrome"))
//		{
//			driver=new ChromeDriver();
//		}
		
		//driver.manage().window().maximize();
//		wlib.maximizeWindow(driver);
//		
//		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		wlib.waitForPageLoad(driver, 10);
//		
//		driver.get(url);
		
		//login as admin
		LoginPage lp = new LoginPage(driver);
		lp.loginToApp(admin_un, admin_pass, driver);
		//driver.findElement(By.name("user")).sendKeys(admin_un, Keys.TAB, admin_pass, Keys.TAB, Keys.ENTER);
		
		/*Alert alt = driver.switchTo().alert();
		alt.accept();*/
		//handling alert popup
		//wlib.acceptAlert(driver);
		
		//click on transaction major tab
		HomePage hp = new HomePage(driver);
		hp.transactionTab();
		//driver.findElement(By.xpath("//span[text()='Transaction']")).click();
	}
}
