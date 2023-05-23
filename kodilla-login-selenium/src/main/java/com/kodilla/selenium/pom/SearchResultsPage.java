package com.kodilla.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getResultsCount() {
        WebElement resultsCount = driver.findElement(By.className("search-results-count"));
        String countText = resultsCount.getText().replaceAll("\\D+", "");
        return Integer.parseInt(countText);
    }
}
