package org.example.StepDefinition;

import org.example.Pages.ProductAddToWishlist;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class S10_ProductAddtoWishlist {

    ProductAddToWishlist productAddtoWishlist;

    @And("Click on wishlist icon in single product page")
    public void clickOnWishlistButtonInSingleProductPage() throws InterruptedException {
        productAddtoWishlist = new ProductAddToWishlist(Hooks.driver);
        productAddtoWishlist.clickOnAddToCart();
        Thread.sleep(2000);
    }

    @And("User navigates to wishlist")
    public void userNavigatesToWishlist() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/wishlist");
    }

    @Then("Product shown in his wishlist")
    public void productShownInHisWishlist() {
        productAddtoWishlist.checkItem();
    }

}
