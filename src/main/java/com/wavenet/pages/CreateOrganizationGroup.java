package com.wavenet.pages;

import com.wavenet.util.Config;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CreateOrganizationGroup {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Login login = new Login();
    private Config config = new Config();

    private By WelcomeMessage=By.xpath("//span[contains(text(),\"Welcome back Admin User\")]");
    private By ClickOnOrganizationBtn =By.xpath("//");
    public void click_on_Organization() throws Throwable {
        Thread.sleep(5000);
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(WelcomeMessage));
        WebElement VerifyOrganization = driver.findElement(ClickOnOrganizationBtn);
        VerifyOrganization.click();

    }
}


