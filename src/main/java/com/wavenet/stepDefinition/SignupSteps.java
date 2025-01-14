package com.wavenet.stepDefinition;

import com.wavenet.pages.Signup;
import com.wavenet.util.Config;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignupSteps {
    private Signup signup = new Signup();
    private Config config = new Config();
    String url = config.getUrl();

        @Given("^Open the browser and launch the application$")
    public void open_the_browser_and_launch_the_url() throws Throwable {
            Thread.sleep(5000);
            signup.loadURL(url);
    }

    @When("^Click on Log In Drop down$")
    public void click_on_Log_In_Drop_down() throws Throwable {
            signup.click_on_Log_In_Drop_Down();
    }

    @And("^Click on Sign In Button$")
    public void click_on_Sign_In_Button() throws Throwable {
        signup.click_on_Sign_In_Button();
    }

    @Then("^Direct to the sign in and sign up page$")
    public void direct_to_the_sign_in_and_sign_up_page() throws Throwable {
        signup.direct_to_the_sign_in_and_sign_up_page();
    }


    @And("^Click on Register Button$")
    public void click_on_Register_Button() throws Throwable {
        signup.click_on_Register_Button();
    }

    @And("^Enter First Name as '(.*?)'$")
    public void enter_First_Name(String firstName) throws Throwable {
        signup.enter_First_Name(firstName);
    }

    @And("^Enter Last Name as '(.*?)'$")
    public void enter_Last_Name(String lastName) throws Throwable {
        signup.enter_Last_Name(lastName);
    }

    @And("^Enter Email as '(.*?)'$")
    public void enter_Email(String email) throws Throwable {
        signup.enter_Email(email);
    }

    @And("^Click on drop down of country codes$")
    public void click_on_drop_down_of_country_codes() throws Throwable {
        signup.click_on_drop_down_of_country_codes();
    }

    @And("^Select the country from the drop down$")
    public void select_the_country_from_the_drop_down() throws Throwable {
        signup.select_the_country_from_the_drop_down();
    }

    @And("^Enter Mobile Number for sign up as '(.*?)'$")
    public void enter_Mobile_Number_for_sign_up(String mobileNumber) throws Throwable {
        signup.enter_Mobile_Number_for_sign_up(mobileNumber);
    }

    @Given("^Enter Password for sign up as '(.*?)'$")
    public void enter_Password_for_sign_up(String pwd) throws Throwable {
            signup.enter_Password_for_sign_up(pwd);
    }


    @And("^ReEnter password as '(.*?)'$")
    public void reenter_password(String pwd) throws Throwable {
        signup.reenter_password(pwd);
    }

    @And("^Enter National Identification Number as '(.*?)'$")
    public void enter_National_Identification_Number(String idNo) throws Throwable {
        signup.enter_National_Identification_Number(idNo);
    }

    @And("^Click on RegisterButton$")
    public void click_on_RegisterButton() throws Throwable {
        signup.click_on_RegisterButton();
    }

    @Then("^Field for SMS code is visible$")
    public void field_for_SMS_code_is_visible() throws Throwable {
        signup.field_for_SMS_code_is_visible();
    }

    @Then("^Direct to the sign up submission page$")
    public void direct_to_the_sign_up_submission_page() throws Throwable {
        signup.direct_to_the_sign_up_submission_page();
    }

//    test case 4

    @Then("^Display Please specify first name as '(.*?)'$")
    public void display_Please_specify_first_name(String firstName) throws Throwable {
        signup.display_Please_specify_first_name(firstName);
    }

    @Then("^Display Please specify last name as '(.*?)'$")
    public void display_Please_specify_last_name(String lastName) throws Throwable {
        signup.display_Please_specify_last_name(lastName);
    }

    @Then("^Display Please specify email as '(.*?)'$")
    public void display_Please_specify_email(String email) throws Throwable {
        signup.display_Please_specify_email(email);
    }

    @Then("^Display Please specify mobile number as '(.*?)'$")
    public void display_Please_specify_mobile_number(String mobileNumber) throws Throwable {
        signup.display_Please_specify_mobile_number(mobileNumber);
    }

    @Then("^Display Please specify password as '(.*?)'$")
    public void display_Please_specify_password(String pwd) throws Throwable {
        signup.display_Please_specify_password(pwd);
    }

    @Then("^Display MISSING_NATIONALID as '(.*?)'$")
    public void display_MISSING_NATIONALID(String nic) throws Throwable {
        signup.display_MISSING_NATIONALID(nic);
    }

    //    test case 5
    @And("^Enter Invalid Email as '(.*?)'$")
    public void enter_Invalid_Email(String email) throws Throwable {
        signup.enter_Invalid_Email(email);
    }

    @Then("^Display Invalid email address as '(.*?)'$")
    public void display_Invalid_email_address(String validationMsg) throws Throwable {
        signup.display_Invalid_Email_Address(validationMsg);
    }
    // test case 6

    @And("^Enter email with correct format as '(.*?)'$")
    public void enter_Email_with_Correct_Format(String email) throws Throwable {
        signup.enter_Email_with_correct_format(email);
    }

    // test case 7
    @And("^ReEnter different password as '(.*?)'$")
    public void reenter_Different_password(String pwd) throws Throwable {
        signup.reenter_Different_password(pwd);
    }

    @Then("^Display Password confirmation as '(.*?)'$")
    public void display_Password_confirmation(String emailValidation) throws Throwable {
        signup.display_Password_confirmation(emailValidation);
    }

    @Then("^Display validation text as '(.*?)'$")
    public void display_validation_text(String validationText) throws Throwable {
        signup.display_validation_text(validationText);
    }

    @And("^Enter PreRegistered Mobile Number as '(.*?)'$")
    public void enter_PreRegistered_Mobile_Number(String registeredMobileNumber) throws Throwable {
        signup.enter_PreRegistered_Mobile_Number(registeredMobileNumber);
    }

    @And("^Select USA from the drop down$")
    public void select_USA_from_the_drop_down() throws Throwable {
        signup.select_USA_from_the_drop_down();
    }

    @Then("^Check Mobile Number validation$")
    public void check_Mobile_Number_validation() throws Throwable {
        signup.check_Mobile_Number_validation();
    }

    @And("^Enter First Name Maxlength$")
    public void enter_First_Name_Maxlength() throws Throwable {
        signup.enter_First_Name_Maxlength();
    }

    @And("^Enter Last Name Maxlength$")
    public void enter_Last_Name_Maxlength() throws Throwable {
        signup.enter_Last_Name_Maxlength();
    }

    @And("^Enter Email Maxlength$")
    public void enter_Email_Maxlength() throws Throwable {
        signup.enter_Email_Maxlength();
    }

    @And("^Enter Mobile Number Maxlength$")
    public void enter_Mobile_Number_Maxlength() throws Throwable {
        signup.enter_Mobile_Number_Maxlength();
    }

    @And("^Enter National Identification Number Maxlength$")
    public void enter_National_Identification_Number_Maxlength() throws Throwable {
        signup.enter_National_Identification_Number_Maxlength();
    }
}
