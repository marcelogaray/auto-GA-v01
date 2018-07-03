package org.umssdiplo.automationv01.core.managepage.functionmanual;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class CreateFunctionManual extends BasePage {

    @FindBy(id = "form-functionManual")
    private WebElement formTableFunctionManual;

    @FindBy(name = "name")
    private WebElement nameFunctionManual;

    @FindBy(name = "position")
    private WebElement positionFunctionManual;

    @FindBy(name = "hierarchicalLever")
    private WebElement hierarchicalLevelFunctionManual;

    @FindBy(name = "superiorBoss")
    private WebElement superiorBossFunctionManual;

    @FindBy(name = "dependentPersonal")
    private WebElement dependentPersonalFunctionManual;

    @FindBy(name = "internalRelation")

    private WebElement internalRelationFunctionManual;

    @FindBy(name = "externalRelation")
    private WebElement externalRelationFunctionManual;

    @FindBy(name = "generalActivity")
    private WebElement generalActivityFunctionManual;

    @FindBy(name = "principalFunction")
    private WebElement principalFunctionFunctionManual;

    @FindBy(name = "roleFunction")
    private WebElement roleFunctionManual;

    @FindBy(id = "SaveManual")
    private WebElement saveFunctionManualButton;

    public CreateFunctionManual() {
        CommonEvents.isVisible(formTableFunctionManual);
    }

    public void fillNewManualForm() {
        fillName("test function manual");
        fillPosition("test position");
        fillHierarchicalLevel("new level");
        fillSuperiorBoss("administrator boss");
        fillDependentPersonal("test dependent personal");
        fillInternalRelation("all the administrators and HHRR");
        fillExternalRelation("test External relations");
        fillGeneralActivity("test general activity");
        fillPrincipalFunction("new function");
        fillRoleFunctionManual("1");
    }

    private void fillName(String name) {
        CommonEvents.setInputField(nameFunctionManual, name);
    }

    private void fillPosition(String position) {
        CommonEvents.setInputField(positionFunctionManual, position);
    }

    private void fillHierarchicalLevel(String hierarchicalLevel) {
        CommonEvents.setInputField(hierarchicalLevelFunctionManual, hierarchicalLevel);
    }

    private void fillSuperiorBoss(String superiorBoss) {
        CommonEvents.setInputField(superiorBossFunctionManual, superiorBoss);
    }

    private void fillDependentPersonal(String dependentPersonal) {
        CommonEvents.setInputField(dependentPersonalFunctionManual, dependentPersonal);
    }

    private void fillInternalRelation(String internalRelation) {
        CommonEvents.setInputField(internalRelationFunctionManual, internalRelation);
    }

    private void fillExternalRelation(String externalRelation) {
        CommonEvents.setInputField(externalRelationFunctionManual, externalRelation);
    }

    private void fillGeneralActivity(String generalActivity) {
        CommonEvents.setInputField(generalActivityFunctionManual, generalActivity);
    }

    private void fillPrincipalFunction(String principalFunction) {
        CommonEvents.setInputField(principalFunctionFunctionManual, principalFunction);
    }

    private void fillRoleFunctionManual(String roleId) {
        CommonEvents.selectOptionFieldByValue(roleFunctionManual, roleId);
    }

    public FunctionManual clickSaveManualButton() {
        CommonEvents.clickButton(saveFunctionManualButton);
        return new FunctionManual();
    }
}
