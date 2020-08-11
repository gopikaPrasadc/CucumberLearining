$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/Testing/eclipse/secindcucumber/src/main/java/feature/demotours.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Mapss Login",
  "description": "",
  "id": ";mapss-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "naviagte homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "clik reg",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "select gender",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter your personal details",
  "rows": [
    {
      "cells": [
        "name",
        "lastname",
        "mail id",
        "password",
        "confirmpass"
      ],
      "line": 9
    },
    {
      "cells": [
        "gopika",
        "prasad",
        "gopikacek14@gmail.com",
        "adhil",
        "adhil"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should click on Register button",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "I should close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "demoregister.naviagte_homepage()"
});
formatter.result({
  "duration": 12622701000,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "demoregister.select_gender()"
});
formatter.result({
  "status": "skipped"
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