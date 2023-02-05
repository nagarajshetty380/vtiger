package GenricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getExcelData(String SheetName,int RowNum,int CelNum) throws Throwable
	{
		FileInputStream fis= new FileInputStream("./src/test/resources/datafile.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(SheetName);
		Row row = sh.getRow(RowNum);
		Cell cell = row.getCell(CelNum);
		String orgName = cell.getStringCellValue();
		return orgName;
		
		
		
		
	}

}
