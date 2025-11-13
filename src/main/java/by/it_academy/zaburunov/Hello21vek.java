package by.it_academy.zaburunov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hello21vek {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://21vek.by");

        WebElement buttonCloseCookies = driver.findElement(By.xpath("//*[@id=\"modal-cookie\"]/div/div[2]/div[2]/button[2]"));
        buttonCloseCookies.click();

        WebElement account = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div/div[3]/div/button"));
        account.click();

        WebElement enter = driver.findElement(By.xpath("//*[@id=\"stickyHeader\"]/div/div[3]/div/div/div[1]/div[2]/button"));
        enter.click();

        WebElement email = driver.findElement(By.xpath("//*[@id=\"login-email\"]"));
        email.sendKeys("wdwad@wdd.com");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"login-password\"]"));
        password.sendKeys("12331231");

        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"modal\"]/div/div/div[2]/div/div/div/div[4" +
                "]/form/div/div[3]/button"));
        continueButton.click();
    }
}
