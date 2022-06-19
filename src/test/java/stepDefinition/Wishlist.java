package stepDefinition;

import io.cucumber.java.en.And;
import org.testng.Assert;

import static pages.WishlistPage.addToWishlistIcon;
import static pages.WishlistPage.message;

public class Wishlist {

    @And("user selects his favorite product")
    public void addProduct(){
        addToWishlistIcon().click();
    }

        @And("user adds a product to the Wishlist")
        public void verifyMessage(){
            Assert.assertTrue(message().isDisplayed());

        }

}
