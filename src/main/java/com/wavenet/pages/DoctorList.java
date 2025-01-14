package com.wavenet.pages;

import com.wavenet.util.Config;
import com.wavenet.util.InitializeDriver;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class DoctorList {

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
        private By VerifyClosingAddDoctorPage = By.xpath("");
        private By VerifyThePassportErrorMessageOne = By.xpath("//mat-error[contains(text(),' Passport is invalid ')]"); //Verify the Error Message in Passport
        private By NICErrorMessage = By.xpath("//mat-error[contains(text(),' NIC is invalid ')]"); //Max NIC Error Message
        private By PopNICErrorMessage = By.xpath("//*[@id=\"cdk-overlay-13\"]/snack-bar-container/div/div/simple-snack-bar/span/text()"); //Verify the NIC PopUp Message
        private By WelcomeMessage=By.xpath("//span[contains(text(),\"Welcome back Admin User\")]");
        private By AllDoctorsPageHeader=By.xpath("//h1[text()=\"All Doctors\"]");
    public DoctorList() {driver = InitializeDriver.getInstance().getDriver();
        executor = (JavascriptExecutor) driver;
    }

//    public void click_on_Doc() throws InterruptedException {
//        Duration duration = Duration.ofSeconds(30);
//        WebDriverWait wait = new WebDriverWait(driver, duration);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(WelcomeMessage));
//        WebElement VerifyDoctors = driver.findElement(ClickOnDoctorBtn);
//
//        VerifyDoctors.click();
//    }




    public void verify_The_All_Doctors_Header() throws InterruptedException {
        Thread.sleep(3000);
        WebElement verifyAllDoctorsPageHeader = driver.findElement(AllDoctorsPageHeader);

        Assert.assertTrue("Element should be visible", verifyAllDoctorsPageHeader.isDisplayed());


    }
}

