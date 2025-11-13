package by.it_academy.zaburunov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloMarkFormelle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://markformelle.by/");

        WebElement cookieAcceptButton = driver.findElement(By.id("js-submit-btn"));
        cookieAcceptButton.click();

        WebElement cartButton = driver.findElement(By.className("app-header__navbar-link app-desktop-visible js-basket-open"));
        cartButton.click();
    }
}
