package com.nike;

import utilities.BaseModules;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by pratheekreddy on 9/26/2015.
 */
public class LoginTest extends Login{
    WebDriver driver;
    WebDriverWait wait;


@BeforeClass
    public void startLogin() {
   driver= BaseModules.startFirefoxBrowser();
    wait=new WebDriverWait(driver,15);
    Assert.assertEquals(BaseModules.waitVisibilityOfElementAndGetText(wait,NIKE_HOME_PAGE_TITLE_XPATH),"THE PLUS MEANS MORE");
}

    @Test
    public void startLoginTest(){
        BaseModules.waitVisibilityOfElementAndClick(wait, LOGIN_XPATH);
        Assert.assertEquals(BaseModules.waitVisibilityOfElementAndGetText(wait, LOGIN_TITLE_XPATH), "LOG IN WITH NIKE+");
        logIn(wait,USER_MAILID,USER_PASSWORD);

        Assert.assertEquals(BaseModules.waitVisibilityOfElementAndGetText(wait, WELCOME_XPATH), "WELCOME TO NIKE+, MICHAEL");
    }
    @AfterClass
    public void closeLogin(){
        logOut(wait);
        Assert.assertEquals(BaseModules.waitVisibilityOfElementAndGetText(wait, NIKE_HOME_PAGE_TITLE_XPATH), "THE PLUS MEANS MORE");
        BaseModules.tearDown(driver);
    }
}
