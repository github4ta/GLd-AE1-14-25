package by.booklover.api;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonalProfileTest {

    @Test
    public void testPostLogIn() {
        String url = "https://booklover.by/personal/profile/";

        given().queryParam("login", "yes")

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
    public void testLogin() {
        PersonalProfile personalProfile = new PersonalProfile();

        personalProfile.setUserLogin("+375 29 689-5587");
        personalProfile.setUserPassword("5662266");

        personalProfile.doRequest();
        assertAll("personalProfile",
                () -> assertEquals(200, personalProfile.getStatusCode()),
                () -> assertTrue(personalProfile.getBody().contains("Неверный телефон или пароль"), "Text does not corrector")
        );
    }
}
