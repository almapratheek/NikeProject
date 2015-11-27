package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseModules {

    public static WebDriver startFirefoxBrowser(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://secure-nikeplus.nike.com/plus/");
        driver.manage().window().maximize();
        return driver;
    }
    public static WebDriver startChromeDriver(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://secure-nikeplus.nike.com/plus/");
        driver.manage().window().maximize();
        return driver;
    }
    public static void tearDown(WebDriver driver) {
        driver.close();
    }

    public static void waitVisibilityOfElement(WebDriverWait wait, String xpath){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }

    public static void waitVisibilityOfElementAndClick(WebDriverWait wait, String xpath){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();
    }

    public static String waitVisibilityOfElementAndGetText(WebDriverWait wait, String xpath){
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).getText();
    }

    public static void waitVisibilityOfElementAndSendKeys(WebDriverWait wait, String xpath, String value){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).sendKeys(value);
    }
}
