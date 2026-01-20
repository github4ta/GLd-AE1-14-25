package by.kupi;

import by.kupi.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest2 {
    private LoginPage2 loginPage;
    private HomePage homePage;

    @BeforeEach
    public void openHomePageAndCloseCookiesAndClickEnter() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookie();
        homePage.clickEnter();
        loginPage = new LoginPage2();
    }

    @Test
    public void testLoginForm() {
        loginPage.inputEmail("a.dgdg@rambler.ru");
        loginPage.inputPassword("dddd");
        loginPage.putButtonEnter();
        Assertions.assertEquals("Выбранное значение для E-Mail адрес некорректно.", loginPage.getErrorMessage());
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}

