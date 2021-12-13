Feature: Centro Application Login

Scenario Outline: Centro Home Page check
Given Initialize the browser
And Navigate to "http://www.qaclickacademy.com/" site
And Click on Login link in home page to land on Secure sign in Page
When User login with <username> and <password>
Then Verify the HomePage

Examples:
|username				 |password|
|test12@gmail.com|Def@1234|
|test23@gmail.com|Abc@1234|