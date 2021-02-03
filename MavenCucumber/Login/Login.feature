Feature: Login Feature
This Application includes validating login application with 
1) valid case 
2) invalid case
Background:
Given Login application present

@ValidCase
Scenario: To validate login with valid credentials
When Enter valid Name
And Enter valid password click on submit
Then Login successful

@InvalidCase
Scenario: To validate login with invalid credentials
When Enter Invalid Name
And Enter Invalid password  click on submit
Then Login Unsuccessful