package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearchText {

	public static WebDriver driver;
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\AbhreshWorkspace\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/?toWww=1&redig=D889C0AECD3647ADA5CF07449ECE0EEC");
		
		BingHomePageObjects page = new BingHomePageObjects(driver);
		
		//Search SeleniumHQ
		page.txtSearch.clear();
		page.txtSearch.sendKeys("SeleniumHQ");
		
		//Click on Search Button
		page.BtnSearch.click();
				
		page.txtSearch.clear();
		page.txtSearch.sendKeys("Edureka");
		page.BtnSearch.click();

		page.txtSearch.clear();
		page.txtSearch.sendKeys("India");
		page.BtnSearch.click();

		page.txtSearch.clear();
		page.txtSearch.sendKeys("Pune");
		page.BtnSearch.click();

		page.txtSearch.clear();
		page.txtSearch.sendKeys("SeleniumHQ");
		page.BtnSearch.click();

		

	}

}
