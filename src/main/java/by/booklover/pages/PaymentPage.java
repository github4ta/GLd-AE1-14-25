package by.booklover.pages;

import by.booklover.driver.Driver;
import org.openqa.selenium.By;

public class PaymentPage {

    private final org.openqa.selenium.WebDriver driver;

    private final By CASH_PAYMENT_INFO = By.xpath("//tr[td[contains(text(), 'Наличные')] and td[contains(text(), 'Октябрьская площадь')]]");
    private final By CARD_PAYMENT_INFO = By.xpath("//tr[td[contains(text(), 'Банковской картой')] and td[contains(text(), 'Октябрьская площадь')]]");
    private final By PAGE_HEADING = By.tagName("h1");

    public PaymentPage() {
        this.driver = Driver.getDriver();
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
}
