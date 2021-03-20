package com.kkk.apileaning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.kkk.utils.Webdriver.getFirefoxDriver;

public class IFrameHandle {

    public static void main(String[] args) {

        String url="https://the-internet.herokuapp.com/iframe";
        WebDriver driver=getFirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        By iframeNodeSelector= By.id("mce_0_ifr");
        By iframeBodySelector=By.id("tinymce");

        WebElement iframeElem=driver.findElement(iframeNodeSelector);
        driver.switchTo().frame(iframeElem);

        driver.findElement(iframeBodySelector).clear();
        driver.findElement(iframeBodySelector).sendKeys("kkkkkkkk");

        //Switch back to main frame
        driver.switchTo().defaultContent();

        //driver.quit();

    }
}
