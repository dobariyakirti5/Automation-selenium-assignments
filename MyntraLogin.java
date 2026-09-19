package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLogin {

    public static void main(String[] args) throws InterruptedException {

    	System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/login");
        Thread.sleep(3000);

        driver.findElement(By.id("mobileNumber"))
                .sendKeys("9876543210");
        Thread.sleep(3000);

        driver.close();
    }
}