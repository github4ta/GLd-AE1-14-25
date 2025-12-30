package by.booklover.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest {
    @Test
    public void testSearch() {
        SearchService searchService = new SearchService();

        searchService.doRequest();

        Assertions.assertEquals(200, searchService.getStatusCode());
        Assertions.assertTrue(searchService.getBody().contains("Ничего не найдено по запросу"));
    }
}
