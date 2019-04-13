package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects2 {

	public BingHomePageObjects2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	public WebElement txtSearch;

	@FindBy(name = "go")
	public WebElement BtnSearch;
	
	@FindBy(linkText = "Selenium - Web Browser Automation")
	public WebElement ClickSel;
	
	public void SearchBing(String SearchContent){
		//Search SeleniumHQ
		txtSearch.clear();
		txtSearch.sendKeys(SearchContent);
		BtnSearch.click();
	}
	
	public void GotoSeleium(){
		ClickSel.click();
	}
	
}
