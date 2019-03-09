Feature: Buying tennis by car
  Scenario Outline: Price on the main page should match with the price on the pop up
    Given the Adidas web side is loaded
    When click over “Hombre” option on 'Header' section
    Then verify that new options sections is present on 'Header' section as popup
    And verity that the list of elements on the subsection "Tenis" are displayed on popup
    And click over 'Search Bar' field on 'Header' section as popup
    When look for "<Tenis Name>" search bar field on 'Header' section as popup
    Then the "<Tenis Name>" title is displayed on 'Custom Product' page
    And expand list of 'Tallas' on 'Custom Product' page
    And select "<Size>" on 'Custom Product' page
    When getting the 'Price' of "<Tenis Name>" displayed on 'Custom Product' page
    When click 'Add to Car' button on 'Custom Product' page
    Then verify the "¡Añadido al carrito correctamente!" title message should be displayed on 'Custom Product' page as popup
    And verity that the Price of "<Tenis Name>" on the main page should match with the price on the pop up
    And verify the "<Size>" is according to selected on 'Custom Product' page

    Examples:
      | Tenis Name                   | Size |
      | Tenis SoleCourt Boost Parley | MX 7.5|