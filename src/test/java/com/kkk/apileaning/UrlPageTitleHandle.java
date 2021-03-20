package com.kkk.apileaning;

import com.kkk.utils.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

import static com.kkk.utils.Webdriver.*;

public class UrlPageTitleHandle {
    public static void main(String[] args) {
        String url="https://the-internet.herokuapp.com/login";
        WebDriver driver=getFirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        By usernameSelector= By.id("username");
        By passwordSelector= By.id("password");
        By loginSelector= By.cssSelector("[type='submit']");

        WebElement usernameElem=driver.findElement(usernameSelector);
        WebElement passwordElem=driver.findElement(passwordSelector);
        WebElement loginElem=driver.findElement(loginSelector);

        usernameElem.sendKeys("tomsmith");
        passwordElem.sendKeys("SuperSecretPassword!");
        loginElem.click();

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginSelector));

        String pageUrlTitleAfterLogin=driver.getTitle();
        String pageUrlAfterLogin=driver.getCurrentUrl();

        System.out.println("Page title: " + pageUrlTitleAfterLogin);
        System.out.println("Page URL: " + pageUrlAfterLogin);

        try {
            URL urlParser = new URL(pageUrlAfterLogin);
            System.out.println("Page base url: "+urlParser.getHost());
            System.out.println("Page path url"+ urlParser.getPath());
        }catch (Exception e){
            e.printStackTrace();

        }


        driver.close();



    }
}
