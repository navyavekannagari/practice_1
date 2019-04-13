package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePageObjects {

	public BingHomePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	public WebElement txtSearch;

	@FindBy(name = "go")
	public WebElement BtnSearch;
	
}
