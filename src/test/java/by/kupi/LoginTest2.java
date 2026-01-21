package by.kupi;

import by.kupi.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest2 {
    private LoginPage2 loginPage;

    @BeforeEach
    public void openHomePageAndCloseCookiesAndClickEnter() {
        loginPage = new HomePage()
                .open()
                .clickCookie()
                .clickEnter();
    }

    @Test
    public void testLoginForm() {
        String errorMessage = loginPage.inputEmail("a.dgdg@rambler.ru")
                .inputPassword("dddd")
                .putButtonEnter()
                .getErrorMessage();
        Assertions.assertEquals("Выбранное значение для E-Mail адрес некорректно.", errorMessage);
    }

    @AfterEach
    public void tearDown() {
        Driver.quit();
    }
}

