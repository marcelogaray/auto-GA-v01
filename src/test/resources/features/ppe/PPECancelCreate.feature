# @Author: Walker Colina
# feature to review behaviour of cancel create ppe
Feature: PPECancelCreate

  Scenario: La insercion de registro para un de equipo de proteccion personal no se muestra en la lista de de equipo de proteccion personal cuando presiono boton Cancel
    Given 'SSI-A' home page is loaded
    And Click 'PPE' menu on 'Header' page
    And Click 'PPE' sub menu of 'PPE' menu
    And Click 'New PPE' button of 'PPE list' page
    And Fill 'PPE' form using Data Driver Test on create 'PPE' page
    And Click 'Cancel' button into create 'PPE' form page
    Then Created 'PPE' is not showed in PPE list page
