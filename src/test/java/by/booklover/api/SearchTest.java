package by.booklover.api;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class SearchTest {
    @Test
    public void testSearch() {
        String url = "https://booklover.by/search/";
        Response response = given().queryParam("q", "qwert").when().get(url);

        int actualStatusCode = response.then().extract().statusCode();
        String body = response.then().extract().body().asString();
        System.out.println(body);

        Assertions.assertEquals(200, actualStatusCode);
    }
}
