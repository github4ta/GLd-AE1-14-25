package by.hobbygames;

import org.openqa.selenium.*;

public class LoginPage {
    public By inputLoginName = By.xpath("//input[@name='login']");
    public By inputLoginPassword = By.xpath("//input[@name='password']");
    public By submitButton = By.xpath("//input[@type='submit']");

    public  By errorMessageLoginName = By.xpath("//label[@data-scenario='login']//div[contains(@class='error')]");
    public  By errorMessageLoginPassword = By.xpath("//div[@class='password-group']/div[@class=error']");


    public WebDriver driver;

    public LoginPage() {
        this.driver = Driver.getDriver();
    }

    public void inputLoginName(String login) {
        driver.findElement(inputLoginName).sendKeys("tratata");
    }

    public void inputLoginPassword(String password) {
        driver.findElement(inputLoginPassword).sendKeys("tra123");
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public  String getTextMessageLoginError(){
        return driver.findElement(errorMessageLoginName).getText();
    }
    public  String getTextMessagePasswordError(){
        return driver.findElement(errorMessageLoginPassword).getText();
    }

}
