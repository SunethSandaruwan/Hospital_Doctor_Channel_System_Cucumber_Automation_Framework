Feature: Verify deleting a created Doctor profile

Scenario: Verify the Administration user can navigate to the Doctor list page
  Given Login to GPAdmin Successfully
  When Click on Doctor
  And Click on All Doctors
  Then Verify All Doctors page header visibility
  And Click On Add Doctor Button
  And Click on Upload Button
  And Doctor profile image uploading
  And Click on the title field
  And Select the valid Doctor title
  And Enter User First name "TestDoctorTamari"
  And Enter User Last name "Hasantha"
  And Enter User Display name "Hasantha Dissanayake"
  Then Click on gender field
  And Select the Gender
  Then Click on the Date of Birth
  And Select the Date of Birth
  Then Enter Mobile Number "0771234567"
  And Enter Email Address "example1@gmail.com"
  And Enter Doctor Address "Colombo09"
  And Enter Doctor NIC Number "943172455V"
  And Enter Passport Number "B3456783"
  And Enter Doctor Bio Details "Test"
  And Verify the Doctor professional Info title
  And Enter Doctor SLMC Reg No "876534"
  Then Enter Doctor TIN Number "2342422767"
  And Click on SLMC Reg issues date field
  And CLick on Practicing Hospital "Peradeniya"
  And Click on Add Doctor Create Button
  Then Verify the Successfully Doctor onboarding Popup message

