package by.booklover;

import by.booklover.pages.HomePage;
import by.booklover.pages.PaymentPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    private WebDriver driver;
    private HomePage homePage;
    private PaymentPage paymentPage;

    @BeforeEach
    public  void setupDriverAndOpenHomePageAndCloseCookieAlertAndOpenProfilePage (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        homePage.open();
        homePage.clickCookieAlertClose();
        homePage.clickPaymentLink();

        paymentPage = new PaymentPage(driver);
    }

    @Test
    public void testPaymentPageUrl() {
        navigateToPaymentPage();
        assertEquals("https://booklover.by/payment/", paymentPage.getCurrentUrl().trim());
    }

    @Test
    public void testPaymentPageHasCorrectTitle() {
        navigateToPaymentPage();
        assertEquals("Оплата", paymentPage.getPageTitleText().trim());
    }

    @Test
    public void testCashPaymentInfoIsDisplayed() {
        navigateToPaymentPage();
        String cashText = paymentPage.getCashPaymentInfoText();
        assertTrue(cashText.contains("Наличные"), "Текст 'Наличные' не найден");
        assertTrue(cashText.contains("Октябрьская площадь, 2-3, ТЦ Купаловский, павильон 10"),
                "Адрес для наличной оплаты не соответствует ожидаемому");
    }

    @Test
    public void testCardPaymentInfoIsDisplayed() {
        navigateToPaymentPage();
        String cardText = paymentPage.getCardPaymentInfoText();
        assertTrue(cardText.contains("Банковской картой"), "Текст 'Банковской картой' не найден");
        assertTrue(cardText.contains("Октябрьская площадь, 2-3, ТЦ Купаловский, павильон 10"),
                "Адрес для оплаты картой не соответствует ожидаемому");
    }

    private void navigateToPaymentPage() {
        homePage.open();
        try {
            homePage.clickCookieAlertClose();
        } catch (Exception ignored) {}
        homePage.clickPaymentLink();
    }

    @AfterEach
    public void quitDriver (){
        driver.quit();
    }
}