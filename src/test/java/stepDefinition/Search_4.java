package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

import static pages.SearchPage.*;

public class Search_4 {
    static String productName = "HTC";






    @When("user clicks on search field")
    public void LookingProduct(){
        clickOnSearchField().click();

    }
    @And("user searches with name of product")
    public void enterNameOfProduct(){
        enterName().sendKeys(productName);
        clickSearchButton().click();
    }
    @Then("user could find relative results")
    public void showProduct(){
        SearchPage.countOfProducts();

    }



}