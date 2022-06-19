package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;

public class SliderPage {
    public static WebElement slider_1() {
        return Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]"));
    }

    public static WebElement slider_2() {
        return Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]"));
    }
}
