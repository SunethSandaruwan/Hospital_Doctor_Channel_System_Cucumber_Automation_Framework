package com.wavenet.stepDefinition;

import com.wavenet.pages.DoctorCreation;
import com.wavenet.pages.Login;
import com.wavenet.util.Config;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class DoctorCreationSteps {

    private DoctorCreation doctorCreation = new DoctorCreation();
    private Login login = new Login();
    private Config config = new Config();
    String url = config.getUrl();

    String ComposeUrl = config.getComposeUrl();
    String ComposeUsername = config.getNewDocGpUsername();
    String ComposePassword = config.getNewDocGpPassword();

    @When("^Click on Doctor$")
    public void click_on_Doctor() throws Throwable {
        doctorCreation.click_on_Doctor();
    }
    @Then("^Verify the Home Page load$")
    public void verify_the_Home_Page_load() throws Throwable {
        doctorCreation.verify_the_Home_Page_load();
    }
    @Given("^Login to GPAdmin Successfully$")
    public void login_to_GPAdmin_Successfully() throws Throwable {
        doctorCreation.login_to_GPAdmin_Successfully(ComposeUrl,ComposeUsername,ComposePassword);
    }

    @When("^Click on All Doctors$")
    public void click_on_All_Doctors() throws Throwable {
        doctorCreation.click_on_All_Doctors();
    }

    @When("^Verify the All Doctor Page Title \"([^\"]*)\"$")
    public void verify_the_All_Doctor_Page_Title(String GpDoctorPageTitle) throws Throwable {
        doctorCreation.verify_the_All_Doctor_Page_Title(GpDoctorPageTitle);
    }

    @When("^Verify the Add Doctor Button$")
    public void verify_the_Add_Doctor_Button() throws Throwable {
        doctorCreation.verify_the_Add_Doctor_Button();
    }

    @Then("^Click On Add Doctor Button$")
    public void click_On_Add_Doctor_Button() throws Throwable {
        doctorCreation.click_On_Add_Doctor_Button();
    }

    @Then("^Verify the Add Doctor Title \"([^\"]*)\"$")
    public void verify_the_Add_Doctor_Title(String GPAddDoctor) throws Throwable {
        doctorCreation.verify_the_Add_Doctor_Title(GPAddDoctor);
    }

    @Then("^Verify the Upload Logo Image$")
    public void verify_the_Upload_Logo_Image() throws Throwable {
        doctorCreation.verify_the_Upload_Logo_Image();
    }

    @Then("^Verify the All Mandatory fields in Add Doctor Page$")
    public void verify_the_All_Mandatory_fields_in_Add_Doctor_Page() throws Throwable {
        doctorCreation.verify_the_All_Mandatory_fields_in_Add_Doctor_Page();
    }

    @Then("^Click on Add Doctor Create Button$")
    public void click_on_Add_Doctor_Create_Button() throws Throwable {
        doctorCreation.click_on_Add_Doctor_Create_Button();
    }
    @Then("^Click on Upload Button$")
    public void click_on_Upload_Button() throws Throwable {
        doctorCreation.click_on_Upload_Button();
    }

    @Then("^Doctor profile image uploading$")
    public void doctor_profile_image_uploading() throws Throwable {
        doctorCreation.doctor_profile_image_uploading();
    }

    @Then("^Click on the title field$")
    public void click_on_the_title_field() throws Throwable {
        doctorCreation.click_on_the_title_field();
    }

    @Then("^Select the valid Doctor title$")
    public void select_the_valid_Doctor_title() throws Throwable {
        doctorCreation.select_the_valid_Doctor_title();
    }

    @Then("^Enter User First name \"([^\"]*)\"$")
    public void enter_User_First_name(String DoctorFirstName) throws Throwable {
        doctorCreation.enter_User_First_name(DoctorFirstName);
    }

    @Then("^Enter User Last name \"([^\"]*)\"$")
    public void enter_User_Last_name(String DoctorLastName) throws Throwable {
        doctorCreation.enter_User_Last_name(DoctorLastName);
    }

    @Then("^Enter User Display name \"([^\"]*)\"$")
    public void enter_User_Display_name(String DisplayDoctorName) throws Throwable {
        doctorCreation.enter_User_Display_name(DisplayDoctorName);
    }

    @Then("^Click on gender field$")
    public void click_on_gender_field() throws Throwable {
        doctorCreation.click_on_gender_field();
    }

    @Then("^Select the Gender$")
    public void select_the_Gender() throws Throwable {
        doctorCreation.select_the_Gender();
    }

    @Then("^Click on the Date of Birth$")
    public void click_on_the_Date_of_Birth() throws Throwable {
        doctorCreation.click_on_the_Date_of_Birth();
    }

    @Then("^Select the Date of Birth$")
    public void select_the_Date_of_Birth() throws Throwable {
        doctorCreation.select_the_Date_of_Birth();
    }

    @Then("^Enter Mobile Number \"([^\"]*)\"$")
    public void enter_Mobile_Number(String MobileNumber) throws Throwable {
        doctorCreation.enter_Mobile_Number(MobileNumber);
    }

    @Then("^Enter Email Address \"([^\"]*)\"$")
    public void enter_Email_Address(String EmailAddress) throws Throwable {
        doctorCreation.enter_Email_Address(EmailAddress);
    }

    @Then("^Enter Doctor Address \"([^\"]*)\"$")
    public void enter_Doctor_Address(String DoctorAddress) throws Throwable {
        doctorCreation.enter_Doctor_Address(DoctorAddress);
    }

    @Then("^Enter Doctor NIC Number \"([^\"]*)\"$")
    public void enter_Doctor_NIC_Number(String EnterDoctorNICNo) throws Throwable {
        doctorCreation.enter_Doctor_NIC_Number(EnterDoctorNICNo);
    }

    @Then("^Enter Passport Number \"([^\"]*)\"$")
    public void enter_Passport_Number(String DoctorPassportNo) throws Throwable {
        doctorCreation.enter_Passport_Number(DoctorPassportNo);
    }

    @Then("^Enter Doctor Bio Details \"([^\"]*)\"$")
    public void enter_Doctor_Bio_Details(String DoctorBio) throws Throwable {
        doctorCreation.enter_Doctor_Bio_Details(DoctorBio);
    }


    @Then("^Verify the Doctor professional Info title$")
    public void verify_the_Doctor_professional_Info_title() throws Throwable {
        doctorCreation.verify_the_Doctor_professional_Info_title();
    }

    @Then("^Enter Doctor SLMC Reg No \"([^\"]*)\"$")
    public void enter_Doctor_SLMC_Reg_No(String SlMCRegNo) throws Throwable {
        doctorCreation.enter_Doctor_SLMC_Reg_No(SlMCRegNo);
    }

    @Then("^Enter Doctor TIN Number \"([^\"]*)\"$")
    public void enter_Doctor_TIN_Number(String TINNumber) throws Throwable {
        doctorCreation.enter_Doctor_TIN_Number(TINNumber);
    }

    @Then("^Click on SLMC Reg issues date field$")
    public void click_on_SLMC_Reg_issues_date_field() throws Throwable {

    }

    @Then("^CLick on Practicing Hospital \"([^\"]*)\"$")
    public void click_on_Practicing_Hospital(String arg1) throws Throwable {

    }

    @Then("^Verify the Successfully Doctor onboarding Popup message$")
    public void verify_the_Successfully_Doctor_onboarding_Popup_message() throws Throwable {

    }
    @When("^Click on Add Doctor Cancel Button$")
    public void click_on_Add_Doctor_Cancel_Button() throws Throwable {
        doctorCreation.click_on_Add_Doctor_Cancel_Button();
    }
    @Then("^Verify the Error message \"([^\"]*)\"$")
    public void verify_the_Error_message(String FirstNamePopMessage) throws Throwable {
        doctorCreation.verify_the_Error_message(FirstNamePopMessage);
    }
    @Then("^Verify the Last name Field$")
    public void verify_the_Last_name_Field() throws Throwable {
        doctorCreation.verify_the_Last_name_Field();
    }
    @Then("^Click on Gender Dropdown$")
    public void click_on_Gender_Dropdown() throws Throwable {

    }
    @When("^Click on the Search Doctor$")
    public void click_on_the_Search_Doctor() throws Throwable {
        doctorCreation.click_on_the_Search_Doctor();
    }
    @Then("^Enter your Search name Result \"([^\"]*)\"$")
    public void enter_your_Search_name_Result(String DeleteDoctorName ) throws Throwable {
        doctorCreation.enter_your_Search_name_Result(DeleteDoctorName);
    }
    @Then("^verify Selected Gender$")
    public void verifySelectedGender() throws Throwable {
         doctorCreation.verifySelectedGender();
    }
    @Then("^Select the Gender name \"([^\"]*)\"$")
    public void select_the_Gender_name(String selectedGender) throws Throwable {
        doctorCreation.select_the_Gender_name(selectedGender);
    }
    @Then("^Click on the Doctor Delete Button$")
    public void click_on_the_Doctor_Delete_Button() throws Throwable {
        doctorCreation.click_on_the_Doctor_Delete_Button();
    }
    @Then("^Verify the Conformation Delete Popup Message Title$")
    public void verify_the_Conformation_Delete_Popup_Message_Title() throws Throwable {
        doctorCreation.verify_the_Conformation_Delete_Popup_Message_Title();
    }
    @Then("^Click on Delete Conformation Button$")
    public void click_on_Delete_Conformation_Button() throws Throwable {
        doctorCreation.click_on_Delete_Conformation_Button();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Then("^Click on Text Bold button in Doctor Bio \"([^\"]*)\"$")
    public void click_on_Text_Bold_button_in_Doctor_Bio(String BoldTextAutomation) throws Throwable {
        doctorCreation.click_on_Text_Bold_button_in_Doctor_Bio(BoldTextAutomation);
    }

    @Then("^Click on Text Italic button in Doctor Bio \"([^\"]*)\"$")
    public void click_on_Text_Italic_button_in_Doctor_Bio(String ItalicTextAutomation) throws Throwable {
        doctorCreation.click_on_Text_Italic_button_in_Doctor_Bio(ItalicTextAutomation);
    }

    @Then("^Click on Text Underline button in Doctor Bio \"([^\"]*)\"$")
    public void click_on_Text_Underline_button_in_Doctor_Bio(String UnderlineTextAutomation) throws Throwable {
        doctorCreation.click_on_Text_Underline_button_in_Doctor_Bio(UnderlineTextAutomation);
    }

    @Then("^Click on Text Strike button in Doctor Bio \"([^\"]*)\"$")
    public void click_on_Text_Strike_button_in_Doctor_Bio(String StrikeTextAutomation) throws Throwable {
        doctorCreation.click_on_Text_Strike_button_in_Doctor_Bio(StrikeTextAutomation);
    }

    @Then("^Enter All Text Editors Bold Italic Underline Strike \"([^\"]*)\"$")
    public void enter_All_Text_Editors_Bold_Italic_Underline_Strike(String AllTextAutomation) throws Throwable {
        doctorCreation.enter_All_Text_Editors_Bold_Italic_Underline_Strike(AllTextAutomation);
    }

    @Then("^Click on HOne Heading button in Doctor Bio \"([^\"]*)\"$")
    public void click_on_HOne_Heading_button_in_Doctor_Bio(String H1HeadingTextAutomation) throws Throwable {
        doctorCreation.click_on_HOne_Heading_button_in_Doctor_Bio(H1HeadingTextAutomation);
    }
    @Then("^Click on HTwo Heading button in Doctor Bio \"([^\"]*)\"$")
    public void click_on_HTwo_Heading_button_in_Doctor_Bio(String H2HeadingTextAutomation) throws Throwable {
        doctorCreation.click_on_HTwo_Heading_button_in_Doctor_Bio(H2HeadingTextAutomation);
    }

    @Then("^Verify the Doctor Profile Successfully Create Massage$")
    public void verify_the_Doctor_Profile_Successfully_Create_Massage() throws Throwable {
        doctorCreation.verify_the_Doctor_Profile_Successfully_Create_Massage();
    }

    @Then("^Click on Doctor Profile view Button$")
    public void click_on_Doctor_Profile_view_Button() throws Throwable {
        doctorCreation.click_on_Doctor_Profile_view_Button();
    }

    @Then("^Verify the view Doctor Title \"([^\"]*)\"$")
    public void verify_the_view_Doctor_Title(String ViewDoctorTitle) throws Throwable {
        doctorCreation.verify_the_view_Doctor_Title(ViewDoctorTitle);
    }

    @Then("^Verify the Doctor Bio Label Name$")
    public void verify_the_Doctor_Bio_Label_Name() throws Throwable {
        doctorCreation.verify_the_Doctor_Bio_Label_Name();
    }

    @Then("^Verify the Text Bold button in Doctor Bio \"([^\"]*)\"$")
    public void verify_the_Text_Bold_button_in_Doctor_Bio(String BoldText) throws Throwable {
        doctorCreation.verify_the_Text_Bold_button_in_Doctor_Bio(BoldText);
    }

    @Then("^Verify the Text Italic button in Doctor Bio \"([^\"]*)\"$")
    public void verify_the_Text_Italic_button_in_Doctor_Bio(String ItalicText) throws Throwable {
        doctorCreation.verify_the_Text_Italic_button_in_Doctor_Bio(ItalicText);
    }

    @Then("^Verify the Text Underline button in Doctor Bio \"([^\"]*)\"$")
    public void verify_the_Text_Underline_button_in_Doctor_Bio(String UnderlineText) throws Throwable {
        doctorCreation.verify_the_Text_Underline_button_in_Doctor_Bio(UnderlineText);
    }

    @Then("^Verify the Strike Button in Doctor Bio \"([^\"]*)\"$")
    public void verify_the_Strike_Button_in_Doctor_Bio(String StrikeText) throws Throwable {
        doctorCreation.verify_the_Strike_Button_in_Doctor_Bio(StrikeText);
    }

    @Then("^Click on view Doctor close Button$")
    public void click_on_view_Doctor_close_Button() throws Throwable {
        doctorCreation.click_on_view_Doctor_close_Button();
    }
    @Then("^Click on the swipe forward and Backward in Date Piker$")
    public void click_on_the_swipe_forward_and_Backward_in_Date_Piker() throws Throwable {
        doctorCreation.click_on_the_swipe_forward_and_Backward_in_Date_Piker();
    }
    @Then("^Verify the label of Date of Birth in View Doctor profile$")
    public void verify_the_label_of_Date_of_Birth_in_View_Doctor_profile() throws Throwable {
        doctorCreation.verify_the_label_of_Date_of_Birth_in_View_Doctor_profile();
    }
    @Then("^Verify the DOB Format \"([^\"]*)\"$")
    public void verify_the_DOB_Format(String ViewDateFormat) throws Throwable {
        doctorCreation.verify_the_DOB_Format(ViewDateFormat);
    }
    @Then("^Verify the should accept only the numeric value by entering the special character$")
    public void verify_the_should_accept_only_the_numeric_value_by_entering_the_special_character() throws Throwable {
        doctorCreation.verify_the_should_accept_only_the_numeric_value_by_entering_the_special_character();
    }

    @Then("^Verify the Error message in only the numeric value by entering the special character\\.$")
    public void verify_the_Error_message_in_only_the_numeric_value_by_entering_the_special_character() throws Throwable {
        doctorCreation.verify_the_Error_message_in_only_the_numeric_value_by_entering_the_special_character();
    }
    @Then("^Enter adding more digits than the actual mobile number \"([^\"]*)\"$")
    public void enter_adding_more_digits_than_the_actual_mobile_number(String MoreThanNumbersInMobileNo) throws Throwable {
        doctorCreation.enter_adding_more_digits_than_the_actual_mobile_number(MoreThanNumbersInMobileNo);
    }

    @Then("^Verify the Error Message adding more digits than Mobile number \"([^\"]*)\"$")
    public void verify_the_Error_Message_adding_more_digits_than_Mobile_number(String MobileNumberMoreThanErrorMessage) throws Throwable {
        doctorCreation.verify_the_Error_Message_adding_more_digits_than_Mobile_number(MobileNumberMoreThanErrorMessage);
    }

    @Then("^Verify the Error popup message in adding more digits than Mobile number \"([^\"]*)\"$")
    public void verify_the_Error_popup_message_in_adding_more_digits_than_Mobile_number(String MobileNumberMoreThanPopupErrorMessage) throws Throwable {
        doctorCreation.verify_the_Error_popup_message_in_adding_more_digits_than_Mobile_number(MobileNumberMoreThanPopupErrorMessage);
    }
    @Then("^Enter Valid Doctor Email Address \"([^\"]*)\"$")
    public void enter_Valid_Doctor_Email_Address(String EnterEmailAddress) throws Throwable {
        doctorCreation.enter_Valid_Doctor_Email_Address(EnterEmailAddress);
    }
    @Then("^Verify the Valid SLMC Reg No \"([^\"]*)\"$")
    public void verify_the_Valid_SLMC_Reg_No(String ValidSLMCRegNo) throws Throwable {
        doctorCreation.verify_the_Valid_SLMC_Reg_No(ValidSLMCRegNo); // Back-Up Xpath in SLMCNo
    }
    @Then("^Verify the TIN field is Numeric Values \"([^\"]*)\"$")
    public void verify_the_TIN_field_is_Numeric_Values(String TinNumericValues) throws Throwable {
        doctorCreation.verify_the_TIN_field_is_Numeric_Values(TinNumericValues);
    }
    @Then("^Click on SLMC Id issued Date Picker$")
    public void click_on_SLMC_Id_issued_Date_Picker() throws Throwable {
        doctorCreation.click_on_SLMC_Id_issued_Date_Picker();
    }
    @Then("^Enter Practicing Hospital Name \"([^\"]*)\"$")
    public void enter_Practicing_Hospital_Name(String PracticingHos) throws Throwable {
        doctorCreation.enter_Practicing_Hospital_Name(PracticingHos);
    }
    @Then("^Verify the Professional Info label \"([^\"]*)\"$")
    public void verify_the_Professional_Info_label(String PersonalInfoIeb) throws Throwable {
        doctorCreation.verify_the_Professional_Info_label(PersonalInfoIeb);
    }
    @Then("^Verify the passport number should be twenty one characters long valid number \"([^\"]*)\"$")
    public void verify_the_passport_number_should_be_twenty_one_characters_long_valid_number(String PassportNo) throws Throwable {
        doctorCreation.verify_the_passport_number_should_be_twenty_one_characters_long_valid_number(PassportNo);
    }
    @Then("^Verify the Max error message in passport field \"([^\"]*)\"$")
    public void verify_the_Max_error_message_in_passport_field(String ErrorMessage) throws Throwable {
        doctorCreation.verify_the_Max_error_message_in_passport_field(ErrorMessage);
    }
    @Then("^Verify the Add Doctor window getting closed or not \"([^\"]*)\"$")
    public void verify_the_Add_Doctor_window_getting_closed_or_not(String SuccessfullyReDirect) throws Throwable {
        doctorCreation.verify_the_Add_Doctor_window_getting_closed_or_not(SuccessfullyReDirect);
    }
    @Then("^Enter the values passport field by entering the combination of number and blank space \"([^\"]*)\"$")
    public void enter_the_values_passport_field_by_entering_the_combination_of_number_and_blank_space(String BlankSpacePassportNo) throws Throwable {
        doctorCreation.enter_the_values_passport_field_by_entering_the_combination_of_number_and_blank_space(BlankSpacePassportNo);
    }
    @Then("^Verify Passport Error message in combination of number and blank space \"([^\"]*)\"$")
    public void verify_Passport_Error_message_in_combination_of_number_and_blank_space(String ValidErrorMessage) throws Throwable {
        doctorCreation.verify_Passport_Error_message_in_combination_of_number_and_blank_space(ValidErrorMessage);
    }
    @Then("^Enter valid Passport Number \"([^\"]*)\"$")
    public void enter_valid_Passport_Number(String ValidPassportNumber) throws Throwable {
        doctorCreation.enter_valid_Passport_Number(ValidPassportNumber);
    }
    @When("^Verify the Create and Close button in Add Doctor page$")
    public void verify_the_Create_and_Close_button_in_Add_Doctor_page() throws Throwable {
        doctorCreation.verify_the_Create_and_Close_button_in_Add_Doctor_page();
    }
    @Then("^Verify the New Sri Lanka NIC Card max characters \"([^\"]*)\"$")
    public void verify_the_New_Sri_Lanka_NIC_Card_max_characters(String SendNIC) throws Throwable {
        doctorCreation.verify_the_New_Sri_Lanka_NIC_Card_max_characters(SendNIC);
    }
    @Then("^Verify the NIC Error message \"([^\"]*)\"$")
    public void verify_the_NIC_Error_message(String MaxNICErrorMessage) throws Throwable {
        doctorCreation.verify_the_NIC_Error_message(MaxNICErrorMessage);
    }
    @Then("^Verify the NIC Card max characters error message \"([^\"]*)\"$")
    public void verify_the_NIC_Card_max_characters_error_message(String PopUpErrorMessage) throws Throwable {
        doctorCreation.verify_the_NIC_Card_max_characters_error_message(PopUpErrorMessage);
    }
    @Then("^Enter valid Old NIC Number in NIC Field \"([^\"]*)\"$")
    public void enter_valid_Old_NIC_Number_in_NIC_Field(String NICNumber) throws Throwable {
        doctorCreation.enter_valid_Old_NIC_Number_in_NIC_Field(NICNumber);
    }


}
