$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("website.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "  As a user\r\n  I want to be able to add new clients in the system\r\n  So that I can add accounting data for that client",
  "id": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "AddToCart journey homepage section1",
  "description": "",
  "id": ";addtocart-journey-homepage-section1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I open the kayo url and select the \"\u003cp\u003e\" option",
  "keyword": "Given "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": ";addtocart-journey-homepage-section1;",
  "rows": [
    {
      "cells": [
        "p"
      ],
      "line": 15,
      "id": ";addtocart-journey-homepage-section1;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 16,
      "id": ";addtocart-journey-homepage-section1;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "AddToCart journey homepage section1",
  "description": "",
  "id": ";addtocart-journey-homepage-section1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I open the kayo url and select the \"1\" option",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 36
    }
  ],
  "location": "StepDefinition.iOpenTheKayoUrlAndSelectTheOption(String)"
});
