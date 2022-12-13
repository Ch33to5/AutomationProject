package org.example.stepDefs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.example.pages.P00_HomePage;
import org.testng.Assert;
import java.util.ArrayList;


public class D07_followUsStepDef {
    P00_HomePage home = new P00_HomePage();

    //////////////////////Facebook/////////////////////////////////
    @Given("Facebook Link")
    public void facebookLink()
    {
        home.fbBtn().click();
    }

    //FB Verify//
    @And("Verify FB Link")
    public void verifyFBLink() throws InterruptedException
    {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);

        //Assertion//
        String exFBLink = "https://www.facebook.com/nopCommerce";
        String acFBLink = Hooks.driver.getCurrentUrl();
        Hooks.driver.close();
        Assert.assertEquals(acFBLink,exFBLink,"Error : Wrong Facebook Link");
    }

    ////////////////////////Twitter///////////////////////////////
    @Given("Twitter Link")
    public void twitterLink()
    {
        home.twitterBtn().click();
    }

    //Twitter Verify//
    @And("Verify Twitter Link")
    public void verifyTwitterLink() throws InterruptedException
    {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);

        //Assertion//
        String exTwLink = "https://twitter.com/nopCommerce";
        String acTwLink = Hooks.driver.getCurrentUrl();
        Hooks.driver.close();
        Assert.assertEquals(acTwLink,exTwLink,"Error : Wrong Twitter Link");
    }

    ////////////////////////RSS///////////////////////////////
    @Given("RSS Link")
    public void rssLink()
    {
        home.rssBtn().click();
    }

    //RSS Verify//
    @And("Verify RSS Link")
    public void verifyRSSLink() throws InterruptedException
    {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);

        //Assertion//
        String exRSSLink = "https://demo.nopcommerce.com/new-online-store-is-open";
        String acRSSLink = Hooks.driver.getCurrentUrl();
        Hooks.driver.close();
        Assert.assertEquals(acRSSLink,exRSSLink,"Error : Wrong RSS Link");
    }

    ////////////////////////YouTube///////////////////////////////
    @Given("Youtube Link")
    public void youtubeLink()
    {
        home.youTubeBtn().click();
    }

    //YouTube Verify//
    @And("Verify Youtube Link")
    public void verifyYoutubeLink() throws InterruptedException
    {
        Thread.sleep(2000);

        ArrayList<String> tabs = new ArrayList<>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));

        Thread.sleep(2000);

        //Assertion//
        String exYTLink = "https://www.youtube.com/user/nopCommerce";
        String acYTLink = Hooks.driver.getCurrentUrl();
        Hooks.driver.close();
        Assert.assertEquals(acYTLink,exYTLink,"Error : Wrong YouTube Link");
    }
}
