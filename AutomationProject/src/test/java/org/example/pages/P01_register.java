package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    //// create WebElement method to register button ////
    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }

    ////////Select Gender////////
    public WebElement genderEl()
    {
        return Hooks.driver.findElement(By.className("forcheckbox"));
    }


    ////////Firstname////////
    public WebElement firstnameEl()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }

    //////lastname//////
    public WebElement lastnameEl()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }

    ////////Birthday////////

    //Day
    public WebElement bdDD()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));

    }

    //Month
    public WebElement bdMM()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));

    }

    //Year
    public WebElement bdYY()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));

    }


    ////////Email////////
    public WebElement emailEl()
    {
        return Hooks.driver.findElement(By.cssSelector("input[data-val-required=\"Email is required.\"]"));
    }


    ////////Password 1////////
    public WebElement pw1El()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }


    ////////Password 2////////
    public WebElement pw2El()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }

    ////////Submit////////
    public WebElement submitEl()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }

    ///////Success//////
    public WebElement resultSucc()
    {
        return Hooks.driver.findElement(By.className("result"));
    }

}
