package by.booklover.pages;

import by.booklover.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage {

    public final String BASE_URL = "https://booklover.by/search/?q=";
    public final String SEARCH_QUERY_WITHOUT_RESULTS = "qwerty";
    public final String SEARCH_QUERY_WITH_RESULTS = "Java";
    public final String NOT_FOUND_SEARCH_RESULT_TITLE_TEXT = String.format(
            "Ничего не найдено по запросу “%s”",
            SEARCH_QUERY_WITHOUT_RESULTS
    );
    public final String FOUND_SEARCH_RESULT_TITLE_START_TEXT = "Найдено";
    public final String FOUND_SEARCH_RESULT_TITLE_END_TEXT = String.format(
            "по запросу “%s”",
            SEARCH_QUERY_WITH_RESULTS
    );

    private final By SEARCH_FIELD = By.xpath("//input[@id='search']");
    private final By SEARCH_SUBMIT_BUTTON = By.xpath("//div[@class='header__search'] //button[@type='submit']");
    private final By NOT_FOUND_SEARCH_RESULT_TITLE = By.xpath("//h2[@class='not-found__title']");
    private final By FOUND_SEARCH_RESULT_TITLE = By.xpath("//h2[@class='search-result__title']");

    private WebDriver driver;
    private WebDriverWait wait;

    public SearchPage() {
        this.driver = Driver.getDriver();
    }

    public void waitForSearchResultPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/search/?q="));
    }

    public boolean isSearchResultUrlContainsBaseUrl() {
        return driver.getCurrentUrl().contains(BASE_URL);
    }

    public void enterSearchQueryWithoutResults() {
        driver.findElement(SEARCH_FIELD).sendKeys(SEARCH_QUERY_WITHOUT_RESULTS);
        driver.findElement(SEARCH_SUBMIT_BUTTON).click();
    }

    public void enterSearchQueryWithResults() {
        driver.findElement(SEARCH_FIELD).sendKeys(SEARCH_QUERY_WITH_RESULTS);
        driver.findElement(SEARCH_SUBMIT_BUTTON).click();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("/search"));
    }

    public String getNotFoundSearchResultTitle() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(NOT_FOUND_SEARCH_RESULT_TITLE)).getText();
    }

    public String getFoundSearchResultTitle() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(FOUND_SEARCH_RESULT_TITLE)).getText();
    }
}
