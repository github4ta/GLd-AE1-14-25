package by.booklover;

import by.booklover.driver.Driver;
import by.booklover.pages.HomePage;
import by.booklover.pages.ProfilePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProfileTest {

private HomePage homePage;
private ProfilePage profilePage;

@BeforeEach
    public  void setupDriverAndOpenHomePageAndCloseCookieAlertAndOpenProfilePage (){

    homePage = new HomePage();
    homePage.open();
    homePage.clickCookieAlertClose();
    homePage.ClickForAccountButton();

    profilePage = new ProfilePage();
}

@Test
    public void testProfilePageURL () {
    Assertions.assertEquals(profilePage.PROFILE_URL, Driver.getDriver().getCurrentUrl());
}

@Test
    public void testProfilePageTitleRegister() {
    Assertions.assertEquals(profilePage.TITLE_REGISTER_LABEL, profilePage.getTitleRegisterText());
}

@Test
    public void testProfilePageAuthorizationBlockTitle() {
    Assertions.assertTrue(profilePage.getAuthorizationText().contains(profilePage.TEXT_AUTHORIZATION_LABEL));
}

@Test
    public void testProfilePageRegistrationBlockTitle() {
    Assertions.assertTrue(profilePage.getRegistrationText().contains(profilePage.TEXT_REGISTRATION_LABEL));
}

@AfterEach
    public void quitDriver (){
    Driver.quit();
}
}
