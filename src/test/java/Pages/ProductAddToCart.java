package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class ProductAddToCart extends Base{

    public ProductAddToCart(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a")
    WebElement productTitle;
    @FindBy(id = "add-to-cart-button-4")
    WebElement addToCartButton;
    @FindBy(xpath = "//*[@id='flyout-cart']/div/div[2]/div/div[2]/div[1]/a")
    WebElement addToCartItem;
    public void clickOnTitle(){
        productTitle.click();
    }
    public void clickOnAddToCart(){
        addToCartButton.click();
    }
    public void checkItem(){
        SoftAssert soft = new SoftAssert();
        String expectedItem = "Apple MacBook Pro 13-inch";
        String actualItem = addToCartItem.getText();
        soft.assertEquals(actualItem,expectedItem);
    }

}
