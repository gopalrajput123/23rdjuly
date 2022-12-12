package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class WholeRowReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		File myFile2=new File("C:\\Users\\Admin\\Downloads\\tanu.xlsx");
		Sheet mysheet=WorkbookFactory.create(myFile2).getSheet("Sheet3");
		
		//how to read whole sheet by using neasted for loop
		//outer for loop for rows-->varrys from-->0 to 4 
		for(int i=0;i<=4;i++)
		{
			//inner for loop for cell/column-->varrys from-->0 to 3
			for(int j=0;j<=2;j++)
			{
				String value=mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+"|");
			}
			System.out.println();
  
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
