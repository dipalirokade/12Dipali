package pom;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaSignUpPage {
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signUp;
	@FindBy (xpath="//input[@id='user_mobile']") private WebElement mobilenumber;
	@FindBy (xpath="//button[@id='open_account_proceed_form']") private WebElement mobileContinue;
	
	public ZerodhaSignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnSignUp(WebDriver driver) throws InterruptedException 
	{//Thread.sleep(3000);
       signUp.click();
      Set<String> handles=driver.getWindowHandles();
 	  Iterator<String> i=handles.iterator();
 	  String handle1=i.next();
 	  System.out.println(handle1);
 	  String handle2=i.next();
 	  driver.switchTo().window(handle2);
	}
	public void enterMobileNumber(String number)
	{
		mobilenumber.sendKeys(number);
	}
	public void clickOnContinue()
	{
		mobileContinue.click();
	}

}
