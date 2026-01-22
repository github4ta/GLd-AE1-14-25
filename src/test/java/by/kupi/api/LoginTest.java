package by.kupi.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {
    @Test
    public void testLogin() {
        UserAuthService userAuthService = new UserAuthService();
        userAuthService.doRequest();

        Assertions.assertEquals(422, userAuthService.getStatusCode());
        Assertions.assertEquals("Выбранное значение для E-Mail адрес некорректно.", userAuthService.getResponseMessage());

    }

    @Test
    public void testLogin2() {
        UserAuthService userAuthService = new UserAuthService();
        userAuthService.doRequest("cbc@jb.com", "");

        Assertions.assertEquals(422, userAuthService.getStatusCode());
        Assertions.assertEquals("Выбранное значение для E-Mail адрес некорректно. (and 1 more error)", userAuthService.getResponseMessage());

    }
}
