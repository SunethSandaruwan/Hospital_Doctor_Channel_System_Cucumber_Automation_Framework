package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Signup {
    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Config config = new Config();
    String url = config.getUrl();

    public Signup() {
        driver = InitializeDriver.getInstance().getDriver();
      //  wait = new WebDriverWait(driver, 30);
        executor = (JavascriptExecutor) driver;
    }

        public void loadURL(String url) throws InterruptedException {

            String URL = driver.getCurrentUrl();
            driver.get(url);
    }

    public void click_on_Log_In_Drop_Down() throws Throwable {
        Thread.sleep(3000);
        WebElement logInBtn = driver.findElement(By.xpath("//button[@id='button-basic']"));
        logInBtn.click();
    }


    public void click_on_Sign_In_Button() throws Throwable {
        WebElement signInBtn = driver.findElement(By.xpath("//input[@id='kc-login']"));
        signInBtn.click();
    }

    public void direct_to_the_sign_in_and_sign_up_page() throws Throwable {
        Thread.sleep(3000);
        WebElement btn = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-top-navbar[1]/div[1]/nav[1]/div[1]/button[1]"));
        Assert.assertEquals(true,btn.isDisplayed());
    }

    public void click_on_Register_Button() throws Throwable {
        WebElement registerBtn = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
        registerBtn.click();
    }

    public void enter_First_Name(String firstName) throws Throwable {
        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstNameField.sendKeys(firstName);
    }

    public void enter_Last_Name(String lastName) throws Throwable {
        WebElement lastNameField = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameField.sendKeys(lastName);
    }

    public void enter_Email(String email) throws Throwable {
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.sendKeys(email);
    }

    public void click_on_drop_down_of_country_codes() throws Throwable {
        Thread.sleep(2000);
        WebElement country = driver.findElement(By.xpath("//div[@class='iti__arrow']"));
        country.click();
    }

    public void select_the_country_from_the_drop_down() throws Throwable {
        Thread.sleep(1000);
        WebElement dropDownCountry = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[209]/span[1]"));
        dropDownCountry.click();
    }
    public void enter_Mobile_Number_for_sign_up(String mobileNumber) throws Throwable {
        WebElement MobileNoField = driver.findElement(By.xpath("//input[@id='username']"));
        MobileNoField.sendKeys(mobileNumber);
    }

    public void enter_Password_for_sign_up(String pwd) throws Throwable {
        WebElement MobileNoField = driver.findElement(By.xpath("//input[@id='password']"));
        MobileNoField.sendKeys(pwd);
    }

    public void reenter_password(String pwd) throws Throwable {
        WebElement confirmPwd = driver.findElement(By.xpath("//input[@id='password-confirm']"));
        confirmPwd.sendKeys(pwd);
    }

    public void enter_National_Identification_Number(String idNo) throws Throwable {
        WebElement NIC = driver.findElement(By.xpath("//input[@id='nationalId']"));
        NIC.sendKeys(idNo);
    }

    public void click_on_RegisterButton() throws Throwable {
        WebElement register = driver.findElement(By.xpath("//button[@type='button']"));
        register.click();
    }

    public void field_for_SMS_code_is_visible() throws Throwable {
        WebElement register = driver.findElement(By.xpath("//input[@id='code']"));
        Assert.assertEquals(true,register.isDisplayed());
    }

    public void direct_to_the_sign_up_submission_page() throws Throwable {
        WebElement register = driver.findElement(By.xpath("//h1[@id='kc-page-title']"));
        Assert.assertEquals(true,register.isDisplayed());
    }

//    test case 4

    public void display_Please_specify_first_name(String firstName) throws Throwable {
        WebElement displayFirstName = driver.findElement(By.xpath("//span[@id='input-error-firstname']"));
        Assert.assertEquals(firstName, displayFirstName.getText());
    }

    public void display_Please_specify_last_name(String lastName) throws Throwable {
        WebElement displayLastName = driver.findElement(By.xpath("//span[@id='input-error-lastname']"));
        Assert.assertEquals(lastName, displayLastName.getText());
    }

    public void display_Please_specify_email(String email) throws Throwable {
        WebElement displayEmail = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(3) > div:nth-child(1) > span:nth-child(4)"));
        Assert.assertEquals(email, displayEmail.getText());
    }

    public void display_Please_specify_mobile_number(String mobileNumber) throws Throwable {
        WebElement displayMobileNumber = driver.findElement(By.xpath("//div[@class='dh-field mobile-number']//span[@id='input-error-username']"));
        Assert.assertEquals(mobileNumber, displayMobileNumber.getText());
    }

    public void display_Please_specify_password(String pwd) throws Throwable {
        WebElement displayPassword = driver.findElement(By.xpath("//span[@id='input-error-password']"));
        Assert.assertEquals(pwd, displayPassword.getText());
    }

    public void display_MISSING_NATIONALID(String nic) throws Throwable {
        WebElement displayMissingNationalId = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > form:nth-child(3) > div:nth-child(7) > div:nth-child(1) > span:nth-child(4)"));
        Assert.assertEquals(nic, displayMissingNationalId.getText());
    }

    //    test case 5

    public void enter_Invalid_Email(String email) throws Throwable {
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.sendKeys(email);
    }

    public void display_Invalid_Email_Address(String validationMsg) throws Throwable {
        WebElement emailValidation = driver.findElement(By.xpath("//span[@id='input-error-username']"));
        Assert.assertEquals(true,emailValidation.isDisplayed());
    }


    //    test case 6

    public void enter_Email_with_correct_format(String email) throws Throwable {
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        emailField.sendKeys(email);
    }

    //    test case 7
    public void reenter_Different_password(String pwd) throws Throwable {
        WebElement confirmPwd = driver.findElement(By.xpath("//input[@id='password-confirm']"));
        confirmPwd.sendKeys(pwd);
    }

    public void display_Password_confirmation(String emailValidation) throws Throwable {
        WebElement pwdValidation = driver.findElement(By.xpath("//span[@id='input-error-password-confirm']"));
        Assert.assertEquals(emailValidation, pwdValidation.getText());
//        String ExpectedText = "Password confirmation doesn't match.";
//        Assert.assertEquals(ExpectedText, pwdValidation.getText());
    }

    public void enter_PreRegistered_Mobile_Number(String registeredMobileNumber) throws Throwable {
        WebElement MobileNoField = driver.findElement(By.xpath("//input[@id='username']"));
        MobileNoField.sendKeys(registeredMobileNumber);
    }
    public void display_validation_text(String validationText) throws Throwable {
//        WebElement registeredMobileNoValidation = driver.findElement(By.xpath("//div[@class='dh-field mobile-number']//span[@id='input-error-username']"));
        WebElement registeredMobileNoValidation = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/span[1]"));
        Assert.assertEquals(validationText, registeredMobileNoValidation.getText());
    }

    public void select_USA_from_the_drop_down() throws Throwable {
        WebElement dropDownCountry = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[4]/div[1]/div[1]/div[1]/ul[1]/li[1]/span[1]"));
        dropDownCountry.click();

    }
    public void check_Mobile_Number_validation() throws Throwable {
        WebElement mobileNo = driver.findElement(By.xpath("//input[@id='username']"));
        mobileNo.sendKeys("1234567890");
        String typedValue = mobileNo.getAttribute("value");

        String typedValue1 = mobileNo.getAttribute("value");
        int size = typedValue1.length();

        Pattern pattern = Pattern.compile("/^((0)?([6-7])[0-9]{8}|([8])[1-4][0-9]{7}) *$/");
        Matcher matcher = pattern.matcher(typedValue1);
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Mobile No validation with the region is applied");
        } else {
            System.out.println("No validation is set");
        }

    }

    public void enter_First_Name_Maxlength() throws Throwable {
        // Locating firstname web element
        WebElement firstNameInputbox = driver.findElement(By.xpath("//input[@id='firstName']"));

        // Type more than 10 characters as max limit is defined as 10 as per requirement
        firstNameInputbox.sendKeys("abcdefghijklmnopqrstuvwxyz");

        // Get the typed value
        String typedValue = firstNameInputbox.getAttribute("value");
//        String typeA = firstNameInputbox.getAttribute("type");

        // Get the length of typed value
        int size = typedValue.length();
        System.out.println("First Name :");

        // Assert with expected
        if (size == 25) {
            System.out.println("Text are allowed. Max character functionality=25 is working fine.");
//            System.out.println("character type" + typeA);
        }
        else {
            System.out.println("Text are allowed. No limit is set.");
        }

        // Type number
        firstNameInputbox.clear();
        firstNameInputbox.sendKeys("12345");

        // Retrieve typed value
        String typedValue2 = firstNameInputbox.getAttribute("value");

        // Get the length of typed value
        int size1 = typedValue.length();

        if (size1 == 0) {
            System.out.println("Numbers are not allowed.");
        }else {
            System.out.println("Numbers are allowed.");
        }

        // Type special Characters
        firstNameInputbox.clear();
        firstNameInputbox.sendKeys("#%$%&");

        // Retrieve typed value
        String typedValue1 = firstNameInputbox.getAttribute("value");

        // Get the length of typed value
        int size2 = typedValue1.length();

        if (size2 == 0) {
            System.out.println("Special characters are not allowed.");
        }else {
            System.out.println("Special characters are allowed.");
        }
    }

    public void enter_Last_Name_Maxlength() throws Throwable {
        WebElement lastNameInputbox = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastNameInputbox.sendKeys("abcdefghijklmnopqrstuvwxyz");
        String typedValue = lastNameInputbox.getAttribute("value");

        int size = typedValue.length();
        System.out.println("Last Name :");

        if (size == 25) {
            System.out.println("Text are allowed. Max character functionality=25 is working fine.");
        }
        else {
            System.out.println("Text are allowed. No limit is set.");
        }

        lastNameInputbox.clear();
        lastNameInputbox.sendKeys("12345");
        String typedValue2 = lastNameInputbox.getAttribute("value");
        int size1 = typedValue.length();

        if (size1 == 0) {
            System.out.println("Numbers are not allowed.");
        }else {
            System.out.println("Numbers are allowed.");
        }

        lastNameInputbox.clear();
        lastNameInputbox.sendKeys("#%$%&");
        String typedValue1 = lastNameInputbox.getAttribute("value");
        int size2 = typedValue1.length();

        if (size2 == 0) {
            System.out.println("Special characters are not allowed.");
        }else {
            System.out.println("Special characters are allowed.");
        }
    }

    public void enter_Email_Maxlength() throws Throwable {
        WebElement emailInputbox = driver.findElement(By.xpath("//input[@id='email']"));
        emailInputbox.sendKeys("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");
        String typedValue = emailInputbox.getAttribute("value");

        int size = typedValue.length();
        System.out.println("Email :");

        if (size == 50) {
            System.out.println("Text are allowed. Max character functionality=50 is working fine.");
        }
        else {
            System.out.println("Text are allowed. No limit is set.");
        }

        emailInputbox.clear();
        emailInputbox.sendKeys("12345");
        String typedValue2 = emailInputbox.getAttribute("value");
        int size1 = typedValue.length();

        if (size1 == 0) {
            System.out.println("Numbers are not allowed.");
        }else {
            System.out.println("Numbers are allowed.");
        }

        emailInputbox.clear();
        emailInputbox.sendKeys("#%$%&");
        String typedValue1 = emailInputbox.getAttribute("value");
        int size2 = typedValue1.length();

        if (size2 == 0) {
            System.out.println("Special characters are not allowed.");
        }else {
            System.out.println("Special characters are allowed.");
        }
    }

    public void enter_Mobile_Number_Maxlength() throws Throwable {
        WebElement mobileNoInputbox = driver.findElement(By.xpath("//input[@id='username']"));
        mobileNoInputbox.sendKeys("abcdefghijklmnopqrstuvwxyz");
        String typedValue = mobileNoInputbox.getAttribute("value");

        int size = typedValue.length();
        System.out.println("Mobile Number :");

        if (size == 20) {
            System.out.println("Text are allowed. Max character functionality=20 is working fine.");
        }
        else {
            System.out.println("Text are allowed. No limit is set.");
        }

        mobileNoInputbox.clear();
        mobileNoInputbox.sendKeys("12345");
        String typedValue2 = mobileNoInputbox.getAttribute("value");
        int size1 = typedValue.length();

        if (size1 == 0) {
            System.out.println("Numbers are not allowed.");
        }else {
            System.out.println("Numbers are allowed.");
        }

        mobileNoInputbox.clear();
        mobileNoInputbox.sendKeys("#%$%&");
        String typedValue1 = mobileNoInputbox.getAttribute("value");
        int size2 = typedValue1.length();

        if (size2 == 0) {
            System.out.println("Special characters are not allowed.");
        }else {
            System.out.println("Special characters are allowed.");
        }
    }

    public void enter_National_Identification_Number_Maxlength() throws Throwable {
        WebElement nicNoInputbox = driver.findElement(By.xpath("//input[@id='nationalId']"));
        nicNoInputbox.sendKeys("abcdefghijklmnopqrstuvwxyz");
        String typedValue = nicNoInputbox.getAttribute("value");

        int size = typedValue.length();
        System.out.println("National Identification Number :");

        if (size == 20) {
            System.out.println("Text are allowed. Max character functionality=20 is working fine.");
        }
        else {
            System.out.println("Text are allowed. No limit is set.");
        }

        nicNoInputbox.clear();
        nicNoInputbox.sendKeys("12345");
        String typedValue2 = nicNoInputbox.getAttribute("value");
        int size1 = typedValue.length();

        if (size1 == 0) {
            System.out.println("Numbers are not allowed.");
        }else {
            System.out.println("Numbers are allowed.");
        }

        nicNoInputbox.clear();
        nicNoInputbox.sendKeys("#%$%&");
        String typedValue1 = nicNoInputbox.getAttribute("value");
        int size2 = typedValue1.length();

        if (size2 == 0) {
            System.out.println("Special characters are not allowed.");
        }else {
            System.out.println("Special characters are allowed.");
        }
    }
}
