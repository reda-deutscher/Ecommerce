package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.SwitchPage.*;

public class Switch_8 {
    @When("select a currency")
    public void switchBetweenCurrencies(){
        selectCurrency();

    }

    @Then("user could find the selected currency")
    public void currentCurrency(){
        Assert.assertTrue(assertCurrency().contains("Euro"));

    }



}
