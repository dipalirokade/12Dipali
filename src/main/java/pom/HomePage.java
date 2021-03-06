package pom;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	@FindBy (xpath="//input[@icon='search']") private WebElement search;
	@FindBy (xpath="//span[@class='nice-name']")private List<WebElement> shares;
	@FindBy (xpath="//button[@class='button-blue buy']") private WebElement buy;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterSearchShare(String stockName) {
		search.sendKeys(stockName);
	}
	public void selectSharezfromWatchListAndBuy(String shareName,WebDriver driver) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofMillis(4000));
		wait.until(ExpectedConditions.visibilityOf(search));
		
		System.out.println(shares.size());
		for(int i=0;i<shares.size();i++) {
			WebElement stock=shares.get(i);
			String stockName=stock.getText();
			
			if(stockName.equals(shareName))
			{
				Actions action=new Actions(driver);
				action.moveToElement(stock);
				action.perform();
				buy.click();
				
				
			}
			}
		
	}
	

}
