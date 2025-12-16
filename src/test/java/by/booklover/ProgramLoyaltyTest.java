package by.booklover;

import by.booklover.pages.HomePage;
import by.booklover.pages.ProgramLoyaltyPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

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
    public void verifyLoyaltyProgramPageUrl() {
        Assertions.assertEquals(programLoyaltyPage.PROGRAM_LOYALTY_URL, driver.getCurrentUrl());
    }

    @Test
    public void verifyLoyaltyProgramTitle() {
        Assertions.assertEquals(programLoyaltyPage.PROGRAM_LOYALTY_LABEL, driver.getTitle());
    }

    @Test
    public void testDiscountTableIsDisplayed() {
        Assertions.assertTrue(programLoyaltyPage.isDiscountTableDisplayed(), "Discount Table on the page is not displayed");
    }

    @Test
    public void verifySumAndDiscounts () {
        List<WebElement> rows = programLoyaltyPage.getTableRowsExceptForTitle();
        for (int i = 0; i < rows.size(); i++) {
            String actualSum = programLoyaltyPage.getSumFromRow(rows.get(i));
            String actualDiscount = programLoyaltyPage.getDiscountFromRow(rows.get(i));

            Assertions.assertEquals(programLoyaltyPage.EXPECTED_SUMS.get(i), actualSum);
            Assertions.assertEquals(programLoyaltyPage.EXPECTED_DISCOUNTS.get(i), actualDiscount);
        }
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
