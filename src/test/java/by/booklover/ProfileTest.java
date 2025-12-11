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
    public  void setupDriverAndOpenHomePageAndCloseCookieAlertAndOpenProfilePage (){
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    homePage = new HomePage(driver);
    homePage.open();
    homePage.clickCookieAlertClose();
    homePage.ClickForAccountButton();

    profilePage = new ProfilePage(driver);
}

@Test
    public void testProfilePageURL () {
    Assertions.assertEquals(profilePage.PROFILE_URL, driver.getCurrentUrl());
}

@Test
    public void testProfilePageTitleRegister() {
    Assertions.assertEquals(profilePage.TITLE_REGISTER_LABEL, profilePage.getTitleRegisterText());
}

@Test
    public void testProfilePageAuthorization () {
    Assertions.assertEquals(profilePage.TEXT_AUTHORIZATION_LABEL, profilePage.getAuthorizationText());
}

@Test
    public void testProfilePageRegistration () {
    Assertions.assertEquals(profilePage.TEXT_REGISTRATION_LABEL, profilePage.getRegistrationText());
}

@AfterEach
    public void quitDriver (){
    driver.quit();
}
}
