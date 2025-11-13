package by.it_academy.tretyak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloCalculator {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://svyatoslav.biz/testlab/wt/index.php");

        WebElement inputName = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        inputName.sendKeys("John Black");

        WebElement inputHeight = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        inputHeight.sendKeys("190");

        WebElement inputWeight = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        inputWeight.sendKeys("83");

        WebElement selectGender = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[1]"));
        selectGender.click();

        WebElement pressSubmitButton = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));;
        pressSubmitButton.click();
    }
}
