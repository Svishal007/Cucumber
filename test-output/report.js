$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/OrangeHRM.feature");
formatter.feature({
  "name": "Free CRM Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Free CRM Login page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is already login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.OrangeHRMSteps.user_is_already_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Title of the login page is Free CRM",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.OrangeHRMSteps.title_of_the_login_page_is_Free_CRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username \u0026 password",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OrangeHRMSteps.user_enters_username_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OrangeHRMSteps.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OrangeHRMSteps.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.OrangeHRMSteps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});