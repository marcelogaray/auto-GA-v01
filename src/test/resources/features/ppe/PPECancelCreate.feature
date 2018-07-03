# @Author: Walker Colina
# feature to review behaviour of cancel create ppe
Feature: PPECancelCreate

  Scenario: EPP - Registro - Después de cancelar el registro de un de equipo de protección personal, estos datos no se muestran en la lista de equipo de protección personal
    Given 'SSI-A' home page is loaded
    And click 'PPE' menu on 'Header' page
    And click 'PPE' sub menu of 'PPE' menu
    And click 'New PPE' for cancel button of 'PPE list' page
    And fill 'PPE' form using Data Driver Test on cancel create 'PPE' page
    And click 'Cancel' button into create 'PPE' form page
    Then created 'PPE' is not showed in PPE list page
