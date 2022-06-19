package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.util.ArrayList;

import static pages.FollowUsPage.goToFacebook;
import static stepDefinition.Hooks.driver;

public class FollowUsStepDef {
    ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    @Then("user click icon link")
    public void goToLink() throws InterruptedException {

       // Hooks.scroll_down_to_products();

        goToFacebook().click();
        Thread.sleep(2000);
       Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
    }
    @And("user go to facebook")
    public void assertUrl(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }

}
