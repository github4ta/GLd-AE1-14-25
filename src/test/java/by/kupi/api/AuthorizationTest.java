package by.kupi.api;

import org.junit.jupiter.api.*;

public class AuthorizationTest {
    public AuthorizationService authorizationService;

    @Test
    public void testPrintResponse() {
        authorizationService = new AuthorizationService();
        authorizationService.doRequest();
        authorizationService.printResponse();
    }
}
