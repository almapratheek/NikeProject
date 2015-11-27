package com.nike;

import utilities.BaseModules;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {

    protected static String NIKEPLUS_XPATH = ".//*[@id='homepage']//div[@class='hero-content-container']//div[contains(text(),'The Plus Means More')]";
    protected static String JOIN_NOW_XPATH = ".//*[@name='button_join']//div[@class='nav_item_centering_container']//span[contains(text(),'JOIN')]";
    protected static String REGISTER_XPATH = ".//*[@id='join_btn']";
    protected static String REGISTER_PAGE_TITLE = ".//*[@id='registration_view']/h1[@class='header center']";
    protected static String FIRST_NAME_XPATH = ".//*[@id='firstName']";
    protected static String LAST_NAME_XPATH = ".//*[@id='lastName']";
    protected static String EMAIL_XPATH = ".//*[@id='email']";
    protected static String SCREEN_NAME_XPATH = ".//*[@id='screenName']";
    protected static String PASSWORD_XPATH = ".//*[@id='password']";
    protected static String CONFIRM_PASSWORD_XPATH = ".//*[@id='confirmpassword']";
    protected static String DOB_MONTH_XPATH=".//*[@id='dk_container_dob-m']/a/span";
    protected static String DOB_MONTH_SELECT_XPATH=".//*[@id='dk_container_dob-m']//ul[@class='dk_options_inner']/li/a[contains(text(),'01')]";
    protected static String DOB_DAY_XPATH=".//*[@id='dk_container_dob-d']/a/span";
    protected static String DOB_DAY_SELECT_XPATH=".//*[@id='dk_container_dob-d']//ul[@class='dk_options_inner']/li/a[contains(text(),'01')]";
    protected static String DOB_YEAR_XPATH=".//*[@id='dk_container_dob-y']/a/span";
    protected static String DOB_YEAR_SELECT_XPATH=".//*[@id='dk_container_dob-y']//ul[@class='dk_options_inner']/li/a[contains(text(),'1990')]";
    protected static String POSTALCODE_XPATH=".//*[@id='postalCode']";
    protected static String GENDER_XPATH=".//*[@id='gender']/div[2]";
    protected static String SUBMIT_XPATH=".//a[@id='submit' and @class='submit black-btn btn green']";
    protected static String WELCOME_XPATH=".//*[@id='header']/h1";

    public static void register(WebDriverWait wait){

        String serialNo = Long.toString(System.currentTimeMillis());
        String email="johny"+ serialNo +"@gmail.com";
        BaseModules.waitVisibilityOfElementAndSendKeys(wait, FIRST_NAME_XPATH, "Johny");
        BaseModules.waitVisibilityOfElementAndSendKeys(wait, LAST_NAME_XPATH, "walker");
        BaseModules.waitVisibilityOfElementAndSendKeys(wait, EMAIL_XPATH, email);
        BaseModules.waitVisibilityOfElementAndSendKeys(wait, SCREEN_NAME_XPATH, "johny" + serialNo);
        BaseModules.waitVisibilityOfElementAndSendKeys(wait, PASSWORD_XPATH, "Grillchicken60");
        BaseModules.waitVisibilityOfElementAndSendKeys(wait, CONFIRM_PASSWORD_XPATH, "Grillchicken60");

        BaseModules.waitVisibilityOfElementAndClick(wait, DOB_MONTH_XPATH);
        BaseModules.waitVisibilityOfElementAndClick(wait,DOB_MONTH_SELECT_XPATH);
        BaseModules.waitVisibilityOfElementAndClick(wait, DOB_DAY_XPATH);
        BaseModules.waitVisibilityOfElementAndClick(wait, DOB_DAY_SELECT_XPATH);
        BaseModules.waitVisibilityOfElementAndClick(wait, DOB_YEAR_XPATH);
        BaseModules.waitVisibilityOfElementAndClick(wait, DOB_YEAR_SELECT_XPATH);

        BaseModules.waitVisibilityOfElementAndSendKeys(wait, POSTALCODE_XPATH, "97006");
        BaseModules.waitVisibilityOfElementAndClick(wait, GENDER_XPATH);
        BaseModules.waitVisibilityOfElementAndClick(wait, SUBMIT_XPATH);
    }
}
