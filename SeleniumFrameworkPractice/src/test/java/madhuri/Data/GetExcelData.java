package madhuri.Data;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetExcelData {

	public  ArrayList ExcelDataprovider(String Testcasename) throws IOException {
		
		ArrayList<String> data = new ArrayList<String>();

	FileInputStream Excelfile =  new FileInputStream("C:\\Users\\gopal\\OneDrive\\Desktop\\Madhuri\\Automation doc\\Testing Data.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(Excelfile);
	int sheets= workbook.getNumberOfSheets();
	
	for (int i=0 ; i<sheets ; i++) {
		if(workbook.getSheetName(i).equalsIgnoreCase("Testdata")) {
			
			XSSFSheet  sheet =workbook.getSheetAt(i);
		
		
			Iterator<Row> rows = sheet.iterator();
			Row firstrow= rows.next();
			Iterator<Cell> cell = firstrow.iterator();
			int k=0;
			int coloumn = 0;		
			while (cell.hasNext())
			{
				
			Cell value =cell.next();
			if(value.getStringCellValue().equalsIgnoreCase("Testcase"))
			{
				 coloumn =k;
				 
			}
			
			k++;
			}
			
			System.out.println(coloumn);
		
			
			while (rows.hasNext())
			{
				
				Row rowvalue =rows.next();
			if(rowvalue.getCell(coloumn).getStringCellValue().equalsIgnoreCase(Testcasename))
			{
				Iterator<Cell> cell2=rowvalue.cellIterator();
				 
				while (cell2.hasNext())
				{
				 Cell cv =cell2.next();
				
					if(cv.getCellType()== CellType.STRING) {
						data.add(cv.getStringCellValue());
						
						}else if (cv.getCellType() == CellType.NUMERIC)
						{ data.add(NumberToTextConverter.toText(cv.getNumericCellValue()));
							}
					}
				
				
			}
			}
			
			
		}
	}
	return data;
	
	}

}
