package pages;

import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

import static stepDefinition.Hooks.driver;
import static stepDefinition.Hooks.scroll_down_to_products;

public class FollowUsPage {
    public static WebElement goToFacebook(){
        scroll_down_to_products();

        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));

    }


}
