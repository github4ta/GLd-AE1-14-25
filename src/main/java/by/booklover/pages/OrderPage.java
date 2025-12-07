package by.booklover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPage {
    private final String ORDER_URL = "https://booklover.by/order/";
    public final String ORDER_PAGE_TITLE = "Заказ";
    public final String EXPECTED_ON_ORDER_PAGE_TEXT_BLOCK =
            "Напоминаем, что согласно Постановлению Совета Министров Республики Беларусь № 778 " +
                    "от 14.06.2002 печатные издания входят в Перечень непродовольственных товаров надлежащего качества, " +
                    "не подлежащих обмену и возврату.";

    private final By PAGE_TITLE = By.xpath("//h1[@class='order-info__label title']");
    private final By ORDER_TEXT_BLOCK = By.xpath("//div[@class='order-info__showcase-item']/p[contains(text(),'Постановлению Совета Министров Республики Беларусь № 778')]");

    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean getPageUrlIsTrue() {
        return driver.getCurrentUrl().equals(ORDER_URL);
    }

    public String getPageOrderTitle() {
        return driver.findElement(PAGE_TITLE).getText();
    }

    public String getOrderTextBlock() {
        return driver.findElement(ORDER_TEXT_BLOCK).getText();
    }

}
