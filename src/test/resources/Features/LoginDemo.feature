##while running this, make sure url is et to https://example.testproject.io/web/
#@Regression
#Feature: Test login functionality
#
#  Scenario Outline: Check login is successful with valid credentials
#    Given browser is open
#    And user is on login page
#    When user enters <username> and <password>
#    And user clicks on login
#    Then user is navigated to the home page
#
#    Examples:
#      | username | password |
#      | Gareni   |    12345 |
#      | Toshi    |    12345 |
