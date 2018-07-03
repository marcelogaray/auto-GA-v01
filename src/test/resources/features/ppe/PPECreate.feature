# @Author: Walker Colina
# feature to review behaviour of create ppe classification
Feature: PPECreate

  Scenario: EPP - Registro - Después de registrar datos de un equipo de protección personal, estos se despliegan en la lista de equipo de protección personal
    Given 'SSI-A' home page is loaded
    And click 'PPE' menu on 'Header' page
    And click 'PPE' sub menu of 'PPE' menu
    And click 'New PPE' button of 'PPE list' page
    And fill 'PPE' form using Data Driver Test on create 'PPE' page
    And click 'Save' button into create 'PPE' form page
    Then created 'PPE' is showed in PPE list page