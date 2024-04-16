@tag
Feature: Declare to the Republic Bank form movements
  As a user
  I want to be able to declare to the Republic Bank my movements
  with type of operation Initial

  @DeclareFormMovements
  Scenario Outline: Fill out the  formulary 10 to generate the file that had to be sent to the Republic Bank
    Given that the user is logged into the application of Sucursal Virtual Empresas and Declarations Of Change HDC form movements
    When the user fills the form movements
     |INPUT_DOC|
     |<INPUT_DOC>|
    Then the user see then form movements is created successfully

    Examples:
      |     INPUT_DOC   |
      |     PRUEBA123   |