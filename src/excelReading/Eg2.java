package excelReading;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		File myFile2=new File("C:\\Users\\Admin\\Downloads\\Book1.xlsx");
		
		String value = WorkbookFactory.create(myFile2).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
		
		double value2 = WorkbookFactory.create(myFile2).getSheet("Sheet2").getRow(1).getCell(1).getNumericCellValue();
		System.out.println(value2);

		 boolean value3 = WorkbookFactory.create(myFile2).getSheet("Sheet2").getRow(1).getCell(2).getBooleanCellValue();
		System.out.println(value3);


	}

}
