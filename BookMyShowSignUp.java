package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShowSignUp {
	   public static void main(String[] args) throws InterruptedException {

	        System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();

	        driver.manage().window().maximize();

	        Thread.sleep(3000);

	        driver.get("https://in.bookmyshow.com/");

	        Thread.sleep(3000);
	        
	        driver.findElement(By.id("dummy")).sendKeys("AHmedabad");
	        
	        Thread.sleep(3000);

	        driver.findElement(By.xpath("//*[@id=\"super-container\"]/div/div[1]/div[1]/div/div/div/div[2]/div[2]/button/div")).click();
	        Thread.sleep(3000);
           

	        WebElement mobileNumber = driver.findElement(By.name("mobileNumber"));
	        mobileNumber.sendKeys("1234567890");

	        WebElement button = driver.findElement(By.tagName("button"));

	        System.out.println("Button Text: " + button.getText());

	        Thread.sleep(3000);

	        driver.close();
	    }
}
