package by.booklover;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ApiTest {
    @Test
    public void testGetHomePage() {
        String url = "https://booklover.by";
        when().get(url).then().assertThat().statusCode(200);
    }
}
