package by.booklover;

import by.booklover.driver.Driver;
import by.booklover.pages.CartPage;
import by.booklover.pages.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartTest {
    private HomePage homePage;
    private CartPage cartPage;

    @BeforeEach
    public void setupDriverAndOpenHomePageAndCloseCookieAlertAndOpenCartPage() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookieAlertClose();
        homePage.clickCartButton();

        cartPage = new CartPage();
    }

    @Test
    public void testCartPageUrl() {
        Assertions.assertEquals(cartPage.CART_URL, Driver.getDriver().getCurrentUrl());
    }

    @Test
    public void testCartPageYourCartEmptyText() {
        Assertions.assertEquals(cartPage.YOUR_CART_EMPTY_TEXT, cartPage.getCartPageYourCartEmptyText());
    }

    @Test
    public void testCartPageClickHereBlock() {
        Assertions.assertTrue(cartPage.getCartPageClickHereContinueShoppingBlock().contains(cartPage.CLICK_HERE_CONTINUE_SHOPPING_TEXT));
    }

    @AfterEach
    public void quitDriver() {
        Driver.quit();
    }
}
