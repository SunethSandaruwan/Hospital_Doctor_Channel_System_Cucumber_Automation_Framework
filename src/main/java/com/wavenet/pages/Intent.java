package com.wavenet.pages;

import com.wavenet.util.InitializeDriver;
import org.openqa.selenium.By;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Intent {

    public static WebDriver driver;

    private Login login = new Login();

    public Intent(){
        driver = InitializeDriver.getInstance().getDriver();
    }
    public void composeLogin(String composeUrl, String DocGpUsername, String DocGpPassword){
        login.loadComposeLogin(composeUrl);
        login.enterDocGpLoginData(DocGpUsername,DocGpPassword);
        login.clickLogIn();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  WebElement verifyLocation = driver.findElement(By.xpath(""));
      //  verifyLocation.isDisplayed();
    }
    public void successfully_login_System(String url) throws Throwable {
        login.loadGpLogin(url);
    }
}
