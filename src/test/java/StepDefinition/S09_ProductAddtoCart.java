package StepDefinition;

import Pages.ProductAddToCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S09_ProductAddtoCart {

    ProductAddToCart productAddtoCart;

    @When("Click on product title")
    public void clickOnProductTitle() {
        productAddtoCart = new ProductAddToCart(Hooks.driver);
        productAddtoCart.clickOnTitle();
    }

    @And("Click on add to cart button in single product page")
    public void clickOnAddToCartButtonInSingleProductPage() throws InterruptedException {
        productAddtoCart = new ProductAddToCart(Hooks.driver);
        productAddtoCart.clickOnAddToCart();
        Thread.sleep(2000);
    }

    @Then("Product shown in his cart")
    public void productShownInHisAddToCart() {
        productAddtoCart.checkItem();
    }
}
