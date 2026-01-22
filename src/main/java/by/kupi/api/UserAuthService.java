package by.kupi.api;

import io.restassured.response.*;

import java.util.*;

import static io.restassured.RestAssured.given;

public class UserAuthService {

    //address
    //header
    //body

    private String UrlUserAuth = "https://kupi.by/user/auth";
    private Map<String, String> QueryParams;
    private Map<String, String> Headers;
    private String Body = """
            {
                "login": "login",
                "type": "email_password",
                "email": "it-test20012026@gmail.com",
                "password": "Password!234",
                "_token": "PV07i5GQ4yeGJG88IP81Fn2Ks1TiabPh1gWKkhNE"
            }
            """;

    public void doRequest(){
        Response response = given()
                .queryParams(QueryParams)
                .headers(Headers)
                .body(Body)
                .when()
                .post(UrlUserAuth);
    }
}
