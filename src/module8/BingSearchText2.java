package module8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingSearchText2 {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\AbhreshWorkspace\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.bing.com/?toWww=1&redig=D889C0AECD3647ADA5CF07449ECE0EEC");
		
		BingHomePageObjects2 page1 = new BingHomePageObjects2(driver);
		
		page1.SearchBing("SeleniumHQ");
		
		page1.GotoSeleium();
		
		SeleniumHomePageObjects page2 = new SeleniumHomePageObjects(driver);
		
		Thread.sleep(5000);
		page2.clickDownload();
		Thread.sleep(5000);
		page2.ClickHome();

	}

}
