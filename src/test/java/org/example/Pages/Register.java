package org.example.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.Objects;

public class Register extends Base {
    public Register(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "ico-register")
    WebElement registrationButton;

    @FindBy(id = "gender-male")
    WebElement maleGenderRadio;
    @FindBy(id = "gender-female")
    WebElement femaleGenderRadio;

    @FindBy(id = "FirstName")
    WebElement fName;
    @FindBy(id = "LastName")
    WebElement lName;

    @FindBy(name = "DateOfBirthDay")
    WebElement birthDay;

    public Select getBirthDay() {
        return new Select(birthDay);
    }

    @FindBy(name = "DateOfBirthMonth")
    WebElement birthMonth;

    public Select getMonthDay() {
        return new Select(birthMonth);
    }

    @FindBy(name = "DateOfBirthYear")
    WebElement birthYear;

    public Select getYearDay() {
        return new Select(birthYear);
    }

    @FindBy(id = "Email")
    WebElement email;

    @FindBy(id = "Company")
    WebElement cName;

    @FindBy(id = "Newsletter")
    WebElement newLetter;

    @FindBy(id = "Password")
    WebElement password;
    @FindBy(id = "ConfirmPassword")
    WebElement passwordConfirm;

    @FindBy(id = "register-button")
    public WebElement regBtn;

    @FindBy(className = "result")
    WebElement successMessage;


    public void clickRegister(){
        registrationButton.click();
    }

    public void selectGender(String gender){
        if (Objects.equals(gender, "male")) {
            maleGenderRadio.click();
        } else if (Objects.equals(gender, "female")){
            femaleGenderRadio.click();
        } else {
            System.out.println("Wrong Gender");
        }
    }

    public void enterNames(String firstName, String lastName){
        fName.sendKeys(firstName);
        lName.sendKeys(lastName);
    }

    public void enterDate(String uDay, String uMonth, String uYear){
        getBirthDay().selectByVisibleText(uDay);
        getMonthDay().selectByVisibleText(uMonth);
        getYearDay().selectByVisibleText(uYear);
    }

    public void enterEmail(String umail){
        email.sendKeys(umail);
    }

    public void enterComName(String userComName){
        cName.sendKeys(userComName);
    }

    public void selectNews(String newsCheck){
        if (Objects.equals(newsCheck, "UnCheck")) {
            newLetter.click();
        } else {
            System.out.println("Check Newsletter");
        }
    }


    public void insertPassword(String uPassword, String uCPassword){
        password.sendKeys(uPassword);
        passwordConfirm.sendKeys(uCPassword);
    }


    public void successMsg(){
        SoftAssert soft = new SoftAssert();
        String expectedResult = "Your registration completed";
        String actualResult = successMessage.getText();
        soft.assertEquals(actualResult, expectedResult);
        String actualBannerColor = successMessage.getCssValue("color");
        String expectedBannerColor = "rgba(76, 177, 124, 1)";
        soft.assertEquals(actualBannerColor, expectedBannerColor);
    }
}
