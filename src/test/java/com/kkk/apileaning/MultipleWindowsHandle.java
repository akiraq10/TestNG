package com.kkk.apileaning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.kkk.utils.Webdriver.getFirefoxDriver;

public class MultipleWindowsHandle {
    public static void main(String[] args) {
        String url="https://the-internet.herokuapp.com/windows";
        WebDriver driver=getFirefoxDriver();
        driver.manage().window().maximize();
        driver.get(url);

        By clickHereLinkText= By.linkText("Click Here");
        WebElement linkTextElem=driver.findElement(clickHereLinkText);
        linkTextElem.click();

        List<String> windowsID =new ArrayList<>(driver.getWindowHandles());
        final int FIRST_WINDOWS=0;
        final int SECOND_WINDOWS=1;

        driver.switchTo().window(windowsID.get(SECOND_WINDOWS));
        System.out.println("Second Window title: " +driver.getTitle() );
        System.out.println("Second Window URL: " +driver.getCurrentUrl());


        //switch back to first windows
        driver.switchTo().window(windowsID.get(FIRST_WINDOWS));
        System.out.println("First Window URL: " +driver.getCurrentUrl());
        System.out.println("First Window title: " +driver.getTitle() );

        //close the second window
        driver.switchTo().window(windowsID.get(SECOND_WINDOWS));
        driver.close();

        //switch to the 1st one
        driver.switchTo().window(windowsID.get(FIRST_WINDOWS));
        windowsID =new ArrayList<>(driver.getWindowHandles());
        System.out.println("Current windows number: " + windowsID.size());





        System.out.println(driver.getTitle());
    }
}
