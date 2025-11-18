package by.booklover;

import by.booklover.utils.Waits;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollTest {

    @Test
    public void testScroll() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://booklover.by/");
        for (int i = 0; i < 10; i++) {
            Waits.waitFor(100);
            new Actions(driver).scrollByAmount(0, 156).perform();
        }
    }

    @Test
    public void testSearch() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://booklover.by/");
        WebElement searchInput = driver.findElement(By.xpath("//input[@id='search']"));
        searchInput.click();
//        new Actions(driver).sendKeys("макконахи").sendKeys(Keys.ENTER).perform();
        String attr = driver.switchTo().activeElement().getTagName();
        System.out.println(attr);
    }
}
