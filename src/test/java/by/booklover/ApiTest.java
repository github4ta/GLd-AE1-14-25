package by.booklover;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;

public class ApiTest {
    @Test
    public void testBeHomePage() {
        String url = "https://booklover.by/";
        when().get(url).then().statusCode(200);
    }

    @Test
    public void testPostLogin() {
        String url = "https://booklover.by/personal/profile/?login=yes";
        given()
                .contentType("application/x-www-form-urlencoded")
                .formParam("AUTH_FORM", "Y")
                .formParam("TYPE", "Y")
                .formParam("USER_REMEMBER", "Y")
                .formParam("backurl", "/personal/profile/")
                .formParam("USER_REMEMBER", "Y")
                .formParam("USER_LOGIN", "+375 29 788-2196") // Rest Assured сам закодирует пробел
                .formParam("USER_PASSWORD", "jkbj") // Rest Assured сам закодирует пробел
                .when()
                .post(url)
                .then().assertThat().statusCode(200);
    }

    @Test
    public void testPostLoginKufar() {
        String url = "https://cre-auth.kufar.by/v2/auth/signin?token_type=user";
        String body = """
                    {
                    "login": "marig_na_s@inbox.ru",
                    "password": "cgfcgfc",
                    "recaptcha_user_response": "",
                    "recaptcha_secret_version": "v1",
                    "recaptcha_platform": "web"
                }
                """ ;
        given()
                .header("x-device-id", "645eb5ac9a97eb9b8a4998305f6c5733")
                .header("x-app-name", "Web Kufar")
                .body(body)
                .when()
                .post(url)
                .then()
                .log()
                .all()
                .statusCode(401)
                .body("message", equalTo("authentication failed"))
                .body("label.text", equalTo("Такого профиля не существует"))
                .body("http.message", equalTo("Unauthorized"));
    }

    @Test
    public void testPostLoginSportPari() {
        String url = "https://sportpari.by/api/auth/credentials/login";
        String body = """
                {
                    "username": "",
                    "password": "hbgjhb",
                    "remember": false,
                    "phone_number": "+375445643333",
                    "fingerprint": "351bb726b4a648397eb37f19916fbe10"
                }
                """;
        given()
                .header("Content-Type","application/json")
                .body(body)
        .when()
                .post(url)
        .then()
                .log()
                .all()
                .statusCode(422)
                .body("phone_number[0]", equalTo("data_not_valid"));
    }
}
