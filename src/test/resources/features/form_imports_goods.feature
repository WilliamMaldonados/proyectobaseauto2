@tag
Feature: Declare to the Republic Bank an Import of Goods
  As a user
  I want to be able to declare to the Republic Bank my import of goods

  @DeclareImportsGoods
  Scenario Outline: Fill out the import form and formula 10 to generate the file that had to be sent to the Republic Bank
    Given that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDCF1
    When the user fills the form of import goods
    |F1_INPUT_AMOUNT|F1_INPUT_CURRENCY_AMOUNT_2|F1_TEXT_AREA|F1_IMPORTATION_NUMBER|F1_IMPORTATION_VALUE|
    |<F1_INPUT_AMOUNT>|<F1_INPUT_CURRENCY_AMOUNT_2>|<F1_TEXT_AREA>|<F1_IMPORTATION_NUMBER>|<F1_IMPORTATION_VALUE>|
    Then the user should see the operation registered for import goods
Examples:
  |F1_INPUT_AMOUNT|F1_INPUT_CURRENCY_AMOUNT_2|F1_TEXT_AREA|F1_IMPORTATION_NUMBER|F1_IMPORTATION_VALUE|
  |      120      |          50              |    prueba  |        130          |          130       |