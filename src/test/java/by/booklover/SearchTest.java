package by.booklover;

import by.booklover.pages.HomePage;
import by.booklover.pages.SearchPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest {
    private WebDriver driver;
    private HomePage homePage;
    private SearchPage searchPage;

    @BeforeEach
    public void setupDriverAndOpenHomePageAndEnterSearchTextAndOpenSearchPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        homePage.open();
        homePage.clickCookieAlertClose();
        //homePage.clickSearchField();
        //homePage.typeText();
        // homePage.clickSubmitSearchButton();

        searchPage = new SearchPage(driver);
    }

    @Test
    public void testSearchPageUrl() {
        Assertions.assertTrue(searchPage.isSearchResultUrlContainsBaseUrl(),
                "Search Result page URL is not correct");
    }

    @Test
    public void testNotFoundSearchResultPageTitle() {
        searchPage.enterSearchQueryWithoutResults();
        Assertions.assertEquals(searchPage.getNotFoundSearchResultTitle(), searchPage.NOT_FOUND_SEARCH_RESULT_TITLE_TEXT);
    }

    @Test
    public void testFoundSearchResultPageTitle() {
        searchPage.enterSearchQueryWithResults();
        Assertions.assertTrue(searchPage.getFoundSearchResultTitle().contains(searchPage.FOUND_SEARCH_RESULT_TITLE_START_TEXT)
                && searchPage.getFoundSearchResultTitle().contains(searchPage.FOUND_SEARCH_RESULT_TITLE_END_TEXT), "Incorrect Search result page title.");
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
