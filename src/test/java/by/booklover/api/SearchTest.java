package by.booklover.api;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class SearchTest {
    @Test
    public void testSearch() {
        String searchQuery = "qwerty";
        SearchService searchService = new SearchService();
        searchService.setSearchQuery(searchQuery);

        searchService.doRequest();

        assertAll("search service",
                () -> assertEquals(200, searchService.getStatusCode()),
                () -> assertTrue(searchService.getBody().contains("Ничего не найдено по запросу"), "отсутствует фраза 'Ничего не найдено по запросу' "),
                () -> assertTrue(searchService.getBody().contains(searchQuery), "отсутсвует запрс на поиск " + searchQuery)
        );
    }
}
