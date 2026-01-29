package by.booklover.steps;

import by.booklover.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class HomeStep {
    private HomePage homePage;

    @Given("User opens Home page")
    public void openAndCloseCookie(){
        homePage = new HomePage();
        homePage.open();
        homePage.clickCookieAlertClose();
    }

    @Then("Basket button text is matched")
    public void verifyThatBasketButtonTextIsMatched(){
        Assertions.assertEquals(homePage.BASKET_LABEL, homePage.getBasketButtonText());
    }
}
