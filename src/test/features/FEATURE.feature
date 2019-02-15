@dev
@test
Feature: test

  Background: Warunki wstępne
  Dupa
    Given Open http://executeautomation.com/demosite/Login.html page

  Scenario Outline: test!!!
  Opis scenariusza1
    When User sign in using login: <login> and password: <password>
    Examples:
      | login       | password  |
      | abrakadabra | 660099911 |
      | dupa        | dfsdfds   |

  Scenario: test2!!!
  Opis scenariusza2
    When User sign in using login: abrakadabra and password: 660099911
    Then Check if something