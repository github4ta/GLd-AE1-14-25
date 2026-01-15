package by.kupi;

import by.kupi.driver.*;
import org.junit.jupiter.api.*;

public class HomeTest {
    private HomePage homePage;

    @BeforeEach
    public void openHomePageAndCloseCookies() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookie();
    }

    @Test
    public void testCompanyNameInFooter() {
        Assertions.assertEquals(homePage.COMPANY_NAME_IN_FOOTER_TEXT, homePage.getTextCompanyNameInFooter());
    }

    @AfterEach
    public void close() {
        Driver.quit();
    }
}
