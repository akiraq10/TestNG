package com.kkk.test;

import com.kkk.model.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import static com.kkk.utils.Webdriver.*;

public class TestLoginWithPOM {
    public static void main(String[] args) {
        WebDriver driver = getFirefoxDriver() ;
        driver.get("https://the-internet.herokuapp.com/login");
        LoginPage loginPage =new LoginPage(driver);

//        loginPage.username().sendKeys(".....");
//        loginPage.password().sendKeys("sssssss");
//        loginPage.loginBtn().click();

//        loginPage.inputUsername("asdsad");
//        loginPage.inputPassword("sadsada");
//        loginPage.clickOnLoginBtn();
//
//        String loginBtnColor=loginPage.loginBtn().getAttribute("background-color");
//        System.out.println("Login button color: "+ loginBtnColor);

        loginPage
                .inputUsername("kkk")
                .inputPassword("qwe")
                .clickOnLoginBtn();

        driver.quit();

    }
}
