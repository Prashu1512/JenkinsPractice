package testNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.genericUtil.BaseClass;
import com.genericUtil.ExcelUtils;
import com.genericUtil.FileUtils;
import com.genericUtil.WebDriverUtils;
import com.objectRepo.HomePage;
import com.objectRepo.LoginPage;
import com.objectRepo.ProductPage;

public class UpdateProductSystemTest extends BaseClass 
{
	@Test
	public void updateProductSystemTest() throws Throwable
	{
		//create object for all utils
//				FileUtils flib = new FileUtils();
//				ExcelUtils elib = new ExcelUtils();
//				WebDriverUtils wlib = new WebDriverUtils();
				
				//Read data from properties file
//				String browser = flib.readDataFromPropertyFile("browser");
//				String url = flib.readDataFromPropertyFile("url");
				String admin_un = flib.readDataFromPropertyFile("admin_un");
				String admin_pass = flib.readDataFromPropertyFile("admin_pass");
				String emp_un = flib.readDataFromPropertyFile("emp_un");
				String emp_pass = flib.readDataFromPropertyFile("emp_pass");
				
				
//				WebDriver driver=null;
//				if(browser.equalsIgnoreCase("chrome"))
//				{
//					driver=new ChromeDriver();
//				}
//				else if(browser.equalsIgnoreCase("edge"))
//				{
//					driver=new EdgeDriver();
//				}
//				else if(browser.equalsIgnoreCase("firefox"))
//				{
//					driver=new FirefoxDriver();
//				}
//				else 
//				{
//					System.out.println("Invalid browser");
//				}
//				//maximize window
//				wlib.maximizeWindow(driver);
//				
//				//implicitwait
//				wlib.waitForPageLoad(driver, 10);
//				
//				//Launch the browser
//				driver.get(url);
				
				//login as admin
				LoginPage lp = new LoginPage(driver);
				lp.loginToApp(admin_un, admin_pass, driver);
				
		
				//fetching data from excel
				String p_code = elib.readDataFromExcel("Product", 1, 1);
				String p_name = elib.readDataFromExcel("Product", 2, 1);
				String p_desc = elib.readDataFromExcel("Product", 3, 1);
				String p_quant = elib.readDataFromExcel("Product", 4, 1);
				String p_hand = elib.readDataFromExcel("Product", 5, 1);
				String p_price = elib.readDataFromExcel("Product", 6, 1);
				String p_cat = elib.readDataFromExcel("Product", 0, 6);
				String p_sup = elib.readDataFromExcel("Product", 1, 6);
				String date = elib.readDataFromExcel("Product", 7, 1);
										
				//create product
				HomePage hp = new HomePage(driver);
				hp.productTab();
				//driver.findElement(By.xpath("//span[text()='Product']")).click();
				
				ProductPage pp = new ProductPage(driver);
				pp.createProd(p_code, p_name, p_desc, p_quant, p_hand, p_price, p_cat, p_sup, date);
				
				//search for product and Edit price
				String updatedprice = elib.readDataFromExcel("Product", 6, 2);
				//System.out.println(updatedprice);
				pp.editProd(p_code, updatedprice, p_cat, driver);

				
				//validate product
				pp.validateProd(p_code, updatedprice);
//			driver.findElement(By.xpath("//input[@class='form-control form-control-sm']")).sendKeys(p_code, Keys.ENTER);
//			
				
				
				//logout
				hp.adminLogout();
	}
}
