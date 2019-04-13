package module10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	static WebDriver driver;
	
	public static void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\AbhreshWorkspace\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Browser successfully innitialized");
	}
	
	public static void Navigate(){
		driver.get("https://www.google.com");
		System.out.println("Launched AUT");
	}
	
	public static void ClickGmail() throws InterruptedException{
		driver.findElement(By.linkText("Gmail")).click();
		System.out.println("Clicked on Gmail Link");
		Thread.sleep(5000);
	}
}
