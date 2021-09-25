package UI;

import Pages.LoginPage;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;


public class BasePage {
    private LoginPage loginPage = new LoginPage(DriverUtil.getDriver());

    public static void LaunchUrl(){
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        DriverUtil.getDriver().get("https://amazon.com");

    }
}
