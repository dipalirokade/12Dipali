package test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaSignUpPage;
import utility.Excel;
import utility.ScreenShot;

public class ZerodhaSignUpPageTest {
  WebDriver driver;
  @BeforeMethod
  public void openBrowser()
  {
	driver=  Browser.openChrome();
  }
  
  @Test
  public void signUpPage() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  ZerodhaSignUpPage zerodhaSignUpPage=new ZerodhaSignUpPage(driver);
	  zerodhaSignUpPage.clickOnSignUp(driver);
	 
	 // Thread.sleep(5000);
	  String number=Excel.getData("dipali", 3, 0);
	  zerodhaSignUpPage.enterMobileNumber(number);
	  zerodhaSignUpPage.clickOnContinue();
	  ScreenShot.takeScreenShot(driver,"ZerodhaPin");
  }
}
