package org.example.StepDefinition;

import org.example.Pages.ProductCompare;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S11_ProductCompare {

    org.example.Pages.ProductCompare productCompare;

    @When("Click on First Product Title")
    public void ClickonFirstProductTitle(){
        productCompare = new ProductCompare(Hooks.driver);
        productCompare.navigateToFirstProduct();
    }

    @And("Click on add to compare button in first product page")
    public void clickOnAddToCompareButtonInProductPage() throws InterruptedException {
        productCompare.addFirstProductCompare();
        Thread.sleep(2000);
    }

    @And("Click on second product title")
    public void clickOnSecondProductTitle() throws InterruptedException {
        productCompare.navigateToSecondProduct();
        Thread.sleep(2000);
    }

    @And("Click on add to compare button in second product page")
    public void clickOnAddToCompareButtonInSecondProductPage() throws InterruptedException {
        productCompare.addSecondProductCompare();
        Thread.sleep(2000);
    }

    @And("User navigates to compare page")
    public void userNavigatesToComparePage() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
    }

    @Then("Products shown in his compare list")
    public void productsShownInHisCompareList() {
        productCompare.compareItem();
    }
}
