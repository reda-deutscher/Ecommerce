package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LogInPage;
import pages.SearchPage;

import static pages.LogInPage.*;
import static pages.SearchPage.*;
import static stepDefinition.Reg.email;
import static stepDefinition.Reg.pass;

public class Search {
    static String productName = "HTC";






    @When("logged user clicks on search field")
    public void LookingForProduct(){
        clickOnSearchField().click();

    }
    @And("logged user searches with name of product")
    public void enterNameOfProduct(){
        enterName().sendKeys(productName);
        clickSearchButton().click();
    }
    @Then("logged user could find relative results")
    public void showNameOfProduct(){
        SearchPage.countOfProducts();

    }



}