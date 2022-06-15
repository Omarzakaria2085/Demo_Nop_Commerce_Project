package org.example.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class Search extends Base{
    public Search(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "search-box-text")
    WebElement searchInput;

    @FindBy(className = "search-box-button")
    WebElement searchButton;

    @FindBy(xpath = "//h2[@class='product-title']/a")
    WebElement productName;

    public void searchForProduct(String uItem){
        searchInput.sendKeys(uItem);
    }

    public void clickSearch(){
        searchButton.click();
    }

    public void findProduct(String uItem){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(productName.getText(),uItem);
    }

}
