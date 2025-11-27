package by.booklover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final String BASE_URL = "https://booklover.by/";

    public final String ADDRESS = "ТЦ Купаловский, павильон 10";
    public final String TIMEWORK = "Пн-сб 11:00-19:00";

    private final By HEADER_TOP_INFO_ADDRESS_LINE = By.xpath("//div[@class='header__top-info']/p[1]");
    private final By HEADER_TOP_INFO_TIME_LINE = By.xpath("//div[@class='header__top-info']/p[2]");
    private final By PIN_ICON = By.xpath("//div[contains(@class,'header__top-info')]//*[local-name() = 'use' and contains(@*[local-name() = 'href'], 'pin-icon')]");
    private final By TIME_ICON = By.xpath("//div[contains(@class,'header__top-info')]//*[local-name() = 'use' and contains(@*[local-name() = 'href'], 'time-icon')]");
    private final By HEADER_TOP_NAV_ORDER_ITEM = By.xpath("//nav[@class='header__nav nav']//a[@href='/order/']");
    private final By BACKET_BUTTON = By.xpath("//span[@class='user-link__text']");
    private final By PHONE_OPERATOR = By.xpath("//p[@class='header__top-phone-operator']");
    private final By PHONE_NUMBER = By.xpath("//p[@class='header__top-phone-number']");

    private final String COOKIE_ALERT_CLOSE = "//span[@id='js-cookie-alert-close']";
    private final String LOYALTY_PROGRAM_BUTTON = "//div[@class='header__wrapper header__wrapper--top']/nav/ul/li[4]/a";
    private String deliveryUrl = "//li[@class='nav__item']/a[@href='/delivery/']";
    private String forOrganizationsUrl = "//li[@class='nav__item']/a[@href='/our-clients/']";
    private String contactsUrl = "//li[@class='nav__item']/a[@href='/contacts/']";
    private String forAccountButton = "//a[@class='header__user-link user-link user-link--account']";
    private String paymentUrl = "//li[@class='nav__item']/a[@href='/payment/']";

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void clickCookieAlertClose() {
        driver.findElement(By.xpath(COOKIE_ALERT_CLOSE)).click();
    }

    public String getBasketButtonText() {
        return driver.findElement(BACKET_BUTTON).getText();
    }

    public String getHragerTopNavOrderItem() {
        return driver.findElement(HEADER_TOP_NAV_ORDER_ITEM).getText();
    }

    public String getLoyaltyProgramButton() {
        return driver.findElement(By.xpath(LOYALTY_PROGRAM_BUTTON)).getText();
    }

    public String getDeliveryUrlText() {
        return driver.findElement(By.xpath(deliveryUrl)).getText();
    }

    public String getForOrganizationsUrlText() {
        return driver.findElement(By.xpath(forOrganizationsUrl)).getText();
    }

    public String getContactText() {
        return driver.findElement(By.xpath(contactsUrl)).getText();
    }

    public String getPhoneOperatotText() {
        return driver.findElement(PHONE_OPERATOR).getText();
    }

    public String getPhoneNumberText() {
        return driver.findElement(PHONE_NUMBER).getText();
    }

    public String getheaderTopInfoAddressLineText() {
        return driver.findElement(HEADER_TOP_INFO_ADDRESS_LINE).getText();
    }

    public String getheaderTopInfoTimeLineText() {
        return driver.findElement(HEADER_TOP_INFO_TIME_LINE).getText();
    }

    public boolean isPinIconDisplayed() {
        return driver.findElement(PIN_ICON).isDisplayed();
    }

    public boolean isTimeIconDisplayed() {
        return driver.findElement(TIME_ICON).isDisplayed();
    }

    public String getForAccountButtonText() {
        return driver.findElement(By.xpath(forAccountButton)).getText();
    }

    public String getPaymentUrlText() {
        return driver.findElement(By.xpath(paymentUrl)).getText();
    }
}
