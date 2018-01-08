package com.smartquote.automation.excelutilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.smartquote.automation.quotedata.DealCreationData;
import com.smartquote.automation.quotedata.QuoteTestdataSource;

public class SQExcelUtilities {

	public static List<DealCreationData> readExcelDealCreationDataToPojo(String filePath, String sheetName) {

		List<DealCreationData> dealCreationDatas = new ArrayList<DealCreationData>();

		XSSFWorkbook workbook = null;
		try {
			FileInputStream excelFile = new FileInputStream(new File(filePath));
			workbook = new XSSFWorkbook(excelFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet dataSheet = workbook.getSheet(sheetName);

		Iterator<Row> iterator = dataSheet.iterator();

		while (iterator.hasNext()) {
			
			Row currentRow = iterator.next();
			
			if(currentRow.getRowNum() > 0){
			DealCreationData dealCreationDataValue = new DealCreationData(currentRow.getCell(0).getStringCellValue(),
					currentRow.getCell(1).getStringCellValue(), currentRow.getCell(2).getStringCellValue(),
					currentRow.getCell(3).getStringCellValue(), currentRow.getCell(4).getStringCellValue(),
					currentRow.getCell(5).getStringCellValue(), currentRow.getCell(6).getStringCellValue(),
					currentRow.getCell(7).getStringCellValue(), currentRow.getCell(8).getStringCellValue(),
					currentRow.getCell(9).getStringCellValue(), currentRow.getCell(10).getStringCellValue(),
			        currentRow.getCell(11).getStringCellValue(), currentRow.getCell(12).getStringCellValue(),
			        currentRow.getCell(13).getStringCellValue());

			dealCreationDatas.add(dealCreationDataValue);
			}
			
		}

		return dealCreationDatas;

	}
	
	public static List<QuoteTestdataSource> readExcelQuoteTestdataMapToPojo(String filePath, String sheetName) {

		List<QuoteTestdataSource> dealCreationDatas = new ArrayList<QuoteTestdataSource>();

		XSSFWorkbook workbook = null;
		try {
			FileInputStream excelFile = new FileInputStream(new File(filePath));
			workbook = new XSSFWorkbook(excelFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Sheet dataSheet = workbook.getSheet(sheetName);

		Iterator<Row> iterator = dataSheet.iterator();

		while (iterator.hasNext()) {
			
			Row currentRow = iterator.next();
			
			if(currentRow.getRowNum() > 0){
			QuoteTestdataSource dealCreationDataValue = new QuoteTestdataSource(currentRow.getCell(0).getStringCellValue(),
					currentRow.getCell(1).getStringCellValue(), currentRow.getCell(2).getStringCellValue(),
					currentRow.getCell(3).getStringCellValue(), currentRow.getCell(4).getStringCellValue(),
					currentRow.getCell(5).getStringCellValue(), currentRow.getCell(6).getStringCellValue(),
					currentRow.getCell(7).getStringCellValue(), currentRow.getCell(8).getStringCellValue(),
					currentRow.getCell(9).getStringCellValue(), currentRow.getCell(10).getStringCellValue(),
			        currentRow.getCell(11).getStringCellValue(), currentRow.getCell(12).getStringCellValue(),
			        currentRow.getCell(13).getStringCellValue(),currentRow.getCell(14).getStringCellValue(),
			        currentRow.getCell(15).getStringCellValue(),currentRow.getCell(16).getStringCellValue(),
			        currentRow.getCell(17).getStringCellValue());

			dealCreationDatas.add(dealCreationDataValue);
			}
			
		}

		return dealCreationDatas;

	}
	public void SQ_ExcelWrite(String filePath,String fileName,String sheetName,String[] valueToWrite) throws IOException{

	        //Create an object of File class to open xlsx file

	        File file =    new File(filePath+"\\"+fileName);

	        //Create an object of FileInputStream class to read excel file

	        FileInputStream inputStream = new FileInputStream(file);

	        Workbook SQWorkbook = null;

	        //Find the file extension by splitting  file name in substring and getting only extension name

	        String fileExtensionName = fileName.substring(fileName.indexOf("."));

	        //Check condition if the file is xlsx file

	        if(fileExtensionName.equals(".xlsx")){

	        //If it is xlsx file then create object of XSSFWorkbook class

	        SQWorkbook = new XSSFWorkbook(inputStream);

	        }

	        //Check condition if the file is xls file

	        else if(fileExtensionName.equals(".xls")){

	            //If it is xls file then create object of XSSFWorkbook class

	            SQWorkbook = new HSSFWorkbook(inputStream);
	       

	        }

	        

	    //Read excel sheet by sheet name    

	    Sheet sheet = SQWorkbook.getSheet(sheetName);

	    //Get the current count of rows in excel file

	   int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

	    //Get the first row from the sheet
	   
	   Row row = sheet.getRow(0);

	  
	   Row newRow = sheet.createRow(rowCount+1);

	   //Create a loop over the cell of newly created Row

	   for(int j = 0; j < row.getLastCellNum(); j++){

	       //Fill data in row

	       Cell cell = newRow.createCell(j);

	       cell.setCellValue(valueToWrite[j]);

	   }

	    //Close input stream

	    inputStream.close();

	    //Create an object of FileOutputStream class to create write data in excel file

	    FileOutputStream outputStream = new FileOutputStream(file);

	    //write data in the excel file

	    SQWorkbook.write(outputStream);

	    //close output stream

	    outputStream.close();

	    

	    }

}
