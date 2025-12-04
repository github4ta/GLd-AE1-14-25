package by.booklover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeliveryPage {

    private final String DELIVERY_URL = "https://booklover.by/delivery/";

    public final String TITLE_LABEL = "Доставка";
    public final String TEXTBLOCK_ADMINISTRATION_LABEL1 = "Администрация магазина:";
    public final String TEXTBLOCK_ADMINISTRATION_LABEL2 = "+375 29 5569657 мтс";
    public final String TEXTBLOCK_GMAIL_LABEL1 = "Электронная почта:";
    public final String TEXTBLOCK_GMAIL_LABEL2 = "booklover.by@gmail.com";

    private final By TITLE_XPATH = By.xpath("//div[@class='order-info__head']/h1[@class='order-info__label title']");
    private final By TEXTBLOCK_ADMINISTRATION_LABEL1_XPATH = By.xpath("//p[@class='order-info__item-attension']/b[1]");
    private final By TEXTBLOCK_ADMINISTRATION_LABEL2_XPATH = By.xpath("//div[@class='order-info__delivery-info']/p[@class='order-info__item-attension']");
    private final By TEXTBLOCK_GMAIL_LABEL1_XPATH = By.xpath("//p[@class='order-info__item-attension']/b[2]");
    private final By TEXTBLOCK_GMAIL_LABEL2_XPATH = By.xpath("//div[@class='order-info__delivery-info']/p[@class='order-info__item-attension']/a[@href='mailto:booklover.by@gmail.com']");

    private WebDriver driver;

    public DeliveryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(DELIVERY_URL);
    }

    public String titleGetText() {
        return driver.findElement(TITLE_XPATH).getText();
    }

    public String textblockAdministrationLabel1GetText() {
        return driver.findElement(TEXTBLOCK_ADMINISTRATION_LABEL1_XPATH).getText();
    }

    public String textblockAdministrationLabel2GetText() {
        return driver.findElement(TEXTBLOCK_ADMINISTRATION_LABEL2_XPATH).getText();
    }

    public String textblockGmailLabel1GetText() {
        return driver.findElement(TEXTBLOCK_GMAIL_LABEL1_XPATH).getText();
    }

    public String textblockGmailLabel2GetText() {
        return driver.findElement(TEXTBLOCK_GMAIL_LABEL2_XPATH).getText();
    }
}
