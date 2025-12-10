package by.booklover;

import by.booklover.pages.HomePage;
import by.booklover.pages.ProgramLoyaltyPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramLoyaltyTest {

    private WebDriver driver;
    private HomePage homePage;
    private ProgramLoyaltyPage programLoyaltyPage;

    @BeforeEach
    public void OpenProgramLoyaltyPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        homePage.open();
        homePage.clickCookieAlertClose();
        homePage.clickProgramLoyaltyButton();

        programLoyaltyPage = new ProgramLoyaltyPage(driver);
    }

    @Test
    public void checkLoyaltyProgramPageUrl() {
        Assertions.assertEquals(programLoyaltyPage.PROGRAM_LOYALTY_URL, driver.getCurrentUrl());
    }

    @Test
    public void checkLoyaltyProgramTitle() {
        Assertions.assertEquals(programLoyaltyPage.PROGRAM_LOYALTY_LABEL, programLoyaltyPage.getProgramLoyaltyTitleText());
    }
}
