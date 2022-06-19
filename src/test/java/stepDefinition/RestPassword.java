package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.LogInPage.clickLogin;
import static pages.RegistrationPage.emailAddress;
import static pages.RestPasswordPage.*;
import static stepDefinition.Reg.email;

public class RestPassword {
    @Given("user clicks on forgot password")
    public void forgetPassword(){
        clickLogin().click();
        clickOnForgetPassword().click();
    }
    @When("user enters his valid email address")
    public void enterValidEmail(){
       emailAddress().sendKeys(email);

    }
    @And("user clicks on recover button")
    public void clickRecover(){
        clickOnRecoverButton().click();

    }
    @Then("user got a Displayed Message")
    public void showMessage(){
        Assert.assertTrue(messageOfRecover().isDisplayed());

    }
    @And("user could close the Notification Bar")
    public void closeMessage(){
        closeMessageOfRecover().click();





    }

}
