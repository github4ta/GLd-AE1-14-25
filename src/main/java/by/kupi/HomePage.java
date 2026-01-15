package by.kupi;

import by.booklover.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final String HOME_URL = "https://kupi.by";
    public final By COOKIE_PATH = By.xpath("//div[@id='ck-pup-default']/div[@class='pup-ck__buttons']/button[@class='pup-ck__button pup-ck__button--primary']");
    public final By BUTTON_ENTER = By.xpath("//li[@class='main-controls__item'][1]/button[@class='button-main-controls']");
    public final By FOOTER = By.xpath("//div[@class='footer__info footer-info']");
    public final By COMPANY_NAME_IN_FOOTER =
            By.xpath("//div[@class='container footer__container']//text()[contains(.,'ООО')]");
    private WebDriver driver;

    public final String COMPANY_NAME_IN_FOOTER_TEXT = "ООО \"Дивный новый мир\"";

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public void open(){
        driver.get(HOME_URL);
    }

    public void clickCookie(){
        driver.findElement(COOKIE_PATH).click();
    }

    public void clickEnter(){
        driver.findElement(BUTTON_ENTER).click();
    }

    public String textFooter(){
        return driver.findElement(FOOTER).getText();
    }

    public String getCompanyTextInFooter(){
        return driver.findElement(FOOTER).getText();
    }
}
