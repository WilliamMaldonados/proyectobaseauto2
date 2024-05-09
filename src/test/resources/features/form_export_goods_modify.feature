@tag
Feature: Declare to the Republic Bank an International Investments
  As a user
  I want to be able to declare to the Republic Bank my other operations
  with type of operation Modify

  @DeclareInternationalInvestmentsModify
  Scenario Outline: Fill out the other operations modify forms and formula 10 to generate the file that had to be sent to the Republic Bank
    Given that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDC for modify export goods
    When the user fills the form of export goods for operation modify
      |F2_INPUT_NUMBER_MOD |F2_INPUT_VALOR_COIN|F2_TEXT_AREA_OBSERVATION|F2_NUMBER_EXPORTATION|F2_INPUT_VALOR_INTEGER2|
      |<F2_INPUT_NUMBER_MOD>|<F2_INPUT_VALOR_COIN>|<F2_TEXT_AREA_OBSERVATION>|<F2_NUMBER_EXPORTATION>|<F2_INPUT_VALOR_INTEGER2>|
    Then the user see then form is created successfully in modify for export goods

    Examples:
      |F2_INPUT_NUMBER_MOD  |F2_INPUT_VALOR_COIN|F2_TEXT_AREA_OBSERVATION|F2_NUMBER_EXPORTATION|F2_INPUT_VALOR_INTEGER2|
      |         6951        |       212         |        Pruebamopdifyform2     |         250         |          212          |