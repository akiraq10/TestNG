package com.kkk.apileaning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static com.kkk.utils.Webdriver.getFirefoxDriver;

public class RightClickHandle {
    public static void main(String[] args) {
        String testUrl="https://the-internet.herokuapp.com/context_menu";
        WebDriver driver= getFirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(testUrl);

        By rightClickPlace= By.cssSelector("#hot-spot");
        Actions actions=new Actions(driver);

        WebElement rightClickElement=driver.findElement(rightClickPlace);
        actions.contextClick(rightClickElement).perform();
        WebDriverWait wait=new WebDriverWait(driver,30);
        Alert alert=wait.until(ExpectedConditions.alertIsPresent());
        System.out.println("contain: "+alert.getText());
        alert.accept();
        driver.navigate().refresh();

        driver.quit();
    }
}
