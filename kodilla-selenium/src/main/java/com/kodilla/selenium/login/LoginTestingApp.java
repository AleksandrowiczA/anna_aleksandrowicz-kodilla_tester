package com.kodilla.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");          	// [1]
        WebDriver driver = new ChromeDriver();                	// [2]
        driver.get("https://kodilla.com/pl/test/login");                 	// [3]

        WebElement emailField = driver.findElement(By.xpath("//html/body/section/form/div[1]/input")); // [4]
        emailField.sendKeys("test@kodilla.com");
        WebElement passwordField = driver.findElement(By.xpath("//html/body/section/form/div[2]/input")); // [4]
        passwordField.sendKeys("kodilla123");
    }
}
