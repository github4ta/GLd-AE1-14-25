package by.booklover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentPage {

    private final WebDriver driver;
    private final String EXPECTED_URL = "https://booklover.by/payment/";
    private final String EXPECTED_TITLE = "Оплата";

    private final By CASH_PAYMENT_INFO = By.xpath("//tr[td[contains(text(), 'Наличные')] and td[contains(text(), 'Октябрьская площадь')]]");
    private final By CARD_PAYMENT_INFO = By.xpath("//tr[td[contains(text(), 'Банковской картой')] and td[contains(text(), 'Октябрьская площадь')]]");

    private final By PAGE_HEADING = By.tagName("h1");

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public String getPageTitleText() {
        return driver.findElement(PAGE_HEADING).getText();
    }

    public String getCashPaymentInfoText() {
        return driver.findElement(CASH_PAYMENT_INFO).getText();
    }

    public String getCardPaymentInfoText() {
        return driver.findElement(CARD_PAYMENT_INFO).getText();
    }

    public boolean isCashInfoDisplayed() {
        return driver.findElement(CASH_PAYMENT_INFO).isDisplayed();
    }

    public boolean isCardInfoDisplayed() {
        return driver.findElement(CARD_PAYMENT_INFO).isDisplayed();
    }
}