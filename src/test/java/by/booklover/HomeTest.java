package by.booklover;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {

    private final String BASE_URL = "https://booklover.by/";

    private final String COOKIE_ALERT_CLOSE = "//span[@id='js-cookie-alert-close']";
    // продолжаем добавлять ваши XPath'ы для веб-элементов

    private WebDriver driver;

    @BeforeEach
    public void setupDriverAndOpenHomePageAndCloseCookieAlert() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(BASE_URL);
        driver.findElement(By.xpath(COOKIE_ALERT_CLOSE)).click();
    }

    // продолжаем добавлять ваши тестовые методы


    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
