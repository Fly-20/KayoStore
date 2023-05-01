$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("website.feature");
formatter.feature({
  "line": 1,
  "name": "",
  "description": "",
  "id": "",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 8,
  "name": "AddToCart journey homepage section1",
  "description": "",
  "id": ";addtocart-journey-homepage-section1",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@scenario1"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I open the kayo url and select the \"1\" option",
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
formatter.result({
  "duration": 37502863000,
  "status": "passed"
});
});