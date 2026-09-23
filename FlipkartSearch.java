package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "D:\\Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.flipkart.com/");

        Thread.sleep(3000);

        WebElement searchBoxCSS =
                driver.findElement(By.cssSelector("input[name='q']"));

        System.out.println("Search bar found using CSS Selector");

        WebElement searchBoxXPath =
                driver.findElement(By.xpath("//input[@name='q']"));

        System.out.println("Search bar found using Relative XPath");

        searchBoxCSS.sendKeys("Laptop");

        Thread.sleep(3000);

        driver.quit();
    }
}
