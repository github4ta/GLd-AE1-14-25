package by.vek;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountTest {
    WebDriver driver;

    @BeforeEach
    public void before() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.manage().window().maximize();
        driver.get("https://www.21vek.by/");
        WebElement acceptButton = driver.findElement(By.xpath("//*[@id=\"modal-cookie\"]/div/div[2]/div[2]/button[2]/div"));
        acceptButton.click();
        WebElement accountBtn = driver.findElement(By.xpath("//button[@class='styles_userToolsToggler__c2aHe']"));
        accountBtn.click();
        WebElement enterBtn = driver.findElement(By.xpath("//button[@data-testid=\"loginButton\"]"));
        enterBtn.click();
    }

    @Test
    public void test1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class=\"LoginForm_title__OAEXy Text-module__text Text-module__large Text-module__bold\"]"), "Вход"));
        WebElement enterText = driver.findElement(By.xpath("//div[@class=\"LoginForm_title__OAEXy Text-module__text Text-module__large Text-module__bold\"]"));
        Assertions.assertEquals("Вход", enterText.getText());
    }

    @AfterEach
    public void afterEach() {
//        driver.quit();
    }

//    @Test
//    public void test2() {
//
//    }
 }
