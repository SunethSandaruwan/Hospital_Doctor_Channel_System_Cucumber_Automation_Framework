Feature: Verify the All details in Doctor details page

  #GP990-555 / GP990-581 DH Admin User | Doctor | Verify the user interface in view doctor. / DH Admin User | Doctor | Verify the Full Name / Gender / NIC / Date of birth / Mobile / Email address / Address / Passport / Special Interests Block label names are under the Personal details title
  Scenario: Verify the user interface in view doctor.
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    And Verify the Add Doctor Title "Add Doctor"
    And Click On Add Doctor Button
    Then Click on Upload Button
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
    And Click on Add Doctor Create Button
    Then Verify the Successfully Doctor onboarding Popup message
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on Doctor Profile view Button
    Then Verify the view Doctor Title in Doctor details page "View Doctor"
    And Verify the Doctor title with name"Dr.Nilantha Kasunarathna"
    And Verify the Personal Details title "Personal Details:"
    And Verify the Full label name "Full Name"
    And Verify the Gender Label name "Gender"
    And Verify the NIC Label name "NIC"
    And Verify the DOB Label name "Date of birth"
    And Verify the Mobile Label name "Mobile"
    And Verify the Email Address Label name "Email address"
    And Verify the Address Label name "Address"
    And Verify the Passport Label name "Passport"
    And Verify the Professional Details Title Professional Details "Professional Details"
    And Verify the SLMC Label name "SLMC"
    And Verify the TIN Label name "TIN"
    And Verify the Practicing Hospital Label name"Practicing Hospital"
    And Verify the Qualification Label name "Qualification"
    And Verify the Language Label name "Languages"
    And Verify the Practitioners bo label name "Practitioner's bio"

  #GP990-565 / Gp990-582 DH Admin User | Doctor | Verify the name should consist of [Title]+[First Name]+[Last Name] / DH Admin User | Doctor | Verify the full name should consist of [Title]+[First Name]+[Last Name]
  Scenario: Verify the name should consist of [Title]+[First Name]+[Last Name] / Verify the full name should consist of [Title]+[First Name]+[Last Name]
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on Doctor Profile view Button
    Then Verify the view Doctor Title in Doctor details page "View Doctor"
    And Verify the Doctor title with name"Dr.Nilantha Kasunarathna"

  #GP990-569 DH Admin User | Doctor | Verify the doctor personal details title
  Scenario: Verify the doctor personal details title
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on Doctor Profile view Button
    Then Verify the view Doctor Title in Doctor details page "View Doctor"

  #GP990-584 DH Admin User | Doctor | Check whether the Full name field is editable or not
  Scenario: Check whether the Full name field is editable or not
    Given Login to GPAdmin Successfully
    When Click on Doctor
    And Click on All Doctors
    Then Verify the view Doctor Title "View Doctor"
    And Click on the Search Doctor
    Then Enter your Search name Result "David Parera"
    And Click on Doctor Profile view Button
    And Check whether the Full name field is editable or not

  #



