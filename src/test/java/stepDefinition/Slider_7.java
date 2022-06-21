package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static pages.SliderPage.firstSlider;
import static pages.SliderPage.slider_2;

public class Slider_7 {
    @When("user clicks on first slider")
    public void first_slider()  {
        firstSlider().click();



        }
        @Then("relative product for first slider")
                public void first_Slider() throws InterruptedException {
            Thread.sleep(3000);
            Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
        }
    @When("user clicks on second slider")
    public void second_slider()  {
        slider_2().click();



    }
    @Then("relative product for second slider")
    public void second_Slider() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demoo.nopcommerce.com/iphon_s6");
    }






        }






