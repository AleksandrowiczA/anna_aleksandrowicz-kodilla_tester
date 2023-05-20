package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement acceptCookies = driver.findElement(By.xpath("//*[@id=\"opbox-gdpr-consents-modal\"]/div/div[2]/div/div[2]/button[1]"));
        acceptCookies.click();

        WebElement findField = driver.findElement(By.xpath("//*[contains(@data-role, \"search-input\")]"));
        findField.sendKeys("Mavic mini");
        findField.submit();

        WebElement categoryCombo = driver.findElement(By.xpath("//*[contains(@data-role='filters-dropdown-toggle')]"));
        Select select = new Select(categoryCombo);
        select.selectByValue("/kategoria/elektronika");

    }
}
