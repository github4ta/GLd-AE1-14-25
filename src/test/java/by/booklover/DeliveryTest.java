package by.booklover;

import by.booklover.pages.DeliveryPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// TODO Рефакторить класс: убрать переменную класса driver,
// TODO переписать конструктор DeliveryPage() по аналогии с конструктором HomePage()
// TODO метод AfterEach переписать с использованием метода quite() класса Driver
public class DeliveryTest {
    private WebDriver driver;
    private DeliveryPage deliveryPage;

    @BeforeEach
    public void setupDriverOpenDeliveryPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        deliveryPage = new DeliveryPage(driver);
        deliveryPage.open();
    }

    @Test
    public void testTitleLabel() {
        Assertions.assertEquals(deliveryPage.TITLE_LABEL,deliveryPage.titleGetText());
    }

    @Test
    public void testTextblockAdministrationLabel1() {
        Assertions.assertEquals(deliveryPage.TEXTBLOCK_ADMINISTRATION_LABEL1,deliveryPage.textblockAdministrationLabel1GetText());
    }

    @Test
    public void testTextblockAdministrationLabel2() {
      Assertions.assertTrue(deliveryPage.textblockAdministrationLabel2GetText().contains(deliveryPage.TEXTBLOCK_ADMINISTRATION_LABEL2));
    }

    @Test
    public void testTextblockGmailLabel1() {
        Assertions.assertEquals(deliveryPage.TEXTBLOCK_GMAIL_LABEL1,deliveryPage.textblockGmailLabel1GetText());
    }

    @Test
    public void testTextblockGmailLabel2() {
       Assertions.assertEquals(deliveryPage.TEXTBLOCK_GMAIL_LABEL2,deliveryPage.textblockGmailLabel2GetText());
    }

    @AfterEach
    public void quitDriver() {
        driver.quit();
    }
}
