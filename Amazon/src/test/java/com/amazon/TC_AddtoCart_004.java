package com.amazon;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_AddtoCart_004 {
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
		
		driver.findElement(By.id("add-to-cart-button")).click();
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(20000);
		driver.findElement(By.xpath(("//*[@id=\"attach-sidesheet-checkout-button\"]/span/input"))).click();
		driver.findElement(By.id("ap_email")).sendKeys(username);
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
		
	}
}
