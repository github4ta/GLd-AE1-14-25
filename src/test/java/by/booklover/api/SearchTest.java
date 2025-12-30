package by.booklover.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class SearchTest {
    @Test
    public void testSearch() {
        String url ="https://booklover.by/search/";
        given().
            queryParam("q", "aaaa").
            when().
            get(url).
            then().
            log().
            all().
            statusCode(200);
    }
}
