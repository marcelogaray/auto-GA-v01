# @Author: Walker Colina
# feature to review behaviour of create ppe classification
Feature: PPECreate

  Scenario: La insercion de registro para un de equipo de proteccion personal se muestra en la lista de de equipo de proteccion personal cuando presiono boton Save
    Given 'SSI-A' home page is loaded
    And Click 'PPE' menu on 'Header' page
    And Click 'PPE' sub menu of 'PPE' menu
    And Click 'New PPE' button of 'PPE list' page
    And Fill 'PPE' form using Data Driver Test on create 'PPE' page
    And Click 'Save' button into create 'PPE' form page
    Then Created 'PPE' is showed in PPE list page
