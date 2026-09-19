package com.driver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartButtons {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(3000);
		
	   List<WebElement> buttons=driver.findElements(By.className("btn"));
	   for(WebElement button:buttons) {
		   System.out.println(button.getText());
		   
	   }
	   Thread.sleep(3000);
	 driver.close();	
	}

}
