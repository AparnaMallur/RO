package Constants;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class utility {
	
	private static XSSFSheet ExcelWSheet;
	 
	private static XSSFWorkbook ExcelWBook;

	private static XSSFCell Cell;

	private static XSSFRow Row;

//This method is to set the File path and to open the Excel file, Pass Excel Path and Sheetname as Arguments to this method

public static void setExcelFile(String Path,String SheetName) throws Exception {

		try {

			// Open the Excel file

		FileInputStream ExcelFile = new FileInputStream(Path);

		// Access the required test data sheet

		ExcelWBook = new XSSFWorkbook(ExcelFile);
		//System.out.println("wscount"+ExcelWBook.getNumberOfSheets());
		ExcelWSheet = ExcelWBook.getSheet(SheetName);
		//System.out.println("sheet name1$$$"+ExcelWSheet.getSheetName());

		} catch (Exception e){

			throw (e);

		}

}

//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

public static String getCellData(int RowNum, int ColNum) throws Exception{

		try{
			
			//System.out.println("sheet name in getcell"+ExcelWSheet.getSheetName());
			String CellData="";
			
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			String typ="";
			switch(Cell.getCellType())
			{
			   // case statements
			   // values must be of same type of expression
			   case XSSFCell.CELL_TYPE_STRING :
				   CellData = Cell.getStringCellValue();
				   typ="string";
			      break; // break is optional
			   
			   case XSSFCell.CELL_TYPE_NUMERIC :
			      // Statements
				   CellData = NumberToTextConverter.toText(Cell.getNumericCellValue());
				   typ="number";
				   break; // break is optional
			   
			   
			}
			
				//if(Cell.getCellType()==XSSFCell.CELL_TYPE_STRING) {
					//	 CellData = Cell.getStringCellValue();
				//}
//System.out.println("cell data" + CellData);
				//if(Cell.getCellType()==XSSFCell.CELL_TYPE_NUMERIC) {
				//	 CellData = NumberToTextConverter.toText(Cell.getNumericCellValue());
					 
			//}
		//	System.out.println("cell data" + CellData +"is"+typ);
			return CellData;

			}catch (Exception e){
				System.out.println(e.getMessage());
			return"";

			}

}

//This method is to write in the Excel cell, Row num and Col num are the parameters

public static void setCellData(String Result,  int RowNum, int ColNum) throws Exception	{

		try{

			Row  = ExcelWSheet.getRow(RowNum);

		Cell = Row.getCell(ColNum, Row.RETURN_BLANK_AS_NULL);

		if (Cell == null) {

			Cell = Row.createCell(ColNum);

			Cell.setCellValue(Result);

			} else {

				Cell.setCellValue(Result);

			}

// Constant variables Test Data path and Test Data file name

				FileOutputStream fileOut = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);

				ExcelWBook.write(fileOut);

				fileOut.flush();

				fileOut.close();

			}catch(Exception e){

				throw (e);

		}

	}


	
}
