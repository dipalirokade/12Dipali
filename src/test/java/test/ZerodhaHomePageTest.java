package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.ZerodhaHomePage;
import utility.BaseClass;
import utility.Excel;
import utility.ScreenShot;
@Listeners(utility.Listeners.class)
public class ZerodhaHomePageTest extends BaseClass {
	
	//WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() throws EncryptedDocumentException, IOException {
		driver=Browser.openChrome();
		ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
    	String userId=Excel.getData("dipali", 1, 3);
    	String password=Excel.getData("dipali", 2, 3);
    	String pin=Excel.getData("dipali", 3, 3);
    	zerodhaHomePage.enterUserId(userId);
    	zerodhaHomePage.enterPassword(password);
    	zerodhaHomePage.clickOnLogIn();
    	zerodhaHomePage.enterPin(pin);
    	zerodhaHomePage.clickOnContinue();
	}
//	@AfterMethod
//	public void screen() throws IOException {
//		ScreenShot.takeScreenShot(driver, "HomePage");
//		//driver.quit();
//	}
    @Test(timeOut=1000)
    public void homePageTest() throws EncryptedDocumentException, IOException, InterruptedException {
    	ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
    	Thread.sleep(4000);
    	zerodhaHomePage.clickOnorders();
    	zerodhaHomePage.clickOnHondings();
    }
    	
    @Test
    public  void test() throws EncryptedDocumentException, IOException, InterruptedException 
    {
    	ZerodhaHomePage zerodhaHomePage=new ZerodhaHomePage(driver);
    	//Thread.sleep(4000);
        zerodhaHomePage.selectSharezfromWatchListAndBuy("WIPRO", driver);
        
//        boolean status=zerodhaHomePage.showDisplayBuyButton();
//        SoftAssert softAssert=new SoftAssert();
//        softAssert.assertTrue(status, "Buy");
//		softAssert.assertAll();
//		System.out.println("Buy button is displayed:" +status);
		
   
    }
    	
}