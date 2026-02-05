package by.kupi.api;

import io.restassured.response.*;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class AuthorizationService {
    private Response response;

    public void doRequest() {
        response = given().baseUri("https://kupi.by").queryParams("t", "1770295767129").headers(getHeaders()).body(getDefaultBody()).when().post("https://kupi.by/user/auth");

    }

    private String getDefaultBody() {
        String body = """
                {
                  "login": "login",
                  "type": "email_password",
                  "email": "ajsgdu@jkhk.com",
                  "password": "password",
                  "_token": "roGSRVAmr5kGiRtkyi3cARYrCdcqxf88Po9TUmcw"
                }
                """;
        return body;
    }

    private String getBody(String email, String password) {
        String body = String.format("""
                {
                  "login": "login",
                  "type": "email_password",
                  "email": "%s",
                  "password": "%s",
                  "_token": "roGSRVAmr5kGiRtkyi3cARYrCdcqxf88Po9TUmcw"
                }
                """, email, password);
        return body;
    }

    public void doRequest(String email, String password) {
        response = given().baseUri("https://kupi.by").queryParams("t", "1770295767129").headers(getHeaders()).body(getBody(email, password)).when().post("https://kupi.by/user/auth");
    }

    private Map<String, Object> getHeaders() {
        Map<String, Object> headers = new HashMap<>();
        headers.put("content-type", "application/json; charset=utf-8");
        headers.put("x-requested-with", "XMLHttpRequest");

        return headers;
    }

    public void printResponse() {
        response.then().log().all();
    }
}
