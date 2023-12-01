@Hugo
Feature: Golang service

  Scenario: Verify the title of the page created with Golang
    Given I visit Golang webpage
    When I read the title of the page
    Then I verify the title of the page is "This site was created with Golang"
