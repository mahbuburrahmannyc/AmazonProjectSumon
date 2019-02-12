Feature: Sing In




Scenario: Possitive

Given I am in Sing In page

When i click sign in button in home page
And i enter valid user name
And i enter valid password
And i click Sing In button

Then I successfully Sing in