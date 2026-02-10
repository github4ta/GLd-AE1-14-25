import com.codeborne.selenide.*;
import org.testng.*;
import org.testng.annotations.*;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {

    @BeforeSuite
    public void testLogin() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 5000;

    }

    @Test
    public void testInvalidCredential() {
        Selenide.open("https://chitatel.by/");
        $(byXpath("//div[@class='h-login']//a[@class='block__link login__link login_popup']//div[@class ='name']")).click();
        $(byXpath("//a[contains(@class,'_js-tab-btn') and normalize-space()='Email']")).click();
        $(byXpath("//input[@type='email' and @name='email']")).setValue("test@tets.xk");
        $(byXpath("//input[@class='input__default' and @name='password']")).setValue("testtetsxk");
        $(byId("send-login")).click();

        Assert.assertEquals($(byXpath("//div[@class='alert alert-danger']/ul/li")).getText(), "Неправильный e-mail или пароль!");

    }

}
