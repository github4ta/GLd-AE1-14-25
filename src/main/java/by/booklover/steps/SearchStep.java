package by.booklover.steps;

import by.booklover.pages.SearchPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class SearchStep {
    private SearchPage searchPage;
    private String searchText;

    @When("User use search {string}")
    public void method(String searchText) {
        searchPage = new SearchPage();
        searchPage.open(searchText);
        this.searchText = searchText;
    }

    @Then("Verify that nothing found")
    public void verify1() {
        Assertions.assertEquals("Ничего не найдено по запросу “"+ searchText +"”", searchPage.getSearchNotFoundTitle());
    }

    @Then("Verify please check")
    public void verify2() {
        Assertions.assertEquals("Пожалуйста, убедитесь, что запрос введен корректно или переформулируйте его.", searchPage.getSearchNotFoundText());
    }
}
