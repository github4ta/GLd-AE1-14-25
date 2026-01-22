package by.booklover;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;


public class ApiTest {
    @Test
    public void TestGetHomePage() {
        String url = "https://booklover.by/";
        when().get(url).then().statusCode(200);
    }

    @Test
    public void TestPostLogin() {
        String url = "https://booklover.by/personal/profile/?login=yes";
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("AUTH_FORM", "Y")
                .formParam("TYPE", "AUTH")
                .formParam("USER_REMEMBER", "Y")
                .formParam("backurl", "/personal/profile/")
                .formParam("USER_LOGIN", "+375 44 100-0000")
                .formParam("USER_PASSWORD", "1234567")

        .when()
                .post(url)
        .then().assertThat().statusCode(200);
    }
}
