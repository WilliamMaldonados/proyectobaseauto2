@tag
Feature: Declare to the Republic Bank an Import of Goods
  As a user
  I want to be able to declare to the Republic Bank my import of goods with type of operation Modify

  @DeclareImportsGoods
  Scenario Outline: Fill out the import form and formula 10 to generate the file that had to be sent to the Republic Bank type of operation modify
    Given that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDCF1 with type of operation Modify
    When the user fills the form of import goods with type of operation Modify
      |F1_INPUT_NUMBER_MOD|F1_INPUT_AMOUNT|F1_INPUT_CURRENCY_AMOUNT_2|F1_INPUT_AMOUNT_2|F1_TEXT_AREA|F1_IMPORTATION_NUMBER|F1_IMPORTATION_VALUE|
      |<F1_INPUT_NUMBER_MOD> |<F1_INPUT_AMOUNT>|<F1_INPUT_CURRENCY_AMOUNT_2>|<F1_INPUT_AMOUNT_2>|<F1_TEXT_AREA>|<F1_IMPORTATION_NUMBER>|<F1_IMPORTATION_VALUE>|
    Then the user should see the operation registered for import goods with type of operation Modify
    Examples:
      |F1_INPUT_NUMBER_MOD  |F1_INPUT_AMOUNT|F1_INPUT_CURRENCY_AMOUNT_2|F1_INPUT_AMOUNT_2|F1_TEXT_AREA|F1_IMPORTATION_NUMBER|F1_IMPORTATION_VALUE|
      |         6827   |      140      |          170              |        170       |    pruebamodifynew  |        150          |          150       |