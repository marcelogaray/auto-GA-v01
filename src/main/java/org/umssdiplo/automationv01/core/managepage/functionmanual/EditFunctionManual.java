package org.umssdiplo.automationv01.core.managepage.functionmanual;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class EditFunctionManual extends BasePage {

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

    @FindBy(id = "UpdateManual")
    private WebElement updateFunctionManualButton;

    public EditFunctionManual(){
        CommonEvents.isVisible(formTableFunctionManual);
    }

    public void fillupdateManualForm() {
        fillName("edit function manual");
        fillPosition("edit position");
        fillHirarchicalLevel("edit level");
        fillSuperiorBoss("edit boss");
        fillDependentPersonal("edit dependent personal");
        fillInternalRelation("all the administrators and HHRR");
        fillExternalRelation("edit External relations");
        fillGeneralActivity("edit general activity");
        fillPrincipalFunction("edit function");
        fillRoleFunctionManual("2");
    }

    private void fillName(String name) {
        CommonEvents.setInputField(nameFunctionManual, name);
    }

    private void fillPosition(String position) {
        CommonEvents.setInputField(positionFunctionManual, position);
    }

    private void fillHirarchicalLevel(String hierarchicalLevel) {
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
        CommonEvents.clickButton(updateFunctionManualButton);
        return new FunctionManual();
    }

}
