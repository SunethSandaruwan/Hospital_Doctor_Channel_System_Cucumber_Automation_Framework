package com.wavenet.stepDefinition;

import com.wavenet.pages.Logout;
import com.wavenet.util.Config;
import cucumber.api.java.en.Then;

public class LogoutSteps {
    private Logout logout= new Logout();
    private Config config = new Config();
    String url = config.getUrl();
    @Then("^User Log Out$")
    public void user_Sing_Out() throws Throwable {
        logout.user_Sing_Out();
    }

}
