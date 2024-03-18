@tag
Feature: Declare to the Republic Bank an International Investments
  As a user
  I want to be able to declare to the Republic Bank my international investments
  with type of operation Initial

  @DeclareInternationalInvestmentsInitial
  Scenario Outline: Fill out the international investments forms and formula 10 to generate the file that had to be sent to the Republic Bank
    Given that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDCF
    When the user fills the form of international investments
      | F4_INPUT_PHONE|F4_INPUT_DOC|F4_INPUT_NAME|F4_INPUT_VALUE_COIN|F4_INPUT_VALUE_USD|F4_INPUT_CHANGE|F4_INPUT_PARTICIPANTS|
      |<F4_INPUT_PHONE>|<F4_INPUT_DOC>|<F4_INPUT_NAME>|<F4_INPUT_VALUE_COIN>|<F4_INPUT_VALUE_USD>|<F4_INPUT_CHANGE>|<F4_INPUT_PARTICIPANTS>|
    Then the user see then form is created successfully

    Examples:
      |F4_INPUT_PHONE |F4_INPUT_DOC|F4_INPUT_NAME|F4_INPUT_VALUE_COIN|F4_INPUT_VALUE_USD|F4_INPUT_CHANGE|F4_INPUT_PARTICIPANTS|
      |  3112435676   | 10336789543|    Pepiyo   |         250       |         240      |       150     |         10          |

