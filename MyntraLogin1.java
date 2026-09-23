package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraLogin1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "D:\\Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.myntra.com/");

        Thread.sleep(3000);

        // Relative XPath
        WebElement loginRelative = driver.findElement(
                By.xpath("//span[contains(text(),'Profile')]"));

        System.out.println("Login/Profile button found using Relative XPath");

        // Click Profile
        loginRelative.click();

        Thread.sleep(3000);

        driver.quit();
    }
}
