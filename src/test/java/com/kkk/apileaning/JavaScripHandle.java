package com.kkk.apileaning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.kkk.utils.Webdriver.getFirefoxDriver;

public class JavaScripHandle {
    public static void main(String[] args) {
        String testUrl="https://the-internet.herokuapp.com/javascript_alerts";
        WebDriver driver= getFirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(testUrl);

        final By jsAlert= By.cssSelector("[onclick='jsAlert()']");
        final By jsConfirm= By.cssSelector("[onclick='jsConfirm()']");
        final By jsPrompt= By.cssSelector("[onclick='jsPrompt()']");
        final By resultSelector=By.cssSelector("#result");

        driver.findElement(jsAlert).click();
        WebDriverWait wait=new WebDriverWait(driver,30);
        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("contain: "+alert.getText());
        alert.accept();

        System.out.println("Result: "+ driver.findElement(resultSelector).getText());

        //play with JS confirm Alert
        driver.findElement(jsConfirm).click();
        alert=wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("contain: "+alert.getText());

        alert.dismiss();
        System.out.println("Result: "+ driver.findElement(resultSelector).getText());


        //play with JS prompt Alert
        driver.findElement(jsPrompt).click();
        alert=wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("contain: "+alert.getText());
        alert.sendKeys("kkk");
        alert.accept();
        System.out.println("Result: "+ driver.findElement(resultSelector).getText());



        driver.quit();

    }
}
