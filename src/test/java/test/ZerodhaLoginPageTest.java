package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pojo.Browser;
import pom.ZerodhaLoginPage;
import utility.Excel;
import utility.ScreenShot;

public class ZerodhaLoginPageTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser()
	{
	 driver=Browser.openChrome();
	 
	}
	@AfterMethod
	public void closeBrowser() throws InterruptedException, IOException {
		ScreenShot.takeScreenShot(driver,"Zeodha");}
	@Test
	public  void loginTest() throws EncryptedDocumentException, InterruptedException, IOException
	{
		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
		String userId=Excel.getData("dipali", 0, 0);
		String password=Excel.getData("dipali", 1, 0);
		String pin=Excel.getData("dipali", 2, 0);
		boolean status=zerodhaLoginPage.displayLogo();
		//Assert.assertFalse(status);//hard assert
		SoftAssert softAssert=new SoftAssert();
		softAssert.assertFalse(status);
		zerodhaLoginPage.enterUserID(userId);
		zerodhaLoginPage.enterPassword(password);
		zerodhaLoginPage.clickOnLogIn();
		zerodhaLoginPage.enterPin(pin,driver);
		zerodhaLoginPage.clickOnContinue();
		//zerodhaLoginPage.clickOnForgot2FA();
		zerodhaLoginPage.clickONTataMotor(driver);
		softAssert.assertAll();
		
		
	}
	
//	@Test
//	public void forgotTest() throws IOException
//	{
//		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
//		zerodhaLoginPage.clickOnForgot();
//		ScreenShot.takeScreenShot(driver,"Zeodha");
//	}
//	@Test
//	public void playStoreTest() throws IOException
//	{
//		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
//		zerodhaLoginPage.clickOnPlayStore();
//		ScreenShot.takeScreenShot(driver,"Zeodha");
//	}
//	@Test
//	public void appleStoreTest() throws IOException
//	{
//		ZerodhaLoginPage zerodhaLoginPage=new ZerodhaLoginPage(driver);
//		zerodhaLoginPage.clickOnApple();
//		ScreenShot.takeScreenShot(driver,"Zeodha");
//	}

}



