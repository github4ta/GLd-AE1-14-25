package by.booklover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProgramLoyaltyPage {
    public final String PROGRAM_LOYALTY_URL = "https://booklover.by/programma-loyalnosti/";
    public final String PROGRAM_LOYALTY_LABEL = "Программа лояльности";

    public final List<String> EXPECTED_SUMS = List.of(
            "100.00-199,99 руб.",
            "200.00-299,99 руб.",
            "300.00-399.99 руб.",
            "400.00-499.99 руб.",
            "500.00-999.99 руб.",
            "1000.00 руб. и более"
    );

    public final List<String> EXPECTED_DISCOUNTS = List.of(
            "1%",
            "2%",
            "3%",
            "4%",
            "5%",
            "7%"
    );

    private final By PROGRAM_LOYALTY_TITLE = By.xpath("//div[@class='order-info__head']");
    private final By DISCOUNT_TABLE_LOCATOR = By.xpath("//table[@class='order-info__table-discount table']");

    private WebDriver driver;

    public ProgramLoyaltyPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProgramLoyaltyTitleText() {
        return driver.findElement(PROGRAM_LOYALTY_TITLE).getText();
    }

    public WebElement getDiscountTableWebElement() {
        return driver.findElement(DISCOUNT_TABLE_LOCATOR);
    }

    public boolean isDiscountTableDisplayed() {
        return getDiscountTableWebElement().isDisplayed();
    }

    public List<WebElement> getTableRowsExceptForTitle() {
        WebElement table = getDiscountTableWebElement();
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
        return rows;
    }

    public String getSumFromRow(WebElement row) {
        return row.findElement(By.tagName("td")).getText();  //.tpim ?
    }

    public String getDiscountFromRow(WebElement row) {
        return row.findElement(By.xpath(".//td[2]")).getText();
    }


}
