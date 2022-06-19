package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepDefinition.Hooks;



public class SelectDifferentCategories {


public static WebElement mainMenuElement() {
    return Hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]"));
}

    public static WebElement subMenuElement() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/software\"]"));
    }
    }
