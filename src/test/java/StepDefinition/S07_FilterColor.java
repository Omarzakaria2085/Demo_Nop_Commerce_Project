package StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S07_FilterColor {

    Pages.FilterColor filterColor;

    @When("User navigates to shoes category")
    public void navigateSubCat(){
        filterColor = new Pages.FilterColor(Hooks.driver);
        filterColor.openSubCategory();
    }

    @When("Filter by Red Color")
    public void filterByRedColor() {
        filterColor.filterRed();
    }

    @Then("Adidas items showed")
    public void adidasItemsShowed() {
        filterColor.redItem();
    }
}
