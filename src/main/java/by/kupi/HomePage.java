package by.kupi;

import by.kupi.driver.Driver;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
   // private static final Logger logger = LogManager.getLogger();

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

    public HomePage open(){
        driver.get(HOME_URL);
       // logger.info("Открылась домашняя страница");
        return this;
    }

    public HomePage clickCookie(){
        driver.findElement(COOKIE_PATH).click();
        //logger.info("Принимаем кукки");
        return this;
    }

    public LoginPage2 clickEnter(){
        driver.findElement(BUTTON_ENTER).click();
        return new LoginPage2();
    }

    public String textFooter(){
        return driver.findElement(FOOTER).getText();
    }

    public String getCompanyTextInFooter(){
        String companyTextInFooter = driver.findElement(FOOTER).getText();
        //logger.info("Текс компании футер равен: " + companyTextInFooter );
        return companyTextInFooter;
    }
}
