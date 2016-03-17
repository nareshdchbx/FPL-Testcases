package com.businessutilities;


	import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	public static int ij=1;
		private static XSSFSheet ExcelWSheet;

		private static XSSFWorkbook ExcelWBook;

		private static XSSFCell Cell;

		private static XSSFRow Row;



	public static String[][] getTableArray(String FilePath, String SheetName, int col) throws Exception

	{   

	   String[][] tabArray = null;

	   try{

		   FileInputStream ExcelFile = new FileInputStream(FilePath);

		   // Access the required test data sheet
		   
		   
		   ExcelWBook = new XSSFWorkbook(ExcelFile);
		   ExcelWSheet = ExcelWBook.getSheet(SheetName);

		   int ci=0,cj=0;
		   int totalRows = 1;
		   int totalCols = col;
		   int j;
		   tabArray=new String[totalRows][totalCols];
		   for(int iTestCaseRow=1;iTestCaseRow<=totalRows;iTestCaseRow++,ci++)
		   {
			   for (j=0;j<totalCols;j++,cj++)

			   {
				   tabArray[ci][cj]=getCellData(iTestCaseRow,j);
//				   System.out.println(tabArray[ci][cj]);

			   }
			   cj=0;
			 
		   }
		}

		catch (FileNotFoundException e)

		{

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		catch (IOException e)

		{

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		return(tabArray);

	}
	
	public static String[][] getTableArray2(String FilePath, String SheetName,int row, int col) throws Exception

	{   

	   String[][] tabArray = null;

	   try{

		   FileInputStream ExcelFile = new FileInputStream(FilePath);

		   // Access the required test data sheet
		   
		   
		   ExcelWBook = new XSSFWorkbook(ExcelFile);
		   ExcelWSheet = ExcelWBook.getSheet(SheetName);

		   int ci=0,cj=0;
		   int totalRows = row;
		   int totalCols = col;
		   int j;
		   tabArray=new String[totalRows][totalCols];
		   for(int iTestCaseRow=1;iTestCaseRow<=totalRows;iTestCaseRow++,ci++)
		   {
			   for (j=0;j<totalCols;j++,cj++)

			   {
				   tabArray[ci][cj]=getCellData1(iTestCaseRow,j);
//				   System.out.println(tabArray[ci][cj]);

			   }
			   cj=0;
			 
		   }
		}

		catch (FileNotFoundException e)

		{

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		catch (IOException e)

		{

			System.out.println("Could not read the Excel sheet");

			e.printStackTrace();

		}

		return(tabArray);

	}


	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num

	public static String getCellData1(int RowNum, int ColNum) throws Exception{

		
	   try{
		   
		  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
//		  Cell.setCellType(Cell.CELL_TYPE_STRING); 
		   if(Cell.getCellType()==Cell.CELL_TYPE_STRING)
			{
				return Cell.getStringCellValue();
			}
			else if(Cell.getCellType()==Cell.CELL_TYPE_NUMERIC || Cell.getCellType()==Cell.CELL_TYPE_FORMULA )
			{
				
//				Cell.setCellType(Cell.CELL_TYPE_STRING);
				String cellText  = String.valueOf(Cell.getNumericCellValue());
				
				if (HSSFDateUtil.isCellDateFormatted(Cell))
				{
					// format in form of D/M/YY
					double d = Cell.getNumericCellValue();
					Calendar cal =Calendar.getInstance();
					cal.setTime(HSSFDateUtil.getJavaDate(d));					  
					int Year = cal.get(Calendar.YEAR);
					int Day = cal.get(Calendar.DAY_OF_MONTH);
					int Month = cal.get(Calendar.MONTH)+1;
					cellText = Month + "/" + Day + "/" + String.valueOf(Year);
				}
				else
				{
					
						Cell.setCellType(Cell.CELL_TYPE_STRING);
						cellText= Cell.getStringCellValue();
					
				}
				return cellText;
			}
		   
		   
		  String CellData = Cell.getStringCellValue();
		  
		  return CellData;

		  }catch (Exception e){

			return"";

			}

		}
	
	public static String getCellData(int RowNum, int ColNum) throws Exception{

		
		   try{
			   
			  Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
//			  Cell.setCellType(Cell.CELL_TYPE_STRING); 
			   if(Cell.getCellType()==Cell.CELL_TYPE_STRING)
				{
					return Cell.getStringCellValue();
				}
				else if(Cell.getCellType()==Cell.CELL_TYPE_NUMERIC || Cell.getCellType()==Cell.CELL_TYPE_FORMULA )
				{
					
//					Cell.setCellType(Cell.CELL_TYPE_STRING);
					String cellText  = String.valueOf(Cell.getNumericCellValue());
					
					if (HSSFDateUtil.isCellDateFormatted(Cell))
					{
						// format in form of D/M/YY
						double d = Cell.getNumericCellValue();
						Calendar cal =Calendar.getInstance();
						cal.setTime(HSSFDateUtil.getJavaDate(d));					  
						int Year = cal.get(Calendar.YEAR);
						int Day = cal.get(Calendar.DAY_OF_MONTH);
						int Month = cal.get(Calendar.MONTH)+1;
						cellText = Month + "/" + Day + "/" + (String.valueOf(Year)).substring(2);
					}
					else
					{
						
							Cell.setCellType(Cell.CELL_TYPE_STRING);
							cellText= Cell.getStringCellValue();
						
					}
					return cellText;
				}
			   
			   
			  String CellData = Cell.getStringCellValue();
			  
			  return CellData;

			  }catch (Exception e){

				return"";

				}

			}

	public static String getTestCaseName(String sTestCase)throws Exception{

		String value = sTestCase;

		try{

			int posi = value.indexOf("@");

			value = value.substring(0, posi);
			System.out.println(value);
			posi = value.lastIndexOf(".");	
			System.out.println(posi);
			value = value.substring(posi + 1);
			System.out.println(value);
			return value;

				}catch (Exception e){

			throw (e);

					}

		}

	public static int rownum()
	{
		 ij=1;
		
		return ij++;		
		
		
	}
	
	public static int getRowContains(String sTestCaseName, int colNum) throws Exception{

		int i;

		try {

			int rowCount = ExcelUtilities.getRowUsed();
			System.out.println("rc"+rowCount);

			for ( i=0 ; i<rowCount; i++){

				if  (ExcelUtilities.getCellData(i,colNum).equalsIgnoreCase(sTestCaseName)){

					break;

				}

			}

			return i;

				}catch (Exception e){

			throw(e);

			}

		}

	public static int getRowUsed() throws Exception {		

			try{

				int RowCount = ExcelWSheet.getLastRowNum();

				return RowCount;

			}catch (Exception e){

				System.out.println(e.getMessage());

				throw (e);

			}

		}

}
