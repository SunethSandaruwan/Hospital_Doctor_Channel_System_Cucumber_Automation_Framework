package com.wavenet.stepDefinition;

import com.wavenet.pages.Login;
import com.wavenet.util.Config;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginSteps {
    private Login login = new Login();
    private Config config = new Config();
    String url = config.getUrl();

    @When("^Click on the sign in button$")
    public void click_on_the_sign_in_button() throws Throwable {
        login.click_on_Log_in_Button();
    }
    @When("^Enter for login as \"([^\"]*)\"$")
    public void enter_for_login_as(String Username) throws Throwable {
        login.enter_for_login_as(Username);
    }
    @When("^Enter for password as \"([^\"]*)\"$")
    public void enter_for_password_as(String Password) throws Throwable {
        login.enter_for_password_as(Password);
    }
    @Then("^Navigate to the home page$")
    public void navigate_to_the_home_page() throws Throwable {
         login.navigate_to_the_home_page();
    }
    @When("^Enter a invalid Username \"([^\"]*)\" and valid password \"([^\"]*)\"$")
    public void enter_a_invalid_Username_and_valid_password(String InvalidUsername, String Password) throws Throwable {
        login.enter_a_invalid_Username_and_valid_password(InvalidUsername,Password);
    }
    @When("^Click on Sign in Button$")
    public void click_LogIn() throws Throwable {
            login.clickLogIn();
    }
    @Then("^Verify Error Message in invalid username and valid password$")
    public void verify_Error_Message_in_invalid_username_and_valid_password() throws Throwable {
            login.verify_Error_Message_in_invalid_username_and_valid_password();
    }
    @When("^Enter a valid username \"([^\"]*)\" and invalid password \"([^\"]*)\"$")
    public void enter_a_valid_username_and_invalid_password(String Username, String InvalidPassword) throws Throwable {
            login.enter_a_valid_username_and_invalid_password(Username,InvalidPassword);
    }
    @Then("^Verify Error Message in valid username and invalid Password$")
    public void verify_Error_Message_in_valid_username_and_invalid_Password() throws Throwable {
            login.verify_Error_Message_in_valid_username_and_invalid_Password();
    }
    @When("^Enter empty username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void enter_empty_username_and_password_Test(String EmptyUsername, String ValidPassword) throws Throwable {
            login.enter_empty_username_and_password_Test(EmptyUsername,ValidPassword);
    }
    @Then("^Verify Error Message in Empty username with password$")
    public void verify_Error_Message_in_Empty_username_with_password() throws Throwable {
            login.verify_Error_Message_in_Empty_username_with_password();
    }
    @When("^Enter empty Password \"([^\"]*)\" and Username \"([^\"]*)\"$")
    public void enter_empty_Password_and_Username(String ValidUsername, String EmptyPassword) throws Throwable {
            login.enter_empty_Password_and_Username(ValidUsername,EmptyPassword);
    }
    @Then("^Verify Error Message in Empty Password with Username$")
    public void verify_Error_Message_in_Empty_Password_with_Username() throws Throwable {
            login.verify_Error_Message_in_Empty_Password_with_Username();
    }
    @When("^Enter empty Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void enter_empty_Username_and_Password(String EmptyUsername, String EmptyPassword) throws Throwable {
            login.enter_empty_Username_and_Password(EmptyUsername, EmptyPassword);
    }
    @Then("^Verify Error Message in Empty Username and Empty Password$")
    public void verify_Error_Message_in_Empty_Username_and_Empty_Password() throws Throwable {
            login.verify_Error_Message_in_Empty_Username_and_Empty_Password();
    }
    @When("^Enter a valid Username \"([^\"]*)\" and valid \"([^\"]*)\"$")
    public void enter_a_valid_Username_and_valid(String ValidUsername, String ValidPassword ) throws Throwable {
            login.enter_a_valid_Username_and_valid(ValidUsername,ValidPassword);
    }
    @Then("^Click on eye icon$")
    public void click_on_eye_icon() throws Throwable {
            login.click_on_eye_icon();
    }
    @When("^Browser Quit$")
    public void browser_Quit() throws Throwable {
            login.browser_Quit();
        }
    }




