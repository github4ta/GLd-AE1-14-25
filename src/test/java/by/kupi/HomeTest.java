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
        Assertions.assertTrue(homePage.getCompanyTextInFooter().contains("ООО \"Дивный новый мир\""), "there's no 'Дивный новый мир' text");
    }

    @AfterEach
    public void close() {
        Driver.quit();
    }
}
