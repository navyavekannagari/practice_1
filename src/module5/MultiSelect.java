package module5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");
		
		//Inntialize my Select Class
		Select oSelect = new Select(driver.findElement(By.name("selenium_commands")));
		
		//Part 1 - Select and Deselect - Navigation Commands
		oSelect.selectByVisibleText("Navigation Commands");
		//Thread.sleep(5000);
		oSelect.deselectByIndex(1);
		
		//Part 2 - Run a Loop - Select all the options one by one using index - deselect them one by one
		List<WebElement> oSize = oSelect.getOptions();

		int itotalOptions = oSize.size();
		
		for(int i=0; i<itotalOptions; i++) {
			
			String oValue = oSize.get(i).getText();
			System.out.println(oValue);
			//Thread.sleep(5000);
			
			oSelect.selectByIndex(i);
			
			//Thread.sleep(5000);
			
			//oSelect.deselectByIndex(i);
			Thread.sleep(5000);
		}

		oSelect.deselectAll();
	}

}



