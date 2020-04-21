Feature: Free CRM Login

#With examples keyword

Scenario Outline: Free CRM Login page
Given User is already login page
When Title of the login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then close the browser

Examples:
		| username | password |
		| Tom | test123 |

#Without examples keyword
#Scenario: Free CRM Login page
#Given User is already login page
#When Title of the login page is Free CRM
#Then user enters "Vishal" and "password"
#Then user clicks on login button
#Then user is on home page
#Then close the browser

#This need to be done later
#Scenario: user is able to create new contact
#Given user is on home page
#When user clicks on contacts
#Then user clicks on new contact
#Then user enters the values
#Then user click on save button
#Then verify contact has been created





