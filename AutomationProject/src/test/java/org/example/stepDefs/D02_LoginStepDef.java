package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_Login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_LoginStepDef {
    P02_Login login = new P02_Login();

    //Go To Login Page//

    @Given("user go to login page")
    public void go_to_login()
    {
        login.loginPageLink().click();
    }

    ////////////////////////Insert Valid Data////////////////////////
    @And("user login with valid {string}, {string}")
    public void userLoginWithValid(String email, String pw)
    {
        login.emailBox().sendKeys(email);
        login.pwBox().sendKeys(pw);
    }

    ////Submit////
    @And("user press on login button")
    public void userPressOnLoginButton()
    {
            login.submitBt().click();
    }

    ////////Success Verification////////
    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully()
    {
        SoftAssert soft = new SoftAssert();
        String exUrl = "https://demo.nopcommerce.com/";
        String acUrl = Hooks.driver.getCurrentUrl();
        soft.assertEquals(acUrl,exUrl);
        soft.assertTrue(login.icoAcc().isDisplayed(),"Error : You're Not Logged");
        soft.assertAll();
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////Insert inValid Data////////////////////////
    @And("user login with invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String invalidMail, String invalidPW)
    {
        login.emailBox().sendKeys(invalidMail);
        login.pwBox().sendKeys(invalidPW);
    }

    ////////Fail Verification////////
    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem()
    {
        SoftAssert soft = new SoftAssert();
        String exResult = "Login was unsuccessful.";
        String acResult = login.failMSG().getText();
        soft.assertTrue(acResult.contains(exResult),"Error : Unexpected Login Result");
        String acColor = login.failMSGColor().getCssValue("color");
        String exColor = "#e4434b";
        String x = Color.fromString(acColor).asHex();
        //System.out.println("MSG Color in HEX is : "+x);
        soft.assertTrue(x.equals(exColor),"Error : Wrong Color");

        soft.assertAll();
    }
}
