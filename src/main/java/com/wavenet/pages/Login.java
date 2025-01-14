package com.wavenet.pages;


import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import gherkin.lexer.En;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Login {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();
    String composeUrl = config.getComposeUrl();
    String composeUsername = config.getNewDocGpUsername();
    String composePassword = config.getNewRegistryPassword();

    int a3 = 3;

     private By EnterUserName = By.xpath("//input[@data-placeholder='Username']"); // Username Text field xpath
     private By EnterPassword = By.xpath("//*[@placeholder='Password']"); // Password Text field xpath
     private By EnterLogInBtn = By.xpath("//span[@class='mat-button-wrapper']"); //Sign in Button xpath
     private By Verify_The_Invalid_Username_And_Valid_Password_Actual_error = By.xpath("//span[contains(text(),'Invalid login credentials. Make sure that the correct login details entered.')]"); //
     private By Verify_Error_Message_In_Valid_Username_And_Invalid_Password_Actual_error = By.xpath("//span[contains(text(),'Invalid login credentials. Make sure that the correct login details entered.')]");//
     private By EnterClickOnEyeIcon = By.xpath("//mat-icon[contains(text(),' visibility_off ')]"); // Eye icon Xpath Path
    public Login() {driver = InitializeDriver.getInstance().getDriver();
      //  wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

    public void loadUrl(String loginUrl){
        try {
            driver.get(loginUrl);
            driver.manage().window().maximize();

        } catch (UnhandledAlertException f) {

            try {

                Alert alert = driver.switchTo().alert();
                alert.accept();

            } catch (NoAlertPresentException e) {

                e.printStackTrace();

            }

        }
    }

    public void enterDocGpLoginData(String composeUsername,String composePassword)
    {
        WebElement elementUsername = driver.findElement(EnterUserName);
        elementUsername.sendKeys(composeUsername);
        WebElement elementPassword = driver.findElement(EnterPassword);
        elementPassword.sendKeys(composePassword);
    }


    public void enter_for_login_as(String username) throws Throwable {
       // Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement Username = driver.findElement(EnterUserName);
        Username.sendKeys(username);
    }

    public void enter_for_password_as(String password) throws Throwable {
        // Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement Password = driver.findElement(EnterPassword);
        Password.sendKeys(password);
    }

    public void click_on_Log_in_Button() throws Throwable {
        Thread.sleep(3000);
        WebElement loginBtn = driver.findElement(EnterLogInBtn);
        loginBtn.click();
    }

    public void ClickOnLogInBtn(){
        WebElement GpLogInBtn = driver.findElement(EnterLogInBtn);
        GpLogInBtn.click();

    }

    public void clickLogIn()
    {
        WebElement ClickOnLogIn = driver.findElement(EnterLogInBtn);
        ClickOnLogIn.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // Wait for the overlay to disappear



    }

    public void navigate_to_the_home_page() throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement VerifyTheHomepage = driver.findElement(By.xpath("//img[@class='ng-tns-c28-79']"));
        VerifyTheHomepage.click();
    }

    public void enter_a_invalid_Username_and_valid_password(String InvalidUsername, String Password) throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement EnterInValidUsername = driver.findElement(EnterUserName);
        EnterInValidUsername.sendKeys(InvalidUsername);
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement ValidEnterPassword = driver.findElement(EnterPassword);
        ValidEnterPassword.sendKeys(Password);

    }

    public void verify_Error_Message_in_invalid_username_and_valid_password() throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String actual_error = driver.findElement(Verify_The_Invalid_Username_And_Valid_Password_Actual_error).getText();
        String expected_error = "Invalid login credentials. Make sure that the correct login details entered.";
        Assert.assertEquals(actual_error, expected_error);
        Assert.assertTrue(actual_error.contains("Invalid login credentials. Make sure that the correct login details entered."));
        System.out.println("Test Pass");

    }

    public void verify_Error_Message_in_valid_username_and_invalid_Password() throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String actual_error = driver.findElement(Verify_Error_Message_In_Valid_Username_And_Invalid_Password_Actual_error).getText();
        String expected_error = "Invalid login credentials. Make sure that the correct login details entered";
        Assert.assertEquals(actual_error,expected_error);
        Assert.assertTrue(actual_error.contains("Invalid login credentials. Make sure that the correct login details entered"));
        System.out.println("Actual_Error_Message_Is_Pass");

    }

    public void enter_a_valid_username_and_invalid_password(String Username, String InvalidPassword) throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement EnterInValidUsername = driver.findElement(EnterUserName);
        EnterInValidUsername.sendKeys(Username);
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement ValidEnterPassword = driver.findElement(EnterPassword);
        ValidEnterPassword.sendKeys(InvalidPassword);
    }

    public void enter_empty_username_and_password_Test(String EmptyUsername, String ValidPassword) throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement EnterEmptyUsername = driver.findElement(EnterUserName);
        EnterEmptyUsername.sendKeys(EmptyUsername);
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement EnterValidPassword = driver.findElement(EnterPassword);
        EnterValidPassword.sendKeys(ValidPassword);
    }
    public void verify_Error_Message_in_Empty_username_with_password() throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String actual_error = driver.findElement(Verify_Error_Message_In_Valid_Username_And_Invalid_Password_Actual_error).getText();
        String expected_error = "Invalid login credentials. Make sure that the correct login details entered";
        Assert.assertEquals(actual_error,expected_error);
        Assert.assertTrue(actual_error.contains("Invalid login credentials. Make sure that the correct login details entered"));
        System.out.println("Actual_Error_Message_Is_Pass");
    }
    public void enter_empty_Password_and_Username(String ValidUsername, String EmptyPassword) throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement EnterValidUserName = driver.findElement(EnterUserName);
        EnterValidUserName.sendKeys(ValidUsername);
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement EnterValidPassword = driver.findElement(EnterPassword);
        EnterValidPassword.sendKeys(EmptyPassword);
    }
    public void verify_Error_Message_in_Empty_Password_with_Username() throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String actual_error = driver.findElement(Verify_Error_Message_In_Valid_Username_And_Invalid_Password_Actual_error).getText();
        String expected_error = "Invalid login credentials. Make sure that the correct login details entered";
        Assert.assertEquals(actual_error,expected_error);
        Assert.assertTrue(actual_error.contains("Invalid login credentials. Make sure that the correct login details entered"));
        System.out.println("Actual_Error_Message_Is_Pass");

    }
    public void enter_empty_Username_and_Password(String EmptyUsername, String EmptyPassword) throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement EnterEmptyUsername = driver.findElement(EnterUserName);
        EnterEmptyUsername.sendKeys(EmptyUsername);
        WebElement EnterEmptyPassword = driver.findElement(EnterUserName);
        EnterEmptyUsername.sendKeys(EmptyPassword);
    }
    public void verify_Error_Message_in_Empty_Username_and_Empty_Password() throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String actual_error = driver.findElement(Verify_Error_Message_In_Valid_Username_And_Invalid_Password_Actual_error).getText();
        String expected_error = "Invalid login credentials. Make sure that the correct login details entered";
        Assert.assertEquals(actual_error,expected_error);
        Assert.assertTrue(actual_error.contains("Invalid login credentials. Make sure that the correct login details entered"));
        System.out.println("Actual_Error_Message_Is_Pass");
    }
    public void enter_a_valid_Username_and_valid(String ValidUsername, String ValidPassword) throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement EnterValidUsername = driver.findElement(EnterUserName);
        EnterValidUsername.sendKeys(ValidUsername);
        WebElement EnterValidPassword = driver.findElement(EnterPassword);
        EnterValidPassword.sendKeys(ValidPassword);
    }
    public void click_on_eye_icon() throws Throwable {
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement ClickOnEyeIcon = driver.findElement(EnterClickOnEyeIcon);
        ClickOnEyeIcon.click();
    }


    public void loadComposeLogin(String url)
    {
        try {

            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        } catch (UnhandledAlertException f) {

            try {

                Alert alert = driver.switchTo().alert();
                alert.accept();

            } catch (NoAlertPresentException e) {

                e.printStackTrace();

            }

        }
    }
    public void loadGpLogin(String composeUrl)
    {
        try {
            driver.get(composeUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        }
        catch (UnhandledAlertException f){
            try {
                Alert alert = driver.switchTo().alert();
                alert.accept();
            }catch (NoAlertPresentException e){
                e.printStackTrace();
            }
        }
    }

    public void browser_Quit() throws Throwable {
        driver.quit();
    }

}