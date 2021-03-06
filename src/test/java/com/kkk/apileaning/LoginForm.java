package com.kkk.apileaning;

import static com.kkk.utils.Webdriver.*;

import com.kkk.utils.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginForm {
    public static void main(String[] args) {
        String testUrl="https://the-internet.herokuapp.com/login";
        WebDriver driver= getFirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(testUrl);
        driver.manage().window().maximize();
        WebElement username=driver.findElement(By.cssSelector("[name='username']"));
        WebElement password=driver.findElement(By.cssSelector("[name='password']"));
        WebElement btnLogin=driver.findElement(By.cssSelector("[type='submit']"));

        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        btnLogin.click();
    }
}
