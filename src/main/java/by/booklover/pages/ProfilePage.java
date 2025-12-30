package by.booklover.pages;

import by.booklover.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {

    public final String PROFILE_URL = "https://booklover.by/personal/profile/";

    public final String TITLE_REGISTER_LABEL = "Зарегистрируйтесь или авторизуйтесь,\n" +
            "чтобы получить доступ к личнмому кабинету";
    public final String TEXT_AUTHORIZATION_LABEL = "Авторизация";
    public final String TEXT_REGISTRATION_LABEL = "Регистрация";

    public final By PROFILE_PAGE_TITLE = By.xpath("//p[@class='registration__important-text']");
    public final By AUTHORIZATION_BLOCK = By.xpath("//a[@class='registration__control registration__control--current']");
    public final By REGISTRATION_BLOCK = By.xpath("//a[@class='registration__control']");

    private final By TITLE_REGISTER_TEXT = By.xpath("//p[@class='registration__important-text']");
    private final By AUTHORIZATION_TEXT = By.xpath("//a[@class='registration__control registration__control--current']");
    private final By REGISTRATION_TEXT = By.xpath("//a[@class='registration__control']");

    private WebDriver driver;

    public ProfilePage() {
        this.driver = Driver.getDriver();
    }

    public String getProfilePageTitleText() {
        return driver.findElement(PROFILE_PAGE_TITLE).getText();
    }

    public String getTitleRegisterText() {
        return driver.findElement(TITLE_REGISTER_TEXT).getText();
    }

    public boolean isAuthorizationBlockDisplayed() {
        return driver.findElement(AUTHORIZATION_BLOCK).isDisplayed();
    }

    public String getAuthorizationText() {
        return driver.findElement(AUTHORIZATION_TEXT).getText();
    }

    public boolean isRegistrationBlockDisplayed() {
        return driver.findElement(REGISTRATION_BLOCK).isDisplayed();
    }

    public String getRegistrationText() {
        return driver.findElement(REGISTRATION_TEXT).getText();
    }
}
