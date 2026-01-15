package by.kupi;

import by.kupi.Driver;
import by.kupi.HomePage;
import by.booklover.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HomeTest {

    private HomePage homePage;

    @BeforeEach
    public void openHomePageCloseCookies(){
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookiesAccept();
    }

    @Test
    public void testCompanyNameInFooter(){
        Assertions.assertTrue(homePage.getCompanyNameInFooterText().contains());
    }

    @AfterEach
    public void quit(){
        Driver.quit();
    }
}
