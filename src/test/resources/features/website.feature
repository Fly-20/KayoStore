@Regression
Feature:
    As a user
    I want to be able to add new clients in the system
    So that I can add accounting data for that client


    @scenario1
    Scenario Outline: : AddToCart journey homepage section1
        Given I open the kayo url and select the "<p>" option
        Examples:
            | p |
            | 1 |
            | 3 |
            | 4 |
