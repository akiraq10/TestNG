package com.kkk.utils;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;

public class ElementController {

    public static void  dnd(WebElement fromElement,WebElement toElement) throws AWTException {

        Robot robot =new Robot();
        robot.setAutoDelay(500);

        //Get size form all elements
        org.openqa.selenium.Dimension fromSize= fromElement.getSize();
        org.openqa.selenium.Dimension toSize=toElement.getSize();

        //Get location for all elements
        org.openqa.selenium.Point fromLocation=fromElement.getLocation();
        Point toLocation=toElement.getLocation();

        //Calculator the coordination for the move
        fromLocation.x += fromSize.width / 2;
        fromLocation.y += fromSize.height / 2 + fromSize.height  ;
        toLocation.x +=toSize.width / 2;
        toLocation.y += toSize.height / 2 + toSize.height  ;

        //Use robot instance to make the move
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(fromLocation.x, fromLocation.y);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);

        //Move to the target position
        robot.mouseMove(toLocation.x, toLocation.y);

        //Release the mouse
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    }


}
