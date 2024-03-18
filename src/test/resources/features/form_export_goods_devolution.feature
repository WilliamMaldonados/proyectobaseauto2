@tag
Feature: Declare to the Republic Bank an export goods
  As a user
  I want to be able to declare to the Republic Bank my international investments
  with type of operation devolution

  @DeclareInternationalInvestmentsInitial
  Scenario Outline: Fill out the other operations forms and formula 10 for devolution to generate the file that had to be sent to the Republic Bank
    Given that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDC exportfor devolution
    When the user fills the form of export goods for devolution
      |F2_INPUT_VALOR_COIN|F2_TEXT_AREA_OBSERVATION|F2_NUMBER_EXPORTATION|F2_INPUT_VALOR_INTEGER2|
      |<F2_INPUT_VALOR_COIN>|<F2_TEXT_AREA_OBSERVATION>|<F2_NUMBER_EXPORTATION>|<F2_INPUT_VALOR_INTEGER2>|
    Then the user see then form op is created successfully for devolution of export goods

    Examples:
      |F2_INPUT_VALOR_COIN|F2_TEXT_AREA_OBSERVATION|F2_NUMBER_EXPORTATION|F2_INPUT_VALOR_INTEGER2|
      |       212         |        Pruebadevoluvionform2     |         250         |          212          |