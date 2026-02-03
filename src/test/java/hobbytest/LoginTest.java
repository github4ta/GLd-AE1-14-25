package hobbytest;

import by.hobbygames.*;
import org.junit.jupiter.api.*;

public class LoginTest {
    private LoginPage loginPage;
    private  HomePage homePage;



    @Test
    public void EmptyFieldsLoginTest(){
        homePage.open();
        homePage.clickLoginButton();
        loginPage.clickSubmitButton();
        Assertions.assertAll(
                () -> Assertions.assertEquals("Введите телефон или электронную почту",loginPage.getTextMessageLoginError()),
                () -> Assertions.assertEquals("Введите пароль",loginPage.getTextMessagePasswordError())
        );

    }

}
