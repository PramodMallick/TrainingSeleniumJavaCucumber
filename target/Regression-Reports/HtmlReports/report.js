$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/GoogleSearch.feature");
formatter.feature({
  "name": "feature to test google search functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.scenario({
  "name": "Validate google search is working",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.LoginDemoStepsPOM.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on google search page",
  "keyword": "And "
});
formatter.match({
  "location": "steps.GoogleSearchSteps.user_is_on_google_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});