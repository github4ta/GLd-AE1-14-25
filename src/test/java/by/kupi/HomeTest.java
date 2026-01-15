package by.kupi;

import by.kupi.driver.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;

public class HomeTest {
    private HomePage homePage;
    private static final Logger logger = LogManager.getLogger();


    @BeforeEach
    public void openHomePageAndCloseCookies() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookie();
    }

    @Test
    public void testCompanyNameInFooter() {
        logger.info("Выполняется тест testCompanyNameInFooter");
        Assertions.assertTrue(homePage.getCompanyTextInFooter().contains("ООО \"Дивный новый4 мир\""), "there's no 'Дивный новый мир' text");
    }

    @AfterEach
    public void close() {
        Driver.quit();
    }
}
