package by.booklover.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;

public class SearchTest {
    @Test
    public void testSearch() {
        String url = "https://booklover.by/search/";
        Response response = given().queryParam("q", "ttt").when().get(url);

        int actualStatusCode = response.then().extract().statusCode();
        String body = response.then().extract().body().asPrettyString();
        System.out.println(body);

        Assertions.assertEquals(200,actualStatusCode);
    }
}
