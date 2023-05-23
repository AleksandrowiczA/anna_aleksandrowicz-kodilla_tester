package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.navigate().to("https://kodilla.com/pl/test/login");
    }

    public int searchProduct(String keyword) {
        WebElement searchInput = driver.findElement(By.id("search-input"));
        searchInput.clear();
        searchInput.sendKeys(keyword);
        searchInput.submit();

        return getResultsCount();
    }

    private int getResultsCount() {
        WebElement resultsCountElement = driver.findElement(By.className("results-count"));
        String resultsCountText = resultsCountElement.getText();
        return Integer.parseInt(resultsCountText);
    }
}
