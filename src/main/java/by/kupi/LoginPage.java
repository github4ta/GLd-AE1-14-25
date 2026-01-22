package by.kupi;

import by.kupi.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private WebDriver driver;

    public final By EMAIL_PATH = By.xpath("//input[@id='form-authorization-email']");
    public final By PASSWORD_PATH = By.xpath("//input[@id='form-authorization-password']");
    public final By BUTTON_ENTER_PATH = By.xpath("//button[@class='form-authorization__button form-button-primary']");
    public final By ERROR_MESSAGE_PATH = By.xpath("//div[@class='dialog-authorization-content']/form[@id='form-authorization']/div[@class='form-field']/div[@class='form-field-error-message']");

    public LoginPage() {
        this.driver = Driver.getDriver();
    }

    public void inputEmail(String email){
        driver.findElement(EMAIL_PATH).sendKeys(email);
    }

    public void inputPassword(String password){
        driver.findElement(PASSWORD_PATH).sendKeys(password);
    }

    public void putButtonEnter(){
        driver.findElement(BUTTON_ENTER_PATH).click();
    }

    public String getErrorMessage(){
        // 1. Создаем объект WebDriverWait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Ждем до 10 секунд
        // 2. Дожидаемся видимости элемента по его локатору (например, по ID)
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(ERROR_MESSAGE_PATH));

        return element.getText();
    }
}
