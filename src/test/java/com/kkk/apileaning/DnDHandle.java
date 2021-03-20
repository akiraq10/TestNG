package com.kkk.apileaning;

import com.kkk.utils.ElementController;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.InputEvent;

import static com.kkk.utils.Webdriver.getFirefoxDriver;

public class DnDHandle {

    public static void main(String[] args) throws AWTException {
        String url="https://the-internet.herokuapp.com/drag_and_drop";
        WebDriver driver =getFirefoxDriver();
//        driver.manage().window().maximize();
        driver.get(url);

        By leftColumnSelector= By.id("column-a");
        By rightColumnSelector= By.id("column-b");

        WebElement leftColumnElem=driver.findElement(leftColumnSelector);
        WebElement rightColumnElem=driver.findElement(rightColumnSelector);

        ElementController.dnd(leftColumnElem,rightColumnElem);
        ElementController.dnd(rightColumnElem,leftColumnElem);

//        Robot robot =new Robot();
//        robot.setAutoDelay(500);
//
//        //Get size form all elements
//        Dimension fromSize= leftColumnElem.getSize();
//        Dimension toSize=rightColumnElem.getSize();
//
//        //Get location for all elements
//        Point fromLocation=leftColumnElem.getLocation();
//        Point toLocation=rightColumnElem.getLocation();
//
//        //Calculator the coordination for the move
//        fromLocation.x += fromSize.width / 2;
//        fromLocation.y += fromSize.height / 2 + fromSize.height  ;
//        toLocation.x +=toSize.width / 2;
//        toLocation.y += toSize.height / 2 + toSize.height  ;
//
//        //Use robot instance to make the move
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseMove(fromLocation.x, fromLocation.y);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//
//        //Move to the target position
//        robot.mouseMove(toLocation.x, toLocation.y);
//
//        //Release the mouse
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);




    }
}
