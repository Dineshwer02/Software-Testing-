package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG1 {
	@Test
	private void TC1() {
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://en-gb.facebook.com/");
		Driver.manage().window().maximize();
	}
	@Test
	private void TC3() {

		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		Driver.manage().window().maximize();
		
	}
	
}
