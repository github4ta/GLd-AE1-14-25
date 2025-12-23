package by.booklover;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;

public class ApiTest {
    @Test
    public void testGetHomePage() {
        String homePageUrl = "https://booklover.by/";

        when().get(homePageUrl).then().log().all();
    }
    @Test
    public void testPostLogIn() {
        String homePageUrl = "https://booklover.by/personal/profile/?login=yes";

        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("")
                .formParam("")
                .formParam("")
                .formParam("")
                .formParam("")
        .when()
                .post(homePageUrl)
        .then()
                .assertThat().statusCode(200);

    }
}
