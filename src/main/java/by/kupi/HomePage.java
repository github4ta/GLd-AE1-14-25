package by.kupi;

import by.booklover.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final String HOME_URL = "https://kupi.by/";
    private final By ENTER_BUTTON = By.xpath("//li[@class='main-controls__item'][1]/button[@class='button-main-controls']");
    private final By COOKIES_ACCEPT = By.xpath("//button[@class='https://kupi.by/']");
    public final By COMPANY_NAME = By.xpath("//div[@class='footer__info footer-info']");

    public final String COMPANY_NAME_IN_FOOTER = "ООО \"Дивный новый мир\"";

    private WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public void open() {
        driver.get(HOME_URL);
    }

    public void clickCookiesAccept() {
        driver.findElement(COOKIES_ACCEPT).click();
    }

    public void clickEnter() {
        driver.findElement(ENTER_BUTTON).click();
    }

    public String getCompanyNameInFooterText(){
        return driver.findElement(COMPANY_NAME).getText();
    }
}
