package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
public class D01_registerStepDef {

    P01_register register = new P01_register();

    ////////Go to register page////////
    @Given("user go to register page")
    public void go_to_register()
    {
        register.registerlink().click();
    }

    ////////Select gender type////////

    @And("user select gender type")
    public void userSelectGenderType()
    {
        register.genderEl().click();
    }

    ////////FirstName And LastName////////

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstName, String lastName) {
        register.firstnameEl().sendKeys(firstName);
        register.lastnameEl().sendKeys(lastName);
    }


    ////////Birthday////////

    //Day
    @And("user enter date of birth {string} and {string} and {string}")
    public void userEnterDateOfBirth(String bdDD, String bdMM, String bdYY)
    {
        Select bd1 = new Select(register.bdDD());
        bd1.selectByValue(bdDD);

        //Month
        Select bd2 = new Select(register.bdMM());
        bd2.selectByValue(bdMM);


        //Year
        Select bd3 = new Select(register.bdYY());
        bd3.selectByValue(bdYY);
    }


    ////////Email////////
    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {

        register.emailEl().sendKeys(email);
    }


    ////////Password////////
    @And("user fills Password fields {string} {string}")
    public void userFillsPasswordFields(String pass1, String pass2)
    {
        register.pw1El().sendKeys(pass1);
        register.pw2El().sendKeys(pass2);
    }


    ////////Submit////////
    @And("user clicks on register button")
    public void userClicksOnRegisterButton()
    {
        register.submitEl().click();
    }


    ////////Success MSG////////
    @Then("success message is displayed")
    public void successMessageIsDisplayed() {

        SoftAssert soft = new SoftAssert();

        String exMSG = "Your registration completed";
        String acMSG = register.resultSucc().getText();
        String acColor = register.resultSucc().getCssValue("color");
        //System.out.println("Success MSG Color is : "+acColor);
        String exColor = "rgba(76, 177, 124, 1)";
        ///Soft Assert///
        soft.assertEquals(acMSG,exMSG,"Error : Registration not complete");
        soft.assertEquals(acColor,exColor,"Error : Success MSG Color not the same");
        //System.out.println("The Success MSG Color is : "+color);
        System.out.println(acMSG);

        soft.assertAll();
    }
}
