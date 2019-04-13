package module5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
			
		//Part1 - Open AUT and Capture the name of the window
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		
		String mw = driver.getWindowHandle();
		System.out.println("The main window name is:-"+ mw);
		System.out.println("=================================================================");
		
		//Part 2 - click on a button which will another window
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[3]/button")).click();
		
		//Part 3 - get all window names
		Set<String> allwn = driver.getWindowHandles();
		
		System.out.println("The all window name is:-"+ allwn);
		System.out.println("=================================================================");
		
		//Part 4 - Get all window names and run the data into a for loop and will switch between the windows oppened
		
		for(String sw : driver.getWindowHandles()) {

			Thread.sleep(5000);
			driver.switchTo().window(sw);//since New window is active window it will switch to Main window
		
			Thread.sleep(5000);
			driver.switchTo().window(sw);//since we just moved to the main window now we will move to the other window which new window	
			
		}
		
		driver.close();//my new window will close
		//driver.quit();// close both the window in one go
	}
	
}
