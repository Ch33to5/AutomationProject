package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_Login {
    ////////Login Page////////
    public WebElement loginPageLink()
    {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    ////Email Box////
    public WebElement emailBox()
    {
        return Hooks.driver.findElement(By.cssSelector("input[class=\"email\"]"));
    }

    ////PW Box////
    public WebElement pwBox()
    {
        return Hooks.driver.findElement(By.cssSelector("input[class=\"password\"]"));
    }


    ////Submit////
    public WebElement submitBt()
    {
        return Hooks.driver.findElement(By.xpath("//button[@type=\"submit\"] [@class=\"button-1 login-button\"]"));
    }

    ////My Account ico////
    public WebElement icoAcc()
    {
        return Hooks.driver.findElement(By.className("ico-account"));
    }

    ////Fail MSG////
    public WebElement failMSG()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }

    ////Fail MSG Color////
    public WebElement failMSGColor()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }

}
