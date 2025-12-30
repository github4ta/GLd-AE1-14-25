package by.booklover.api;

import org.junit.jupiter.api.*;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonalProfileTest {
    @Test
        public void TestGetHomePage() {
            String url = "https://booklover.by/personal/profile/";
        given().queryParam("login","yes")
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

    @Test
    public void testLogin(){
        PersonalProfile personalProfile = new PersonalProfile();
        personalProfile.setUserLogin("+375 44 100-0000");
        personalProfile.setUserPassword("12345");

        personalProfile.doRequest();

        assertAll("personal profile service",
                () -> assertEquals(200, personalProfile.getStatusCode()),
                () -> assertTrue(personalProfile.getBody().contains("Неверный телефон или пароль."), "отсутствует фраза 'Ничего не найдено по запросу' ")
        );
    }
}
