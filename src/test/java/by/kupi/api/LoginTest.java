package by.kupi.api;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {
    @Test
    public void testLogin() {
        UserAuthService userAuthService = new UserAuthService();
        userAuthService.doRequest();

        assertAll("Login",
                () -> assertEquals(422, userAuthService.getStatusCode()),
                () -> assertEquals("Выбранное значение для E-Mail адрес некорректно.", userAuthService.getResponseMessage())
        );
    }

    @Test
    public void testLogin2() {
        UserAuthService userAuthService = new UserAuthService();
        userAuthService.doRequest("cbc@jb.com", "");

        assertAll("Login",
                () -> assertEquals(422, userAuthService.getStatusCode()),
                () -> assertEquals("Выбранное значение для E-Mail адрес некорректно. (and 1 more error)", userAuthService.getResponseMessage())
        );
    }
}
