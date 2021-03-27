package com.kkk.model.pages;

import com.kkk.model.components.FooterComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    FooterComponents footerComponents;
    By userNameSelector = By.id("username");
    By passwordSelector =By.id("password");
    By loginBtnSelector =By.cssSelector("[type='submit']");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public FooterComponents footerComponents(){
        return new FooterComponents(driver);
    }

    public WebElement username(){
        return driver.findElement(userNameSelector);
    }

    public  WebElement password(){
        return driver.findElement(passwordSelector);
    }

    public WebElement loginBtn(){
        return driver.findElement(loginBtnSelector);
    }

//    public void inputUsername(String userName){
//        username().sendKeys(userName);
//    }
//
//    public void inputPassword(String password){
//        password().sendKeys(password);
//    }
//
//    public void clickOnLoginBtn(){
//        loginBtn().click();
//    }

    public LoginPage inputUsername(String userName){
        username().sendKeys(userName);
        return this;
    }

    public LoginPage inputPassword(String password){
        password().sendKeys(password);
        return this;
    }

    public LoginPage clickOnLoginBtn(){
        loginBtn().click();
        return this;
    }



}
