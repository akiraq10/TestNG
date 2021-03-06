package com.kkk.apileaning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static com.kkk.utils.Webdriver.getFirefoxDriver;

public class CheckboxesHandle {
    public static void main(String[] args) {
        String testUrl="https://the-internet.herokuapp.com/checkboxes";
        WebDriver driver= getFirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(testUrl);
        final  int FIST_CHECKBOX_INDEX=0;
        final  int SECOND_CHECKBOX_INDEX=1;
        final By checkbox= By.cssSelector("[type='checkbox']");

        //check the checkboxes or selected or not
        List<WebElement> chckGroup=driver.findElements(checkbox);
        WebElement chckbox1=chckGroup.get(FIST_CHECKBOX_INDEX);
        WebElement chckbox2=chckGroup.get(SECOND_CHECKBOX_INDEX);
        System.out.println("checkbox 1 selected: "+chckbox1.isSelected());
        System.out.println("checkbox 2 selected: "+chckbox2.isSelected());

        //try select 1st one
        chckbox1.click();
        System.out.println("checkbox 1 selected: "+chckbox1.isSelected());
        //try to unselect 2rd one
        chckbox2.click();
        System.out.println("checkbox 2 selected: "+chckbox2.isSelected());
        //Try reselect 2rd
        chckbox2.click();
        System.out.println("checkbox 2 selected: "+chckbox2.isSelected());
        driver.quit();
    }
}
