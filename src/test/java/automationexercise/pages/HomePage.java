package automationexercise.pages;

import automationexercise.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//body")
    public WebElement body;

    @FindBy (partialLinkText = "Login")
    public WebElement signUpLogin;

    @FindBy (xpath = "//*[text()=' Logged in as '] ")
    public WebElement loggedIn;

    @FindBy(xpath = "//*[text()=' Delete Account']")
    public WebElement deleteAccount;





}
