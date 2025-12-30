package by.booklover;

import by.booklover.pages.HomePage;
import by.booklover.pages.PaymentPage;
import by.booklover.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PaymentTest {

    private HomePage homePage;
    private PaymentPage paymentPage;

    @BeforeEach
    public void setUp() {
        homePage = new HomePage();
        paymentPage = new PaymentPage();

        homePage.open();
        try {
            homePage.clickCookieAlertClose();
        } catch (Exception ignored) {
            
        }
        homePage.clickPaymentLink();
    }

    @Test
    public void testPaymentPageUrl() {
        assertEquals("https://booklover.by/payment/", paymentPage.getCurrentUrl().trim());
    }

    @Test
    public void testPaymentPageHasCorrectTitle() {
        assertEquals("Оплата", paymentPage.getPageTitleText().trim());
    }

    @Test
    public void testCashPaymentInfoIsDisplayed() {
        String cashText = paymentPage.getCashPaymentInfoText();
        assertTrue(cashText.contains("Наличные"), "Текст 'Наличные' не найден");
        assertTrue(cashText.contains("Октябрьская площадь, 2-3, ТЦ Купаловский, павильон 10"), "Адрес для наличной оплаты не соответствует ожидаемому");
    }

    @Test
    public void testCardPaymentInfoIsDisplayed() {
        String cardText = paymentPage.getCardPaymentInfoText();
        assertTrue(cardText.contains("Банковской картой"), "Текст 'Банковской картой' не найден");
        assertTrue(cardText.contains("Октябрьская площадь, 2-3, ТЦ Купаловский, павильон 10"), "Адрес для оплаты картой не соответствует ожидаемому");
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}
