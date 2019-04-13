package module5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KBMouseAction {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
		
		WebElement Fname = driver.findElement(By.name("ts_first_name"));
		
		Actions steps = new Actions(driver);
		
		Action act = steps.moveToElement(Fname)
		.keyDown(Fname, Keys.SHIFT)
		.sendKeys(Fname, "a")
		.keyUp(Fname, Keys.SHIFT)
		.sendKeys(Fname, "bhresh")
		.doubleClick(Fname)
		.contextClick(Fname)
		.build();
		
		act.perform();		
	}

}
