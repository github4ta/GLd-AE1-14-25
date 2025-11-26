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
        driver.get("https://www.21vek.by");

        WebElement buttonCloseCookies = driver.findElement(By.xpath("//*[@id=\"modal-cookie\"]/div/div[2]/div[2]/button[2]"));
        buttonCloseCookies.click();
    }

    @Test
    public void test1() {
        WebElement text = driver.findElement(By.xpath("//div[@class='styles_legalInformationBlock__iXOVK']/div[2]"));

        Assertions.assertEquals("© 2004–2025 21vek.by, Общество с ограниченной ответственностью «Триовист», юр.адрес: " +
                "220020, Минск, пр. Победителей, 100, оф. 203 E-mail: 21@21vek.by",text.getText());
    }

    @Test
    public void test2(){
        WebElement acount = driver.findElement(By.xpath("//span[@class='userToolsText']"));

        Assertions.assertEquals("Аккаунт", acount.getText());
    }

    @Test
    public void test3(){
        WebElement search = driver.findElement(By.xpath("//input[@id='catalogSearch']"));
        String getAtributeText = search.getAttribute("placeholder");

        Assertions.assertEquals("Поиск товаров", getAtributeText);
    }

    @Test
    public void test4(){
        WebElement buttonCard = driver.findElement(By.xpath("//span[@class='headerCartLabel']"));

        Assertions.assertEquals("Корзина", buttonCard.getText());
    }

    @Test
    public void test5(){
        WebElement buttonCatalog = driver.findElement(By.xpath("//button[@class='styles_catalogButton__z9L_j']/span"));

        Assertions.assertEquals("Каталог товаров", buttonCatalog.getText());
    }

    @AfterEach
    public void closeBrowser(){
        driver.quit();
    }

}
