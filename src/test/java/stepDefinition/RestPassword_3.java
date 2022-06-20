package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.LogInPage.clickLogin;
import static pages.RegistrationPage.emailAddress;
import static pages.RestPasswordPage.*;
import static stepDefinition.Reg_1.email;

public class RestPassword_3 {
    @Given("user clicks on forgot password")
    public void forgetPassword(){
        clickLogin().click();
        clickOnForgetPassword().click();
    }
    @When("user enters his valid email address")
    public void enterEmail(){
       emailAddress().sendKeys(email);

    }
    @And("user clicks on recover button")
    public void clickRecoverButton(){
        clickOnRecoverButton().click();

    }
    @Then("user got a Displayed Message")
    public void showVerifyMessage(){
        Assert.assertTrue(messageOfRecover().isDisplayed());

    }
    @And("user close the Notification Bar")
    public void closeMessage(){
        closeMessageOfRecover().click();





    }

}
