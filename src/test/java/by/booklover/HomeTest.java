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
        String address = driver.findElement(HEADER_TOP_INFO_ADDRESS_LINE).getText();
        String time = driver.findElement(HEADER_TOP_INFO_TIME_LINE).getText();

        Assertions.assertEquals(ADDRESS, address, "Wrong address is displayed in header");
        Assertions.assertEquals(TIMEWORK, time, "Wrong work hours are displayed in header");
        Assertions.assertTrue(driver.findElement(PIN_ICON).isDisplayed(), "Pin icon for address in header is not displayed");
        Assertions.assertTrue(driver.findElement(TIME_ICON).isDisplayed(), "Time icon for work hours in header is not displayed");
    }
    @Test
    public void testElementAccountButton (){
        WebElement elementAccountButton = driver.findElement(By.xpath(forAccountButton));
        Assertions.assertEquals("Кабинет",elementAccountButton.getText());
    }

    @Test
    public void testPayment() {
        WebElement elementPayment = driver.findElement((By.xpath(paymentUrl)));
        Assertions.assertEquals("Оплата", elementPayment.getText());
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
