package by.booklover.pages;

import by.booklover.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    public final String CART_URL = "https://booklover.by/personal/cart/";

    public final String YOUR_CART_EMPTY_TEXT = "Ваша корзина пуста";
    public final String CLICK_HERE_CONTINUE_SHOPPING_TEXT = "Нажмите здесь, чтобы продолжить покупки";

    public final By YOUR_CART_EMPTY_BLOCK = By.xpath ("//div[@class='bx-sbb-empty-cart-text']");
    public final By CLICK_HERE_CONTINUE_SHOPPING_BLOCK = By.xpath("//div[@class='bx-sbb-empty-cart-desc']");

    private WebDriver driver;

    public CartPage() {
        this.driver = Driver.getDriver();
    }

    public String getCartPageYourCartEmptyText(){
        return driver.findElement(YOUR_CART_EMPTY_BLOCK).getText();
    }

    public boolean isYourCartEmptyDisplayed() {
        return driver.findElement(YOUR_CART_EMPTY_BLOCK).isDisplayed();
    }

    public String getCartPageClickHereContinueShoppingBlock() {
        return driver.findElement(CLICK_HERE_CONTINUE_SHOPPING_BLOCK).getText();
    }

    public boolean isContinueShoppingBlockDisplayed() {
        return driver.findElement(CLICK_HERE_CONTINUE_SHOPPING_BLOCK).isDisplayed();
    }
}
