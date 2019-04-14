package module11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\drivers\\chromedriver_2.46.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		Screen s = new Screen();
		
		Pattern cart = new Pattern("C:\\Users\\abhre\\OneDrive\\Pictures\\cart.JPG");
		
		s.getScreen().click(cart);
		
		Thread.sleep(5000);
		
		s.getScreen().click("C:\\Users\\abhre\\OneDrive\\Pictures\\AddtoCart.JPG");

		
	}

}










