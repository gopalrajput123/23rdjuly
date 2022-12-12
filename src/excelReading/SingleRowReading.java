package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class SingleRowReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		File myFile2=new File("C:\\Users\\Admin\\Downloads\\tanu.xlsx");
		Sheet mysheet=WorkbookFactory.create(myFile2).getSheet("Sheet3");
		
		//how to read single row
		
		for(int i=0;i<=2;i++)
		{
			String myValue=mysheet.getRow(2).getCell(i).getStringCellValue();
            System.out.print(myValue+" ");
		}
        System.out.println();
        
      System.out.println("================================================");

		//how to read single column/cell
        
        for(int j=0;j<=4;j++)
        {
        	String myValue2=mysheet.getRow(j).getCell(1).getStringCellValue();
            System.out.println(myValue2);
        }
        System.out.println();

      System.out.println("================================================");
	
		
		
		
		
		
		
		
	}

}
