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
    private final String ADDRESS = "ТЦ Купаловский, павильон 10";
    private final String TIMEWORK = "Пн-сб 11:00-19:00";

    private final String COOKIE_ALERT_CLOSE = "//span[@id='js-cookie-alert-close']";
    private final String LOYALTY_PROGRAM_BUTTON = "//div[@class='header__wrapper header__wrapper--top']/nav/ul/li[4]/a";
    private final By HEADER_TOP_INFO_ADDRESS_LINE = By.xpath("//div[@class='header__top-info']/p[1]");
    private final By HEADER_TOP_INFO_TIME_LINE = By.xpath("//div[@class='header__top-info']/p[2]");
    private final By PIN_ICON = By.xpath("//div[contains(@class,'header__top-info')]//*[local-name() = 'use' and contains(@*[local-name() = 'href'], 'pin-icon')]");
    private final By TIME_ICON = By.xpath("//div[contains(@class,'header__top-info')]//*[local-name() = 'use' and contains(@*[local-name() = 'href'], 'time-icon')]");
    private final By HEADER_TOP_NAV_ORDER_ITEM = By.xpath("//nav[@class='header__nav nav']//a[@href='/order/']");

    private WebDriver driver;

    // продолжаем добавлять ваши XPath'ы для веб-элементов
    private String deliveryUrl = "//li[@class='nav__item']/a[@href='/delivery/']";
    private String forOrganizationsUrl = "//li[@class='nav__item']/a[@href='/our-clients/']";
    private String contactsUrl = "//li[@class='nav__item']/a[@href='/contacts/']";
    private String forAccountButton = "//a[@class='header__user-link user-link user-link--account']";
    private String paymentUrl = "//li[@class='nav__item']/a[@href='/payment/']";

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
    public void verifyOrderItemTextInHeaderNav() {
        WebElement elementOrder = driver.findElement(HEADER_TOP_NAV_ORDER_ITEM);
        Assertions.assertEquals("Заказ", elementOrder.getText());
    }

    @Test
    public void testLoyaltyProgramButton() {
        WebElement loyaltyProgramButton = driver.findElement(By.xpath(LOYALTY_PROGRAM_BUTTON));
        String expectedText = "Программа лояльности";
        String actualText = loyaltyProgramButton.getText();
        Assertions.assertEquals(expectedText, actualText);
    }

    @Test
    public void testDelivery() {
        WebElement elementDelivery = driver.findElement(By.xpath(deliveryUrl));
        Assertions.assertEquals("Доставка", elementDelivery.getText());
    }

    @Test
    public void testForOrganizations() {
        WebElement elementForOrganizations = driver.findElement(By.xpath(forOrganizationsUrl));
        Assertions.assertEquals("Для организаций", elementForOrganizations.getText());
    }

    @Test
    public void testContacts() {
        WebElement elementContacts = driver.findElement(By.xpath(contactsUrl));
        Assertions.assertEquals("Контакты", elementContacts.getText());
    }

    @Test
    public void testVerifyContactOperatorsAndPhone() {
        WebElement elementTopPhoneOperator = driver.findElement(By.xpath("//p[@class='header__top-phone-operator']"));
        WebElement elementTopPhoneNumber = driver.findElement(By.xpath("//p[@class='header__top-phone-number']"));

        Assertions.assertEquals("МТС, A1, Life", elementTopPhoneOperator.getText());
        Assertions.assertEquals("778-22-55", elementTopPhoneNumber.getText());
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
