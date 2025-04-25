package testng;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadri {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Reading the xl_file
				FileInputStream file=new FileInputStream("C:\\Users\\Swetha\\eclipse-workspace\\testng\\src\\test\\java\\testng\\data\\Book1.xlsx");
				XSSFWorkbook workbook=new XSSFWorkbook(file);
				XSSFSheet sheet=workbook.getSheet("Sheet1"); 
				int row_count=sheet.getLastRowNum();
				int cell_count=sheet.getRow(1).getLastCellNum();
				System.out.println("The Row count: "+row_count);
				System.out.println("The cell count: "+cell_count);
				for(int r=0;r<=row_count;r++) {
					XSSFRow r1=sheet.getRow(r);
					for(int c=0;c<cell_count;c++) {
						XSSFCell c1=r1.getCell(c);
						System.out.print(c1.toString()+"\t");
					}
					System.out.println();
				}
				workbook.close();
				file.close();
			}
	
	}


