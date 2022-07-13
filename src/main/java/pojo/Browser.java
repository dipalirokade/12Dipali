package pojo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
	
	public static WebDriver openChrome()
	{   
		ChromeOptions option =new ChromeOptions();
	    option.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
	    //System.setProperty("webdriver.chrome.driver","C:\\sel chrome imp folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000,TimeUnit.MILLISECONDS);
		return driver;
	}

}
