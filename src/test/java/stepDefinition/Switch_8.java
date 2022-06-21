package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.SwitchPage.*;
import static stepDefinition.Hooks.scrollDown;

public class Switch_8 {
    @When("select a currency")
    public void switchBetweenCurrencies(){
        selectCurrency().click();

    }

    @Then("user could find the selected currency")
    public void currentCurrency(){

        Assert.assertTrue(assertPrice().getText().contains("€"));

    }



}
