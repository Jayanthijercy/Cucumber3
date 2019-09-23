package com.Banggood.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver=null;
	
	public static  WebDriver launch(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GT Sanatorium\\Desktop\\Jayanthi\\Cucumber1\\driver\\chromedriver.exe");
		driver=new ChromeDriver();	
		driver.get(url);
		return driver;
}
	
	public static void send(WebElement e,String msg) {
		e.sendKeys(msg);
	}
	
	public static void clk(WebElement e) {
e.click();
	}
}
