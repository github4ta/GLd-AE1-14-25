package by.kupi.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {
    @Test
    public void testLogin() {
        UserAuthService userAuthService = new UserAuthService();
        userAuthService.doRequest();
        userAuthService.printResponse();

        Assertions.assertEquals(422, userAuthService.getStatusCode());

        /*response.then()
                .log().all()
                .statusCode(422)
                .body("message", equalTo("Выбранное значение для E-Mail адрес некорректно."));*/
    }

    @Test
    public void testLogin2() {
        UserAuthService userAuthService = new UserAuthService();
        userAuthService.doRequest("cbc@jb.com", "");
        userAuthService.printResponse();

        Assertions.assertEquals(422, userAuthService.getStatusCode());
    }
}
