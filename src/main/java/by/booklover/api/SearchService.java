package by.booklover.api;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class SearchService {
    private final String URL_SEARCH = "https://booklover.by/search/";
    private Response response;


    public void doRequest() {
        response = given().queryParam("q", "qwert").when().get(URL_SEARCH);
    }

    public int getStatusCode() {
        return response.then().extract().statusCode();
    }

    public String getBody() {
        return response.then().extract().body().asPrettyString();
    }
}
