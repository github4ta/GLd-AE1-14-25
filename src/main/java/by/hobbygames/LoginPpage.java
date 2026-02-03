package by.hobbygames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPpage {
    public By inputLoginPath = By.xpath("//input[@name='login']");
    public By inputPasswordPath = By.xpath("//input[@name='password']");
    public By buttonLogin = By.xpath("//input[@type='submit']");

    public By messageErrorLoginPath = By.xpath("//label[@data-scenario='login']/div[@class='error']");
    public By messageErrorPasswordPath = By.xpath("//label[@class='password-group']/div[@class='error']");

    public WebDriver driver;

    public LoginPpage() {
        this.driver = Driver.getDriver();
    }

    public void inputLogin(String login){
        driver.findElement(inputLoginPath).sendKeys(login);
    }

    public void inputPassword(String password){
        driver.findElement(inputPasswordPath).sendKeys(password);
    }

    public void clickButtonLogin(){
        driver.findElement(buttonLogin).click();
    }

    public String getTextMessageErrorLogin(){
        return driver.findElement(messageErrorLoginPath).getText();
    }

    public String getTextMessageErrorPasword(){
        return driver.findElement(messageErrorPasswordPath).getText();
    }
}
