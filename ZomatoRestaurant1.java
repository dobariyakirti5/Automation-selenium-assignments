package com.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZomatoRestaurant1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
                "D:\\Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.zomato.com/ahmedabad/restaurants");

        Thread.sleep(5000);

        
        WebElement restaurantNameCSS =
                driver.findElement(By.cssSelector("div[class*='jumbo-tracker']"));

        System.out.println("Restaurant found using CSS Selector");

        
        WebElement restaurantNameXPath =
                driver.findElement(By.xpath(
                        "(//div[contains(@class,'jumbo-tracker')]//*[text()])[1]"
                ));

        System.out.println("Restaurant found using Relative XPath");

        System.out.println("Restaurant Name: " + restaurantNameCSS.getText());

        Thread.sleep(3000);

        driver.quit();
    }
}