package com.amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_SearchforProduct_002 {
	public String baseURL = "https://www.amazon.in/";
	public String username = "9325804818";
	public String password = "pallavi143";
	public static WebDriver driver;
	public static String url;
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
	public void SearchforProduct() throws Exception {
	driver.get(baseURL);
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile phones",Keys.ENTER);
	
	driver.findElement(By.xpath(("(//span[@class=\"a-expander-prompt\"])[1]"))).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath(("(//i[@class=\"a-icon a-icon-checkbox\"])[11]"))).click();
	
	driver.findElement(By.xpath("(//span[@class=\"a-size-medium a-color-base a-text-normal\"])[1]")).click();
	Set<String> handles = driver.getWindowHandles();
	Iterator<String> iterator = handles.iterator();
	iterator.next();
	String childwindow = iterator.next();
	driver.switchTo().window(childwindow);
	url = driver.getCurrentUrl();
	
	 
	

}
}
