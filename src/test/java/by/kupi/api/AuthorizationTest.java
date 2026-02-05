package by.kupi.api;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class AuthorizationTest {
    public AuthorizationService authorizationService;

    @Test
    public void testPrintResponse() {
        authorizationService = new AuthorizationService();
        authorizationService.doRequest("", "");
        authorizationService.printResponse();

        assertAll(
                () -> Assertions.assertEquals(422, authorizationService.getStatusCode()),
                () -> Assertions.assertEquals("Поле E-Mail адрес обязательно для заполнения. (and 1 more error)", authorizationService.getMessage()),
                () -> Assertions.assertEquals("Поле E-Mail адрес обязательно для заполнения.", authorizationService.getErrorsEmail()),
                () -> Assertions.assertEquals("Поле Пароль обязательно для заполнения.", authorizationService.getErrorsPassword())
        );
    }
}
