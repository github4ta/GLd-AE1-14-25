package by.kupi;

import by.kupi.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {
    private LoginPage loginPage;
    private HomePage homePage;

    //каждый раз перед тестом
    //открыть домашню стр
    //принять куки
    //нажать на кнопку войти

    //заполнить поле email
    //заполнить поле пароль
    //нажать кнопку войти

    //проверка

    @BeforeEach
    public void openHomePageAndCloseCookiesAndClickEnter() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookie();
        homePage.clickEnter();
    }

    @Test
    public void testLoginForm() {
        loginPage = new LoginPage();
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
