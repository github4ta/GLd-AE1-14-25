package by.kupi.api;

import org.junit.jupiter.api.*;

public class LoginTest {
    @Test
    public void testLogin() {
        UserAuthService userAuthService = new UserAuthService();
        userAuthService.doRequest();
        userAuthService.printResponse();
       /* response.then()
                .log().all()
                .statusCode(422)
                .body("message", equalTo("Выбранное значение для E-Mail адрес некорректно."));*/
    }
}
