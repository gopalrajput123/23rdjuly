package excelReading;
import java.io.File;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{

		File MyFile=new File("C:\\Users\\Admin\\Downloads\\monaSheet1.xlsx");
		
		String value1=WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value1);
		
		String value2 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(value2);

		double value3 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(2).getCell(2).getNumericCellValue();
		System.out.println(value3);

		String value4 = WorkbookFactory.create(MyFile).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		System.out.println(value4);
		
		
	}

}
