package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.pages.DoctorCreation;
import com.wavenet.pages.Login;
import com.wavenet.util.InitializeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.gl.E;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.View;
import java.security.Key;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DoctorView {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Login login = new Login();
    private Config config = new Config();

    private By VerifyTheViewDoctorTitle = By.xpath("");
    private By ViewDoctorPageDoctorNameWithTitle = By.xpath("");


    public void verify_the_view_Doctor_Title_in_Doctor_details_page(String ViewDoctor) throws Throwable {
        Thread.sleep(5000);
        WebElement ViewDoctorTitle = driver.findElement(VerifyTheViewDoctorTitle);
        String actual_Result = ViewDoctorTitle.getText();
        String expected_Result =  "View Doctor" ;
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(expected_Result));
        System.out.println("Verify the View Doctor Page view is Success");
    }

    public void verify_the_Doctor_title_with_name(String DoctorExpectedResult) throws Throwable {
       Thread.sleep(5000);
        WebElement DoctorNameWithTitle = driver.findElement(ViewDoctorPageDoctorNameWithTitle);
        String actual_result = DoctorNameWithTitle.getText();
        String expected_Result = DoctorExpectedResult;
        assertEquals(actual_result,expected_Result);
        assertTrue(actual_result.contains(expected_Result));
        System.out.println("Verify the View Doctor Page Title with Doctor name");
    }
    public void check_whether_the_Full_name_field_is_editable_or_not() throws Throwable {
        Thread.sleep(5000);

    }
}
