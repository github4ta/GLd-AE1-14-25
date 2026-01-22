package by.kupi.api;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class UserAuthService {
    //адрес
    //хедеры
    //боди
    private String UrlUserAuth = "https://kupi.by/user/auth";
    private Map<String, String> QueryParams;
    private Map<String, String> Headers;

    private Response response;

    private String body;

    public void doRequest() {
        response = given()
                .queryParams(getQueryParams())
                .headers(getHeaders())
                .body(getBody())
                .when()
                .post(UrlUserAuth);
    }

    public void printResponse(){
        response.then()
                .log().all();
    }

    private Map<String, String> getQueryParams(){
        Map<String, String> queryParams = new HashMap<>();
        queryParams.put("t", "1768934294587");
        return queryParams;
    }

    private Map<String, String> getHeaders () {
        Map<String, String> headers = new HashMap<>();
        headers.put("content-type", "application/json; charset=utf-8");
        headers.put("x-requested-with", "XMLHttpRequest");
        return  headers;
    }

    private void setQueryParams(){
        QueryParams = new HashMap<>();
        QueryParams.put("t", "1768934294587");
    }

    private void setHeaders () {
        Map<String, String> headers = new HashMap<>();
        Headers.put("content-type", "application/json; charset=utf-8");
        Headers.put("x-requested-with", "XMLHttpRequest");
    }

    public UserAuthService() {
        setQueryParams();
        setHeaders();
        setBody();

    }

    private String getBody(){
        String body = """
                {
                    "login": "login",
                    "type": "email_password",
                    "email": "it-test20012026@gmail.com",
                    "password": "Password!234",
                    "_token": "PV07i5GQ4yeGJG88IP81Fn2Ks1TiabPh1gWKkhNE"
                }
                """;
        return body;
    }

    private void setBody(){
         body = """
                {
                    "login": "login",
                    "type": "email_password",
                    "email": "it-test20012026@gmail.com",
                    "password": "Password!234",
                    "_token": "PV07i5GQ4yeGJG88IP81Fn2Ks1TiabPh1gWKkhNE"
                }
                """;
    }
}
