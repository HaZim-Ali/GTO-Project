Feature: Ensure the chat functionality
#@Monkey
  Scenario: Verify send message correctly

    When user fill valid email address and password
    And click on login button
    And click on chat button
    And click on conversation
    And write message
    And click on send button
#    And click on emoji button
#    And select emoji

