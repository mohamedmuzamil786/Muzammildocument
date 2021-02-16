$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "name": "To Validate the login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user has to lunch chrome and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_has_to_lunch_chrome_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify login functionlity with valid username and ivalid pssword in FB",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user has enter the username and password",
  "rows": [
    {
      "cells": [
        "syed farith",
        "suresh",
        "1234567",
        "21-03"
      ]
    },
    {
      "cells": [
        "Mohammed",
        "Muzamil",
        "1234567",
        "21-05"
      ]
    },
    {
      "cells": [
        "Mohamme",
        "Muzmil",
        "134567",
        "31-05"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_has_enter_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user unable to enter the homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_unable_to_enter_the_homepage()"
});
formatter.result({
  "status": "passed"
});
});