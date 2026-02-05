package by.kupi.api;

import io.restassured.response.*;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class AuthorizationService {
    private final String URL_USER_AUCH = "https://kupi.by/user/auth";
    private Response response;

    public void doRequest() {
        response = given().queryParams(getQueryParams()).headers(getHeaders()).body(getDefaultBody()).when().post(URL_USER_AUCH);

    }

    private Map<String, Object> getQueryParams() {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("t", "1770295767129");
        return queryParams;
    }

    private String getDefaultBody() {
        return getBody("ajsgdu@jkhk.com", "password");
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
        response = given().queryParams(getQueryParams()).headers(getHeaders()).body(getBody(email, password)).when().post(URL_USER_AUCH);
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

    public int getStatusCode(){
        return response.getStatusCode();
    }

    public String getMessage(){
        return response.jsonPath().getString("message");
    }

    public String getErrorsEmail(){
        return response.jsonPath().getString("errors.email[0]");
    }

    public String getErrorsPassword(){
        return response.jsonPath().getString("errors.password[0]");
    }

}
