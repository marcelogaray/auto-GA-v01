# @Author: Linet Torrico
# Feature: Registro de Clasificacion de Herramientas

Feature: Registro de Clasificacion de Herramientas de trabajo
  Scenario: Clasificación de herramienta de trabajo - Después de registrar datos de una clasificación de  de herramienta de trabajo, estos se despliegan en la lista de clasificación de herramientas de trabajo
    Given 'SSI-A' home page is loaded
    And click Work Items 'menu' on 'Header' page
    And click 'Item Classification' sub menu on 'Work Items' menu
    And click in button 'New Work Item Classification' of Item Classification list page
    And fill 'Item Classification' in Classification form page
    And click in button 'Save' into create Item Classification form page
    Then 'Item Classification List' page loads correctly