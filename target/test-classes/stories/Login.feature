Feature: Doc990 GP Login page Verification

  #Unsuccessful Login using invalid username and valid password
  Scenario: Unsuccessful Login using invalid username and valid password
    Given Open the browser and launch the application
    When Enter a invalid Username "ExampleUsername" and valid password "Test@123"
    And Click on Sign in Button
 #   Then Verify Error Message in invalid username and valid password

  #Unsuccessful Login using valid username and invalid Password
  Scenario: Unsuccessful Login using valid username and invalid Password
    Given Open the browser and launch the application
    When Enter a valid username "AdminUser" and invalid password "ExamplePassword"
    And Click on Sign in Button
  #  Then Verify Error Message in valid username and invalid Password

  #Empty username with password
  Scenario: Empty username with password
    Given Open the browser and launch the application
    When Enter empty username " " and password "Test@123"
    And Click on Sign in Button
  #  Then Verify Error Message in Empty username with password

  #Empty password and Username
  Scenario: Empty password and Username
    Given Open the browser and launch the application
    When Enter empty Password "Test@123" and Username ""
    And Click on Sign in Button
  #  Then Verify Error Message in Empty Password with Username

  #Empty Username and Empty Password
  Scenario: Empty Username and Empty Password
    Given Open the browser and launch the application
    When Enter empty Username "" and Password ""
    And Click on Sign in Button
  #  Then Verify Error Message in Empty Username and Empty Password

  #Check on the Click eye icon entered password should be visible in a readable format
  Scenario: Verify the Click eye icon entered password should be visible in a readable format
    Given Open the browser and launch the application
    When Enter a valid Username "AdminUser" and valid "Test@123"
    Then Click on eye icon
    And Click on Sign in Button

  #loging in to the BAP project in registered user
  Scenario: Verification of successful log In
    Given Open the browser and launch the application
    When Enter for login as "AdminUser"
    And Enter for password as "Test@123"
    And Click on Sign in Button
    #Then Navigate to the home page










