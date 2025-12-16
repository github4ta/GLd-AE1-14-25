package by.booklover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private final String SEARCH_PAGE_URL = "https://booklover.by/search/?q=";

    public final By SEARCH_NOT_FOUND_TITLE = By.xpath("//div[@class='search-result__wrapper']/h2[@class='not-found__title']");
    public final By SEARCH_NOT_FOUND_TEXT = By.xpath("//div[@class='search-result__wrapper']/p[@class='not-found__text']");
    public final By SEARCH_RESULT_TITLE = By.xpath("//div[@class='search-result__wrapper']/h2[@class='search-result__title']");

    private WebDriver driver;

    public SearchPage(WebDriver driver) {this.driver = driver;}

    public void open(String searchParam) {driver.get(SEARCH_PAGE_URL + searchParam);}

    public String getSearchNotFoundTitle() {
        return driver.findElement(SEARCH_NOT_FOUND_TITLE).getText();
    }
    public String getSearchNotFoundText() {
        return driver.findElement(SEARCH_NOT_FOUND_TEXT).getText();
    }
    public String getSearchResultTitle() {
        return driver.findElement(SEARCH_RESULT_TITLE).getText();
    }
}
