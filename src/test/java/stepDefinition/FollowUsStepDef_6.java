package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.FollowUsPage;

import java.util.ArrayList;

import static pages.FollowUsPage.goToFacebook;
import static stepDefinition.Hooks.driver;

public class FollowUsStepDef_6 {
    ArrayList<String> Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
    @Given("user click icon link")
    public void goToLink() throws InterruptedException {
        goToFacebook().click();
        Thread.sleep(2000);
       Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
    }

    @And("user go to facebook")
    public void assertUrl(){
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
    }
    @Then("go to home page")
    public void goToHome() throws InterruptedException {


        Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(0));
        Thread.sleep(2000);
    }
    @Given("user click twitter icon link")
    public void goToTwitter() throws InterruptedException {
       FollowUsPage.goToTwitter().click();
        Thread.sleep(2000);
        Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
    }

    @And("user go to twitter")
    public void assertTwitterUrl() throws InterruptedException {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");

    }

}
