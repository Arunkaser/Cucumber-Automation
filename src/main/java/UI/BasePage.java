package UI;

import Pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class BasePage {
    private SearchPage loginPage = new SearchPage(DriverUtil.getDriver());
    private static WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), 10);

    public static void LaunchUrl() throws InterruptedException {
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(3000);
        DriverUtil.getDriver().get("https://google.com");

    }

    public static void enterText(By element, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        DriverUtil.getDriver().findElement(element).sendKeys(text);
    }

    public static void clickOnElement(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        DriverUtil.getDriver().findElement(element).click();
    }

    public static List<WebElement> getListOfElement(By element){
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
        return DriverUtil.getDriver().findElements(element);
    }
}
