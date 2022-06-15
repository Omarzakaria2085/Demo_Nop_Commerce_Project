package org.example.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class FilterTags extends Base {
    public FilterTags(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//li/a[@href='/cool']")
    WebElement coolTag;
    public void clickTag(){
        coolTag.click();
    }
    public void navigatetoTag(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals("https://demo.nopcommerce.com/cool",driver.getCurrentUrl());
    }
}
