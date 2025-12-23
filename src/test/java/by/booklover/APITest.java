package by.booklover;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class APITest {
    @Test
    public void testGetHomePage() {
        String url = "https://booklover.by/";
        when().get(url).then().statusCode(200);
    }

    @Test
    public void testPostLogIn() {
        String url = "https://booklover.by/personal/profile/?login=yes";
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("AUTH_FORM", "Y")
                .formParam("TYPE", "AUTH")
                .formParam("USER_REMEMBER", "Y")
                .formParam("backurl", "/personal/profile/")
                .formParam("USER_LOGIN", "+375 33 333-3333")
                .formParam("USER_PASSWORD", "wewewewewwewe")
        .when()
                .post(url)
        .then().assertThat().statusCode(200);
    }

}
