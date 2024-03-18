@tag
Feature: Declare to the Republic Bank an Export of Goods
  As a user
  I want to be able to declare to the Republic Bank my export of goods
  with type of operation Initial

  @DeclareExportsGoods
  Scenario Outline: Fill out the export forms and formula 10 to generate the file that had to be sent to the Republic Bank
    Given that the user is logged into the application HDC
    When the user fills the form of export goods
      |F2_INPUT_VALOR_COIN|F2_TEXT_AREA_OBSERVATION|F2_NUMBER_EXPORTATION|F2_INPUT_VALOR_INTEGER2|
      |<F2_INPUT_VALOR_COIN>|<F2_TEXT_AREA_OBSERVATION>|<F2_NUMBER_EXPORTATION>|<F2_INPUT_VALOR_INTEGER2>|
    Then the user should see the operation registered


    Examples:
      |F2_INPUT_VALOR_COIN|F2_TEXT_AREA_OBSERVATION|F2_NUMBER_EXPORTATION|F2_INPUT_VALOR_INTEGER2|
      |       212         |        Pruebaform2     |         250         |          212          |