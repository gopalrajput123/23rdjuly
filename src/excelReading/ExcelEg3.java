package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelEg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile2=new File("C:\\Users\\Admin\\Downloads\\tanu.xlsx");
		Sheet mysheet=WorkbookFactory.create(myFile2).getSheet("Sheet3");
		
		int lastRowNum=mysheet.getLastRowNum();
		System.out.println("last row num is "+lastRowNum);
		
		int totalNumOfRows=lastRowNum-2;
		System.out.println("total num of rows are  "+totalNumOfRows);

		System.out.println("==============================================");
		
		int lastCellNum=mysheet.getRow(0).getLastCellNum();
		System.out.println("last cell num is  "+lastCellNum);

		int totalNumOfCells=lastCellNum-1;
		System.out.println("total num of cells are  "+totalNumOfCells);

		System.out.println("==============================================");

		for(int i=0;i<=totalNumOfRows;i++ )
		{
			for(int j=0;j<=totalNumOfCells;j++)
			{
				String value1=mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value1+" ");
			}
			System.out.println();

		}


	}

}
