package automationexercise.tests;

import automationexercise.pages.HomePage;
import automationexercise.pages.LoginPage;
import automationexercise.utilites.ConfigReader;
import automationexercise.utilites.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase02 {
HomePage homePage = new HomePage();
LoginPage loginPage = new LoginPage();

    @Test
    public void loginUserSuccesfully() {

//1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //3. Verify that home page is visible successfully
        Assert.assertTrue(homePage.body.isDisplayed());

        //4. Click on 'Signup / Login' button
        homePage.signUpLogin.click();



    }
}
