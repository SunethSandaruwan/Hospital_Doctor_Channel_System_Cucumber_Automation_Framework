Feature: Doctor Creating

  #GP990-132 Verify the 'Add Doctor ' button available under the 'All Doctors' page.
  Scenario: Verify the 'Add Doctor ' button available under the 'All Doctors' page.
    Given Login to GPAdmin Successfully
   # Then Click on Main Doctor Manu
    Then Verify the Home Page load
    When Click on Doctor

#    And Click on All Doctors
#    And Click On Add Doctor Button

  # GP990-190 Verify the All Mandatory Filed(DH Admin User | Doctor | Verify the mandatory Field in Title)
  # GP990-236, GP990-254, GP990-270, GP990-410 DH Admin User | Doctor | Verify if the name field is mandatory then a black ” * ” mark should be displayed

  Scenario: Verify the Doctor Creating Form mandatory field
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click On Add Doctor Button
    Then Verify the Add Doctor Title "Add Doctor"
    And Click on Add Doctor Create Button
    #And Verify the All Mandatory fields in Add Doctor Page

  #Enter the all details in Doctor creating form
  Scenario: Verify the All details in Doctor creating form
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Verify the Add Doctor Title "Add Doctor"
    And Click On Add Doctor Button
    Then Click on Upload Button
#GP990-414 Verify the successful messages when the user enters the valid date in all the fields.
    And Click on the title field
    And Select the valid Doctor title
    Then Enter User First name "Nilantha"
    And Enter User Last name "Kasunarathna"
    And Enter User Display name "Nilanthi Dias Kasunarathna"
    Then Click on gender field
    And Select the Gender
    Then Click on the Date of Birth
    And Select the Date of Birth
    Then Enter Mobile Number "0771234567"
    And Enter Email Address "Example@gmail.com"
    And Enter Doctor Address "Colombo09"
    And Enter Doctor NIC Number "943172455V"
    And Enter Passport Number "B3456783"
    And Enter Doctor Bio Details "Test"
    And Verify the Doctor professional Info title
    And Enter Doctor SLMC Reg No "876534"
    Then Enter Doctor TIN Number "2342422767"
    And Click on SLMC Reg issues date field
    And CLick on Practicing Hospital "Peradeniya"
#    And Click on Add Doctor Create Button
#    Then Verify the Successfully Doctor onboarding Popup message


  #GP990-130 Verify the User Interface in Add Doctor Page
  Scenario: Verify the User Interface in Add Doctor Page
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And   Click on All Doctors
    And   Verify the All Doctor Page Title "All Doctors"
    And   Verify the Add Doctor Button
    Then  Click On Add Doctor Button
    And   Verify the Add Doctor Title "Add Doctor"
    And   Verify the Upload Logo Image


  #GP990-160 When user clicking Add Button should show the 'Add Doctor Form' with the Doctor Added fields.
  Scenario: user clicking Add Button should show the 'Add Doctor Form' with the Doctor Added fields.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click On Add Doctor Button
    And Verify the Add Doctor Title "Add Doctor"


  #GP990-162 Verify the Upload image button is clickable or not
  Scenario: Verify the Upload image button is clickable or not
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click On Add Doctor Button
    And Click on Image Upload Button

  #GP990-166 Verify by clicking on the cancel button upload image popup closed or not.
  Scenario: Verify by clicking on the cancel button upload image popup closed or not.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click On Add Doctor Button
    And Click on Add Doctor Cancel Button


  #GP990-256 Verify the validation error message should be displayed when the user enters numeric characters in the name field.
  Scenario: Verify the Only single selection in the gender dropdown list.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter User First name "Nilanthi"
    And Enter User Last name "Kasunarathna"
    And Enter User Last name "345356476"
    And Click On Add Doctor Button
    Then Verify the Error message "Last Name Invalid"
    Then Click on Add Doctor Cancel Button

  #GP990-238 Verify the validation error message should be displayed when the user enters numeric characters in the first name field.
  Scenario: Verify the validation error message should be displayed, & Verify the User enters numeric characters in the first name field.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter User First name "Nilanthi"
    And Enter Last Name as 'Kasunarathna'
    Then Enter User Display name "34875757"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    And Click On Add Doctor Button
    Then Verify the Error message ""
    Then Click on Add Doctor Cancel Button

  #GP990-240 Check validation error messages should be displayed when users enter special characters in the name field.
  Scenario:Check validation error messages should be displayed when users enter special characters in the name field.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter User Display name "#%#%#%#%#%"
    Then Enter User First name "Nilanthi"
    And Enter Last Name as 'Kasunarathna'
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    And Click On Add Doctor Button
    Then Verify the Error message "At least one of the required fields are empty or contain invalid data. Please check your input."
    Then Click on Add Doctor Cancel Button

  #GP990-244 Check the validation error message should be displayed if the user entered the maximum or upper limit of characters.
  Scenario: Check the validation error message should be displayed if the user entered the maximum or upper limit of characters.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter User Display name "weoiwuwtuwtwtiuwtiwtownvjeve"
    Then Enter User First name "Nilanthi"
    And Enter Last Name as 'Kasunarathna'
    And Click On Add Doctor Button
    Then Verify the Error message ""
    Then Click on Add Doctor Cancel Button

  #GP990-248 Check whether the user should be able to proceed with a blank field or not
  Scenario: Check whether the user should be able to proceed with a blank field or not
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    #Below line using verify blank field in Display field
    Then Enter User First name "Nilanthi"
    And Enter Last Name as 'Karunatilaka'
    Then Enter User Display name " "
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    And Click On Add Doctor Button
    Then Verify the Error message "At least one of the required fields are empty or contain invalid data. Please check your input."
    Then Click on Add Doctor Cancel Button

  #GP990-252 Check when the user clicks on the last name field, the text cursor should be visible in the last name field
  Scenario: Check when the user clicks on the last name field, the text cursor should be visible in the last name field
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Verify the Last name Field
    Then Click on Add Doctor Cancel Button

  #GP990-256 Verify the validation error message should be displayed when the user enters numeric characters in the name field
  Scenario:Verify the validation error message should be displayed when the user enters numeric characters in the name field
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'Nilanthi'
    And Enter Last Name as 'Karunathilaka'
    And Enter User Display name "23456789"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    And Click On Add Doctor Button
    Then Verify the Error message "At least one of the required fields are empty or contain invalid data. Please check your input."
    Then Click on Add Doctor Cancel Button

  #GP990-258 Check validation error messages should be displayed when users enter special characters in the name field.
  Scenario: Check validation error messages should be displayed when users enter special characters in the name field.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'Nilanthi'
    And Enter Last Name as 'Karunathilaka'
    And Enter User Display name "#$#$%^&"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    And Click On Add Doctor Button
    Then Verify the Error message "At least one of the required fields are empty or contain invalid data. Please check your input."
    Then Click on Add Doctor Cancel Button


  #GP990-260 Verify the validation error message should be displayed when the user enters numeric special characters in the name field
  Scenario: Verify the validation error message should be displayed when the user enters numeric special characters in the name field
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'Nilanthi'
    And Enter Last Name as 'Karunathilaka'
    And Enter User Display name "$%^$^34534"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    And Click On Add Doctor Button
    Then Verify the Error message "At least one of the required fields are empty or contain invalid data. Please check your input."
    Then Click on Add Doctor Cancel Button

  #GP990-262 Check the validation error message should be displayed if the user entered the maximum or upper limit of characters.
  Scenario: Check the validation error message should be displayed if the user entered the maximum or upper limit of characters.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'Nilanthi'
    And Enter Last Name as 'Karunathilaka'
    And Enter User Display name "afdsfsfdsfsfsffsfsfdsfdsfhdsfsfbsjfsjfhbsjhfbsfjsfsfsfbsdhfjsjfbsjhfbjshfbsjhfbsjhfshjfsjhfbsjhfbsjhfbsjhfbshfbsjhfbbsdfsdbfsbfjhdsbfjhsdbfjhsdbfjshbfjdshbfjhsbfsjhfbshjdfbsjhdfsjhdfjhcdbdsjhvbcdsuvbsd"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    And Click On Add Doctor Button
    Then Verify the Error message "At least one of the required fields are empty or contain invalid data. Please check your input."
    Then Click on Add Doctor Cancel Button

  #GP990-266 Check that the user cannot enter numeric characters in the name field.
  Scenario: Check that the user cannot enter numeric characters in the name field.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as '134224324324'
    And Enter Last Name as '423432432423'
    And Enter User Display name "234256533y6"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    And Click On Add Doctor Button
    Then Verify the Error message "first name invalid."
    Then Click on Add Doctor Cancel Button

  #GP990-269 DH Admin User | Doctor | Verify the Enter validation data in display name text field
  Scenario: Verify the Enter validation data in display name text field
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Click On Add Doctor Button
    #Deleteing Create Automation Test Data
    When Verify the All Doctor Page Title "All Doctors"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on the Doctor Delete Button
    Then Verify the Conformation Delete Popup Message Title
    And Click on Delete Conformation Button

  #GP990-274 DH Admin User | Doctor | Verify the Doctor's Bio in Rich Text Editor
  Scenario: Verify the Doctor's Bio in Rich Text Editor
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    #Docter Bio Setup
    Then Click on Text Bold button in Doctor Bio "Test Automation Bold"
    Then Click on Text Italic button in Doctor Bio "Test Automation Italic"
    Then Click on Text Underline button in Doctor Bio "Test Automation Underline"
    Then Click on Text Strike button in Doctor Bio "Test Automation Strike"
    And Enter All Text Editors Bold Italic Underline Strike "Test All Editors Bold Italic Underline Strike"
    #Docoer Bio Heading Tools
    Then Click on HOne Heading button in Doctor Bio "Test Automation Test Data H1 "
    Then Click on HTwo Heading button in Doctor Bio "Test Automation Test Data H2 "
    And Click on Add Doctor Create Button
    #Verify the Doctor Bio view page verification
    Then Verify the Doctor Profile Successfully Create Massage
    And Verify the All Doctor Page Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on Doctor Profile view Button
    Then Verify the view Doctor Title "View Doctor"
    #Verify the previously Enter Doctor Profile details
    Then Verify the Doctor Bio Label Name
    Then Verify the Text Bold button in Doctor Bio "Test Automation Bold"
    And Verify the Text Italic button in Doctor Bio "Test Automation Italic"
    And Verify the Text Underline button in Doctor Bio "Test Automation Underline"
    And Verify the Strike Button in Doctor Bio "Test Automation Strike"
    And Enter All Text Editors Bold Italic Underline Strike "Test All Editors Bold Italic Underline Strike"
    Then Click on view Doctor close Button

    #GP990-278 / GP990-280 / GP990-282 / GP990-290 DH Admin User | Doctor | Click on the date field and check if the right month and year for the date picker are shown / Check that future dates should not be displayed in the drop-down list.
  #/Check on selecting the date from the date picker, whether the date picker is closed or not /  Check whether the selected date is showing in the date field or not.
  Scenario:Click on the date field and check if the right month and year for the date picker are shown / check that future dates should not be displayed in the drop-down list./Check on selecting the date from the date picker, whether the date picker is closed or not
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Click on the Date of Birth
    And Select the Date of Birth
    Then Click on Add Doctor Create Button
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on the Doctor Delete Button
    Then Verify the Conformation Delete Popup Message Title
    And Click on Delete Conformation Button

  #GP990-286 DH Admin User | Doctor | Check that user can swipe the previous month or year from the arrow(forward and Backward) option in the date picker (if allowed)
  Scenario: Check that user can swipe the previous month or year from the arrow(forward and Backward) option in the date picker (if allowed)
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Click on the Date of Birth
    Then Click on the swipe forward and Backward in Date Piker
    Then Click on Add Doctor Cancel Button

  #GP990-292 DH Admin User | Doctor | Click on the date field, select the date, and verify if the date shown is in mm/dd/yy format.
  Scenario: Click on the date field, select the date, and verify if the date shown is in mm/dd/yy format.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Click on the Date of Birth
    And Select the Date of Birth
    Then Click on Add Doctor Create Button
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on Doctor Profile view Button
    Then Verify the view Doctor Title "View Doctor"
    And Verify the label of Date of Birth in View Doctor profile
    Then Verify the DOB Format "yyyy/MM/dd"
    And Click on view Doctor close Button

  #GP990-296 DH Admin User | Doctor | Verify mobile number field should accept only the numeric value by entering the special character.
  Scenario: Verify mobile number field should accept only the numeric value by entering the special character.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Verify the should accept only the numeric value by entering the special character
    Then Click on Add Doctor Create Button
    And Verify the Error message in only the numeric value by entering the special character.
    And Click on Add Doctor Cancel Button

  #GP990-302 DH Admin User | Doctor | Verify the behaviour by adding more digits than the actual mobile number.
  Scenario: Verify the behaviour by adding more digits than the actual mobile number.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Enter adding more digits than the actual mobile number "0372345678234"
    And Verify the Error Message adding more digits than Mobile number "Mobile Number should not exceed 12 characters"
    Then Click on Add Doctor Create Button
    And Verify the Error popup message in adding more digits than Mobile number "At least one of the required fields are empty or contain invalid data. Please check your input."
    Then Click on Add Doctor Cancel Button

  #GP990-329 / GP990-335 DH Admin User | Doctor | Validate the email field by entering a valid email address. (example@gmail.com) / Enter the valid address in Address field
  Scenario: Validate the email field by entering a valid email address. (example@gmail.com)
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Enter Valid Doctor Email Address "example@gmail.com"
    Then Click on Add Doctor Create Button
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on the Doctor Delete Button
    Then Verify the Conformation Delete Popup Message Title
    And Click on Delete Conformation Button

  #GP990-1667 DH Admin User | Doctor | Ensure that SLMC fields with a blank in the last position are reported as erroneous.
  Scenario: Enter the valid address in Address field
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Verify the Valid SLMC Reg No "6534789"
    Then Click on Add Doctor Create Button
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on the Doctor Delete Button
    Then Verify the Conformation Delete Popup Message Title
    And Click on Delete Conformation Button

  #GP990-344 DH Admin User | Doctor | Verify the TIN field is Numeric Values
  Scenario: Verify the TIN field is Numeric Values
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Verify the TIN field is Numeric Values "2345676788"
    Then Click on Add Doctor Create Button
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on the Doctor Delete Button
    Then Verify the Conformation Delete Popup Message Title
    And Click on Delete Conformation Button

  #GP990-346 DH Admin User | Doctor | Verify the SLMC id issues date
  Scenario: Verify the SLMC id issues date
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    Then Click on Add Doctor Create Button
    And Click on SLMC Id issued Date Picker
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on the Doctor Delete Button
    Then Verify the Conformation Delete Popup Message Title
    And Click on Delete Conformation Button

  #GP990-350 DH Admin User | Doctor | Verify the Enter practicing Hospital valid data
  Scenario: Verify the Enter practicing Hospital valid data
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Enter Practicing Hospital Name "Peradaniya"
    Then Click on Add Doctor Create Button
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on the Doctor Delete Button
    Then Verify the Conformation Delete Popup Message Title
    And Click on Delete Conformation Button

  #GP990-352 DH Admin User | Doctor | Verify the ' Professional Info" Label in doctor create page
  Scenario: Verify the Enter practicing Hospital valid data
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Verify the Professional Info label "Professional Info"

  #GP990-358 DH Admin User | Doctor | Verify the New Sri Lankan NIC Card max characters (Ex:- 2000344567892)
  Scenario: Verify the New Sri Lankan NIC Card max characters (Ex:- 2000344567892)
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Verify the New Sri Lanka NIC Card max characters "2000344567892"
    And Verify the NIC Error message "NIC is invalid"
    Then Click on Add Doctor Create Button
    And Verify the NIC Card max characters error message "At least one of the required fields are empty or contain invalid data. Please check your input."

   #GP990-360 DH Admin User | Doctor | Verify the Old NIC number in NIC Field (993172455V)
  Scenario: Verify the Old NIC number in NIC Field (993172455V)
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Enter valid Old NIC Number in NIC Field "993172455V"
    Then Click on Add Doctor Create Button
    And Verify the Successfully Doctor onboarding Popup message
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on the Doctor Delete Button
    Then Verify the Conformation Delete Popup Message Title
    And Click on Delete Conformation Button


   #GP990-362 DH Admin User | Doctor | Check that the valid NIC number (ex:- 992345678V)
  Scenario: Check that the valid NIC number
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Enter valid Old NIC Number in NIC Field "993172455V"
    Then Click on Add Doctor Create Button
    And Verify the Successfully Doctor onboarding Popup message
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on the Doctor Delete Button
    Then Verify the Conformation Delete Popup Message Title
    And Click on Delete Conformation Button

  #GP990-364 DH Admin User | Doctor | Check passport number should be 21 characters long valid number.
  Scenario: Check passport number should be 8 characters long valid number.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Verify the passport number should be twenty one characters long valid number "123456789012345678901"
    Then Verify the Max error message in passport field "Passport should not exceed 20 characters"

  #GP990-384 DH Admin User | Doctor | Check the passport field by entering the combination of number and blank space.
  Scenario: Check the passport field by entering the combination of number and blank space.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Enter the values passport field by entering the combination of number and blank space "B233 3445"
    Then Verify Passport Error message in combination of number and blank space "Passport is invalid"

  #GP990-412 DH Admin User | Doctor | Check whether the page redirects to the expected page or not when the user enters the valid data in all the fields.
  Scenario: Check the passport field by entering the combination of number and blank space.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Enter valid Passport Number "B00090 23455"
    Then Click on Add Doctor Create Button
    And Verify the Successfully Doctor onboarding Popup message
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on the Doctor Delete Button
    Then Verify the Conformation Delete Popup Message Title
    And Click on Delete Conformation Button

  #GP990-418 DH Admin User | Doctor | Check that when the user clicks on the cancel button the window gets closed or not
  Scenario: Check that when the user clicks on the cancel button the window gets closed or not
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    Then Enter First Name as 'David'
    And Enter Last Name as 'Parera'
    And Enter User Display name "David Parera"
    Then Click on Gender Dropdown
    And Select the Gender name "Male"
    Then verify Selected Gender
    And Click on Add Doctor Cancel Button
    Then Verify the Add Doctor window getting closed or not "All Doctors"

  #GP990-421 DH Admin User | Doctor | Verify the two buttons titled 'Create' and 'Cancel' would be shown at the bottom of the pop-up window.
  Scenario: verify the two buttons titled 'Create' and 'Cancel' would be shown at the bottom of the pop-up window.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Click on the title field
    And Select the valid Doctor title
    And Verify the Create and Close button in Add Doctor page





















































