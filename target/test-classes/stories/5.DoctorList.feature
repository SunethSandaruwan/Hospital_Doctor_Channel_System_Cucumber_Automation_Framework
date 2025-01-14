Feature: ListDoctor

Scenario: Verify the Administration user can navigate to the Doctor list page
  Given Login to GPAdmin Successfully
  When Click on Doctor
  And Click on All Doctors
  Then Verify All Doctors page header visibility

Scenario: Verify the User Interface in All Doctor list
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors