package by.booklover;

import by.booklover.pages.HomePage;
import by.booklover.pages.OrderPage;
import by.booklover.utils.Waits;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static by.booklover.utils.Waits.waitFor;

public class OrderTest {
    private WebDriver driver;
    private HomePage homePage;
    private OrderPage orderPage;

    @BeforeEach
    public void openOrderPage() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        homePage.open();
        Waits.waitFor(2000);

        homePage.clickCookieAlertClose();
        homePage.clickOrderButton();

        Waits.waitFor(2000);
        orderPage = new OrderPage(driver);
    }

    @Test
    public void verifyOrderPageUrl(){
        Assertions.assertTrue(orderPage.getPageUrlIsTrue());
    }
    @Test
    public void verifyTitle(){
        Assertions.assertEquals(orderPage.ORDER_PAGE_TITLE, orderPage.getPageOrderTitle());
    }

    @Test
    public void verifyTextOrderBlock(){
        Assertions.assertEquals(orderPage.EXPECTED_ON_ORDER_PAGE_TEXT_BLOCK.replaceAll("\\s+", " ").trim(),orderPage.getOrderTextBlock().replaceAll("\\s+", " ").trim());
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }

}
