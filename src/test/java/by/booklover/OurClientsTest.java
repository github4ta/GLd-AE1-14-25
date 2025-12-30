package by.booklover;

import by.booklover.driver.Driver;
import by.booklover.pages.HomePage;
import by.booklover.pages.OurClientsPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OurClientsTest {
    private HomePage homePage;
    private OurClientsPage ourClientsPage;

    @BeforeEach
    public void setupDriverAndOpenHomePageAndCloseCookieAlertAndOpenOurClientsPage() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookieAlertClose();
        homePage.clickForOrganizationsUrl();

        ourClientsPage = new OurClientsPage();
    }

    @Test
    public void testOurClientsPageURL() {
        Assertions.assertEquals(ourClientsPage.PAGE_URL, Driver.getDriver().getCurrentUrl());
    }

    @Test
    public void testOurClientsPageTitle() {
        Assertions.assertEquals(ourClientsPage.ORGANIZATION_INFO_TITLE_TEXT, ourClientsPage.getOurClientsPageTitleText());
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
