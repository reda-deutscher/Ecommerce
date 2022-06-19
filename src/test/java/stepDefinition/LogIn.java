package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LogInPage;

import static pages.LogInPage.*;
import static stepDefinition.Hooks.driver;
import static stepDefinition.Reg.email;
import static stepDefinition.Reg.pass;

public class LogIn {
    @Given("user navigates to login page")
    public void openLoginPage(){
        clickLogin().click();

    }
    @When("user can login with valid email and valid password")
    public void logInWithValidData(){
        enterEmailAddress().sendKeys(email);
        enterPasswordAddress().sendKeys(pass);

    }
    @Then("user could login successfully")
    public void clickLoginButton(){
        LogInPage.clickLoginButton().click();
    }
    @And("user in home page")
    public void openHomePage(){
        Assert.assertTrue(seeMyAccount().isDisplayed());


    }
}
