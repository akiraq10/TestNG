package com.kkk.model.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserDashBoardPage {
    WebDriver driver;



    By flashMsgSelector = By.id("flash");
    By pageHeaderSelector= By.tagName("h2");
    By subHeaderSelector= By.className("subheader");
    By logoutBtn= By.cssSelector(".example a");

    public UserDashBoardPage(WebDriver driver) {
        this.driver=driver;
    }
    public WebElement getFlashMsgSelector() {
        return driver.findElement(flashMsgSelector);
    }

    public WebElement getPageHeaderSelector() {
        return driver.findElement(pageHeaderSelector);
    }

    public WebElement getSubHeaderSelector() {
        return driver.findElement(subHeaderSelector);
    }

    public WebElement getLogoutBtn() {
        return driver.findElement(logoutBtn);
    }



}
