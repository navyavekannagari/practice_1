package module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeDragDrop {

	public static void main(String[] args) {

		//Open Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("http://jqueryui.com/droppable/");
		
		//Create 3 WebElement
		//Iframe
		WebElement F = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(F);
		
		//DragBox Location
		WebElement From = driver.findElement(By.id("draggable"));
		
		//DropBox Location
		WebElement To = driver.findElement(By.id("droppable"));

		//Actions Class
		Actions act = new Actions(driver);
		
		//Act
		act.dragAndDrop(From, To).perform();
	
		
		
	}

}
