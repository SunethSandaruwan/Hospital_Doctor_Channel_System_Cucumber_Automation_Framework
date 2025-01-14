package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.pages.DoctorCreation;
import com.wavenet.pages.Login;
import com.wavenet.util.InitializeDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.gl.E;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.View;
import java.security.Key;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class DoctorCreation {

    public static WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor executor;
    private Login login = new Login();
    private Config config = new Config();
    private By VerifyTheHomePageTitle = By.xpath("//h2[@class='nav-title link']//child::img[@routerlink='/finance/dashboard']"); // Verify the home page title xpath
    private By ClickOnDoctorBtn = By.xpath("//span[contains(text(),\"Doctors\")]"); // Click on the Doctor button xpath (BackUp Xpath :- //mat-icon[@role='img']//following::span[text()=' Doctors']) or //span[text()=' Doctors']

    private By ClickOnAllDoctorBtn = By.xpath("//span[text()='All Doctors']"); // Click on the All Doctor button xpath (BackUp Xpath :- //mat-icon[@role='img']//following::span[text()='All Doctors'])
    private By VerifyTheAllDoctorPage = By.xpath("//h1[text()='All Doctors']"); // Verify the All Doctor title xpath
    private By AddDoctorButton = By.xpath("//span[text()=' Add Doctor ']"); // All Doctor ------> Add Doctor button xpath
    private By VerifyTheAddDoctorTitle = By.xpath("//span[text()=' Add Doctor ']"); // All Doctor -----> Add Doctor ---> Add Doctor Page Title (BackUp Xpath:- //mat-dialog-container[@role='dialog']//preceding::h2[text()='Add Doctor'])
    private By ClickOnAddDoctorCreateButton = By.xpath("//span[text()=\" Create \"]"); // All Doctor -----> Add Doctor ---> Create Button
    private By DoctorTitleFieldErrorMessage = By.xpath("//mat-error[text()=\" This field is required \"]"); // When User Click on Doctor Create (Create) Button then display the Red color error message!.
    private By FirstNameMandatoryErrorMessage = By.xpath("//mat-error[text()=\" First Name is required \"]"); // When User Click on Doctor Crate button then display the Mandatory Error message!.
    private By LastNameMandatoryErrorMessage = By.xpath("///mat-error[text()=' This field is required ']"); // When User Click on Create button then display the Mandatory Error message.
    private By DisplayMandatoryErrorMessage = By.xpath("//mat-error[text()=' Display Name is required ']"); // When User Click on Create button then mandatory error message
    private By GenderMandatoryErrorMessage = By.xpath("//mat-error[text()=' Gender is required ']"); // When User CLick on Create Button then mandatory error message.
    private By ClickOnDoctorImageUploadButton = By.xpath("//label[@for='uploadHospitalGroupLogo']"); // All Doctor ---> Image Upload Button xpath
    private By CLickOnDoctorTitleButton = By.xpath("//*[@id=\"title\"]"); // Click on Doctor title xpath
    private By SelectTheDoctorTitle = By.xpath("//span[normalize-space()='Mr.']"); // Select on Doctor title
    private By EnterDoctorFirstName = By.xpath("//input[@id='first-name']"); // Enter Doctor First Name
    private By EnterDoctorLastName = By.xpath("//*[@id=\"last name\"]"); // Enter Doctor Last Name
    private By EnterDoctorDisplayName = By.xpath("//input[@id=\"display-name\"]"); // Enter Doctor Display name
    private By ClickOnGenderField = By.xpath("//mat-select[@id='gender']");// Click On Doctor Gender Field
    private By SelectGender = By.xpath("//span[normalize-space()='Male']"); //Select the Gender
    private By ClickOnDOB = By.xpath("//input[@id='dob']");//Click on Date of Birthday
    private By SelectDOBYearAndMonth = By.xpath("//span[@id='mat-calendar-button-3']"); // Select the Year & Month in Date Piker
    private By MobileNumberErrorMessage = By.xpath("//mat-error[contains(text(),' Mobile Number is invalid ')]"); //Verify the Error message xpath in Doctor Mobile number
    private By EnterDoctorMobileNumber = By.xpath("//mat-label[@class='ng-tns-c29-22 ng-star-inserted']"); //Fill in the Doctor Mobile Number
    private By EnterDoctorEmailAddress = By.xpath("//input[@id='email']"); //Fill  in the Doctor Email address
    private By EnterDoctorAddress = By.xpath("//input[@id='address']"); //Fill in the Doctor Address
    private By EnterDoctorNIC = By.xpath("//input[@id='nationalIdNumber']"); //Fill in the Doctor NIC Number
    private By PassportNumber = By.xpath("//input[@id='passport']"); //Fill in the Doctor Passport Number
    private By DoctorBio = By.xpath("//*[@id=\"mat-dialog-2\"]/add-update-doctor/form/div/div[2]/div[12]/mat-label"); //Fill in the Doctor Bio Details
    private By DoctorSLMCRegNo = By.xpath("//*[@id=\"slmcNo\"]"); //Fill in the Doctor SLMC Reg No
    private By SLMCNo = By.id("slmcNo"); // SLMC Number in selenium locators
    private By DoctorTINNumber = By.xpath("//input[@id='tin']"); //Fill in the Doctor TIN No
    private By PracticingHospital = By.id("practice-hospital"); //Fill in the Practicing
    private By AddDoctorCancel = By.xpath("//span[normalize-space()='Close']"); //Click on Add Doctor Close button Xpath
    private By VerifyTheUserEntersNumericCharacters = By.xpath(""); //Enter Numeric Characters Value Xpath
    private By verifyTheLastNameFieldXpath = By.xpath(""); //Enter Last name label name xpath
    private By ClickOnSearchButton = By.xpath("//input[@placeholder='Search Practitioner Name']"); //Click on All Doctor page Search button xpath
    private By ClickOnDoctorProfileDeleteButton = By.xpath("//button[@mattooltip='Delete'][1]"); //Click on Doctor profile Delete Button
    private By GenderDropdownLocator = By.id("gender"); // Doctors (Main Manu) -> ALl Doctor -> Click on Add Button -> Select on Gender name xpath
    private By DoctorProfileDelete = By.xpath("//span[contains(text(),'delete')]"); // Doctors -> All Doctors -> Search Doctor name -> Doctor profile Delete Button Xpath
    private By DoctorProfileDeleteConformationTitleXpath = By.xpath("//h4[normalize-space()='Confirm Delete']"); //Doctors -> All Doctors -> Doctor Profile Delete button -> Popup Delete Conformation box -> Popup Title name
    private By ConformationButtonPopupDeleteButtonXpath = By.xpath("//span[contains(text(),' Confirm ')]"); //Doctors -> All Doctor -> Search doctor name -> Click on Doctor Delete button -> Popup Doctor Delete Conformation Box -> Delete Button xpath
    private By DoctorBioBoldBtn = By.xpath("//quill-editor[@id='doctorsbio']//span[1]//button[1]//*[name()='svg']//*[name()='path'][2]"); //Doctor -> All Doctors -> Add Doctor -> Doctor Bio -> Bold Button Xpath
    private By DoctorBioTextField = By.xpath("//div[@spellcheck='false']"); //Doctor -> All Doctors -> Add Doctor -> Doctor Bio Text Field
    private By DoctorBioItalicBtn = By.xpath("//quill-editor[@id='doctorsbio']//span[1]//button[2]//*[name()='svg']"); //Doctor -> All Doctors -> Add Doctor -> Italic Button Xpath
    private By DoctorBioUnderline = By.xpath("//quill-editor[@id='doctorsbio']//button[3]//*[name()='svg']//*[name()='path' and contains(@class,'ql-stroke')]"); //Doctor -> All Doctors -> Add Doctor -> Underline Button Xpath
    private By DoctorBioStrikeBtn = By.xpath("//button[@class='ql-strike']//*[name()='svg']//*[name()='path'][1]"); //Doctor -> All Doctors -> Add Doctor -> Strike Button Xpath
    private By DoctorBioH1Heading = By.xpath("//button[@value='1']//*[name()='svg']"); //Doctor -> All Doctors -> Add Doctor -> H1 Heading Button
    private By DoctorBioH2Heading = By.xpath("//button[@value='2']"); //Doctor -> All Doctors -> Add Doctor -> H2 Heading Button
    private By VerifyDoctorCreateSuccessfullyMessage = By.xpath(""); // Create a valid Doctor Create Successfully Popup Message Xpath
    private By ClickOnDoctorProfileViewBtn = By.xpath("//span[contains(text(),' visibility ')]"); //Doctor -> All Doctors -> Search Doctor name -> Select the Doctor and Click on View Button
    private By VerifyTheViewDoctorTitle = By.xpath("//h2[normalize-space()='View Doctor']"); //view Doctor Page Doctor's Title Verifying
    private By VerifyTheDoctorBioLabel = By.xpath("//span[contains(text(),\"Doctor's Bio\")]"); // View Doctor Page Doctor's Bio view page label xpath
    private By ViewDoctorBiosBoldText = By.xpath("//*[@id=\"bio\"]/p[1]/strong"); // View Doctor bio's Bold Text
    private By ViewDoctorBiosItalicText = By.xpath("//em[contains(text(),'Test ')]"); //View Doctor bio's Italic Text
    private By ViewDoctorBiosUnderline = By.xpath("//u[contains(text(),'Test')]"); //View Doctor bio's Underline Text
    private By ViewDoctorBiosStrike = By.xpath("//s[contains(text(),'Test')]"); //View Doctor bio's Strike Text
    private By ViewDoctorCloseBtn = By.xpath("//span[normalize-space()='Close']"); //View Doctor Page Close Button Xpath
    private By TheForwardInOneBtn = By.xpath("//button[@aria-label='Previous month']"); // Data picker forward Button Xpath
    private By TheBackwardInOneBtn = By.xpath("//button[@aria-label='Next month']"); //Data picker Backward Button Xpath
    private By DoctorProfileDateOfBirthViewPage = By.xpath("DoctorProfileDateOfBirthViewPage"); //Date of Birth in View Page Xpath
    private By DOBFormat = By.xpath("//span[@id='dob']"); //Date Format
    private By MobileNumberPopupErrorMessage = By.xpath(""); //Verify the Mobile Number Popup Error Message
    private By ProfessionalInfo = By.xpath("//h4[normalize-space()='Professional Info']"); //ProfessionalInfo Xpath
    private By MaxPasswordError = By.xpath("//mat-error[contains(text(),' Passport should not exceed 20 characters ')]"); //Passport max 21 character error message
    private By VerifyClosingAddDoctorPage  = By.xpath("");
    private By VerifyThePassportErrorMessageOne = By.xpath("//mat-error[contains(text(),' Passport is invalid ')]"); //Verify the Error Message in Passport
    private By NICErrorMessage = By.xpath("//mat-error[contains(text(),' NIC is invalid ')]"); //Max NIC Error Message
    private By PopNICErrorMessage = By.xpath("//*[@id=\"cdk-overlay-13\"]/snack-bar-container/div/div/simple-snack-bar/span/text()"); //Verify the NIC PopUp Message
    private By WelcomeMessage=By.xpath("//span[contains(text(),\"Welcome back Admin User\")]");
    private By SelectTheDOBMonth =By.xpath("");
    private By SelectTheDOBYear =By.xpath("");


    public DoctorCreation() {driver = InitializeDriver.getInstance().getDriver();
        executor = (JavascriptExecutor) driver;
    }
    public void verify_the_Home_Page_load() throws Throwable {
        Thread.sleep(5000);
        WebElement VerifyHomePage = driver.findElement(By.xpath("//img[@alt='welcome-img']"));
        VerifyHomePage.click();
        System.out.println("All Doctor title verification is pass");
    }
    public void click_on_Doctor() throws InterruptedException {
        Duration duration = Duration.ofSeconds(30);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(WelcomeMessage));
        WebElement VerifyDoctors = driver.findElement(ClickOnDoctorBtn);
        VerifyDoctors.click();
    }

    public void login_to_GPAdmin_Successfully(String ComposeUrl, String ComposeUsername, String ComposePassword) throws Throwable {
        login.loadGpLogin(ComposeUrl);
        Thread.sleep(10000);
        login.enterDocGpLoginData(ComposeUsername,ComposePassword);
        Thread.sleep(10000);
        login.ClickOnLogInBtn();
        Thread.sleep(10000);
    //    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    //    WebElement VerifyTheLogin = driver.findElement(VerifyTheHomePageTitle);
    //    VerifyTheLogin.isDisplayed();

    }
    public void click_on_All_Doctors() throws Throwable {
        Thread.sleep(3000);
  //    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement ClickOnAllDoctor = driver.findElement(ClickOnAllDoctorBtn);
        ClickOnAllDoctor.click();
    }

    public void verify_the_All_Doctor_Page_Title(String GpDoctorPageTitle) throws Throwable {
        Thread.sleep(3000);
        String actual_Result = driver.findElement(VerifyTheAllDoctorPage).getText();
        String expected_Result = GpDoctorPageTitle;
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(GpDoctorPageTitle));
        System.out.println("All Doctor title verification is pass");
    }
    public void verify_the_Add_Doctor_Button() throws Throwable {
        Thread.sleep(3000);
        WebElement VerifyAddDoctorButton = driver.findElement(AddDoctorButton);
        VerifyAddDoctorButton.isDisplayed();
    }
    public void click_On_Add_Doctor_Button() throws Throwable {
        Thread.sleep(3000);
        WebElement ClickOnAddDoctor = driver.findElement(AddDoctorButton);
        ClickOnAddDoctor.click();
    }
    public void verify_the_Add_Doctor_Title(String GPAddDoctor) throws Throwable {
        Thread.sleep(3000);
        String actual_Result = driver.findElement(VerifyTheAddDoctorTitle).getText();
        String expected_Result = GPAddDoctor;
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(GPAddDoctor));
        System.out.println("Add Doctor Title verification is pass");
    }
    public void verify_the_Upload_Logo_Image() throws Throwable {
        Thread.sleep(3000);

    }
    public void verify_the_All_Mandatory_fields_in_Add_Doctor_Page() throws Throwable {

        Thread.sleep(3000);
        //Verify the Doctor Title Field in mandatory or not.
        String Title_Field_Mandatory_Result_Data = "This field is required";
        String Title_Field_actual_Mandatory_Result = driver.findElement(DoctorTitleFieldErrorMessage).getText();
        String expected_Mandatory_Result = "This field is required";
        assertEquals(Title_Field_actual_Mandatory_Result,expected_Mandatory_Result);
        assertTrue(Title_Field_actual_Mandatory_Result.contains("This field is required"));
        System.out.println("Verified Title field Mandatory fields in Add Doctor Page");

        //Verify the First Name Text field in mandatory or not
        String First_Name_actual_Mandatory_Result = driver.findElement(FirstNameMandatoryErrorMessage).getText();
        String First_Name_expected_Mandatory_Result = " First Name is required ";
        assertEquals(First_Name_actual_Mandatory_Result,First_Name_expected_Mandatory_Result);
        assertTrue(Title_Field_actual_Mandatory_Result.contains(" First Name is required "));
        System.out.println("Verified First Name field Mandatory fields in Add Doctor Page");

        //Verify the Last name Text Field in mandatory or not
        String Last_Name_actual_Mandatory_Result = driver.findElement(LastNameMandatoryErrorMessage).getText();
        String Last_Name_expected_Mandatory_Result = " Last Name is required ";
        assertEquals(Last_Name_actual_Mandatory_Result,Last_Name_expected_Mandatory_Result);
        assertTrue(Last_Name_actual_Mandatory_Result.contains(" Last Name is required "));
        System.out.println("Verified Last Name field Mandatory fields in Add Doctor Page");

        //Verify the Display Name Text Field in mandatory or not
        String Display_Name_actual_Mandatory_Result = driver.findElement(DisplayMandatoryErrorMessage).getText();
        String Display_Name_expected_Mandatory_Result = " Display Name is required ";
        assertEquals(Display_Name_actual_Mandatory_Result,Display_Name_expected_Mandatory_Result);
        assertTrue(Display_Name_actual_Mandatory_Result.contains(" Display Name is required "));
        System.out.println("Verified the Display name field mandatory fields in Add Doctor page");

        //Verify the Gender Values in Mandatory or not
        String Gender_actual_Mandatory_Result = driver.findElement(GenderMandatoryErrorMessage).getText();
        String Gender_expected_Mandatory_Result = " Gender is required ";
        assertEquals(Gender_actual_Mandatory_Result,Gender_expected_Mandatory_Result);
        assertTrue(Gender_actual_Mandatory_Result.contains(" Gender is required "));
        System.out.println("Verified the Gender field mandatory fields in Add Doctor page");


        if (Title_Field_actual_Mandatory_Result==Title_Field_Mandatory_Result_Data){
                assertEquals(Title_Field_actual_Mandatory_Result,expected_Mandatory_Result);
                assertTrue(Title_Field_actual_Mandatory_Result.contains("This field is required"));
                System.out.println("Verified Title Field Mandatory fields in Add Doctor Page");
        }else if (First_Name_actual_Mandatory_Result==First_Name_expected_Mandatory_Result) {
                        assertEquals(First_Name_actual_Mandatory_Result,First_Name_expected_Mandatory_Result);
                        assertTrue(Title_Field_actual_Mandatory_Result.contains(" First Name is required "));
                        System.out.println("Verified First Name Mandatory fields in Add Doctor Page");
        } else if (Last_Name_actual_Mandatory_Result==Last_Name_expected_Mandatory_Result) {
                                assertEquals(Last_Name_actual_Mandatory_Result,Last_Name_expected_Mandatory_Result);
                                assertTrue(Last_Name_actual_Mandatory_Result.contains(" Last Name is required "));
                                System.out.println("Verify Last Name Mandatory field in Add Doctor Page");
        } else if (Display_Name_actual_Mandatory_Result==Display_Name_expected_Mandatory_Result) {
                                        assertEquals(Display_Name_actual_Mandatory_Result,Display_Name_expected_Mandatory_Result);
                                        assertTrue(Display_Name_actual_Mandatory_Result.contains(" Display Name is required "));
                                        System.out.println("Verified Display Name Field Mandatory fields in Add Doctor Page");
        } else if (Gender_actual_Mandatory_Result==Gender_actual_Mandatory_Result) {
                                                assertEquals(Display_Name_actual_Mandatory_Result,Display_Name_expected_Mandatory_Result);
                                                assertTrue(Display_Name_actual_Mandatory_Result.contains(" Gender is required "));
                                                System.out.println("Verified Gender Mandatory fields in Add Doctor Page");
        }

    }
    public void click_on_Upload_Button() throws Throwable {
        Thread.sleep(3000);
        WebElement ClickOnImageUploadButton = driver.findElement(ClickOnDoctorImageUploadButton);
        ClickOnImageUploadButton.click();
    }
    public void doctor_profile_image_uploading() throws Throwable {
        Thread.sleep(3000);
        WebElement upload_file = driver.findElement(ClickOnDoctorImageUploadButton);
        upload_file.sendKeys("resources/Images/doctorTestImage .jpg");
    }
    public void click_on_the_title_field() throws Throwable {
        Thread.sleep(3000);
        WebElement ClickOnTheTitleField = driver.findElement(CLickOnDoctorTitleButton);
        ClickOnTheTitleField.click();
    }
    public void click_on_Add_Doctor_Create_Button() throws Throwable {
        Thread.sleep(3000);
        WebElement ClickOnCreateBtn = driver.findElement(ClickOnAddDoctorCreateButton);
        ClickOnCreateBtn.click();
    }
    public void select_the_valid_Doctor_title() throws Throwable {
        Thread.sleep(3000);
        WebElement ClickOnMRDoctorTitle = driver.findElement(SelectTheDoctorTitle);
        ClickOnMRDoctorTitle.click();
    }
    public void enter_User_First_name(String DoctorFirstName) throws Throwable {
        Thread.sleep(3000);
        WebElement EnterFirstName = driver.findElement(EnterDoctorFirstName);
        EnterFirstName.sendKeys(DoctorFirstName);
    }
    public void enter_User_Last_name(String DoctorLastName) throws Throwable {
     // Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement EnterLastName = driver.findElement(EnterDoctorLastName);
        EnterLastName.sendKeys(DoctorLastName);
    }
    public void enter_User_Display_name(String DoctorDisplayName) throws Throwable {
     // Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement EnterDisplayName = driver.findElement(EnterDoctorDisplayName);
        EnterDisplayName.sendKeys(DoctorDisplayName);
    }
    public void click_on_gender_field() throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement ClickOnDoctorGenderField = driver.findElement(ClickOnGenderField);
        ClickOnDoctorGenderField.click();
    }
    public void select_the_Gender() throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement SelectDoctorGender = driver.findElement(SelectGender);
        SelectDoctorGender.click();
    }
    public void click_on_the_Date_of_Birth() throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement ClickOnDOBBtn = driver.findElement(ClickOnDOB);
        ClickOnDOBBtn.click();
    }

    /////////////////////////////////////////////////////
    public void select_the_Date_of_Birth() throws Throwable {
        Thread.sleep(5000);
        WebElement SelectTheYearlyMonth = driver.findElement(SelectDOBYearAndMonth);
        SelectTheYearlyMonth.click();
        WebElement Select_The_Month = driver.findElement(SelectTheDOBMonth);
        WebElement Select_The_Year = driver.findElement(SelectTheDOBYear);


    }
    public void enter_Mobile_Number(String MobileNumber) throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement EnterMobileNumber = driver.findElement(EnterDoctorMobileNumber);
        EnterMobileNumber.sendKeys(MobileNumber);
    }
    public void enter_Email_Address(String EmailAddress) throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement EnterEmailAddress = driver.findElement(EnterDoctorEmailAddress);
        EnterEmailAddress.sendKeys(EmailAddress);
    }
    public void enter_Doctor_Address(String DoctorAddress) throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement EnterDoctorPersonalAddress = driver.findElement(EnterDoctorAddress);
        EnterDoctorPersonalAddress.sendKeys(DoctorAddress);
    }
    public void enter_Doctor_NIC_Number(String EnterDoctorNICNo) throws Throwable {
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement EnterDoctorNICNumber = driver.findElement(EnterDoctorNIC);
        EnterDoctorNICNumber.sendKeys(EnterDoctorNICNo);
    }
    public void enter_Passport_Number(String DoctorPassportNo) throws Throwable {
        Thread.sleep(3000);
        WebElement EnterPassportNumber = driver.findElement(PassportNumber);
        EnterPassportNumber.sendKeys(DoctorPassportNo);
    }
    public void enter_Doctor_Bio_Details(String DoctorBioDetails) throws Throwable {
        Thread.sleep(3000);
        WebElement EnterDoctorBioDetails = driver.findElement(DoctorBio);
        EnterDoctorBioDetails.sendKeys(DoctorBioDetails);
    }
    public void verify_the_Doctor_professional_Info_title() throws Throwable {
        Thread.sleep(3000);
        String DoctorProfessional_actual_Result = driver.findElement(VerifyTheAllDoctorPage).getText();
        String DoctorProfessional_expected_Result = "Professional Info";
        assertEquals(DoctorProfessional_actual_Result,DoctorProfessional_expected_Result);
        assertTrue(DoctorProfessional_actual_Result.contains("Professional Info"));
        System.out.println("All Doctor professional Info title verification is pass");
    }
    public void enter_Doctor_SLMC_Reg_No(String SlMCRegNo) throws Throwable {
        Thread.sleep(3000);
        WebElement EnterDoctorSLMCRegNo = driver.findElement(DoctorSLMCRegNo);
        EnterDoctorSLMCRegNo.sendKeys(SlMCRegNo);
    }
    public void enter_Doctor_TIN_Number(String TINNUmber) throws Throwable {
        Thread.sleep(3000);
        WebElement EnterDoctorTINNumber = driver.findElement(DoctorTINNumber);
        EnterDoctorTINNumber.sendKeys(TINNUmber);
    }
    public void click_on_SLMC_Reg_issues_date_field() throws Throwable {
        Thread.sleep(3000);

    }
    public void click_on_Practicing_Hospital(String DoctorPracticingHospital) throws Throwable {
        Thread.sleep(3000);
        WebElement EnterPracticingHospital = driver.findElement(PracticingHospital);
        EnterPracticingHospital.sendKeys(DoctorPracticingHospital);
    }
    public void verify_the_Successfully_Doctor_onboarding_Popup_message() throws Throwable {
        Thread.sleep(3000);
        String SuccessfullyDoctorOnboarding_actual_Result = driver.findElement(VerifyTheAllDoctorPage).getText();
        String SuccessfullyDoctorOnboarding_expected_Result = "Test";
        assertEquals(SuccessfullyDoctorOnboarding_actual_Result,SuccessfullyDoctorOnboarding_expected_Result);
        assertTrue(SuccessfullyDoctorOnboarding_actual_Result.contains("Test"));
        System.out.println("All Doctor create verification is pass");

    }
    public void click_on_Add_Doctor_Cancel_Button() throws Throwable {
        Thread.sleep(3000);
        WebElement EnterAddDoctorCancelButton = driver.findElement(AddDoctorCancel);
        EnterAddDoctorCancelButton.click();
    }
    public void verify_the_Error_message(String FirstNamePopMessage) throws Throwable {
        Thread.sleep(3000);
        String ErrorMessage_actual_Result = driver.findElement(VerifyTheUserEntersNumericCharacters).getText();
        String ErrorMessage_expected_Result = "";
        assertEquals(ErrorMessage_actual_Result,ErrorMessage_expected_Result);
        assertTrue(ErrorMessage_actual_Result.contains(""));
        System.out.println("Verify the Error message");
    }
    public void verify_the_Last_name_Field() throws Throwable {
        Thread.sleep(5000);
        String LastNameLabel_actual_Result = driver.findElement(verifyTheLastNameFieldXpath).getText();
        String LastNameLabel_Expected_Result = "Last Name";
        assertEquals(LastNameLabel_actual_Result,LastNameLabel_Expected_Result);
        assertTrue(LastNameLabel_actual_Result.contains(""));
        System.out.println("Verify the last name Field");
    }
    public void click_on_Gender_Dropdown() throws Throwable {
        Thread.sleep(5000);
        WebElement ClickOnGenderDropDown = driver.findElement(ClickOnGenderField);
        ClickOnGenderDropDown.click();
    }
    public void select_the_Gender_name(String selectedGender) throws Throwable {
            WebElement genderDropdown = driver.findElement(GenderDropdownLocator);
        genderDropdown.sendKeys(selectedGender);

            // You can perform additional actions based on the selected gender
            if ("Male".equalsIgnoreCase(selectedGender)) {
                // Do something specific for Male
            } else if ("Female".equalsIgnoreCase(selectedGender)) {
                // Do something specific for Female
            } else {
                // Handle other cases
              //  Exception exception(clone());
            }
    }
    public void verifySelectedGender() {
        // Assuming there's an element displaying the selected gender with ID 'selectedGender'
        WebElement selectedGenderElement = driver.findElement(By.id("selectedGender"));
        String selectedGender = selectedGenderElement.getText();
        // Assert or verify the selected gender against the expected value
        assertEquals("Expected gender does not match the selected gender", "Male", selectedGender);
    }

    public void click_on_the_Search_Doctor() throws Throwable {
        Thread.sleep(3000);
        WebElement ClickOnSearchDoctorBtn = driver.findElement(ClickOnSearchButton);
        ClickOnSearchDoctorBtn.click();
    }
    public void enter_your_Search_name_Result(String DeleteDoctorName) throws Throwable {
        Thread.sleep(5000);
        WebElement EnterSearchNameAnswer = driver.findElement(ClickOnAllDoctorBtn);
        EnterSearchNameAnswer.sendKeys(DeleteDoctorName);
    }
    public void click_on_the_Doctor_Delete_Button() throws Throwable {
        Thread.sleep(5000);
        WebElement ClickOnDeleteButton = driver.findElement(DoctorProfileDelete);
        ClickOnDeleteButton.click();
    }
    public void verify_the_Conformation_Delete_Popup_Message_Title() throws Throwable {
        Thread.sleep(5000);
       // WebElement VerifyTheConformationTitle = driver.findElement(DoctorProfileDeleteConformationTitleXpath);

        String DoctorProfileDeletePageTitle_actual_Result = driver.findElement(DoctorProfileDeleteConformationTitleXpath).getText();
        String DoctorProfileDeletePageTitle_expected_Result = "Confirm Delete";
        assertEquals(DoctorProfileDeletePageTitle_actual_Result,DoctorProfileDeletePageTitle_expected_Result);
        assertTrue(DoctorProfileDeletePageTitle_actual_Result.contains("Confirm Delete"));
        System.out.println("All Doctor Profile Delete popup Title verification is pass");

    }
    public void click_on_Delete_Conformation_Button() throws Throwable {
        Thread.sleep(5000);
        WebElement ClickOnConformationPopupDeleteBtn = driver.findElement(ConformationButtonPopupDeleteButtonXpath);
        ClickOnConformationPopupDeleteBtn.click();
    }
    public void click_on_Text_Bold_button_in_Doctor_Bio(String BoldTextAutomation) throws Throwable {
        Thread.sleep(5000);
        //Click on "B"
        WebElement ClickOnBoldBtn = driver.findElement(DoctorBioBoldBtn);
        ClickOnBoldBtn.click();
        //When Enter Text Document in Doctor bio
        WebElement EnterDoctorBioTextField = driver.findElement(DoctorBioTextField);
        EnterDoctorBioTextField.sendKeys(BoldTextAutomation);
        EnterDoctorBioTextField.sendKeys(Keys.ENTER);
    }
    public void click_on_Text_Italic_button_in_Doctor_Bio(String ItalicTextAutomation) throws Throwable {
        Thread.sleep(5000);
        //Click on "I"
        WebElement ClickOnItalicBtn = driver.findElement(DoctorBioItalicBtn);
        ClickOnItalicBtn.click();
        //When Enter Text Document in Doctor bio

        WebElement EnterDoctorBioTextField = driver.findElement(DoctorBioTextField);
        EnterDoctorBioTextField.sendKeys(ItalicTextAutomation);
        EnterDoctorBioTextField.sendKeys(Keys.ENTER);
    }
    public void click_on_Text_Underline_button_in_Doctor_Bio(String UnderlineTextAutomation) throws Throwable {
        Thread.sleep(5000);
        //Click on "U"
        WebElement ClickOnUnderlineBtn = driver.findElement(DoctorBioUnderline);
        ClickOnUnderlineBtn.click();
        //When Enter Text Document in Doctor bio

        WebElement EnterDoctorBioTextField = driver.findElement(DoctorBioTextField);
        EnterDoctorBioTextField.sendKeys(UnderlineTextAutomation);
        EnterDoctorBioTextField.sendKeys(Keys.ENTER);
    }
    public void click_on_Text_Strike_button_in_Doctor_Bio(String StrikeTextAutomation) throws Throwable {
        Thread.sleep(5000);
        //Click on "S/"
        WebElement ClickOnStrikeBtn = driver.findElement(DoctorBioStrikeBtn);
        ClickOnStrikeBtn.click();
        //When Enter Text Document in Doctor bio

        WebElement EnterDoctorBioTextField = driver.findElement(DoctorBioTextField);
        EnterDoctorBioTextField.sendKeys(StrikeTextAutomation);
        EnterDoctorBioTextField.sendKeys(Keys.ENTER);
    }
    public void enter_All_Text_Editors_Bold_Italic_Underline_Strike(String AllTextAutomation) throws Throwable {
        Thread.sleep(5000);

    }
    public void click_on_HOne_Heading_button_in_Doctor_Bio(String H1HeadingTextAutomation) throws Throwable {
        Thread.sleep(5000);
        //Heading H1
        WebElement ClickOnHeadingH1Btn = driver.findElement(DoctorBioH1Heading);
        ClickOnHeadingH1Btn.click();
        //When Enter Text Document in Doctor Bio
        WebElement EnterDoctorBioTextField = driver.findElement(DoctorBioTextField);
        EnterDoctorBioTextField.sendKeys(H1HeadingTextAutomation);
        EnterDoctorBioTextField.sendKeys(Keys.ENTER);

    }
    public void click_on_HTwo_Heading_button_in_Doctor_Bio(String H2HeadingTextAutomation) throws Throwable {
        Thread.sleep(5000);
        //Heading H2
        WebElement ClickOnHeadingH2Btn = driver.findElement(DoctorBioH2Heading);
        ClickOnHeadingH2Btn.click();
        //When Enter Text Document in Doctor Bio
        WebElement EnterDoctorBioTextField = driver.findElement(DoctorBioTextField);
        EnterDoctorBioTextField.sendKeys(H2HeadingTextAutomation);
        EnterDoctorBioTextField.sendKeys(Keys.ENTER);
    }
    public void verify_the_Doctor_Profile_Successfully_Create_Massage() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //   WebElement SuccessfullyMessage = driver.findElement(VerifyDoctorCreateSuccessfullyMessage);

        String SuccessfullyMessage_actual_Result = driver.findElement(VerifyDoctorCreateSuccessfullyMessage).getText();
        String SuccessfullyMessage_expected_Result = "";
        assertEquals(SuccessfullyMessage_actual_Result,SuccessfullyMessage_expected_Result);
        assertTrue(SuccessfullyMessage_actual_Result.contains("The doctor created successfully."));
        System.out.println("Verify the Doctor Create Successfully message");
    }
    public void click_on_Doctor_Profile_view_Button() throws Throwable {
        Thread.sleep(5000);
        WebElement ClickOnDoctorProfileViewButton = driver.findElement(ClickOnDoctorProfileViewBtn);
        ClickOnDoctorProfileViewButton.click();
    }
    public void verify_the_view_Doctor_Title(String ViewDoctorTitle) throws Throwable {
        Thread.sleep(5000);
       // WebElement VerifyViewDoctorTit = driver.findElement(VerifyTheViewDoctorTitle);
        String actual_Result = driver.findElement(VerifyTheViewDoctorTitle).getText();
        String expected_Result = ViewDoctorTitle;
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(ViewDoctorTitle));
        System.out.println("Add Doctor Title verification is pass");

        if(actual_Result.equals(expected_Result)){
            System.out.println("Title Verification is pass!");
        }else {
            System.out.println("Title Verification is failed!");
        }
    }
    public void verify_the_Doctor_Bio_Label_Name() throws Throwable {
        Thread.sleep(5000);
        String actual_Result = driver.findElement(VerifyTheDoctorBioLabel).getText();
        String expected_Result = "Doctor's Bio";
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(expected_Result));
        System.out.println("Add Doctor bio label verification is pass");
    }
    public void verify_the_Text_Bold_button_in_Doctor_Bio(String BoldText) throws Throwable {
        Thread.sleep(5000);
        // Locate the element containing the text
        WebElement textElement = driver.findElement(ViewDoctorBiosBoldText);

        // Get the value of the 'font-weight' CSS property
        String fontWeight = textElement.getCssValue("font-weight");

        // Verify if the text is bold (font-weight is either "bold" or a numeric value >= 700)
        assertTrue("Text is not bold.", "bold".equals(fontWeight) || Integer.parseInt(fontWeight) >= 700);
    }
    public void verify_the_Text_Italic_button_in_Doctor_Bio(String ItalicText) throws Throwable {
        Thread.sleep(5000);
        // Locate the element containing the text
        WebElement textElement = driver.findElement(ViewDoctorBiosItalicText);

        // Get the value of the 'font-style' CSS property
        String fontStyle = textElement.getCssValue("font-style");

        // Verify if the text is italicized (font-style is "italic")
        if ("italic".equals(fontStyle)) {
            System.out.println("Text is italicized!");
        } else {
            System.out.println("Text is not italicized.");
        }

    }
    public void verify_the_Text_Underline_button_in_Doctor_Bio(String UnderlineText) throws Throwable {
       Thread.sleep(5000);
        WebElement textElement = driver.findElement(ViewDoctorBiosUnderline);
        // Get the value of the 'text-decoration' CSS property
        String textDecoration = textElement.getCssValue("text-decoration");

        // Verify if the text is underlined (text-decoration is "underline")
        if ("underline".equals(textDecoration)) {
            System.out.println("Text is underlined!");
        } else {
            System.out.println("Text is not underlined.");
        }
    }
    public void verify_the_Strike_Button_in_Doctor_Bio(String StrikeText) throws Throwable {
        Thread.sleep(5000);
        // Locate the element containing the text
        WebElement textElement = driver.findElement(ViewDoctorBiosStrike);

        // Get the value of the 'text-decoration' CSS property
        String textDecoration = textElement.getCssValue("text-decoration");

        // Verify if the text has a strikethrough (text-decoration is "line-through")
        if ("line-through".equals(textDecoration)) {
            System.out.println("Text has a strikethrough!");
        } else {
            System.out.println("Text does not have a strikethrough.");
        }
    }
    public void click_on_view_Doctor_close_Button() throws Throwable {
        Thread.sleep(5000);
        WebElement ViewDoctorCloseButton = driver.findElement(ViewDoctorCloseBtn);
        ViewDoctorCloseButton.click();
    }
    public void click_on_the_swipe_forward_and_Backward_in_Date_Piker() throws Throwable {
        Thread.sleep(5000);
        WebElement DOBSwipeTheForwardInOne = driver.findElement(TheForwardInOneBtn);
        DOBSwipeTheForwardInOne.click();
        DOBSwipeTheForwardInOne.click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        WebElement DOBSwipeTheBackwardInOne = driver.findElement(TheBackwardInOneBtn);
        DOBSwipeTheBackwardInOne.click();
        DOBSwipeTheBackwardInOne.click();
    }
    public void verify_the_label_of_Date_of_Birth_in_View_Doctor_profile() throws Throwable {
        Thread.sleep(5000);
        String actual_Result = driver.findElement(DoctorProfileDateOfBirthViewPage).getText();
        String expected_Result = "Date of Birth";
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains("Date of Birth"));
        System.out.println("Verify the Date of Birth");
    }
    public void verify_the_DOB_Format() throws Throwable {
        Thread.sleep(5000);
//        // Find the element containing the date (replace "your_date_element_id" with the actual ID)
//        WebElement dateElement = driver.findElement(By.id("your_date_element_id"));
//
//        // Get the displayed date text
//        String displayedDate = dateElement.getText();
//
//        // Define the expected date format (replace "yyyy-MM-dd" with your expected format)
//        String expectedFormat = "yyyy-MM-dd";
//
//        // Verify the date format using regular expression
//        Assert.assertTrue(displayedDate.matches("\\d{4}-\\d{2}-\\d{2}"), "Date does not match the expected format: " + expectedFormat);

        // Find the element containing the date (replace "your_date_element_id" with the actual ID)
        WebElement dateElement = driver.findElement(By.id("your_date_element_id"));
        String displayedDate = dateElement.getText();
        // Verify the date format using regular expression
    //    Assert.assertTrue(displayedDate.matches(expectedFormat), "Date does not match the expected format: " + expectedFormat);

    }
    public void verify_the_DOB_Format(String ViewDateFormat) throws Throwable {
        Thread.sleep(5000);
        WebElement dateElement = driver.findElement(DOBFormat);
        String displayedDate = dateElement.getText();
        String expectedFormat = ViewDateFormat;
        // Verify the date format using regular expression
        Assert.assertTrue("Date does not match the expected format: " + expectedFormat, displayedDate.matches("\\d{4}-\\d{2}-\\d{2}"));
    }
    public void verify_the_should_accept_only_the_numeric_value_by_entering_the_special_character() throws Throwable {
        Thread.sleep(5000);
        WebElement EnterMobileNumber = driver.findElement(EnterDoctorMobileNumber);
        EnterMobileNumber.sendKeys("Test Automation Data Mobile");
        WebElement VerifyTheErrorMessage = driver.findElement(MobileNumberErrorMessage);
        String ErrorMessage_actual_Result = VerifyTheErrorMessage.getText();
        String ErrorMessage_expected_Result = " Mobile Number is invalid ";
        assertEquals(ErrorMessage_actual_Result,ErrorMessage_expected_Result);
        assertTrue(ErrorMessage_actual_Result.contains(ErrorMessage_expected_Result));
        System.out.println("verified in Error Message");
        // Enter Special character in verify the error message
        WebElement VerifyTheSpecialCharacterErrorMessage = driver.findElement(MobileNumberErrorMessage);
        String ErrorMessage_SpecialCharacterErrorMessage_actual_Result = VerifyTheSpecialCharacterErrorMessage.getText();
        assertEquals(ErrorMessage_SpecialCharacterErrorMessage_actual_Result,ErrorMessage_expected_Result);
        assertTrue(ErrorMessage_SpecialCharacterErrorMessage_actual_Result.contains(ErrorMessage_expected_Result));
        System.out.println("verified in Special Character Error Message");

    }
    public void verify_the_Error_message_in_only_the_numeric_value_by_entering_the_special_character() throws Throwable {
        Thread.sleep(5000);
        WebElement VerifyThePopupMessage = driver.findElement(MobileNumberPopupErrorMessage);
        String ErrorMessage_actual_Result= VerifyThePopupMessage.getText();
        String ErrorMessage_expected_Result = "At least one of the required fields are empty or contain invalid data. Please check your input.";
        assertEquals(ErrorMessage_actual_Result,ErrorMessage_expected_Result);
        assertTrue(ErrorMessage_actual_Result.contains(ErrorMessage_expected_Result));
        System.out.println("verified in Error Message");
    }
    public void enter_adding_more_digits_than_the_actual_mobile_number(String MoreThanNumbersInMobileNo) throws Throwable {
        Thread.sleep(5000);
        WebElement EnterMobileNumber = driver.findElement(EnterDoctorMobileNumber);
        EnterMobileNumber.sendKeys(MoreThanNumbersInMobileNo);
    }
    public void verify_the_Error_Message_adding_more_digits_than_Mobile_number(String MobileNumberMoreThanErrorMessage) throws Throwable {
        Thread.sleep(5000);
        WebElement VerifyTheErrorMessage = driver.findElement(MobileNumberErrorMessage);
        String ErrorMessage_actual_Result= VerifyTheErrorMessage.getText();
        String ErrorMessage_expected_Result = MobileNumberMoreThanErrorMessage;
        assertEquals(ErrorMessage_actual_Result,ErrorMessage_expected_Result);
        assertTrue(ErrorMessage_actual_Result.contains(ErrorMessage_expected_Result));
        System.out.println("verified in Error Message in 13th Mobile Number");
    }

    public void verify_the_Error_popup_message_in_adding_more_digits_than_Mobile_number(String MobileNumberMoreThanPopupErrorMessage) throws Throwable {
        Thread.sleep(5000);
        String ErrorMessage_actual_Result= driver.findElement(MobileNumberErrorMessage).getText();
        String ErrorMessage_expected_Result = MobileNumberMoreThanPopupErrorMessage;
        assertEquals(ErrorMessage_actual_Result,ErrorMessage_expected_Result);
        assertTrue(ErrorMessage_actual_Result.contains(ErrorMessage_expected_Result));
        System.out.println("verified in Error Popup Message in 13th Mobile Number");
    }
    public void enter_Valid_Doctor_Email_Address(String EnterEmailAddress) throws Throwable {
        Thread.sleep(5000);
       WebElement EnterValidEmailAddress = driver.findElement(EnterDoctorEmailAddress);
       EnterValidEmailAddress.sendKeys(EnterEmailAddress);
    }
    public void verify_the_Valid_SLMC_Reg_No(String ValidSLMCRegNo) throws Throwable {
        Thread.sleep(5000);
        WebElement EnterValidSLMCRegNo = driver.findElement(DoctorSLMCRegNo);
        EnterValidSLMCRegNo.sendKeys(ValidSLMCRegNo);
    }
    public void verify_the_TIN_field_is_Numeric_Values(String TinNumericValues) throws Throwable {
        Thread.sleep(5000);
        WebElement TinNumber = driver.findElement(DoctorTINNumber);
        TinNumber.sendKeys(TinNumericValues);
    }
    public void click_on_SLMC_Id_issued_Date_Picker() throws Throwable {
        Thread.sleep(5000);
        WebElement ClickOnSLMCIDIssues = driver.findElement(SLMCNo);
        ClickOnSLMCIDIssues.click();
    }
    public void enter_Practicing_Hospital_Name(String PracticingHos) throws Throwable {
        Thread.sleep(5000);
        WebElement EnterPracticingHospitalName = driver.findElement(PracticingHospital);
        EnterPracticingHospitalName.sendKeys(PracticingHos);
    }
    public void verify_the_Professional_Info_label(String PersonalInfoLbl) throws Throwable {
        Thread.sleep(5000);
        WebElement ProfessionalInfoIn = driver.findElement(ProfessionalInfo);
        String actual_Result= ProfessionalInfoIn.getText();
        String expected_Result = PersonalInfoLbl;
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(expected_Result));
        System.out.println("verified in Practicing Hospital Name Title");
    }
    public void verify_the_passport_number_should_be_twenty_one_characters_long_valid_number(String PassportNo) throws Throwable {
        Thread.sleep(5000);
        WebElement EnterPassport = driver.findElement(PassportNumber);
        EnterPassport.sendKeys(PassportNo);
    }
    public void verify_the_Max_error_message_in_passport_field(String ErrorMessage) throws Throwable {
        Thread.sleep(5000);
        WebElement MaxPassportNumberErrorMessage = driver.findElement(MaxPasswordError);
        String actual_Result= MaxPassportNumberErrorMessage.getText();
        String expected_Result = ErrorMessage;
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(expected_Result));
        System.out.println("verified in Practicing Hospital Name Title");
    }
    public void verify_the_Add_Doctor_window_getting_closed_or_not(String SuccessfullyReDirect) throws Throwable {
        Thread.sleep(5000);
        WebElement VerifyTheAddDoctorPageClose = driver.findElement(VerifyClosingAddDoctorPage);
        String actual_Result = VerifyTheAddDoctorPageClose.getText();
        String expected_Result = SuccessfullyReDirect;
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(expected_Result));
        System.out.println("verified in closing add doctor page");
    }
    public void enter_the_values_passport_field_by_entering_the_combination_of_number_and_blank_space(String BlankSpacePassportNo) throws Throwable {
        Thread.sleep(5000);
        WebElement EnterPassportField = driver.findElement(PassportNumber);
        EnterPassportField.sendKeys(BlankSpacePassportNo);
    }
    public void verify_Passport_Error_message_in_combination_of_number_and_blank_space(String ValidErrorMessage) throws Throwable {
        Thread.sleep(5000);
        WebElement VerifyPassportErrorMessage = driver.findElement(VerifyThePassportErrorMessageOne);
        String actual_Result = VerifyPassportErrorMessage.getText();
        String expected_Result = ValidErrorMessage;
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(expected_Result));
        System.out.println("verified the Error message");
    }
    public void enter_valid_Passport_Number(String ValidPassportNumber) throws Throwable {
        Thread.sleep(5000);
        WebElement EnterValidPassportNo = driver.findElement(PassportNumber);
        EnterValidPassportNo.sendKeys(ValidPassportNumber);
    }
    public void verify_the_Create_and_Close_button_in_Add_Doctor_page() throws Throwable {
        Thread.sleep(5000);
        WebElement VerifyTheCreateBtn = driver.findElement(ClickOnAddDoctorCreateButton);
        String Create_actual_Result = VerifyTheCreateBtn.getText();
        String Create_expected_Result =  "Create" ;
        assertEquals(Create_actual_Result,Create_expected_Result);
        assertTrue(Create_actual_Result.contains(Create_expected_Result));

        Thread.sleep(5000);
        WebElement VerifyTheCloseBtn = driver.findElement(AddDoctorCancel);
        String actual_Result = VerifyTheCloseBtn.getText();
        String expected_Result =  "Create" ;
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(expected_Result));
    }
    public void verify_the_New_Sri_Lanka_NIC_Card_max_characters(String SendNIC) throws Throwable {
        Thread.sleep(5000);
        WebElement VerifyTheMaxCharacters = driver.findElement(EnterDoctorNIC);
        VerifyTheMaxCharacters.sendKeys(SendNIC);
    }
    public void verify_the_NIC_Error_message(String MaxNICErrorMessage) throws Throwable {
        Thread.sleep(5000);
        WebElement VerifyTheErrorMessage = driver.findElement(NICErrorMessage);
        String actual_Result = VerifyTheErrorMessage.getText();
        String expected_Result =  MaxNICErrorMessage ;
        assertEquals(actual_Result,expected_Result);
        assertTrue(actual_Result.contains(expected_Result));
    }
    public void verify_the_NIC_Card_max_characters_error_message(String PopUpErrorMessage) throws Throwable {
//        Thread.sleep(5000);
//        WebElement PopUpNICMaxErrorMessage = driver.findElement(PopNICErrorMessage);
//        String actual_Result = PopUpNICMaxErrorMessage.getText();
//        String expected_Result =  PopUpErrorMessage ;
//        assertEquals(actual_Result,expected_Result);
//        assertTrue(actual_Result.contains(expected_Result));

        //Verify the toast First Message Logic
//        String toastTitle = driver.findElement(By.className("toast-title")).getText();
//        String toastMessage = driver.findElement(By.className("toast-message")).getText();
//
//        System.out.println("Title of the toast Message is: "+toastTitle);
//        System.out.println("Message of the Toast Message is:"+toastMessage);
//
//        Assert.assertEquals(toastTitle,"Success");
//        Assert.assertEquals(toastMessage, "At least one of the required fields are empty or contain invalid data. Please check your input.");

        try {
            // Wait for the toast message to appear
            Wait<WebDriver> wait =
                    new FluentWait<>(driver)
                            .withTimeout(Duration.ofSeconds(2))
                            .pollingEvery(Duration.ofMillis(300))
                            .ignoring(ElementNotInteractableException.class);

            wait.until(
                    d -> {
                        By toastLocator = By.xpath("//*[@id=\"cdk-overlay-13\"]/snack-bar-container/div/div/simple-snack-bar/span/text()");
                        WebElement toast = wait.until(ExpectedConditions.visibilityOfElementLocated(toastLocator));

                        // Once the toast message is visible, you can capture its text
                        String toastText = toast.getText();
                        System.out.println("Toast Message: " + toastText);

                        String actual_Result = toast.getText();
                        String expected_Result =  PopUpErrorMessage ;
                        assertEquals(actual_Result,expected_Result);
                        assertTrue(actual_Result.contains(expected_Result));
                        //  revealed.sendKeys("Displayed");
                        return true;
                    });

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void enter_valid_Old_NIC_Number_in_NIC_Field(String NICNumber) throws Throwable {
        Thread.sleep(5000);
        WebElement EnterValidNICNo = driver.findElement(EnterDoctorNIC);
        EnterValidNICNo.sendKeys(NICNumber);
    }

}
