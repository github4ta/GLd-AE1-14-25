package by.booklover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
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
    private final By BASKET_BUTTON = By.xpath("//span[@class='user-link__text']");

    // продолжаем добавлять ваши XPath'ы для веб-элементов
    private String deliveryUrl = "//li[@class='nav__item']/a[@href='/delivery/']";
    private String forOrganizationsUrl = "//li[@class='nav__item']/a[@href='/our-clients/']";
    private String contactsUrl = "//li[@class='nav__item']/a[@href='/contacts/']";
    private String forAccountButton = "//a[@class='header__user-link user-link user-link--account']";
    private String paymentUrl = "//li[@class='nav__item']/a[@href='/payment/']";

    private WebDriver driver;

    public String getBasketButtonText(){
        return driver.findElement(BASKET_BUTTON).getText();
    }

}
