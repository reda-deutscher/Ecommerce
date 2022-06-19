package stepDefinition;
import stepDefinition.Hooks;

import io.cucumber.java.en.Given;

import static pages.SliderPage.slider_1;
import static pages.SliderPage.slider_2;

public class Slider {
    @Given("user select nivo control")
    public void user_select_nivo_control() {

        String linkClass_1 = slider_1().getAttribute("class");
        String linkClass_2 = slider_2().getAttribute("class");

        if (linkClass_1.contains("active")) {
            slider_2().click();
            System.out.println("click on second link");
        }



        if (linkClass_2.contains("active")) {
            slider_1().click();
            System.out.println("click on first link");
        }




    }
}
