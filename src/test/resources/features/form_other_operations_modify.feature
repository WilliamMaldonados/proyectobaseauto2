@tag
Feature: Declare to the Republic Bank an International Investments
  As a user
  I want to be able to declare to the Republic Bank my other operations
  with type of operation Modify

  @DeclareInternationalInvestmentsModify
  Scenario Outline: Fill out the other operations modify forms and formula 10 to generate the file that had to be sent to the Republic Bank
    Given that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDC for modify other operations
    When the user fills the form of other operations for operation modify
      |F5_INPUT_NUMBER_MOD|F5_INPUT_COIN|F5_INPUT_VALUE_USD2|F5_INPUT_OBSERVATIONS|
      | <F5_INPUT_NUMBER_MOD>|<F5_INPUT_COIN>|<F5_INPUT_VALUE_USD2>|<F5_INPUT_OBSERVATIONS>|
    Then the user see then form is created successfully in modify for other operations

    Examples:
      |F5_INPUT_NUMBER_MOD|F5_INPUT_COIN|F5_INPUT_VALUE_USD2|F5_INPUT_OBSERVATIONS|
      |      6838       |        0.01  |           125     |     modificacion    |