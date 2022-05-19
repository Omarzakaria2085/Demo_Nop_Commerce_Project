package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class ProductAddToWishlist extends Base{
    public ProductAddToWishlist(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "add-to-wishlist-button-4")
    WebElement addToWishListButton;
    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[1]/table/tbody/tr/td[4]/a")
    WebElement wishListItem;
    public void clickOnAddToCart(){
        addToWishListButton.click();
    }
    public void checkItem(){
        SoftAssert soft = new SoftAssert();
        String expectedItem = "Apple MacBook Pro 13-inch";
        String actualItem = wishListItem.getText();
        soft.assertEquals(actualItem,expectedItem);
    }

}
