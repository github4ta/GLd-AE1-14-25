package by.hobbygames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPpage {
    public By inputLoginPath = By.xpath("//input[@name='login']");
    public By inputPasswordPath = By.xpath("//input[@name='password']");
    public By buttonLogin = By.xpath("//input[@type='submit']");

    private String INPUT_LOGIN = "//input[@name='login']";
    private String ERROR_INPUT_LOGIN = INPUT_LOGIN + "/following-sibling::div";

    public By messageErrorLoginPath = By.xpath("//label[@data-scenario='login']/div[@class='error']");
    public By messageErrorPasswordPath = By.xpath("//label[@class='password-group']/div[@class='error']");

    private final By LOGIN_POPUP = By.xpath("//div[@class='login-popup']");

    public WebDriver driver;

    public LoginPpage() {
        driver = Driver.getDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        wait.until(ExpectedConditions.visibilityOfElementLocated(LOGIN_POPUP));
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
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        WebElement messageErrorLogin = wait.until(ExpectedConditions.visibilityOfElementLocated(messageErrorLoginPath));
        return messageErrorLogin.getText();
    }

    public String getTextMessageErrorPasword(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
        WebElement messageErrorPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(messageErrorPasswordPath));
        return messageErrorPassword.getText();
    }
}
