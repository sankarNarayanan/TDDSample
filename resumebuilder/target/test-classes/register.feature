Feature: I am job portal App user , I want to register myself
	 Scenario: I have entered email address and first name and click on Register
	 Given I am on the sign up screen
	 When I enter email Id and name as "sankar@gmail.com" and "sankar" and click on register
	 Then I get alert as "Verification email sent successfully"