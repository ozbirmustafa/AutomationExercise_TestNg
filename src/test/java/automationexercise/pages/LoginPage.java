package automationexercise.pages;

import automationexercise.utilites.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@data-qa='signup-name'] ")
    public WebElement name;

    @FindBy (xpath = "(//*[@name='email'])[2]")
    public WebElement newEmail;

    @FindBy (xpath = "//button[text()='Signup']")
    public WebElement signUp;

    @FindBy (xpath =  "//*[.='New User Signup!']")
    public WebElement newUserText;



}
