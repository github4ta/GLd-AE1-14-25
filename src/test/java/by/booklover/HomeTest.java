package by.booklover;

import by.booklover.utils.Waits;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {

    private final String BASE_URL = "https://booklover.by/";

    private final String COOKIE_ALERT_CLOSE = "//span[@id='js-cookie-alert-close']";

    private WebDriver driver;
    // продолжаем добавлять ваши XPath'ы для веб-элементов

    @BeforeEach
    public void setupDriverAndOpenHomePageAndCloseCookieAlert() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(BASE_URL);
        driver.findElement(By.xpath(COOKIE_ALERT_CLOSE)).click();
    }

    // продолжаем добавлять ваши тестовые методы
    @Test
    public void testBasket() {
        WebElement elementBasket = driver.findElement(By.xpath("//span[@class='user-link__text']"));
        Assertions.assertEquals("Корзина", elementBasket.getText());
    }

    @Test
    public void testSearchString(){
        WebElement searchForm = driver.findElement(By.xpath("//form[@class='header__search-form']"));
        String textInSearch = "//input[@id='search']";
        Assertions.assertTrue(driver.findElement(By.xpath(textInSearch)).isDisplayed());
        String getAttribute = driver.findElement(By.xpath(textInSearch)).getAttribute("placeholder");
        Assertions.assertEquals("Поиск среди 290 000 книг, введите автора, название, isbn, серию или другое...",getAttribute);
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
