package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;
    String path = "C:\\Users\\redaa\\Downloads\\Compressed\\chromedriver.exe";

    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @After
    public void closeBrowser() {
        driver.quit();

    }

    public static void scrollDown() {
        JavascriptExecutor scrollToElle = (JavascriptExecutor) driver;
        scrollToElle.executeScript("scroll(0,2000)");

    }

    public static void scroll() {
        JavascriptExecutor scrollToElle = (JavascriptExecutor) driver;
        scrollToElle.executeScript("scroll(0,1000)");


    }
}
