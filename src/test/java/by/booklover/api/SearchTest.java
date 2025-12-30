package by.booklover.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTest {
    @Test
    public void testSearch() {
        SearchService searchService = new SearchService();

        searchService.doRequest();

        assertAll("searchService",
                () -> assertEquals(200, searchService.getStatusCode()),
                () -> assertTrue(searchService.getBody().contains("Ничего не найдено по запросу"), "Text does not correspond to the template 'Ничего нe найдено по запросу'.")
        );
    }
}
