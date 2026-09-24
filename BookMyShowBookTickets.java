package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShowBookTickets {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "D:\\Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open BookMyShow
        driver.get("https://in.bookmyshow.com/");

        Thread.sleep(5000);

        WebElement bookTickets = driver.findElement(
                By.cssSelector("[class*='book']")
        );

        System.out.println("Book Tickets button found");

        bookTickets.click();

        Thread.sleep(3000);

        driver.quit();
    }
}