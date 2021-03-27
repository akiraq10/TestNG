package com.kkk.test;

import com.kkk.model.pages.LoginPage;
import org.openqa.selenium.WebDriver;

import static com.kkk.utils.Webdriver.*;
public class TestCommonComponents {
    public static void main(String[] args) {

        WebDriver driver=getFirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginPage=new LoginPage(driver);
        System.out.println(loginPage.footerComponents().pageFooter().getText());
        System.out.println(loginPage.footerComponents().pageFooterLink().getAttribute("href"));

        driver.quit();

    }
}
