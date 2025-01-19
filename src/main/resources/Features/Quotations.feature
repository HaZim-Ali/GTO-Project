Feature: Ensure to create new customers in customers list
#@Monkey
  Scenario: Verify admin can add and delete any customer account from customers list

    When user fill valid email address and password
    And click on login button
    And  click on add new customer button
    And admin fill "CustomerID" and "Albania" and "None" and "CreationDate" and "SelectDate" and "CreationTime"
    And select time from time picker

#    And  click on delete customer button
