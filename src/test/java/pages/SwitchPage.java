package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import stepDefinition.Hooks;



public class SwitchPage {

    public static Select selectCurrency() {
        Select curr = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        curr.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fhtc-one-mini-blue");

        return curr;
    }



    public static String assertCurrency() {

     String euro= selectCurrency().toString();

        System.out.println(euro);
        return euro;
    }
}

