package by.hobbygames;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {
    private Faker faker = new Faker();
    private LoginPpage loginPpage;
    private HomePage homePage;

    @BeforeEach
    public void setup(){
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookieBtn();
        homePage.clickButonLogin();
        loginPpage = new LoginPpage();
    }

    @Test
    public void emptyFieldsLoginTest() {
        loginPpage.clickButtonLogin();
        Assertions.assertAll(
                () -> Assertions.assertEquals("Введите телефон или электронную почту", loginPpage.getTextMessageErrorLogin(), "Сообщение не такое"),
                () -> Assertions.assertEquals("Введите пароль", loginPpage.getTextMessageErrorPasword(), "Сообщение пароля не такое")
        );
    }

    @Test
    public void emptyEmailField() {
        loginPpage.inputLogin(faker.internet().emailAddress());
        loginPpage.clickButtonLogin();
        Assertions.assertAll(
                () -> Assertions.assertEquals("Неверный телефон/e-mail", loginPpage.getTextMessageErrorLogin(), "Текст ошибки не совпадает"),
                () -> Assertions.assertEquals("Введите пароль", loginPpage.getTextMessageErrorPasword(), "Сообщение пароля не такое")
        );
    }

    @Test
    public void emptyPasswordField() {
        loginPpage.inputLogin(faker.internet().password());
        loginPpage.clickButtonLogin();
        Assertions.assertAll(
                () -> Assertions.assertEquals("Неверный телефон/e-mail", loginPpage.getTextMessageErrorLogin(), "Текст ошибки не совпадает"),
                () -> Assertions.assertEquals("Неверный пароль", loginPpage.getTextMessageErrorPasword(), "Не такое сообщение об ошибке пароля")
        );
    }

    @AfterEach
    public void closeBrowser(){
        Driver.quitDriver();
    }
}
