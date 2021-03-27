package com.kkk.model.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FooterComponents {
    WebDriver driver;
    By pageFooterSelector= By.id("page-footer");
    By pageFooterLinkSelector=By.cssSelector("#page-footer a");

    public FooterComponents(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement pageFooter(){
        return driver.findElement(pageFooterSelector);
    }

    public WebElement pageFooterLink(){
        return driver.findElement(pageFooterLinkSelector);
    }
}
