package test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.HomePage;
import pom.ZerodhaHomePage;
import utility.Excel;

public class HomePageTest {
	WebDriver driver;
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

	@Test
	public void buyFromWatchListTest() {
		HomePage homePage=new HomePage(driver);
		homePage.selectSharezfromWatchListAndBuy("WIPRO", driver);
    	
    	
	
	}
}
