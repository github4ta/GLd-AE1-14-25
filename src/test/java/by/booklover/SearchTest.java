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
    public void setupDriverAndOpenHomePageAndCloseCookieAlert() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        homePage.open();
        homePage.clickCookieAlertClose();
    }

    @Test
    public void testIsSearchPageContainsParams() {
        homePage.getSearchButton().click();
        Assertions.assertEquals("https://booklover.by/search/?q=", driver.getCurrentUrl());
    }

    @Test
    public void testShouldDisplayNoResultsForQueryQwerty() {
        searchPage = new SearchPage(driver);
        searchPage.open("qwerty");
        Assertions.assertEquals("Ничего не найдено по запросу “qwerty”", searchPage.getSearchNotFoundTitle());
        Assertions.assertEquals("Пожалуйста, убедитесь, что запрос введен корректно или переформулируйте его.", searchPage.getSearchNotFoundText());
    }

    @Test
    public void testShouldDisplayResultsJava() {
        searchPage = new SearchPage(driver);
        searchPage.open("java");
        Assertions.assertEquals("Найдено 6 книг по запросу “java”", searchPage.getSearchResultTitle());
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }

}
