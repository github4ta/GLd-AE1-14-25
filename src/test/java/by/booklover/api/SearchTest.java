package by.booklover.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchTest {
    @Test
    public void testSearch() {
        String serchQuery = "qwerty";
        SearchServise searchServise = new SearchServise();
        searchServise.setSearchQuery(serchQuery);

        searchServise.doRequest();

        assertAll("searchService",
                () -> assertEquals(200, searchServise.getStatusCode()),
                () -> assertTrue(searchServise.getBody().contains("Ничего не найдено по запросу"), "Text does not corrector"),
                () -> assertTrue(searchServise.getBody().contains(serchQuery), "отсутствует запрос на поиск" + serchQuery)
        );
    }
}
