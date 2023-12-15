Feature: Search by keyword

  @green
  Scenario: Searching for 'green'
    Given Sergey is researching things on the internet
    When he looks up "green"
    Then he should see information about "green"

  @red
  Scenario: Searching for 'red'
    Given Sergey is researching things on the internet
    When he looks up "red"
    Then he should see information about "red"


  @colors
  Scenario Outline: Searching for 'colors'
    Given Sergey is researching things on the internet
    When he looks up "<color>"
    Then he should see information about "<color>"

    Examples:
    |color|
    |blue |
    |yellow|
