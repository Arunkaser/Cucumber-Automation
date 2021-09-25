Feature: Google Search
  As a user, I should be able to verify the first result on google

Scenario: Access Amazon

  Given User Launch browser
  When User browse "walmart" on google
  Then User verify the first link
  Then User click on first link and verify the title
