package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void brouserLaunch () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
