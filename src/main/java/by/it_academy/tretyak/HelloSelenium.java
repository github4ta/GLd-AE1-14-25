package by.it_academy.tretyak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://evroopt.by/");
        WebElement buttonAcceptCookies = driver.findElement(By.xpath("/html/body/main/div[1]/div[4]/div/div/div/div/div[3]/button[2]"));
//        WebElement buttonAcceptCookies = driver.findElement(By.className("Button_button__6mIH_"));
        buttonAcceptCookies.click();
//        WebElement webElement = driver.findElement(By.className(""));
//        driver.quit();


    }
}
