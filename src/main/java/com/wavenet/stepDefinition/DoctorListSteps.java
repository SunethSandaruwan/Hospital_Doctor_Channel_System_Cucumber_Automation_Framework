package com.wavenet.stepDefinition;

import com.wavenet.pages.*;
import com.wavenet.util.Config;
import cucumber.api.java.en.*;


import com.wavenet.pages.DoctorCreation;
import com.wavenet.pages.Login;
import com.wavenet.util.Config;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class DoctorListSteps {

        private DoctorList doctorList=new DoctorList();
        private Login login = new Login();
        private Config config = new Config();
        String url = config.getUrl();

        String ComposeUrl = config.getComposeUrl();
        String ComposeUsername = config.getNewDocGpUsername();
        String ComposePassword = config.getNewDocGpPassword();

        @And("Verify All Doctors page header visibility")
        public void verifyAllDoctorsPageHeaderVisibility() throws InterruptedException {
                doctorList.verify_The_All_Doctors_Header();
        }
}
