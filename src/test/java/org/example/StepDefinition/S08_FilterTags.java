package org.example.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S08_FilterTags {

    org.example.Pages.FilterTags filterTags;

    @When("Filter by Cool Tag")
    public void clickonTag(){
        filterTags = new org.example.Pages.FilterTags(Hooks.driver);
        filterTags.clickTag();
    }

    @Then("User navigates to cool tag page")
    public void navigateCool(){
        filterTags.navigatetoTag();
    }


}
