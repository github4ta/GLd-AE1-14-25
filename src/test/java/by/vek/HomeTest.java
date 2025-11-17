package by.vek;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {

    WebDriver driver;

    @BeforeEach
    public void before() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");

        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"modal-cookie\"]/div/div[2]/div[2]/button[2]/div"));
        acceptButton.click();
    }

    @Test
    public void test1() {
        WebElement siteDescriptionText = driver.findElement(By.xpath("//*[@id=\"footer-inner\"]/div/div/div[4]/div[2]"));

        Assertions.assertEquals("© 2004–2025 21vek.by, Общество с ограниченной ответственностью «Триовист», юр.адрес:" +
                " 220020, Минск, пр. Победителей, 100, оф. 203 E-mail: 21@21vek.by", siteDescriptionText.getText());
    }

    @Test
    public void test2() {
        WebElement button = driver.findElement(By.xpath("//button[@class='styles_userToolsToggler__c2aHe']/span"));

        Assertions.assertEquals("Аккаунт", button.getText());
    }

    @AfterEach
    public void closeBrowser() {
        driver.quit();
    }
}
