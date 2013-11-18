Feature: SeleniumTestGoogleSearch
	As a Google searcher
	If I search for a result in Google search page
	I should get search result
	
Scenario: Search page should return search result of selenium to the user	
	Given I am in Google home page
	When I type  selenium in search field and I click in search button
	Then I should get result selenium
	
