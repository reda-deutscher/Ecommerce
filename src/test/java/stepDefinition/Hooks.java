package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver =null;
    @Before
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\redaa\\IdeaProjects\\untitled2\\redaFwd\\newProject\\res\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

    }
    @After
    public void closeBrowser(){
       driver.quit();

    }
    public static void scroll_down_to_products() {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("scroll(0,2000)");

    }


}
