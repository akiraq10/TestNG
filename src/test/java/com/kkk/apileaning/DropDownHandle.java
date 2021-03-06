package com.kkk.apileaning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import static com.kkk.utils.Webdriver.getFirefoxDriver;

public class DropDownHandle {
    public static void main(String[] args) {
        String testUrl="https://the-internet.herokuapp.com/dropdown";
        WebDriver driver= getFirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(testUrl);

        final By dropdownSelector= By.cssSelector("#dropdown");

        Select select=new Select(driver.findElement(dropdownSelector));
        select.selectByVisibleText("Option 1");
        select.selectByValue("2");
        select.selectByIndex(1);


        driver.quit();
    }
}
