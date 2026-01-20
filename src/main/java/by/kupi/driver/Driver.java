package by.kupi.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private static final Logger logger = LogManager.getLogger();

    private static WebDriver driver;

    private Driver() {

    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();

        }
        logger.info("Создали хром-драйвер");
        return driver;
    }

    public static void quit() {
        if (driver != null) {
            driver.quit();
            driver = null;
            logger.info("Закрыли хром-драйвер");
        }
    }

    private static WebElement wait(String xpath) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        return  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    //метод для кликания на элементе
    public static void click(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void waitAndClick(String xpath) {
        wait(xpath).click();
    }

    //метод для заполнения поля текстом
    public static void input(String xpath, String text){
        driver.findElement(By.xpath(xpath)).sendKeys(text);
    }

    public static void waitAndInput(String xpath, String text){
        wait(xpath).sendKeys(text);
    }

    //метод возвращает текст для элемента
    public static String getText(String xpath){
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public static String waitAndGetText(String xpath){
        return wait(xpath).getText();
    }



}
