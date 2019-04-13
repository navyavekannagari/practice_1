package module4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CAlert {

	public static void main(String[] args) {

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Open AUT
		driver.get("https://seleniumautomationpractice.blogspot.com/2018/01/blog-post.html");

		// Click on ALert Button
		driver.findElement(By.id("confirm")).click();

		// Innitialize Alert Interface
		Alert cA = driver.switchTo().alert();
		
		System.out.println(cA.getText());
		
		cA.dismiss();
		

	}

}
