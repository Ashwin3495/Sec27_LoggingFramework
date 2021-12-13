Feature: Centro Application Login

Scenario: Centro Home Page check
Given User is on Login page
When User login with usename "Abc" and password "1234"
Then HomePage is loaded
And Centro HomePage is displayed "true"

Scenario: Centro Home Page check
Given User is on Login page
When User login with usename "Ashwin" and password "Bigil"
Then HomePage is loaded
And Centro HomePage is displayed "false"