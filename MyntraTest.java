package com.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTest {
	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.close();
	}

}
