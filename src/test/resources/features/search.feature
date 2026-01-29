Feature: Search page test-cases.

  Scenario: Verify nothing search
    Given User opens Home page
    When User use search "Java"
    Then Verify that nothing found
    And Verify please check
