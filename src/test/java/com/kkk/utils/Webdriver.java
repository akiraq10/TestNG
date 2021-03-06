package com.kkk.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {

    public static WebDriver getFirefoxDriver(){

        String path= System.getProperty("user.dir");
        String ffDriverPath=path+"//geckodriver.exe";
        System.getProperty("webdriver.gecko.driver",ffDriverPath);
        return new FirefoxDriver();

    }
}
