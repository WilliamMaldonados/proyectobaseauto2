@tag
Feature: Declare to the Republic Bank an External Indebtedness
  As a user
  I want to be able to declare to the Republic Bank my external indebtedness
  with type of operation mopdify

  @DeclareExternalIndebtedness
  Scenario Outline: Fill out the external indebtedness forms and formula 10 to generate the file that had to be sent to the Republic Bank
    Given that the user is logged into the application Of HDC for modyfy f3
    When the user fills the form of external indebtedness for modify
      |  F3_INPUT_NUMBER_MOD|  F3_NUMBER_LOAN_ENDORSEMENT|  F3_INPUT_NAME_CREDITOR| F3_INPUT_COIN_NEGOTIATION | F3_INPUT_COIN_HIRING | F3_INPUT_NAME_F3  | F3_INPUT_ID_F3  |
      |  <F3_INPUT_NUMBER_MOD> |<F3_NUMBER_LOAN_ENDORSEMENT>|<F3_INPUT_NAME_CREDITOR>|<F3_INPUT_COIN_NEGOTIATION>|<F3_INPUT_COIN_HIRING>| <F3_INPUT_NAME_F3>| <F3_INPUT_ID_F3>|
    Then the form is created successfully for modify



    Examples:
      | F3_INPUT_NUMBER_MOD|F3_NUMBER_LOAN_ENDORSEMENT|F3_INPUT_NAME_CREDITOR|F3_INPUT_COIN_NEGOTIATION|F3_INPUT_COIN_HIRING| F3_INPUT_NAME_F3  | F3_INPUT_ID_F3  |
      |       68632        |      1223prueba     |           pepito     |              150        |        150         |     PruebaAutomod    |    103365447865   |