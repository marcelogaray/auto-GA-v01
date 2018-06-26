# @Author: Walker Colina
# feature to review behaviour of create ppe classification
Feature: PPEClassificationCreate

  Scenario: La inserción de registro Clasificación de equipo de protección personal se muestra en la lista de Clasificación de equipo de protección personal cuando presiono botón Save
    Given 'SSI-A' home page is loaded
    And Click 'PPE' menu on 'Header' page
    And Click 'PPE Classification' sub menu of 'PPE' menu
    And Click 'New PPE Classification' button of 'PPE Classification list' page
    And Fill 'PPE Classification' form using Data Driver Test on create 'PPE Classification' page
    And Click 'Cancel' button into create 'PPE Classification' form page
    Then Cancel creation 'PPE Classification' is not showed in PPE Classification list page
