package by.kupi;

import by.kupi.driver.Driver;

public class LoginPage2 {
    private final String INPUT_EMAIL = "//input[@id='form-authorization-email']";
    private final String INPUT_PASSWORD = "//input[@id='form-authorization-password']";
    private final String BUTTON_ENTER = "//button[@class='form-authorization__button form-button-primary']";
    private final String ERROR_MESSAGE = "//div[@class='dialog-authorization-content']/form[@id='form-authorization']/div[@class='form-field']/div[@class='form-field-error-message']";

    public LoginPage2 inputEmail(String email){
        Driver.waitAndInput(INPUT_EMAIL, email);
        return this;
    }

    public LoginPage2 inputPassword(String password){
        Driver.waitAndInput(INPUT_PASSWORD, password);
        return this;
    }

    public LoginPage2 putButtonEnter(){
        Driver.click(BUTTON_ENTER);
        return this;
    }

    public String getErrorMessage(){
        return Driver.waitAndGetText(ERROR_MESSAGE);
    }
}
