Feature: To login functionality
#@Monkey
  Scenario: Verify to login with valid data

#    Given open browser and goto web site "https://gto.bit68.com/"
    When user fill valid email address and password
    And click on login button
    Then user login successfully

