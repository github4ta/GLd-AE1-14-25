package by.kupi.api;

import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginTest {
    @Test
    public void testLogin() {
        String body = """
                {
                    "login": "login",
                    "type": "email_password",
                    "email": "it-test20012026@gmail.com",
                    "password": "Password!234",
                    "_token": "PV07i5GQ4yeGJG88IP81Fn2Ks1TiabPh1gWKkhNE"
                }
                """;

        given().baseUri("https://kupi.by")
                .queryParam("t", "1768934294587")
                .header("content-type", "application/json; charset=utf-8")
                .header("x-requested-with", "XMLHttpRequest")
                .body(body)
        .when()
                .post("/user/auth")
        .then()
                .log().all()
                .statusCode(422)
                .body("message", equalTo("Выбранное значение для E-Mail адрес некорректно."));
    }
}
