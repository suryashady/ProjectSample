package com.app.base;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void loadDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public static void loadurl(String url) {
		driver.get(url);
	}

	public static WebElement findByID(String Id) {
		return driver.findElement(By.id(Id));
	}

	public static WebElement findByName(String name) {
		return driver.findElement(By.name(name));
	}

	public static WebElement findByClassName(String className) {
		return driver.findElement(By.className(className));
	}

	public static WebElement findByXpath(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

	public static WebElement findElementBy(By by) { // Abstract Method for WebElement
		return driver.findElement(by);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void typeData(WebElement element, String keys) {
		element.sendKeys(keys);
	}
	
	public static String getAttribute (WebElement element, String attributevalue) {
		String attribute = element.getAttribute(attributevalue);
		
		System.out.println(attribute);
		return attribute;
	}
	public static String getText (WebElement element) {
		
		String attribute = element.getText();
		System.out.println(attribute);
		return attribute;
	}
	
	public static void actions(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element);
		
	}

	public static String propertiesfile(String propertydatas) {
		try {
			FileReader f = new FileReader("E:\\eclipse\\AdactinPageObjectModel\\AdactinPageObjectModel\\src\\test\\resources\\TestData\\TestData.properties");
			Properties pr = new Properties();

			pr.load(f);
			String property = pr.getProperty(propertydatas);
			return property;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return propertydatas;
	}

	public static void scroll(int x, int y) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(" + x + "," + y + ")");
	}

	public static String excelRead(int rowvalue, int cellvalue) {
		String value = null;
		File f = new File("E:\\eclipse\\AdactinPageObjectModel\\AdactinPageObjectModel\\src\\test\\resources\\TestData\\Testdata without page factory.xlsx");

		try {
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row = sheet.getRow(rowvalue);
			Cell cell = row.getCell(cellvalue);
			int cellType = cell.getCellType();
			if (cellType == 1) {
				value = cell.getStringCellValue();
			} else if (cellType == 0) {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sc = new SimpleDateFormat("dd/MM/yyyy");
					value = sc.format(dateCellValue);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long a = (long) numericCellValue;
					value = String.valueOf(a);

				}
			}
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
	}

	public static void excelWrite(String value) {
		File f = new File(
				"E:\\eclipse\\AdactinPageObjectModel\\AdactinPageObjectModel\\src\\test\\resources\\TestData\\Testdata without page factory.xlsx");
		try {
			FileInputStream fis = new FileInputStream(f);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet createSheet = wb.createSheet("Output");
			Row createRow = createSheet.createRow(0);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(value);
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
			wb.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void close() {
		driver.close();
}
}