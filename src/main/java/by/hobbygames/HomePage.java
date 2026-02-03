package by.hobbygames;

import org.openqa.selenium.*;

public class HomePage {
    public By buttonLogin = By.xpath("//a[@href='/login']");
    public String homePageUrl = "https://hobbygames.by";
    public  WebDriver driver;

    public HomePage(){
        this.driver = Driver.getDriver();
    }

    public void open(){
        driver.get(homePageUrl);
    }

    public void clickLoginButton(){
        driver.findElement(buttonLogin).click();

    }
}
