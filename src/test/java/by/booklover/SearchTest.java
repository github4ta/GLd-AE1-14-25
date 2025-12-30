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
    public void setupDriverAndOpenHomePageAndCloseCookieAlert() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookieAlertClose();
    }

    @Test
    public void testIsSearchPageContainsParams() {
        homePage.getSearchButton().click();
        Assertions.assertEquals("https://booklover.by/search/?q=", Driver.getDriver().getCurrentUrl());
    }

    @Test
    public void testShouldDisplayNoResultsForQueryQwerty() {
        searchPage = new SearchPage();
        searchPage.open("qwerty");
        Assertions.assertEquals("Ничего не найдено по запросу “qwerty”", searchPage.getSearchNotFoundTitle());
        Assertions.assertEquals("Пожалуйста, убедитесь, что запрос введен корректно или переформулируйте его.", searchPage.getSearchNotFoundText());
    }

    @Test
    public void testShouldDisplayResultsJava() {
        searchPage = new SearchPage();
        searchPage.open("java");
        Assertions.assertEquals("Найдено 6 книг по запросу “java”", searchPage.getSearchResultTitle());
    }

    @AfterEach
    public void closeBrowser() {
        Driver.quit();
    }

}
