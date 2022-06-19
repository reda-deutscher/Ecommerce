package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static pages.SelectDifferentCategories.mainMenuElement;
import static pages.SelectDifferentCategories.subMenuElement;
import static stepDefinition.Hooks.driver;

public class SelectDifferentCategories {
    SoftAssert verifyAssert = new SoftAssert();



    @Given("user select random category")
    public void user_select_random_category() {
        Actions actions = new Actions(driver);
        actions.moveToElement(mainMenuElement());
        actions.moveToElement(subMenuElement());

        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        actions.click().build().perform();
    }

    @Then("user should redirected to the page of the selected category")
    public void selected_category() {
        String expectedResult = "https://demo.nopcommerce.com/software";
        verifyAssert.assertEquals(driver.getCurrentUrl(), expectedResult, "Wrong Page");
        verifyAssert.assertAll();
    }

}
