Feature: Verification of Hotel Booking Application 


Scenario: Verify Login page Heading
Given I am on Login page
And Heading of the Login page is matching the expectations
Then Printing the heading of Login page and closing the browser

Scenario: Verification of login page 
Given I am on Login page			
When Entering the login credentials
And It should redirected to Hotel Booking Form
Then Printing the Hotel booking form URL and closing the browser

Scenario: Verify error messages for username and password
Given I am on Login page
When Clicking on login without entering username
And Clicking on login without entering password
Then Printing the error messages and closing the browser

Scenario: Verify the alert box message for First Name
Given I am on Booking form
When Clicking on Confirm without entering First Name
Then Printing the alert message for first name and closing the browser
	
Scenario: Verify the alert box message for Last Name
Given I am on Booking form
When Clicking on Confirm without entering Last Name
Then Printing the alert message for Last name and closing the browser

Scenario: Verify the alert box message for Email
Given I am on Booking form
When Clicking on Confirm without entering Email
And Clicking on Confirm by entering incorrect Email
Then Printing the alert messages for Email and closing the browser
	
Scenario: Verify the alert box message for Mobile no
Given I am on Booking form
When Clicking on Confirm without entering Mobile
And Clicking on Confirm by entering incorrect Mobile
Then Printing the alert messages for Mobile and closing the browser
	
Scenario: Verify the alert box message for City
Given I am on Booking form
When Clicking on Confirm without selecting City
Then Printing the alert messages for City and closing the browser	

Scenario: Verify the alert box message for State
Given I am on Booking form
When Clicking on Confirm without selecting State
Then Printing the alert messages for State and closing the browser

Scenario: Verify the alert box message for Card holder Name
Given I am on Booking form
When Clicking on Confirm without entering Card holder Name
Then Printing the alert message for Card holder name and closing the browser
	
Scenario: Verify the alert box message for Debit card number
Given I am on Booking form
When Clicking on Confirm without entering Debit card number
Then Printing the alert message for Debit card number and closing the browser
	
Scenario: Verify the alert box message for CVV
Given I am on Booking form
When Clicking on Confirm without entering CVV
Then Printing the alert message for CVV and closing the browser
	
Scenario: Verify the alert box message for Expiration Month and Year
Given I am on Booking form
When Clicking on Confirm without entering Expiration Month
And Clicking on Confirm without entering Expiration Year
Then Printing the alert messages for Expiration Month and Year and closing the browser

Scenario: Verify the Boking complete message
Given I am on Booking form
When Entering all details and clicking on confirm button
Then it should redirected to success page




