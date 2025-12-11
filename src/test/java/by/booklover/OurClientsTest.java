package by.booklover;

import by.booklover.pages.HomePage;
import by.booklover.pages.OurClientsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OurClientsTest {
    private WebDriver driver;
    private HomePage homePage;
    private OurClientsPage ourClientsPage;

    @BeforeEach
    public void setupDriverAndOpenHomePageAndCloseCookieAlertAndOpenOurClientsPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        homePage.open();
        homePage.clickCookieAlertClose();
        homePage.clickForOrganizationsUrl();

        ourClientsPage = new OurClientsPage(driver);
    }

    @Test
    public void testOurClientsPageURL() {
        Assertions.assertEquals(ourClientsPage.PAGE_URL, driver.getCurrentUrl());
    }

    @Test
    public void testOurClientsPageTitle() {
        Assertions.assertEquals(ourClientsPage.ORGANIZATION_INFO_TITLE_TEXT, ourClientsPage.getOurClientsPageTitleText());
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
