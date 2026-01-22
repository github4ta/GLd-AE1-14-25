package by.kupi.api;

import io.restassured.response.*;

import java.util.*;

import static io.restassured.RestAssured.given;

public class UserAuthService {
    private String urlUtherAuth = "https://kupi.by/user/auth";

    private Response response;

    private Map<String, String> getQueryParams() {
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("t", "1768934294587");
        return queryParams;
    }

    private Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("content-type", "application/json; charset=utf-8");
        headers.put("x-requested-with", "XMLHttpRequest");
        return headers;
    }

    private String getBody(String email, String password) {
        String body = "{\n" +
                "\"login\": \"login\",\n" +
                "\"type\": \"email_password\",\n" +
                "\"email\": \"" + email + "\",\n" +
                "\"password\": \"" + password + "\",\n" +
                "\"_token\": \"PV07i5GQ4yeGJG88IP81Fn2Ks1TiabPh1gWKkhNE\"\n" +
                "}";

        return body;
    }

    public void doRequest() {
        doRequest("it-test20012026@gmail.com", "Password!234");
    }

    public void doRequest(String email, String password) {
        response =
                given().baseUri("https://kupi.by")
                        .queryParams(getQueryParams())
                        .headers(getHeaders())
                        .body(getBody(email, password))
                        .when()
                        .post(urlUtherAuth);
    }

    public void printResponse() {
        response.then()
                .log().all();
    }

    public int getStatusCode() {
        return response.getStatusCode();
    }

    public String getResponseMessage(){
        return  response.body().jsonPath().getString("message");
    }
}
