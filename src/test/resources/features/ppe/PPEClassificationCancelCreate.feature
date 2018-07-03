# @Author: Walker Colina
# feature to review behaviour of cancel create ppe classification
Feature: PPEClassificationCancelCreate

  Scenario: Clasificación de EPP - Registro - Después de cancelar el registro de una clasificación de equipo de protección personal, estos datos no se muestran en la lista de clasificación de equipo de protección personal
    Given 'SSI-A' home page is loaded
    And click 'PPE' menu on 'Header' page
    And click 'PPE Classification' sub menu of 'PPE' menu
    And click 'New PPE Classification' button of 'PPE Classification list' page
    And fill 'PPE Classification' form using Data Driver Test on cancel create 'PPE Classification' page
    And click 'Cancel' button into create 'PPE Classification' form page
    Then cancel creation 'PPE Classification' is not showed in PPE Classification list page
