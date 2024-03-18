@tag
Feature: Declare to the Republic Bank an exceptions
  As a user
  I want to be able to declare to the Republic Bank my form exceptions
  with type of operation initial

  @DeclareExceptions
  Scenario Outline: Fill out the exceptions forms and formulary 10 to generate the file that had to be sent to the Republic Bank
    Given that the user is logged into the application HDCF
    When the user fills the form exceptions
      |F3a_INPUT_NUMBER|F3a_NUMBER_LENDING_INPUT|F3a_CREDITOR_NAME_INPUT|F3a_INPUT_COIN_NEGOTIATION|F3a_INPUT_COIN_VALOR|F3a_NAME_INPUT|F3a_IDENTITY_INPUT|F3a_ADDRESS|F3a_TELEPHONE|F3a_EMAIL|
      |<F3a_INPUT_NUMBER>|<F3a_NUMBER_LENDING_INPUT>|<F3a_CREDITOR_NAME_INPUT>|<F3a_INPUT_COIN_NEGOTIATION>|<F3a_INPUT_COIN_VALOR>|<F3a_NAME_INPUT>|<F3a_IDENTITY_INPUT>|<F3a_ADDRESS>| <F3a_TELEPHONE>| <F3a_EMAIL>|
    Then the user should see the form created

    Examples:
      |F3a_INPUT_NUMBER|F3a_NUMBER_LENDING_INPUT|F3a_CREDITOR_NAME_INPUT|F3a_INPUT_COIN_NEGOTIATION|F3a_INPUT_COIN_VALOR|F3a_NAME_INPUT|F3a_IDENTITY_INPUT|F3a_ADDRESS|F3a_TELEPHONE|F3a_EMAIL|
      |       125323219     |     12345678911       |       Javier         |            150          |        150        |    Pepito   |     1033770898   |Calle 78 bis # 90-15 |   7645897  |prueba@gmail.com|