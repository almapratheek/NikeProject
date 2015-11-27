package com.nike;

import utilities.BaseModules;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by pratheekreddy on 9/28/2015.
 */
public class Login {

    protected static final String NIKE_HOME_PAGE_TITLE_XPATH=".//*[@id='homepage']//div[@class='title']";
    protected static final String LOGIN_XPATH=".//*[@id='button_sign_in']/div/div/span[contains(text(),'LOG IN')]";
    protected static final String LOGIN_TITLE_XPATH=".//*[@id='page_wrapper']/div[4]/div[2]/span";
    protected static final String LOGIN_EMAIL_XPATH=".//*[@id='login_email']";
    protected static final String LOGIN_PASSWORD_XPATH=".//*[@id='login_password']";
    protected static final String LOGIN_BUTTON_XPATH=".//*[@id='login_popup_submit']";
    protected static final String WELCOME_XPATH=".//*[@id='header']/h1";
    protected static final String USER_MAILID= "Michael1234@gmail.com";
    protected static final String USER_PASSWORD="Grillchicken60";
    protected static final String LOGOUT_DROPDOWN_XPATH=".//*[@id='button_profile_dropdown']/div/div[3]";
    protected static final String LOGOUT_BUTTON_XPATH=".//*[@id='button_log_out']";

public static void logIn(WebDriverWait wait,String mailId,String password) {
    BaseModules.waitVisibilityOfElementAndSendKeys(wait, LOGIN_EMAIL_XPATH, mailId);
    BaseModules.waitVisibilityOfElementAndSendKeys(wait, LOGIN_PASSWORD_XPATH,password );
    BaseModules.waitVisibilityOfElementAndClick(wait, LOGIN_BUTTON_XPATH);
}
    public static void logOut(WebDriverWait wait){
        BaseModules.waitVisibilityOfElementAndClick(wait,LOGOUT_DROPDOWN_XPATH);
        BaseModules.waitVisibilityOfElementAndClick(wait,LOGOUT_BUTTON_XPATH);
    }
}
