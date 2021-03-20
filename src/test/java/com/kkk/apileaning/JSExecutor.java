package com.kkk.apileaning;

import com.kkk.utils.PageController;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static com.kkk.utils.Webdriver.*;

public class JSExecutor {
    public static void main(String[] args) {
        String url="https://the-internet.herokuapp.com/floating_menu";
        WebDriver driver =getFirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        By menuSelector= By.id("menu");

        PageController.scrollToBottom(driver);
        System.out.println(PageController.isElementInViewPort(driver, driver.findElement(menuSelector)));

        driver.quit();

    }
}
