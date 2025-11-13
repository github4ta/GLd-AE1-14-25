package by.it_academy.tretyak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloOnliner {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        WebElement acceptCookies = driver.findElement(By.id("submit-button"));
        acceptCookies.click();

        WebElement enterButtonPress = driver.findElement(By.xpath("#userbar > div:nth-child(2) > div > div > div.auth-bar__item.auth-bar__item--text"));
//        WebElement enterButtonPress = driver.findElement(By.xpath("//div[contains(@class, 'auth-bar__item auth-bar__item--text') and contains (text(), 'Вход')]"));
//        WebElement enterButtonPress = driver.findElement(By.className("auth-bar__item auth-bar__item--text"));
        enterButtonPress.click();


    }
}