package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class ZerodhaLoginPage<ChromeOptions> {
	@FindBy (xpath="//input[@id='userid']") private WebElement userId;
	@FindBy (xpath="//input[@id='password']") private WebElement password;
	@FindBy (xpath="//button[@type='submit']")private WebElement logIn;
	@FindBy (xpath="//a[text()='Forgot user ID or password?']") private WebElement forgot;
	@FindBy (xpath="//a[text()=\"Don't have an account? Signup now!\"]") private WebElement signUp;
    @FindBy (xpath="//img[@alt='Kite Android']") private WebElement playStore;
    @FindBy (xpath="//img[@alt='Kite iOS']") private WebElement appleStore;
    @FindBy (xpath="//input[@id='pin']") private WebElement pin;
    @FindBy (xpath="//button[@class='button-orange wide']") private WebElement pinLogIn;
    @FindBy (xpath="//a[text()='Forgot 2FA?']") private WebElement forgot2FA;
    @FindBy (xpath="//span[text()='TATAPOWER']") private WebElement tatMotor;
    @FindBy (xpath="//img[@alt='Kite']") private WebElement logo;
    public ZerodhaLoginPage(WebDriver driver)
    {
     PageFactory.initElements(driver, this);
    }
    public void enterUserID(String user)
    {
    	userId.sendKeys(user);
    }
    public void enterPassword(String pass)
    {
    	password.sendKeys(pass);
    }
    public void clickOnLogIn()
    {
    	logIn.click();
    	
    }
    public void clickOnForgot()
    {
    	forgot.click();
    }
    public void clickOnSignUp()
    {
    	signUp.click();
    }
    public void clickOnPlayStore()
    {
    	playStore.click();
    }
    public void clickOnApple()
    {
    	appleStore.click();
    }
    public void  enterPin(String pinnumber,WebDriver driver)
    {
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(2000));//expicit
    wait.until(ExpectedConditions.visibilityOf(pin));
    
//    	FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
//    	wait.withTimeout(Duration.ofMillis(2000));
//    	wait.pollingEvery(Duration.ofMillis(500));
//    	wait.ignoring(Exception.class);
//    	wait.until(ExpectedConditions.visibilityOf(pin));	
        pin.sendKeys(pinnumber);
    }
    public void clickOnContinue()
    { 
    	pinLogIn.click();
    	
    	
    }
    public void clickOnForgot2FA() {
    	forgot2FA.click();
    }
    public void clickONTataMotor(WebDriver driver)
    { 
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofMillis(5000));
        wait.until(ExpectedConditions.visibilityOf(tatMotor));
    	tatMotor.click();
    }
    public boolean displayLogo() {
    	return logo.isDisplayed();
    	//return;
    }
}
