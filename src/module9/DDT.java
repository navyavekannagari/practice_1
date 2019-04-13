package module9;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DDT {

	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int rownum;
	int colnum;
		
	
	@BeforeSuite
	public void OpenBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\AbhreshWorkspace\\ExeFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	}
	
	@Test(dataProvider = "TD")
	public void FormFill(String FName, String LName, String Add) throws InterruptedException{
		
		driver.findElement(By.id("ts_first_name")).clear();
		driver.findElement(By.id("ts_first_name")).sendKeys(FName);
		
		driver.findElement(By.id("ts_last_name")).clear();
		driver.findElement(By.id("ts_last_name")).sendKeys(LName);
		
		driver.findElement(By.id("ts_address")).clear();
		driver.findElement(By.id("ts_address")).sendKeys(Add);
		
		Thread.sleep(5000);
			
	}

	@DataProvider(name = "TD")
	public Object[][] TestFeed() throws IOException, BiffException{
		
		FileInputStream fis = new FileInputStream("D:\\AbhreshWorkspace\\Edureka_9thMarch-master\\src\\module9\\TestData.xls");
	
		wb = Workbook.getWorkbook(fis);
		
		sh = wb.getSheet(1);
		
		rownum = sh.getRows();
		
		colnum = sh.getColumns();
		
		Object[][] FormData = new Object[rownum][colnum];
		
		for(int i=0; i<rownum; i++)
		{
			for(int j=0; j<colnum; j++)
			{
				FormData[i][j] = sh.getCell(j, i).getContents();
			}
		}
		return FormData;
	}

	@AfterSuite
	public void Closebrowser(){
		driver.quit();
	}
}
