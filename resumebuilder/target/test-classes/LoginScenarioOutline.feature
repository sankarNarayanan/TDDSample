 @login
 Feature: Login using scenario outline
	Scenario Outline: Login with Correct credentials
	Given I am on the login screen
	When I login with the credentials of <email> and <password> and click login
	Then I get response as "Authentication Successful"
     
  Examples:
  |  email   |	password |
  |  "sankar@gmail.com"   |	"sankar" |
  |  "san@gmail.com"   |	"san" |