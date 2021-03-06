package org.example.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S06_Categories {
    org.example.Pages.Categories categories;
    @When("Hover on menu item and select Category")
    public void navigateSubCat(){
        categories = new org.example.Pages.Categories(Hooks.driver);
        categories.openSubCategory();
    }

    @Then("Category Page Opened")
    public void categoryPageOpened() {
        categories.checkCategory();
    }
}
