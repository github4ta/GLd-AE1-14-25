package by.booklover.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    public final String PAGE_URL = "https://booklover.by/personal/profile/";
    public final String PROFILE_PAGE_TITLE_TEXT = "Зарегистрируйтесь или авторизуйтесь,\nчтобы получить доступ к личнмому кабинету";

    public final By PROFILE_PAGE_TITLE = By.xpath("//p[@class='registration__important-text']");
    public final By AUTHORIZATION_BLOCK = By.xpath("//a[@class='registration__control registration__control--current']");
    public final By REGISTRATION_BLOCK = By.xpath("//a[@class='registration__control']");

    private WebDriver driver;
    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProfilePageTitleText() {
        return driver.findElement(PROFILE_PAGE_TITLE).getText();
    }

    public boolean isAuthorizationBlockDisplayed() {
        return driver.findElement(AUTHORIZATION_BLOCK).isDisplayed();
    }

    public boolean isRegistrationBlockDisplayed() {
        return driver.findElement(REGISTRATION_BLOCK).isDisplayed();
    }
}
