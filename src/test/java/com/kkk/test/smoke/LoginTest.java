package com.kkk.test.smoke;

import com.kkk.model.pages.LoginPage;
import com.kkk.model.pages.UserDashBoardPage;
import com.kkk.utils.Url;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static com.kkk.utils.Webdriver.getFirefoxDriver;

public class LoginTest {

    @BeforeTest
    public void createTestData(){
        System.out.println("this is before test");
    }

    @AfterTest
    public void deleteTestData(){
        System.out.println("this is after test");
    }

    @BeforeMethod
    public void runBeforeMethod(){
        System.out.println("this is before method");
    }

    @AfterMethod
    public void runAfterMethod(){
        System.out.println("this is after method");
    }

    @Test
    public void registerUser(){
        System.out.println("Registering the user......");
//        Assert.fail("Register the user failed....");

    }
    @Test(dependsOnMethods = "registerUser")
    public void loginWithCorrectCredential(){
        WebDriver driver = getFirefoxDriver() ;
        driver.get(Url.currentTestUrl("LOGIN_PAGE"));
        LoginPage loginPage =new LoginPage(driver);
        SoftAssert softAssert =new SoftAssert();
        loginPage
                .inputUsername("tomsmith")
                .inputPassword("SuperSecretPassword!")
                .clickOnLoginBtn();

        UserDashBoardPage userDashBoardPage =new UserDashBoardPage(driver);
        String expectedPageHeader="Secure Area1";
        String actualPageHeader=userDashBoardPage.getPageHeaderSelector().getText();
        softAssert.assertEquals(actualPageHeader,expectedPageHeader,"ERR | Page Header Wrong!!!");
        softAssert.assertTrue(userDashBoardPage.getLogoutBtn().isDisplayed(),"ERR | Logout button is NOT displayed");

        driver.close();
        softAssert.assertAll();


    }

    @Test
    public void loginWithInCorrectCredential(){
        WebDriver driver = getFirefoxDriver() ;
        driver.get(Url.currentTestUrl("LOGIN_PAGE"));
        LoginPage loginPage =new LoginPage(driver);
        loginPage
                .inputUsername("tomsmith")
                .inputPassword("SuperSecretPassword!")
                .clickOnLoginBtn();
        driver.close();



    }

    @Test
    public void ABCTest(){
        System.out.println("this is abc test");
    }
    @Test
    public void KKKTest(){
        System.out.println("this is KKK test");
    }
}
