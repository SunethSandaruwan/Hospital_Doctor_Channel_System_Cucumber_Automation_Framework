Feature: DDH Sign Up


# TestCase 1253: UI Navigation
  Scenario:TestCase 1253: UI Navigation
    Given Open the browser and launch the application
    Then Direct to the sign in and sign up page


# TestCase 1255: UI Navigation-Sign up page
  Scenario:TestCase 1255: UI Navigation-Sign up page
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on Register Button
    Then Direct to the sign up submission page


# TestCase 1259: Verification of Successful Sign Up
  Scenario:TestCase 1259: Verification of Successful Sign up
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on Register Button
    And Enter First Name as 'Nipuni'
    And Enter Last Name as 'Silva'
    And Enter Email as 'ishaniwavenet23@gmail.com'
    And Click on drop down of country codes
    And Select the country from the drop down
    And Enter Mobile Number for sign up as '0761234568'
    And Enter Password for sign up as 'Password@123'
    And ReEnter password as 'Password@123'
    And Enter National Identification Number as '123456789V'
    And Click on RegisterButton
    Then Field for SMS code is visible



# TestCase 1260: Mandatory field validation
  Scenario:TestCase 1260: Mandatory field validation
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on Register Button
    And Click on RegisterButton
    Then Display Please specify first name as 'This field is required.'
    Then Display Please specify last name as 'This field is required.'
    Then Display Please specify email as 'This field is required.'
    Then Display Please specify mobile number as 'This field is required.'
    Then Display Please specify password as 'This field is required.'
##          Then Display MISSING_NATIONALID as 'MISSING_NATIONALID'

# TestCase 1263: Email Validation
  Scenario:TestCase 1263: Email Validation
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on Register Button
    And Enter First Name as 'Nipuni'
    And Enter Last Name as 'Silva'
    And Enter Invalid Email as 'test'
    And Click on drop down of country codes
    And Select the country from the drop down
    And Enter Mobile Number for sign up as '0761234567'
    And Enter Password for sign up as 'Password@123'
    And ReEnter password as 'Password@123'
    And Enter National Identification Number as '123456789V'
    And Click on RegisterButton
    Then Display Invalid email address as 'Invalid email address.'


# TestCase 1264: Verification of Correct Format of Email
  Scenario:TestCase 1264: Verification of Correct Format of Email
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on Register Button
    And Enter First Name as 'Nipuni'
    And Enter Last Name as 'Silva'
    And Enter email with correct format as 'test@abcd.com'
    And Click on drop down of country codes
    And Select the country from the drop down
    And Enter Mobile Number for sign up as '0761234567'
    And Enter Password for sign up as 'Password@123'
    And ReEnter password as 'Password@123'
    And Enter National Identification Number as '123456789V'
    And Click on RegisterButton
    Then Field for SMS code is visible


# TestCase 1267: Password Validation with two different passwords
  Scenario:TestCase 1267: Password Validation with two different passwords
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on Register Button
    And Enter First Name as 'Nipuni'
    And Enter Last Name as 'Silva'
    And Enter Email as 'ishaniwavenet22@gmail.com'
    And Click on drop down of country codes
    And Select the country from the drop down
    And Enter Mobile Number for sign up as '0761234567'
    And Enter Password for sign up as 'Password@123'
    And ReEnter different password as 'Password@'
    And Enter National Identification Number as '123456789V'
    And Click on RegisterButton
    Then Display Password confirmation as 'Password confirmation doesn't match.'


# TestCase 1268: Password Validation with same passwords
  Scenario:TestCase 1268: Password Validation with same passwords
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on Register Button
    And Enter First Name as 'Nipuni'
    And Enter Last Name as 'Silva'
    And Enter Email as 'ishaniwavenet22@gmail.com'
    And Click on drop down of country codes
    And Select the country from the drop down
    And Enter Mobile Number for sign up as '0761234567'
    And Enter Password for sign up as 'Password@123'
    And ReEnter password as 'Password@123'
    And Enter National Identification Number as '123456789V'
    And Click on RegisterButton
    Then Field for SMS code is visible


# TestCase 1275: Registering with pre-registerd Mobile no
  Scenario:TestCase 1275: Registering with pre-registerd Mobile no
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on Register Button
    And Enter First Name as 'Nipuni'
    And Enter Last Name as 'Silva'
    And Enter Email as 'ishaniwavenet22@gmail.com'
    And Click on drop down of country codes
    And Select the country from the drop down
    And Enter PreRegistered Mobile Number as '0712345678'
    And Enter Password for sign up as 'Password@123'
    And ReEnter password as 'Password@123'
    And Enter National Identification Number as '123456789V'
    And Click on RegisterButton
    Then Display validation text as 'Number is already registered. Please try sign in again.'


# TestCase 1272: Mobile No validation with the region
  Scenario:TestCase 1272: Mobile No validation with the region
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on Register Button
    And Enter First Name as 'Nipuni'
    And Enter Last Name as 'Silva'
    And Enter Email as 'ishaniwavenet2@gmail.com'
    And Click on drop down of country codes
    And Select USA from the drop down
    Then Check Mobile Number validation
#            And Enter Password
#            And ReEnter password
#            And Enter National Identification Number
#            And Click on RegisterButton
#            Then Field for SMS code is visible

# TestCase 1280: Input Field validation
  Scenario:TestCase 1280: Input Field validation
    Given Open the browser and launch the application
    When Click on Log In Drop down
    And Click on Register Button
    And Enter First Name Maxlength
    And Enter Last Name Maxlength
    And Enter Email Maxlength
    And Click on drop down of country codes
    And Select the country from the drop down
    And Enter Mobile Number Maxlength
#              And Enter Password
#              And ReEnter password
#              And Enter National Identification Number Maxlength
#              And Click on RegisterButton