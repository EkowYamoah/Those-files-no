import org.apache.poi.hssf.usermodel.HSSFCell;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;


public class ExcelRW {
	

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner inputs = new Scanner(System.in);
		int value = 0;
		
		// TODO
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Sheet 1 example");
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = row.createCell(0);
		
		System.out.println("Cell Value: ");
		value = inputs.nextInt();
		
		cell.setCellValue(value);
		
		
		
		
		workbook.write(new FileOutputStream("excel.xls"));
		workbook.close();
		
	}

}
