$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginAmazon.feature");
formatter.feature({
  "line": 1,
  "name": "Login Amazon",
  "description": "As a user, I should be able to login to Amazon App",
  "id": "login-amazon",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Access Amazon",
  "description": "",
  "id": "login-amazon;access-amazon",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Launch \"\u003cbrowser\u003e\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User browse amazon url",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User login into to Amazon with valid Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User verify the title of the homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "login-amazon;access-amazon;",
  "rows": [
    {
      "cells": [
        "browser"
      ],
      "line": 11,
      "id": "login-amazon;access-amazon;;1"
    },
    {
      "cells": [
        "Chrome"
      ],
      "line": 12,
      "id": "login-amazon;access-amazon;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Access Amazon",
  "description": "",
  "id": "login-amazon;access-amazon;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User Launch \"Chrome\" browser",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User browse amazon url",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User login into to Amazon with valid Credentials",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User verify the title of the homepage",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});