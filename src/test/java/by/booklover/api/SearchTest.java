package by.booklover.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;


public class SearchTest {
    @Test
    public void testSearch() {
        SearchService searchService = new SearchService();

        searchService.doRequest();

        //assertEquals(200, searchService.getStatusCode());
        //assertTrue(searchService.getBody().contains("Ничего не найдено по запросу"));


        assertAll("seacrch service",
                () -> assertEquals(200, searchService.getStatusCode()),
                () -> assertTrue(searchService.getBody().contains("Ничего не найдено 1 по запросу"), "tututu")
        );
    }
}
