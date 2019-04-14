package module12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJS {

	public static void main(String[] args) {

		System.setProperty("phantomjs.binary.path", "C:\\Users\\abhre\\Downloads\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.google.com/");
		
		String AppTitle = driver.getTitle();

		System.out.println(AppTitle);
			
		boolean result = AppTitle.equals("google");
		
		System.out.println(result);

		

	}

}
