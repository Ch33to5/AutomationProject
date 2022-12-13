package org.example.stepDefs;
import io.cucumber.java.en.Given;
import org.example.pages.P00_HomePage;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
public class D08_WishlistStepDef
{
    P00_HomePage home = new P00_HomePage();

    @Given("Added to wishlist Success")
    public void wishlistSuccess() {
        home.wishlistBtn().click();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(home.wishlistSuccessMSG().isDisplayed(),"Error : Item not added to Wishlist");

        String msgColor = home.successMsgColor().getCssValue("background-color");

        String acColor = Color.fromString(msgColor).asHex();
        String exColor = "#4bb07a";

        //System.out.println("Success MSG Color is : "+acColor);

        soft.assertTrue(acColor.equals(exColor),"Error : Success MSG not the same color");

        soft.assertAll();
    }

    /////////////////////////////////////////////////////////

    @Given("Wishlist Qty Verify")
    public void wishlistQtyVerify() throws InterruptedException {
        home.wishlistBtn().click();

        Thread.sleep(5000);

        home.wishlistLink().click();

        int qty = Integer.parseInt(home.qtyNum().getAttribute("value"));
        Assert.assertTrue(qty > 0);
    }
}
