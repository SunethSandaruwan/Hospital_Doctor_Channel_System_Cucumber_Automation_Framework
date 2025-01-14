package com.wavenet.pages;

import com.wavenet.util.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Logout {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();

    private By UserProfileItem = By.xpath(""); //Top of right conner User Profile Xpath
    private By LogOutButton = By.xpath("//span[normalize-space()='Logout']"); //User Log out Button Xpath
    public void user_Sing_Out() throws Throwable {
          Thread.sleep(10000);
          driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

 //       final List<WebElement> listStudentsWhoMetGoals = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[text()=\" AU \"]")));

          WebElement ClickXpath = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-top-bar/div/mat-toolbar/div/button"));
          ClickXpath.click();

//        WebElement element = driver.findElement(By.xpath("/html/body/app-root/mat-sidenav-container/mat-sidenav-content/app-top-bar/div/mat-toolbar/div/button"));
//        JavascriptExecutor executor = (JavascriptExecutor) driver;
//        executor.executeScript("arguments[0].click();", element);
    }

}
