package by.booklover.api;

import io.restassured.response.*;

import static io.restassured.RestAssured.given;

public class PersonalProfile {
    private final String URL_PERSONAL_PROFILE = "https://booklover.by/personal/profile/";
    private String userLogin;
    private String password;

    private Response response;


    public void doRequest() {
        response = given().queryParam("login", "yes")
                .contentType("application/x-www-form-urlencoded")
                .formParam("AUTH_FORM", "Y")
                .formParam("TYPE", "AUTH")
                .formParam("USER_REMEMBER", "Y")
                .formParam("backurl", "/personal/profile/")
                .formParam("USER_LOGIN", userLogin)
                .formParam("USER_PASSWORD", password)
                .when().post(URL_PERSONAL_PROFILE);
    }

    public int getStatusCode() {
        return response.then().extract().statusCode();
    }

    public String getBody() {
        return response.then().extract().body().asPrettyString();
    }

    public void setUserLogin (String userLogin){
        this.userLogin = userLogin;
    }

    public void setUserPassword (String password){
        this.password = password;
    }

}
