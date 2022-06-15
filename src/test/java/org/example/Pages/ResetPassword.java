package org.example.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class ResetPassword extends Base{

    public ResetPassword(WebDriver driver) {
        super(driver);
    }
    // Forget Button
    @FindBy(xpath = "//a[@href='/passwordrecovery']")
    WebElement forgetButton;
    // Email
    @FindBy(id = "Email")
    WebElement email;
    // Recover Button
    @FindBy(className = "password-recovery-button")
    WebElement recoveryButton;
    // Success Message
    @FindBy(xpath = "//p[@class='content']")
    WebElement banner;

    public void forgetBtnClick(){
        forgetButton.click();
    }

    public void enterEmail(String uEmail){
        email.sendKeys(uEmail);
    }

    public void recoverBtnClick (){
        recoveryButton.click();
    }

    public void resetSuccess(){
        SoftAssert soft = new SoftAssert();
        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = banner.getText();
        soft.assertEquals(actualResult, expectedResult);
    }
}
