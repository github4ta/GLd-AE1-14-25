import com.microsoft.playwright.*;
import org.testng.*;
import org.testng.annotations.*;

public class LoginTest {
    static Playwright playwright;
    static Browser browser;

    BrowserContext context;
    Page page;

    @BeforeClass
    public void testLogin() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }

    @BeforeMethod
    void createContextAndPage() {
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterMethod
    void closeContext() {
        context.close();
    }

    @AfterClass
    void closeBrowser() {
        playwright.close();
    }

    @Test
    public void testInvalidCredential() {
        page.navigate("https://chitatel.by/");
        page.locator(
                "//div[@class='h-login']//a[@class='block__link login__link login_popup']//div[@class ='name']")
                .click();
        page.locator("//a[contains(@class,'_js-tab-btn') and normalize-space()='Email']").click();
        page.locator("//input[@type='email' and @name='email']").fill("test@tets.xk");
        page.locator("//input[@class='input__default' and @name='password']").fill("testtetsxk");
        page.locator("//input[@id='send-login']").click();
        Assert.assertEquals(page.locator("//div[@class='alert alert-danger']/ul/li").textContent(),
                "Неправильный e-mail или пароль!");
    }
}
