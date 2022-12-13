package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.P00_HomePage;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class D06_homeSlidersStepDef {
    P00_HomePage home = new P00_HomePage();
    /////////1st Slider//////////
    @Given("First Slider")
    public void firstSlider()
    {
        home.slider1().click();
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String acSlider1Link = Hooks.driver.getCurrentUrl();
        String exSlider1Link = "https://demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(acSlider1Link,exSlider1Link,"Error : Slider 1 Link is incorrect");
    }

    ////////2st Slider//////////
    @Given("Second Slider")
    public void secondSlider()
    {
        home.slider2().click();
        Hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        String acSlider2Link = Hooks.driver.getCurrentUrl();
        String exSlider2Link = "https://demo.nopcommerce.com/iphone-6";
        Assert.assertEquals(acSlider2Link,exSlider2Link,"Error : Slider 2 Link is incorrect");
    }
}
