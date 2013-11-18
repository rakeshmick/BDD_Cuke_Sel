$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestMe.feature");
formatter.feature({
  "id": "seleniumtestgooglesearch",
  "description": "As a Google searcher\r\nIf I search for a result in Google search page\r\nI should get search result",
  "name": "SeleniumTestGoogleSearch",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 14562178740,
  "status": "passed"
});
formatter.scenario({
  "id": "seleniumtestgooglesearch;search-page-should-return-search-result-of-selenium-to-the-user",
  "description": "",
  "name": "Search page should return search result of selenium to the user",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "I am in Google home page",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I type  selenium in search field and I click in search button",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I should get result selenium",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "GoogleSearchSteps.I_am_in_Google_home_page()"
});
formatter.result({
  "duration": 43501057712,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.I_type_selenium_in_search_field_and_I_click_in_search_button()"
});
formatter.result({
  "duration": 1451907688,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSearchSteps.I_should_get_result_selenium()"
});
formatter.result({
  "duration": 1804979842,
  "status": "passed"
});
formatter.after({
  "duration": 461269271,
  "status": "passed"
});
});