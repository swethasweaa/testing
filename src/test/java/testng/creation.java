package testng;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class creation {
	
	public static void main(String[] args) throws IOException {
		
	XSSFWorkbook workbook=new XSSFWorkbook();
	XSSFSheet sheet=workbook.createSheet("sample_sheet");
	XSSFRow row1=sheet.createRow(0);
	row1.createCell(0).setCellValue("name");
	row1.createCell(1).setCellValue("place");
	row1.createCell(2).setCellValue("dept");
	row1.createCell(3).setCellValue("game");
	XSSFRow row2=sheet.createRow(1);
	row2.createCell(0).setCellValue("ram");
	row2.createCell(1).setCellValue("sal");
	row2.createCell(2).setCellValue("cs");
	row2.createCell(3).setCellValue("tennis");
	XSSFRow row3=sheet.createRow(2);
	row3.createCell(0).setCellValue("sam");
	row3.createCell(1).setCellValue("tir");
	row3.createCell(2).setCellValue("it");
	row3.createCell(3).setCellValue("cricket");
	XSSFRow row4=sheet.createRow(3);
	row4.createCell(0).setCellValue("jam");
	row4.createCell(1).setCellValue("chen");
	row4.createCell(2).setCellValue("mec");
	row4.createCell(3).setCellValue("football");
	FileOutputStream file=new FileOutputStream("C:\\Users\\Swetha\\eclipse-workspace\\testng\\excel\\Book2.xlsx");
	workbook.write(file);
    workbook.close();
    file.close();
    System.out.println("check the file is created!!");
}
	}


