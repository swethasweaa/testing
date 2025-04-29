package practice;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class datadrivencreation {
	
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
	row4.createCell(0).setCellValue("mam");
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































































//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//public class datadrivencreation {
//
//
//			public static void main(String[] args) throws IOException {
//				
//				FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\data\\setupp.properties");
//				//load the properties file
//				Properties propertiesobj=new Properties();
//				propertiesobj.load(file);
//				
//				//read the data which is given in the file
//				String val1=propertiesobj.getProperty("sampleurl");
//				String val2=propertiesobj.getProperty("navbar1");
//				String val3=propertiesobj.getProperty("navbar2");
//				String val4=propertiesobj.getProperty("navbar3");
//				String val5=propertiesobj.getProperty("navbar4");
//				
//				System.out.println(val1+"\n"+val2+"\n"+val3+"\n"+val4);
//				//
//				//System.out.println(propertiesobj.stringPropertyNames());
//				System.out.println(propertiesobj.keySet());
//				System.out.println(propertiesobj.values());
//			}
//
//		}
//
//	}
//
//}
