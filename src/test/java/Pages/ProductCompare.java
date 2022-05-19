package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class ProductCompare extends Base{
    public ProductCompare(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/h2/a")
    WebElement firstProduct;
    @FindBy(xpath = "//*[@id='product-details-form']/div[2]/div[3]/div[2]/div[1]/div/div[2]/h2/a")
    WebElement secondProduct;
    @FindBy(xpath = "//*[@id='product-details-form']/div[2]/div[1]/div[2]/div[10]/div[2]/button")
    WebElement firstProductCompareButton;
    @FindBy(xpath = "//*[@id='product-details-form']/div[2]/div[1]/div[2]/div[9]/div[2]/button")
    WebElement secondProductCompareButton;
    @FindBy(xpath = "//div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[2]/a")
    WebElement secondItemCompare;
    @FindBy(xpath = "//div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[3]/a")
    WebElement firstItemCompare;
    public void navigateToFirstProduct(){
        firstProduct.click();
    }
    public void addFirstProductCompare(){
        firstProductCompareButton.click();
    }
    public void navigateToSecondProduct(){
        secondProduct.click();
    }
    public void addSecondProductCompare(){
        secondProductCompareButton.click();
    }
    public void compareItem(){
        SoftAssert soft = new SoftAssert();
        String expectedFirstItem = "Apple MacBook Pro 13-inch";
        String actualFirstItem = firstItemCompare.getText();
        soft.assertEquals(actualFirstItem,expectedFirstItem);
        String expectedSecondItem = "Samsung Series 9 NP900X4C Premium Ultrabook";
        String actualSecondItem = secondItemCompare.getText();
        soft.assertEquals(actualSecondItem,expectedSecondItem);
    }
}
