# @Author: Walker Colina
# feature to review behaviour of create ppe classification
Feature: PPEClassificationCreate

  Scenario: Clasificación de EPP - Registro - Después de registrar datos de una clasificación de equipo de protección personal, estos se despliegan en la lista de clasificación de equipo de protección personal
    Given 'SSI-A' home page is loaded
    And click 'PPE' menu on 'Header' page
    And click 'PPE Classification' sub menu of 'PPE' menu
    And click 'New PPE Classification' button of 'PPE Classification list' page
    And fill 'PPE Classification' form using Data Driver Test on create 'PPE Classification' page
    And click 'Save' button into create 'PPE Classification' form page
    Then created 'PPE Classification' is showed in 'PPE Classification list' page