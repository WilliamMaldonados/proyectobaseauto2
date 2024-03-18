@tag
Feature: Declare to the Republic Bank an other operations
  As a user
  I want to be able to declare to the Republic Bank my international investments
  with type of operation Initial

  @DeclareInternationalInvestmentsInitial
  Scenario Outline: Fill out the other operations forms and formula 10 to generate the file that had to be sent to the Republic Bank
    Given that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDC other operations
    When the user fills the form of other operations
      |F5_INPUT_COIN|F5_INPUT_VALUE_USD2|F5_INPUT_OBSERVATIONS|
      |<F5_INPUT_COIN>|<F5_INPUT_VALUE_USD2>|<F5_INPUT_OBSERVATIONS>|
    Then the user see then form op is created successfully

    Examples:
      |F5_INPUT_COIN|F5_INPUT_VALUE_USD2|F5_INPUT_OBSERVATIONS|
      |     0.01    |        125  |         Pruebaf5    |