Feature: the user create a new account, search a item and add to cart, then the user go to cart
  and can see that the item added is the same that appear in the shopping cart

  Scenario: the user can create a new account, add a item and verify the item
    Given the user open the app Dafiti
    When the user create a new account
    |email            |password     |documentType |documentNumber |name       |lastName        |birthday   |gender   |
    |prueba@prueba.com|prueba123.,.,|CC           |12345678       |Juan Felipe|Monsalve Palacio|28/12/1985 |Masculino|
    And the user search "nike"
    And the user add a shoe to shopping cart
    Then the user can see the item added is the same in the shopping cart
