package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCss {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl/");

        WebElement acceptCookies = driver.findElement(By.cssSelector("button[data-role='accept-consent']"));
        acceptCookies.click();

        WebElement findField = driver.findElement(By.cssSelector("input[type='search']"));
        findField.sendKeys("Mavic mini");
        WebElement selectAll = driver.findElement(By.cssSelector("select[data-role='filters-dropdown-toggle']"));
        Select selectAllDropdown = new Select(selectAll);
        selectAllDropdown.selectByVisibleText("Elektronika");

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("section>article")));

        List<WebElement> products = driver.findElements(By.cssSelector("section>article"));

        for (WebElement product : products) {
            System.out.println(product.getText());
        }

        driver.quit();
    }
}