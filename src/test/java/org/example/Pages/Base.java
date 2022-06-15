package org.example.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Base {
    WebDriver driver = null;
    public Actions action;
    public Base(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
