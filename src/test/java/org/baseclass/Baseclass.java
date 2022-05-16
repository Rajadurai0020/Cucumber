package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public static WebDriver driver;
	public static Actions a;
	public static WebElement element;
	public static Robot r;
	public static Alert A;
	public static TakesScreenshot t;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void loadUrl(String url) {
		driver.get(url);

	}

	public static void maxBrowser() {
		driver.manage().window().maximize();

	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void fill(WebElement element, String userText) {
		element.sendKeys(userText);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public static void toGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static String toGetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");

		return attribute;

	}

	public static void toQuit() {
		driver.quit();

	}

	public static void toclose() {
		driver.close();

	}

	public static void toPerformMoveToElement() {
		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void toPerformDragAndDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();

	}

	public static void toPerformDoubleClick() {
		a.doubleClick().perform();

	}

	public static void toPerformRightClick() {
		a.contextClick().perform();

	}

	public static void toPerformKeyUp(String key) {
		a.keyUp(element, key).build().perform();

		a.keyDown(element, key).build().perform();

	}

	public static void toPerformEnter() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void toPerformTab() {
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

	public static void toPerformControl() {
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}

	public static void toPerformShift() {
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyRelease(KeyEvent.VK_SHIFT);

	}

	public static void toPerformUp() {
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void toPerformDown() {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void toAcceptAlert() {
		A = driver.switchTo().alert();
		A.accept();

	}

	public static void toDismissAlert() {
		A.dismiss();

	}

	public static void FillAlert(String text) {
		A.sendKeys(text);

	}

	public static void toGetTextAlert() {
		String text = A.getText();
		System.out.println(text);

	}

	public static void toTakeScreenshot(String path ) throws IOException {
		t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des=new File(path);
		FileUtils.copyFile(src, des);

	}
	public static void waits(long time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}
	public static String readExcel(int rowno, int cellno) throws IOException {
		File f = new File("C:\\Users\\Raja Durai\\eclipse-workspace\\Cucumber\\Excel\\fB inputs.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("raj");

		Row r = sh.getRow(rowno);

		Cell c = r.getCell(cellno);
		System.out.println(c);
		int value = c.getCellType();

		String type = "";
		if (value == 1) {

			type = c.getStringCellValue();

		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dateCellValue = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			type = sim.format(dateCellValue);

		} else {
			double d = c.getNumericCellValue();
			System.out.println(d);

			long l = (long) d;
			System.out.println(l);
			type = String.valueOf(l);
		}
		return type;

	}
	public static String excel(int rno, int cno) throws IOException {
		File f = new File("C:\\Users\\Raja Durai\\eclipse-workspace\\Cucumber\\Excel\\fB inputs.xlsx");
		FileInputStream fin = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fin);
		Sheet sh = book.getSheet("raj");
		Row r = sh.getRow(rno);
		Cell c = r.getCell(cno);
		System.out.println(c);
		String type = c.getStringCellValue();
		return type;

	}

	

}
