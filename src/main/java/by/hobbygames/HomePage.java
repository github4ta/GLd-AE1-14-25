package by.hobbygames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public By buttonLogin = By.xpath("//a[@href='/login']");
    public String urlHomePage = "https://hobbygames.by";
    public WebDriver driver;

    public HomePage() {
        this.driver = Driver.getDriver();
    }

    public void open(){
        driver.navigate().to(urlHomePage);
    }

    public void clickButonLogin(){
        driver.findElement(buttonLogin).click();
    }
}
