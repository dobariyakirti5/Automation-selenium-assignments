package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAddToCart {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "D:\\Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        Thread.sleep(5000);

        WebElement addToCart = driver.findElement(
                By.xpath("//span[text()='Samsung Galaxy Phone']/parent::div//button")
        );

        System.out.println("Add to Cart button found");

        addToCart.click();

        Thread.sleep(3000);

        driver.quit();
    }
}