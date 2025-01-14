package com.wavenet.stepDefinition;

import com.wavenet.pages.DoctorView;
import com.wavenet.pages.DoctorCreation;
import com.wavenet.pages.Login;
import com.wavenet.util.Config;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DoctorViewSteps {
    private DoctorViewSteps doctorViewSteps = new DoctorViewSteps();
    private Login login = new Login();
    private Config config = new Config();
    String url = config.getUrl();

    String ComposeUrl = config.getComposeUrl();
    String ComposeUsername = config.getNewDocGpUsername();
    String ComposePassword = config.getNewDocGpPassword();


    @Then("^Verify the view Doctor Title in Doctor details page \"([^\"]*)\"$")
    public void verify_the_view_Doctor_Title_in_Doctor_details_page(String ViewDoctor) throws Throwable {
        verify_the_Doctor_title_with_name(ViewDoctor);
    }

    @Then("^Verify the Doctor title with name\"([^\"]*)\"$")
    public void verify_the_Doctor_title_with_name(String DoctorExpectedResult) throws Throwable {
        verify_the_Doctor_title_with_name(DoctorExpectedResult);
    }

    @Then("^Verify the Personal Details title \"([^\"]*)\"$")
    public void verify_the_Personal_Details_title(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Full label name \"([^\"]*)\"$")
    public void verify_the_Full_label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Gender Label name \"([^\"]*)\"$")
    public void verify_the_Gender_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the NIC Label name \"([^\"]*)\"$")
    public void verify_the_NIC_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the DOB Label name \"([^\"]*)\"$")
    public void verify_the_DOB_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Mobile Label name \"([^\"]*)\"$")
    public void verify_the_Mobile_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Email Address Label name \"([^\"]*)\"$")
    public void verify_the_Email_Address_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Address Label name \"([^\"]*)\"$")
    public void verify_the_Address_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Passport Label name \"([^\"]*)\"$")
    public void verify_the_Passport_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Professional Details Title Professional Details \"([^\"]*)\"$")
    public void verify_the_Professional_Details_Title_Professional_Details(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the SLMC Label name \"([^\"]*)\"$")
    public void verify_the_SLMC_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the TIN Label name \"([^\"]*)\"$")
    public void verify_the_TIN_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Practicing Hospital Label name\"([^\"]*)\"$")
    public void verify_the_Practicing_Hospital_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Qualification Label name \"([^\"]*)\"$")
    public void verify_the_Qualification_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Language Label name \"([^\"]*)\"$")
    public void verify_the_Language_Label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^Verify the Practitioners bo label name \"([^\"]*)\"$")
    public void verify_the_Practitioners_bo_label_name(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
    @Then("^Check whether the Full name field is editable or not$")
    public void check_whether_the_Full_name_field_is_editable_or_not() throws Throwable {

    }




}
