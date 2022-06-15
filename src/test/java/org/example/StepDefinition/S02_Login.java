package org.example.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S02_Login {
    org.example.Pages.Login login;

    @And("User navigates to the login page")
    public void user_navigates_to_login_page(){
        login= new org.example.Pages.Login(Hooks.driver);
        login.clickLogin();
    }

    @When("Enter Email {string} and Enter Password {string}")
    public void enterEmailAndEnterPassword(String arg0, String arg1) {
        login.validData(arg0, arg1);
    }

    @And("Click on login button")
    public void clickOnLoginButton() {
        login.loginSubmitButton.click();
    }

    @Then("User could login successfully")
    public void userCouldLoginSuccessfully() {
        login.navigateHome();
    }
}
