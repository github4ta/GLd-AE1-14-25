package by.booklover;

import by.booklover.driver.Driver;
import by.booklover.pages.HomePage;
import org.junit.jupiter.api.*;

//import static by.booklover.by.kupi.Driver.driver;

public class HomeTest {
    private HomePage homePage;

    @BeforeEach
    public void setupDriverAndOpenHomePageAndCloseCookieAlert() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookieAlertClose();
    }

    @Test
    public void testBasket() {
        Assertions.assertEquals(homePage.BASKET_LABEL, homePage.getBasketButtonText());
    }

   // @Test
   // public void verifyOrderItemTextInHeaderNav() {
   //     Assertions.assertEquals(homePage.ORDER_LABEL, homePage.getHeaderTopNavOrderItem());
  //  }

    @Test
    public void testProgramLoyaltyButton() {
        Assertions.assertEquals(homePage.PROGRAM_LOYALTY_LABEL, homePage.getProgramLoyaltyButton());
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

    // TODO рефакторить код теста: вынести в PageObject веб элементы и действия с ними!
    @Disabled
    @Test
    public void testSearchString(){
        /*
        WebElement searchForm = driver.findElement(By.xpath("//form[@class='header__search-form']"));
        String textInSearch = "//input[@id='search']";
        Assertions.assertTrue(driver.findElement(By.xpath(textInSearch)).isDisplayed());
        String getAttribute = driver.findElement(By.xpath(textInSearch)).getAttribute("placeholder");
        Assertions.assertEquals("Поиск среди 290 000 книг, введите автора, название, isbn, серию или другое...",getAttribute);
        */
    }

    @Test
    public void testDeliveryUrl(){
        Assertions.assertEquals(homePage.DELIVERY_URL,homePage.getDeliveryButtonUrl());
    }

    // @Test
   // public void testClickDeliveryButton(){
   //    homePage.getDeliveryButton().click();
   //    Assertions.assertEquals(driver.getCurrentUrl(),homePage.DELIVERY_URL);
   // }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
