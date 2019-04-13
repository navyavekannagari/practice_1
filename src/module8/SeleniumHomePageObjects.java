package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHomePageObjects {

	public SeleniumHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Download")
	public WebElement Download;
	
	@FindBy(linkText = "Browser Automation")
	public WebElement HomeClick;
	
	
	public void clickDownload(){
		Download.click();
	}
	
	public void ClickHome(){
		HomeClick.click();
	}
}
