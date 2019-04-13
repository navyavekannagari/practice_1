package module10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	public static void SetExcel(String path, int Sheetnum) throws IOException
	{
	
		File src = new File(path);
		
		FileInputStream fis = new FileInputStream(src);
		
		wb = new XSSFWorkbook(fis);
		
		sh = wb.getSheetAt(Sheetnum);
	}
	
	public static String GetData(int rownum, int celnum)
	{
		String Data = sh.getRow(rownum).getCell(celnum).getStringCellValue();
		return Data;
	}

}


