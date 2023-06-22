package Com.wallyax.Browserutility;

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadExcel {
	
	static String fileLocation = "./TestData/New Microsoft Excel Worksheet.xlsx";
	static XSSFWorkbook wbook;
	static XSSFSheet sheet;
	
	@DataProvider(name="excelreader")
	public static String[][] readExcel(int sheetIndox) {
		try {
			wbook = new XSSFWorkbook(fileLocation);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sheet = wbook.getSheetAt(sheetIndox);
		int lastRow = sheet.getLastRowNum();
		System.out.println(lastRow);
		short lastcellNumber = sheet.getRow(0).getLastCellNum();
		System.out.println(lastcellNumber);
		
		
		String[][] data = new String[lastRow][lastcellNumber];		
		
		for(int i=1;i<=lastRow;i++) {
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<lastcellNumber;i++) {
				XSSFCell cell = row.getCell(j);
				
				DataFormatter dff = new DataFormatter();
				
			String value=dff.formatCellValue(cell);
			data[i-1][j]=value;
				
			}
		}
		try {
			wbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
		
	}

}
