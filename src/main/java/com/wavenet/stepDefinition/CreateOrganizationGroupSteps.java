package com.wavenet.stepDefinition;

import com.wavenet.pages.DoctorCreation;
import com.wavenet.pages.Login;
import com.wavenet.pages.CreateOrganizationGroup;
import com.wavenet.util.Config;
import cucumber.api.java.en.When;

public class CreateOrganizationGroupSteps {

    private DoctorCreation doctorCreation = new DoctorCreation();
    private CreateOrganizationGroup organization = new CreateOrganizationGroup();
    private Login login = new Login();
    private Config config = new Config();
    String url = config.getUrl();

    String ComposeUrl = config.getComposeUrl();
    String ComposeUsername = config.getNewDocGpUsername();
    String ComposePassword = config.getNewDocGpPassword();

    @When("^Click on Organization$")
    public void click_on_Organization() throws Throwable {

    }
}
