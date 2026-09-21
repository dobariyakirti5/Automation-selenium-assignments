package com.driver;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoRestaurant {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com"); 
		Thread.sleep(3000);
		driver.findElement(By.linkText("/html/body/div/astro-island/div[8]/div[7]/footer/div[2]/div/div[2]/div[1]/h4")).click(); 
		Thread.sleep(3000); 
		driver.close();
		}
}