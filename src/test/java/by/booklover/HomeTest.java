package by.booklover;

import by.booklover.pages.HomePage;
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

    @Test
    public void testBasket() {
        Assertions.assertEquals(homePage.BASKET_LABEL, homePage.getBasketButtonText());
    }

    @Test
    public void verifyOrderItemTextInHeaderNav() {
        Assertions.assertEquals(homePage.ORDER_LABEL, homePage.getHragerTopNavOrderItem());
    }

    @Test
    public void testLoyaltyProgramButton() {
        Assertions.assertEquals(homePage.LOYALTY_PROGRAM_LABEL, homePage.getLoyaltyProgramButton());
    }

    @Test
    public void testDelivery() {
        Assertions.assertEquals(homePage.DELIVERY_LABLE, homePage.getDeliveryUrlText());
    }

    @Test
    public void testForOrganizations() {
        Assertions.assertEquals(homePage.FOR_ORGANISATION_URL_LABEL, homePage.getForOrganizationsUrlText());
    }

    @Test
    public void testContacts() {
        Assertions.assertEquals(homePage.CONTACTS_URL_LABEL, homePage.getContactText());
    }

    @Test
    public void testVerifyContactOperatorsAndPhone() {
        Assertions.assertEquals(homePage.PHONE_OPERATOR_LABEL, homePage.getPhoneOperatotText());
        Assertions.assertEquals(homePage.PHONE_NUMBER_LABEL, homePage.getPhoneNumberText());
    }

    @Test
    public void verifyAddressAndWorkTimeAreDisplayed() {
        Assertions.assertEquals(homePage.ADDRESS, homePage.getHeaderTopInfoAddressLineText(), "Wrong address is displayed in header");
        Assertions.assertEquals(homePage.TIMEWORK, homePage.getHeaderTopInfoTimeLineText(), "Wrong work hours are displayed in header");
        Assertions.assertTrue(homePage.isPinIconDisplayed(), "Pin icon for address in header is not displayed");
        Assertions.assertTrue(homePage.isTimeIconDisplayed(), "Time icon for work hours in header is not displayed");
    }

    @Test
    public void testElementAccountButton (){
        Assertions.assertEquals(homePage.FOR_ACCOUNT_BUTTON_LABEL, homePage.getForAccountButtonText());
    }

    @Test
    public void testPayment() {
        Assertions.assertEquals(homePage.PAYMENT_URL_LABEL, homePage.getPaymentUrlText());
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
