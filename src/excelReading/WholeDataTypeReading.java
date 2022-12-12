package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.CellType;

public class WholeDataTypeReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
	 
	    kbc();
		System.out.println("=======================================");

		File myFile2=new File("C:\\Users\\Admin\\Downloads\\tanu.xlsx");
		Sheet mysheet=WorkbookFactory.create(myFile2).getSheet("Sheet4");
		
		int totalNumOfRows=mysheet.getLastRowNum();
		int totalNumOfCells=mysheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=totalNumOfRows;i++)
		{
			for(int j=0;j<=totalNumOfCells;j++)
			{
				CellType CellDataType=mysheet.getRow(i).getCell(j).getCellType();
				
			if(CellDataType==CellType.STRING)
			{
				String value1=mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value1+" |");
			}
			else if(CellDataType==CellType.NUMERIC)
			{
				double value2=mysheet.getRow(i).getCell(j).getNumericCellValue();
				System.out.print(value2+" |");
			}
			else if(CellDataType==CellType.BOOLEAN)
			{
				boolean value3=mysheet.getRow(i).getCell(j).getBooleanCellValue();
				System.out.print(value3+" |");
			}
			else if(CellDataType==CellType.BLANK)
			{
				
			}
			
			}
			System.out.println();

		}
		System.out.println("=======================================");

		     
	}
    public static void kbc()  throws EncryptedDocumentException, IOException 
	     {
	    	 File myFile2=new File("C:\\Users\\Admin\\Downloads\\tanu.xlsx");

	    	 
	    	 for(int i=0;i<=3;i++)
	    	 {
	    		 String value=WorkbookFactory.create(myFile2).getSheet("Sheet5").getRow(i).getCell(i).getStringCellValue();
		 			System.out.print(value+" ");

	    	 }
	 			System.out.println();

	 			 for(int i=3;i>=0;i--)
		    	 {
		    		 String value=WorkbookFactory.create(myFile2).getSheet("Sheet5").getRow(i).getCell(i).getStringCellValue();
			 			System.out.print(value+" ");

		    	 }
		 			System.out.println();
	     }
	     
	    
	
	           
     
}
