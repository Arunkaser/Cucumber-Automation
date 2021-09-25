Feature: Login Amazon
  As a user, I should be able to login to Amazon App

Scenario: Access Amazon

  Given User Launch "Chrome" browser
  And User browse amazon url
  When User login into to Amazon with valid Credentials
  Then User verify the title of the homepage
