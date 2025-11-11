package by.it_academy.sinkevich;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebDriver.Timeouts;

import java.time.Duration;

public class HelloSelenium {
    public static void main(String[] args) {
        WebDriver webDriver = new EdgeDriver();

        webDriver.manage().window().maximize();

/*
        webDriver.get("https://markformelle.by");
        WebElement btton = webDriver.findElement(By.id("js-submit-btn"));
        btton.click();

        WebElement bttBox = webDriver.findElement(By.xpath("/html/body/div[4]/header/div[2]/div[4]/nav/a[2]"));
        bttBox.click();
*/
 /*
        webDriver.get("https://svyatoslav.biz/testlab/wt/index.php");
        WebElement inptName = webDriver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[2]/td[2]/input"));
        inptName.sendKeys("ivanov");
        WebElement inptHeight = webDriver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[3]/td[2]/input"));
        inptHeight.sendKeys("180");
        WebElement inptWeight = webDriver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[4]/td[2]/input"));
        inptWeight.sendKeys("80");
        WebElement inptGender = webDriver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[5]/td[2]/input[2]"));
        inptGender.click();
        WebElement inptResult = webDriver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/form/table/tbody/tr[6]/td/input"));
        inptResult.click();
     */

/*
        webDriver.get("https://www.google.com");
        WebElement inpt = webDriver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
        inpt.sendKeys("hi");

 */
        webDriver.get("https://catalog.onliner.by");

        WebElement bttonCokie = webDriver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
        bttonCokie.click();

        timeouts().implicitlyWait(Duration.ofSeconds(1));

        WebElement bttonEnter = webDriver.findElement(By.xpath("//*[@id=\"container\"]/div/div/header/div[3]/div/div[2]/div[3]/div[2]/div[1]/div[1]"));
        bttonEnter.click();

        WebElement inptLogin = webDriver.findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input"));
        inptLogin.sendKeys("qwerty");

        WebElement inptPassword = webDriver.findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/input"));
        inptPassword.sendKeys("qwerty");

        WebElement bttBox = webDriver.findElement(By.xpath("//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button"));
        bttBox.click();


    }

    private static Timeouts timeouts() {

        return null;
    }


}
