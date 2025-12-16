package by.booklover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProgrammaLoyalnostiPage {
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

    private final By DISCOUNT_TABLE_LOCATOR = By.xpath("//table[@class='order-info__table-discount table']");

    private WebDriver driver;

    public ProgrammaLoyalnostiPage(WebDriver driver) {
        this.driver = driver;
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
//    public final String PAGE_URL = "https://booklover.by/programma-loyalnosti/";
//    public final String ORDER_INFO_LABEL_TITLE = "Программа лояльности";
//    public final String[][] DISCOUNT_TABLE_VALUES = {
//            {"100.00-199,99 руб.", "1%"},
//            {"200.00-299,99 руб.", "2%"},
//            {"300.00-399.99 руб.", "3%"},
//            {"400.00-499.99 руб.", "4%"},
//            {"500.00-999.99 руб.", "5%"},
//            {"1000.00 руб. и более", "7%"}
//    };
//
//    public By ORDER_INFO_LABEL = By.xpath("//h1[@class='order-info__label title']");
//    public By ORDER_INFO_TABLE_DISCOUNT = By.xpath("//table[@class='order-info__table-discount table']//tbody/tr");
//    public By ORDER_INFO_TABLE_DISCOUNT_ROWS = By.xpath("//table[@class='order-info__table-discount table']//tbody/tr");
//
//    private WebDriver driver;
//
//    public ProgrammaLoyalnostiPage(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    public String getProgrammaLoyalnostiPageTitleText() {
//        return driver.findElement(ORDER_INFO_LABEL).getText();
//    }
//
//    public boolean isOrderInfoTableDiscountDisplayed() {
//        return driver.findElement(ORDER_INFO_TABLE_DISCOUNT).isDisplayed();
//    }
//
//    public List<List<String>> getDiscountTableValues() {
//        List<List<String>> discountTableValues = new ArrayList<>();
//        List<WebElement> tableRows = driver.findElements(ORDER_INFO_TABLE_DISCOUNT_ROWS);
//
//        for (WebElement row : tableRows) {
//            List<WebElement> cellsOfTableRows = row.findElements(By.tagName("td"));
//
//            List<String> rowValues = new ArrayList<>();
//            for (WebElement cell : cellsOfTableRows) {
//                String cellValue = cell.getText();
//                cellValue = cellValue.replace("&nbsp;", " ");
//                rowValues.add(cellValue);
//            }
//
//            discountTableValues.add(rowValues);
//        }
//
//        return discountTableValues;
//    }
}
