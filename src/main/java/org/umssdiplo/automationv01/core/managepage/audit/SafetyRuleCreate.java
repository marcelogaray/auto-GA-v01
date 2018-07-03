package org.umssdiplo.automationv01.core.managepage.audit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

/**
 * @author Neyber Rojas Zapata
 */
public class SafetyRuleCreate extends BasePage {

    @FindBy(name = "policyCode")
    private WebElement policyCodeInput;

    @FindBy(name = "policyName")
    private WebElement policyNameSelectOption;

    @FindBy(name = "complianceParameter")
    private WebElement complianceParameterSelectOption;

    @FindBy(name = "complianceMetric")
    private WebElement complianceMetricInput;

    @FindBy(name = "auditId")
    private WebElement auditSelectOption;

    @FindBy(id = "saveSafetyRuleButton")
    private WebElement saveSafetyRuleButton;

    public SafetyRuleCreate() {
        CommonEvents.isVisible(policyCodeInput);
    }

    public void fillSafetyRuleFromResourceUsingDataDriverTest() {
        fillPolicyCode(DataDriverTest.readValues.getValue("SafetyRule.create.policyCode"));
        selectOptionPolicyName();
        selectOptionComplianceParameter();
        fillComplianceMetric(DataDriverTest.readValues.getValue("SafetyRule.create.complianceMetric"));
        selectOptionAudit();
    }

    private void fillPolicyCode(String policyCode) {
        CommonEvents.setInputField(policyCodeInput, policyCode);
    }

    private void selectOptionPolicyName() {
        Select selectPolicyName = new Select(policyNameSelectOption);
        selectPolicyName.selectByIndex(1);
    }

    private void selectOptionComplianceParameter() {
        Select selectComplianceParameter = new Select(complianceParameterSelectOption);
        selectComplianceParameter.selectByIndex(1);
    }

    private void fillComplianceMetric(String complianceMetric) {
        CommonEvents.setInputField(complianceMetricInput, complianceMetric);
    }

    private void selectOptionAudit() {
        Select selectAudit = new Select(auditSelectOption);
        selectAudit.selectByIndex(1);
    }

    public SafetyRulesList clickSaveButton() {
        CommonEvents.clickButton(saveSafetyRuleButton);
        return new SafetyRulesList();
    }
}
