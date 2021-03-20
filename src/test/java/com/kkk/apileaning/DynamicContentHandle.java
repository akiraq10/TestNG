package com.kkk.apileaning;

import com.kkk.utils.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.kkk.utils.Webdriver.getFirefoxDriver;

public class DynamicContentHandle {
    public static void main(String[] args) {

        String url="https://the-internet.herokuapp.com/dynamic_controls";
        WebDriver driver =getFirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);

        By removeButtonSelector = By.cssSelector("#checkbox-example button");
        By checkboxSelector=By.id("checkbox");
        By inputSelector=By.cssSelector("#input-example input");
        By enabledInputButtonSelector=By.cssSelector("#input-example button");


        System.out.println("IS the checkbox displayed: " + driver.findElement(checkboxSelector).isDisplayed());

        driver.findElement(removeButtonSelector).click();
        WebDriverWait wait =new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(checkboxSelector));
        try{
            driver.findElement(checkboxSelector);
        }catch (Exception e){
            System.out.println("The checkbox was removed ");
        }


        System.out.println("Is the Input form enabled: " +driver.findElement(inputSelector).isEnabled());
        driver.findElement(enabledInputButtonSelector).click();
        wait.until(ExpectedConditions.textToBe(enabledInputButtonSelector, "Disable"));
        System.out.println("Is the Input form enabled: " +driver.findElement(inputSelector).isEnabled());

        driver.close();


    }
}
