package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class DriverUtil {
    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriver driver;
    public static Properties config;

    public static WebDriver initiateWebDriver(String browser) throws Exception {
        Properties driverConf = LoadConfigFile();

        final String property = System.getProperty("user.dir");
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", property + driverConf.getProperty("CHROME_DRIVERPATH"));
            System.out.println("driver path --> "+property+driverConf.getProperty("CHROME_DRIVERPATH"));
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", property + driverConf.getProperty("FIREFOX_DRIVERPATH"));
            driver = new FirefoxDriver();
        }else {
            driver=null;
        }
        return driver;
    }

    public static Properties LoadConfigFile() throws Exception {
        config = new Properties();
        String configFilePath = System.getProperty("user.dir") + "//src/main/resources/config.properties";
        config.load(new FileInputStream(new File(configFilePath)));
        return config;
    }
}
