package com.wavenet.stepDefinition;

import com.wavenet.pages.Intent;
import com.wavenet.pages.Login;
import com.wavenet.util.Config;
import cucumber.api.java.en.Given;

public class IntentSteps {

    private Config config = new Config();
    private Intent intent = new Intent();
    private Login login = new Login();

    String composeUrl = config.getComposeUrl();
    String DocGpUsername = config.getNewDocGpUsername();
    String DocGpPassword = config.getNewDocGpPassword();

    @Given("^Login to DocGP Successfully$")
    public void login_to_DocGP_Successfully() throws Throwable {
        intent.composeLogin(composeUrl,DocGpUsername,DocGpPassword);
    }
    @Given("^Successfully login System$")
    public void successfully_login_System() throws Throwable {

    }



}
