package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_LoginTest_001 {
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
public void loginTest() throws Exception {
	driver.get(baseURL);
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.id("ap_email")).sendKeys(username);
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys(password);
	driver.findElement(By.id("signInSubmit")).click();
	System.out.println(driver.getTitle());
	if(driver.getTitle().equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in")) {
		Assert.assertTrue(true);
	} else {
		Assert.assertTrue(false);
		
	}
}
}