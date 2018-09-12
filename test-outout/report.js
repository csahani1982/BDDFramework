$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/Chetanpreet/eclipse-workspace/freecrmBDDFrmwrk/src/main/java/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM user Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-user-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.tite_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
});