package com.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;

public class HandleNoSuchElement {
	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/");

        try {

            // This ID does not exist on the page
            WebElement element = driver.findElement(By.id("invalidElement"));

            element.click();

        } catch (NoSuchElementException e) {

            System.out.println("Custom Error: Element was not found on the page.");

        }

        driver.quit();
    }

}
