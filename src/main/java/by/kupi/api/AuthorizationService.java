package by.kupi.api;

import io.restassured.response.*;

import static io.restassured.RestAssured.*;

public class AuthorizationService {
    private Response response;

    public void doRequest() {
        response =
                given().baseUri("https://kupi.by")
                        .queryParams("t","1770295767129")
                        .header("content-type","application/json; charset=utf-8")
                        .header("x-requested-with","XMLHttpRequest")
                        .body("{\"login\":\"login\",\"type\":\"email_password\",\"email\":\"\",\"password\":\"\",\"_token\":\"roGSRVAmr5kGiRtkyi3cARYrCdcqxf88Po9TUmcw\"}")
                        .when()
                        .post("https://kupi.by/user/auth");

    }

    public void printResponse() {
        response.then().log().all();
    }
}
