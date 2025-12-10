package by.booklover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProgramLoyaltyPage {
    public final String PROGRAM_LOYALTY_URL = "https://booklover.by/programma-loyalnosti/";
    public final String PROGRAM_LOYALTY_LABEL = "Программа лояльности";

    private final By PROGRAM_LOYALTY_TITLE = By.xpath("//div[@class='order-info__head']");

    private WebDriver driver;

    public ProgramLoyaltyPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProgramLoyaltyTitleText() {
        return driver.findElement(PROGRAM_LOYALTY_TITLE).getText();
    }



}
