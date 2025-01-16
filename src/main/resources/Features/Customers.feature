Feature: Ensure to create new customers in customers list

  Scenario: Verify admin can add and delete any customer account from customers list

    When user fill valid email address and password
    And click on login button
    And  click on add new customer button
    And admin fill "Hazem Ali" and "Albania" and "None" and "31/01/2025"

#    And  click on delete customer button
