@smoke
Feature: Follow Us Links

  Scenario: user opens facebook link
    Given Facebook Link
    And Verify FB Link

  Scenario: user opens twitter link
    Given Twitter Link
    And Verify Twitter Link

  Scenario: user opens rss link
    Given RSS Link
    And Verify RSS Link

  Scenario: user opens youtube link
    Given Youtube Link
    And Verify Youtube Link