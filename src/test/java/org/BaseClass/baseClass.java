package org.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	public static WebDriver driver;
	
	public static  WebDriver LanuchBrowser(){
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIVA\\eclipse-workspace\\Day1cumer\\driver1\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
		}
	
	public static void loadURl(String url) {
		driver.get(url);
	}
	
	public static void fill(WebElement e, String s) {
			e.sendKeys(s);
	}
	
	public static void btnClick(WebElement e) {
		e.click();
		
	}
	
	public static void find(WebElement e,By s) {
		e.findElement(s);
		
		
		

	}
	
	
	
	

}
