import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KodillaTestSuitePom {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Konfiguracja i inicjalizacja przeglądarki Chrome
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testSearchResultsCount() {
        String[] searchKeywords = {"NoteBook", "School", "Brand", "Business", "Gaming", "Powerful"};

        for (String keyword : searchKeywords) {
            // Otwieranie strony sklepu
            driver.get("https://kodilla.com/pl/test/store");

            // Wyszukiwanie frazy
            WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
            searchInput.sendKeys(keyword);
            searchInput.submit();

            // Sprawdzanie ilości wyników wyszukiwania
            WebElement resultsCount = driver.findElement(By.cssSelector(".search-results strong"));
            int count = Integer.parseInt(resultsCount.getText());
            int expectedCount = 10; // Zakładamy, że zawsze otrzymamy 10 wyników

            Assert.assertEquals(count, expectedCount, "Nieprawidłowa liczba wyników dla frazy: " + keyword);
        }
    }

    @Test
    public void testSearchResultsCaseInsensitive() {
        String keyword = "notebook";

        // Otwieranie strony sklepu
        driver.get("https://kodilla.com/pl/test/store");

        // Wyszukiwanie frazy
        WebElement searchInput = driver.findElement(By.cssSelector("input[name='search']"));
        searchInput.sendKeys(keyword);
        searchInput.submit();

        // Sprawdzanie ilości wyników wyszukiwania
        WebElement resultsCount = driver.findElement(By.cssSelector(".search-results strong"));
        int count = Integer.parseInt(resultsCount.getText());
        int expectedCount = 10; // Zakładamy, że zawsze otrzymamy 10 wyników

        Assert.assertEquals(count, expectedCount, "Nieprawidłowa liczba wyników dla frazy: " + keyword);
    }

    @AfterMethod
    public void tearDown() {
        // Zamknięcie przeglądarki
        driver.quit();
    }
}