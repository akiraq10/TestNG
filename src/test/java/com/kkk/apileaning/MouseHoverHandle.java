package com.kkk.apileaning;

import com.kkk.utils.Webdriver;
import jdk.dynalink.linker.LinkerServices;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.kkk.utils.Webdriver.getFirefoxDriver;

public class MouseHoverHandle {
    public static void main(String[] args) {
        String testUrl="https://the-internet.herokuapp.com/hovers";
        WebDriver driver= getFirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(testUrl);

        By avatarSelector= By.cssSelector(".figure");
        By usernameSelector=By.cssSelector(".figcaption h5");
        By usernameHyperLink=By.cssSelector(".figcaption a");
        final int USER_1_INDEX=0;
        final int USER_2_INDEX=1;
        final int USER_3_INDEX=2;

        List<WebElement> avatarElement=driver.findElements(avatarSelector);
        List<WebElement> usernameElement=driver.findElements(usernameSelector);
        List<WebElement> usernameHyperLinkElement=driver.findElements(usernameHyperLink);

        //Move mouse on the 1sr user
        Actions actions=new Actions(driver);
        actions.moveToElement(avatarElement.get(USER_1_INDEX)).perform();
        System.out.println( usernameElement.get(USER_1_INDEX).getText());
        System.out.println( usernameHyperLinkElement.get(USER_1_INDEX).getAttribute("href"));

        //Move mouse on the 2sd user
       ;
        actions.moveToElement(avatarElement.get(USER_2_INDEX)).perform();
        System.out.println( usernameElement.get(USER_2_INDEX).getText());
        System.out.println( usernameHyperLinkElement.get(USER_2_INDEX).getAttribute("href"));

        //Move mouse on the 3rd user

        actions.moveToElement(avatarElement.get(USER_3_INDEX)).perform();
        System.out.println( usernameElement.get(USER_3_INDEX).getText());
        System.out.println( usernameHyperLinkElement.get(USER_3_INDEX).getAttribute("href"));

        driver.quit();

    }
}
