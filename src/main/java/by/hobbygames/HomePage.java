package by.hobbygames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public By buttonLogin = By.xpath("//a[@href='/login']");
    public String urlHomePage = "https://hobbygames.by";
    public WebDriver driver;

    private final By COOKIE_ACCEPT_BTN = By.xpath("//div[@class='cookie-banner__button']/button");

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public void open(){
        driver.navigate().to(urlHomePage);
    }

    public void clickCookieBtn() {
        driver.findElement(COOKIE_ACCEPT_BTN).click();
    }

    public void clickButonLogin(){
        driver.findElement(buttonLogin).click();
    }
}
