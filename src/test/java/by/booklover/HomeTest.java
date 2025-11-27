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
    private WebDriver driver;
    private HomePage homePage;

    @BeforeEach
    public void setupDriverAndOpenHomePageAndCloseCookieAlert() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        homePage.open();
        homePage.clickCookieAlertClose();
    }

    // продолжаем добавлять ваши тестовые методы
    @Test
    public void testBasket() {
        Assertions.assertEquals("Корзина", homePage.getBasketButtonText());
    }

    @Test
    public void verifyOrderItemTextInHeaderNav() {
        Assertions.assertEquals("Заказ", homePage.getHragerTopNavOrderItem());
    }

    @Test
    public void testLoyaltyProgramButton() {
        Assertions.assertEquals("Программа лояльности", homePage.getLoyaltyProgramButton());
    }

    @Test
    public void testDelivery() {
        Assertions.assertEquals("Доставка", homePage.getDeliveryUrlText());
    }

    @Test
    public void testForOrganizations() {
        Assertions.assertEquals("Для организаций", homePage.getForOrganizationsUrlText());
    }

    @Test
    public void testContacts() {
        Assertions.assertEquals("Контакты", homePage.getContactText());
    }

    @Test
    public void testVerifyContactOperatorsAndPhone() {
        Assertions.assertEquals("МТС, A1, Life", homePage.getPhoneOperatotText());
        Assertions.assertEquals("778-22-55", homePage.getPhoneNumberText());
    }

    @Test
    public void verifyAddressAndWorkTimeAreDisplayed() {
        Assertions.assertEquals(homePage.ADDRESS, homePage.getheaderTopInfoAddressLineText(), "Wrong address is displayed in header");
        Assertions.assertEquals(homePage.TIMEWORK, homePage.getheaderTopInfoTimeLineText(), "Wrong work hours are displayed in header");
        Assertions.assertTrue(homePage.isPinIconDisplayed(), "Pin icon for address in header is not displayed");
        Assertions.assertTrue(homePage.isTimeIconDisplayed(), "Time icon for work hours in header is not displayed");
    }

    @Test
    public void testElementAccountButton (){
        Assertions.assertEquals("Кабинет",homePage.getForAccountButtonText());
    }

    @Test
    public void testPayment() {
        Assertions.assertEquals("Оплата", homePage.getPaymentUrlText());
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
