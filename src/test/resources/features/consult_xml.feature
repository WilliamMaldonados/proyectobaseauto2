@tag
Feature: Declare to the Republic Bank form movements
  As a user
  I want to be able to consult to the  my movements
  in th xml

  @DeclareFormMovements
  Scenario Outline: Fill out the  formulary 10 to generate the file and cosult the xlm to sent to republic bank
    Given that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDC form movements for xml
    When the user fills the information for consult xml
      |INPUT_DOC|
      |<INPUT_DOC>|
    Then the user see then xml is created successfully

    Examples:
      |     INPUT_DOC   |
      |     Prueba12334     |