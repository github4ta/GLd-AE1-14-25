package by.booklover;

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
    private String deliveryUrl = "//li[@class='nav__item']/a[@href='/delivery/']";

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
    public void testDelivery(){
        WebElement element = driver.findElement(By.xpath(deliveryUrl));
        Assertions.assertEquals("Доставка",element.getText());
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
