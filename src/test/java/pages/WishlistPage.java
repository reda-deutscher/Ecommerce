package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import stepDefinition.Hooks;

import static stepDefinition.Hooks.scroll;
import static stepDefinition.Hooks.scrollDown;


public class WishlistPage {


    public static WebElement addToWishlistIcon() throws InterruptedException {
        scroll();
        Thread.sleep(5000);
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }





    public static WebElement message() {
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

}
