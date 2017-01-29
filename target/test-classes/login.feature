Feature: I am job portal App user , I want to try login into my account
	 Scenario: I have entered user name and password and login
	 Given I am on the login screen
	 When I login with the credentials of "Sankar@gmail.com" and "Sankar" and click login
	 Then I get response as "Authentication Successful"
	 
	 Scenario: I have entered user name and password and login
	 Given I am on the login screen
	 When I login with the credentials of "Sankar@gmail.com" and "Sankar" and click cancel
	 Then I get response as nothing
	 
	 Scenario: I have entered user name and password and login
	 Given I am on the login screen
	 When I login with the credentials of "San@gmail.com" and "San" and click login
	 Then I get response as "Authentication Failure"
	  