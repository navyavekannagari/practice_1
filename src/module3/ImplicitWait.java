package module3;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Abhresh\\Installation_stuff\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//PageLoad
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
				
		driver.get("http://newtours.demoaut.com/");
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");//20
		driver.findElement(By.name("password")).sendKeys("tutorial");//20
		driver.findElement(By.name("login")).click();//20
		
		driver.findElement(By.linkText("PROFILE")).click();//20
		
		driver.close();
		
	}

}
