package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P00_HomePage {

    ////////Currency////////
    public WebElement currencyEl() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    /////////Prices///////

    public List<WebElement> prices()
    {
        List<WebElement> prices = Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));
        return prices;
    }

    ////////Search Box////////
    public WebElement searchBox() {
        return Hooks.driver.findElement(By.cssSelector("input[id=\"small-searchterms\"]"));
    }

    ////////Search Button////////
    public WebElement searchBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    ////////Product Button////////
    public WebElement productEl()
    {
        return Hooks.driver.findElement(By.xpath("//h2/a"));
    }

    ////////Products////////
    public List<WebElement> products()
    {
        List<WebElement> products = Hooks.driver.findElements(By.className("product-title"));
        return products;
    }

    ///////////SKU Locator///////////
    public WebElement skuEl()
    {
        return Hooks.driver.findElement(By.xpath("//div[@class=\"sku\"]//span[@class=\"value\"]"));
    }

    //////////Main Categories//////////
    public WebElement cat(int catNum) {
        return Hooks.driver.findElement(By.xpath("//div[6]/div[2]/ul[1]/li["+catNum+"]/a"));
    }

    /////HOVER/////
    public WebElement hoverRandom(int catNum, int subNum)
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li["+catNum+"]/ul/li["+subNum+"]/a"));
    }

    ////////Page Title////////
    public WebElement pageTitle()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"] h1"));
    }

    ////////////////////////////////////////Slider///////////////////////////////////////////////////

    //////////1st Slider/////////
    public WebElement slider1()
    {
        return Hooks.driver.findElement(By.xpath("//div[3]/div/div/div/div/div[1]/div[2]/a[1]"));
    }

    //////////2nd Slider/////////
    public WebElement slider2()
    {
        return Hooks.driver.findElement(By.xpath("//div[3]/div/div/div/div/div[1]/div[2]/a[2]"));
    }


    ////////////////////////////////////////////Follow US////////////////////////////////////////////

    ///////////////Facebook///////////////
    public WebElement fbBtn()
    {
        return Hooks.driver.findElement(By.xpath("//div[4]/div[1]/ul/li[1]/a"));
    }

    ///////////////Twitter///////////////
    public WebElement twitterBtn()
    {
        return Hooks.driver.findElement(By.xpath("//div[4]/div[1]/ul/li[2]/a"));
    }
    ///////////////RSS///////////////
    public WebElement rssBtn()
    {
        return Hooks.driver.findElement(By.xpath("//div[4]/div[1]/ul/li[3]/a"));
    }
    ///////////////Youtube///////////////
    public WebElement youTubeBtn()
    {
        return Hooks.driver.findElement(By.xpath("//div[4]/div[1]/ul/li[4]/a"));
    }
    ////////////////////////////////////////////Wishlist////////////////////////////////////////////

    ///////////////Wishlist Btm////////////////
    public WebElement wishlistBtn()
    {
        return Hooks.driver.findElement(By.xpath("//div[3]/div/div[2]/div[3]/div[2]/button[3]"));
    }

    ///////Wishlist Success MSG///////
    public WebElement wishlistSuccessMSG()
    {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p"));
    }
    ///////////Success MSG Color/////////
    public WebElement successMsgColor()
    {
        return Hooks.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
    }
    /////////Wishlist link/////////
    public WebElement wishlistLink()
    {
        return Hooks.driver.findElement(By.xpath("//div[1]/div[2]/div[1]/ul/li[3]/a"));
    }
    ////////Qty////////
    public WebElement qtyNum()
    {
        return Hooks.driver.findElement(By.xpath("//table/tbody/tr/td[6]/input"));
    }
}
