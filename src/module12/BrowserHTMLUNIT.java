package module12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class BrowserHTMLUNIT {

	public static void main(String[] args) {

		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("https://www.google.com/");
		
		String AppTitle = driver.getTitle();

		System.out.println(AppTitle);
			
		boolean result = AppTitle.equals("google");
		
		System.out.println(result);

		

	}

}
