Feature: Free CRM create contacts

Scenario Outline:
: Free CRM create a new contact scenario
Given User is already login page
When Title of the login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:
		|usernamee | password | firstname | lastname | position |
		| vishals | test123 | Vishal | Sonk | Sr. Engg |
		| vilass | test3211 | Vilas | Sonk | Net Engg |