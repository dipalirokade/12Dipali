package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	public static String getData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Placement Programs\\.metadata\\.plugins\\org.eclipse.core.resources\\.projects\\dipali\\Zerodha\\src\\test\\resources\\textdata.xlsx");
		String value=WorkbookFactory.create(file).getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	    return value;
	
	}

}
