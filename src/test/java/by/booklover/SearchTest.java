package by.booklover;

import by.booklover.driver.Driver;
import by.booklover.pages.HomePage;
import by.booklover.pages.SearchPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SearchTest {
    private HomePage homePage;
    private SearchPage searchPage;

    @BeforeEach
    public void setupDriverAndOpenHomePageAndEnterSearchTextAndOpenSearchPage() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookieAlertClose();

        searchPage = new SearchPage();
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
        Driver.quit();
    }
}
