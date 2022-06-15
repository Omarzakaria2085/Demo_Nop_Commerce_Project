package org.example.StepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S05_SwitchCurrencies {
    org.example.Pages.SwitchCurrencies currencies;

    @When("Select Euro from currency dropdown list")
    public void switchCurrency(){
        currencies = new org.example.Pages.SwitchCurrencies(Hooks.driver);
        currencies.switchCurrency();
    }

    @Then("Price is Euro")
    public void priceIsEuro() {
        currencies.euroSelected();
    }
}
