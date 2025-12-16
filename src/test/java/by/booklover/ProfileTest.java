package by.booklover;

import by.booklover.pages.HomePage;
import by.booklover.pages.ProfilePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProfileTest {
    private WebDriver driver;
    private HomePage homePage;
    private ProfilePage profilePage;

    @BeforeEach
    public void setupDriverAndOpenHomePageAndCloseCookieAlertAndOpenProfilePage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        homePage.open();
        homePage.clickCookieAlertClose();
        homePage.clickForAccountButton();

        profilePage = new ProfilePage(driver);
    }

    @Test
    public void testProfilePageUrl() {
        Assertions.assertEquals(profilePage.PAGE_URL, driver.getCurrentUrl());
    }

    @Test
    public void testProfilePageTitleText() {
        Assertions.assertEquals(profilePage.getProfilePageTitleText(), profilePage.PROFILE_PAGE_TITLE_TEXT);
    }

    @Test
    public void testProfilePageHasAuthorizationBlock() {
        Assertions.assertTrue(profilePage.isAuthorizationBlockDisplayed(), "Authorization block is not displayed.");
    }

    @Test
    public void testProfilePageHasRegistrationBlock() {
        Assertions.assertTrue(profilePage.isRegistrationBlockDisplayed(), "Registration block is not displayed.");
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
