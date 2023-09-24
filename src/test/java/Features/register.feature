Feature:Register
  @register
  Scenario:As a user,I should able to register  successfully
    Given I am on HomePage
  When I click on user button "Login to your account" icon
    Then click on create account
    When I enter all registration details
    Then I should able to register successfully

