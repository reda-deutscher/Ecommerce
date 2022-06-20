package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LogInPage;

import static pages.LogInPage.*;
import static stepDefinition.Reg_1.email;
import static stepDefinition.Reg_1.pass;

public class LogIn_2 {
    @Given("user navigates to login page")
    public void openLoginPage(){
        clickLogin().click();

    }
    @When("user can login with valid email and valid password")
    public void loginWithValidData(){
        enterEmailAddress().sendKeys(email);
        enterPasswordAddress().sendKeys(pass);

    }
    @Then("user login successfully")
    public void clickLoginButton(){
        LogInPage.clickLoginButton().click();
    }
    @And("home page")
    public void openHomePage(){
        Assert.assertTrue(seeMyAccount().isDisplayed());


    }
}
