package module10;

import java.io.IOException;

public class Execution {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String path = "D:\\AbhreshWorkspace\\Edureka_9thMarch-master\\src\\module10\\MyDataEngine.xlsx";
		
		ExcelUtility.SetExcel(path, 0);
		
		for(int i=0; i<=3; i++)
		{
		String Keyword = ExcelUtility.GetData(i, 1);
			if(Keyword.equals("OpenBrowser"))
			{
				ActionKeywords.OpenBrowser();
			}
			else if(Keyword.equals("Navigate"))
			{
				ActionKeywords.Navigate();
			}
			else if(Keyword.equals("ClickGmail"))
			{
				ActionKeywords.ClickGmail();
			}
		}
	}
}
