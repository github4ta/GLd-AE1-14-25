package by.booklover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OurClientsPage {
    public final String PAGE_URL = "https://booklover.by/our-clients/";
    public final String ORGANIZATION_INFO_TITLE_TEXT = "Для организаций";

    private final By ORGANIZATION_INFO_TITLE = By.xpath("//h1[@class='organization-info__title title']");

    private WebDriver driver;

    public OurClientsPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getOurClientsPageTitleText() {
        return driver.findElement(ORGANIZATION_INFO_TITLE).getText();
    }
}
