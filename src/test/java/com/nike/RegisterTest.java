package com.nike;

        import com.nike.Register;
        import utilities.BaseModules;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

public class RegisterTest extends Register {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setup() {
        driver = BaseModules.startFirefoxBrowser();
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void startRegistration() {

        BaseModules.waitVisibilityOfElementAndClick(wait, JOIN_NOW_XPATH);
        Assert.assertEquals(BaseModules.waitVisibilityOfElementAndGetText(wait, REGISTER_PAGE_TITLE), "BECOME A NIKE+ MEMBER");
        register(wait);
        Assert.assertEquals(BaseModules.waitVisibilityOfElementAndGetText(wait, WELCOME_XPATH), "WELCOME TO NIKE+, JOHNY");
        Login.logOut(wait);
    }

    @Test
    public void Registration() {

        BaseModules.waitVisibilityOfElementAndClick(wait, REGISTER_XPATH);
        Assert.assertEquals(BaseModules.waitVisibilityOfElementAndGetText(wait, REGISTER_PAGE_TITLE), "BECOME A NIKE+ MEMBER");
        register(wait);
        Assert.assertEquals(BaseModules.waitVisibilityOfElementAndGetText(wait, WELCOME_XPATH), "WELCOME TO NIKE+, JOHNY");
        Login.logOut(wait);
    }

    @AfterClass
    public void close(){
        BaseModules.tearDown(driver);
    }


}
