package org.example.stepDefs;
import io.cucumber.java.en.Given;
import org.example.pages.P00_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.Random;
public class D05_hoverCategories {
    static P00_HomePage home = new P00_HomePage();

    //////HOVER//////
    @Given("Hover")
    public void hoverCat() {

        Random random = new Random();
        int catNum = 1+random.nextInt(3);
        int subNum = 1+random.nextInt(3);

        Actions hover = new Actions(Hooks.driver);
        hover.moveToElement(home.cat(catNum)).perform();

        String exResultProductName = home.hoverRandom(catNum,subNum).getText().toLowerCase();
        ////Random click in the full Xpath with 2 variables////
        home.hoverRandom(catNum,subNum).click();

        String acResultPageTitle = home.pageTitle().getText().toLowerCase();
        //////Page Title Hard Assertion//////
        Assert.assertTrue(acResultPageTitle.contains(exResultProductName));
    }
}
