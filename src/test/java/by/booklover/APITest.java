package by.booklover;

import org.apache.http.auth.AUTH;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

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

    @Test
    public void testPostLoginSportpari(){
        String url = "https://sportpari.by/api/auth/credentials/login";
        String body = """
                {
                    "username": "",
                    "password": "13341",
                    "remember": false,
                    "phone_number": "+375295565255",
                    "fingerprint": "42029a40aff2afd651f6c394638c04ae"
                }
                """;

        given().header("content-type","application/json").body(body).when().post(url).then().log().all().statusCode(422).body("phone_number[0]", equalTo("data_not_valid")).body("password[0]",equalTo("data_not_valid"));
    }
}