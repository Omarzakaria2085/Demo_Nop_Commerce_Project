package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;


public class Login extends Base {

    public Login(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "ico-login")
    WebElement loginButton;
    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "Password")
    WebElement password;
    @FindBy(className= "login-button")
    public
    WebElement loginSubmitButton;
    public void clickLogin(){
        loginButton.click();
    }
    public void validData(String uMail, String uPassword){
        email.clear();
        password.clear();
        email.sendKeys(uMail);
        password.sendKeys(uPassword);
    }
    public void navigateHome(){
        SoftAssert soft = new SoftAssert();
        soft.assertEquals("https://demo.nopcommerce.com/",driver.getCurrentUrl());
    }

}
