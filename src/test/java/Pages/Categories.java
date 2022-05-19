package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

public class Categories extends Base {
    public Categories(WebDriver driver) {
        super(driver);
        action= new Actions(driver);
    }
    @FindBy(xpath = "//div[6]/div[2]/ul[1]/li[2]/a")
    WebElement mainCategory;
    @FindBy (xpath = "//div[6]/div[2]/ul[1]/li[2]/ul/li[1]/a")
    WebElement subCategory;
    @FindBy (tagName = "h1")
    WebElement currentCategory;
    public void openSubCategory()
    {
        action.moveToElement(mainCategory).moveToElement(subCategory).click().build().perform();
    }
    public void checkCategory(){
        SoftAssert soft = new SoftAssert();
        String actualResult = currentCategory.getText();
        String expectedResult = "Camera & photo ";
        soft.assertEquals(actualResult,expectedResult);
    }
}
