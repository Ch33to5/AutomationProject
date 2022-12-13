package org.example.stepDefs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P00_HomePage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P00_HomePage home = new P00_HomePage();

    /////////Select Euro/////////
    @Given("user select euro")
    public void userSelectEuro()
    {
        Select select = new Select(home.currencyEl());
        select.selectByVisibleText("Euro");
    }

    ///////////Euro displayed on all products////////////
    @Then("euro is displayed on all products")
    public void euroIsDisplayedOnAllProducts()
    {
        for (int x= 0 ; x < home.products().size(); x++)
        {
            String value = home.prices().get(x).getText();
            System.out.println(value);
            String euroSign = "€";
            Assert.assertTrue(value.contains(euroSign),"Error : The Currency is not Euro");
        }
    }
}
