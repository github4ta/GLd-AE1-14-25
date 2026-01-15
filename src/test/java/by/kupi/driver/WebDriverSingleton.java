package by.kupi.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSingleton {
    private static WebDriver instance;

    private WebDriverSingleton() {

    }

    public static synchronized WebDriver getInstance() {
        if (instance == null) {
            ChromeOptions options = new ChromeOptions();

            instance = new ChromeDriver(options);
        }
        return instance;
    }

    public static synchronized void quitDriver() {
        if (instance != null) {
            instance.quit();
            instance = null;
        }
    }
}
