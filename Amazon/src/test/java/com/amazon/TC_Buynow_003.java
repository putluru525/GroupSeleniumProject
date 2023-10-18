package com.amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Buynow_003 {
	public String baseURL = "https://www.amazon.in/";
	public String username = "9325804818";
	public String password = "pallavi143";
	public static WebDriver driver;
	@BeforeClass
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	@Test
	public void buynow() throws Exception {
		TC_SearchforProduct_002 search = new TC_SearchforProduct_002();
		search.setup();
		search.SearchforProduct();
		driver.get(search.url);
		driver.findElement(By.xpath("//input[@id=\"buy-now-button\"]")).click();
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
	
		
		
		
		
		
	}
}
