package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");          	// [1]
        WebDriver driver = new ChromeDriver();                	// [2]
        driver.get("https://www.ebay.pl/");                 	// [3]

        WebElement inputField = driver.findElement(By.name("_nkw")); // [4]
        inputField.sendKeys("Laptop");
        inputField.submit();
    }
}
