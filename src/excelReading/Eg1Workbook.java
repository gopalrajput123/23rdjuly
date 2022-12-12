package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1Workbook {

	public static void main(String[] args) throws EncryptedDocumentException, IOException

	{
		
		File myFile3=new File("C:\\Users\\Admin\\Downloads\\Book1.xlsx");

        Workbook myWorkbook = WorkbookFactory.create(myFile3);
		 
		Sheet mySheet = myWorkbook.getSheet("Sheet2");
		
		Row myRow = mySheet.getRow(1);
		
        Cell myCell = myRow.getCell(3);	
        
        CellType cellDataType = myCell.getCellType();
        
        System.out.println("Data type is "+cellDataType);
		
        //System.out.println(myCell.getStringCellValue());

        System.out.println(myCell.getBooleanCellValue());

        //System.out.println(myCell.getNumericCellValue());

		
			
				
				
				
				
				
				
			}
		
	}


