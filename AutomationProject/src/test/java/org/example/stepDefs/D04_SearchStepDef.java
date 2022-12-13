package org.example.stepDefs;
import io.cucumber.java.en.Given;
import org.example.pages.P00_HomePage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_SearchStepDef {
    P00_HomePage home = new P00_HomePage();

    /////////////////Search//////////////////
    @Given("user could search using {string}")
    public void userCouldSearchUsing(String productName)
    {
        home.searchBox().sendKeys(productName); //Write
        home.searchBtn().click(); //Click

        ////////Soft Assert////////
        SoftAssert soft = new SoftAssert();

        String exResult = "https://demo.nopcommerce.com/search?q=";
        String acResult = Hooks.driver.getCurrentUrl();
        soft.assertTrue(acResult.contains(exResult));

        soft.assertAll();

        ////////Count number of search////////
        int totalSearchItems = home.products().size();
        System.out.println("Total "+productName+" Search Result is : "+totalSearchItems);

        ////////Verify each result contains search word////////
        for (int x = 0 ; x < home.products().size(); x++)
        {
            String productSearchName = home.products().get(x).getText().toLowerCase();
            //System.out.println("Product name : "+productSearchName);
            SoftAssert count = new SoftAssert();
            count.assertTrue(productSearchName.contains(productName),"Error : one or more Products not found");

            count.assertAll();
        }
    }

    ////////////////Search By sku////////////////
    @Given("user could search using sku {string}")
    public void userCouldSearchUsingSku(String sku)
    {
        home.searchBox().sendKeys(sku); //Write
        home.searchBtn().click(); //Click search
        home.productEl().click(); //Click on the product
        ////////SKU Verification////////
        String acSKU = home.skuEl().getText();

        ////Hard Assert////
        Assert.assertEquals(acSKU,sku,"Error : SKU is not the same");
    }
}
