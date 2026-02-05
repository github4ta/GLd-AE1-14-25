package by.kupi.api;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AuthorizationTest {
    public String url = "https://kupi.by/user/auth";
    public Response response;

    @Test
    public void printResponse(){
        response =
                given().baseUri("https://kupi.by")
                        .queryParams("t","1770295767129")
                        .header("content-type","application/json; charset=utf-8")
                        .header("x-requested-with","XMLHttpRequest")
                        .body("{\"login\":\"login\",\"type\":\"email_password\",\"email\":\"\",\"password\":\"\",\"_token\":\"roGSRVAmr5kGiRtkyi3cARYrCdcqxf88Po9TUmcw\"}")
                        .when()
                        .post(url);

        response.print();
    }
}
