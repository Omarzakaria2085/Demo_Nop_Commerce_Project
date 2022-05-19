package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S03_ResetPassword {
    Pages.ResetPassword resetPassword;

    @Given("User clicks on forget password button")
    public void user_clicks_Forget_Password(){
        resetPassword = new Pages.ResetPassword(Hooks.driver);
        resetPassword.forgetBtnClick();
    }

    @When("Enter Email {string}")
    public void enterEmail(String uEmail) {
        resetPassword.enterEmail(uEmail);
    }

    @And("Click on recovery button")
    public void clickOnRecoverButton() {
        resetPassword.recoverBtnClick();
    }

    @Then("User will be able to reset his password successfully")
    public void userAbleToResetHisPasswordSuccessfully() {
        resetPassword.resetSuccess();
    }
}
