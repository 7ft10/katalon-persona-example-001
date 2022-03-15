Feature: Take Out New Motorcycle Commuter Policy
  As a Commuter 
  I want to purchase a new policy 
  So that I am insured any damage to my bike

  Scenario Outline: Simple purchase
    Given I have all my details handy
    And I have a new bike that is not currently insured
    When I apply to purchase my policy
    Then I should be able to pay for my new policy
    And ensure that my bike is covered for any damage

    Examples: 
      | Name | Age | Motorcycle Make | Motorcycle Model | Motorcycle Year |
      | Bob  |  21 | Harley Davidson | Iron 883         |            2016 |
