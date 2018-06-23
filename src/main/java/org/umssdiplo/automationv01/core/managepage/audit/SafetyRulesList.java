package org.umssdiplo.automationv01.core.managepage.audit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/**
 * @author Neyber Rojas Zapata
 */
public class SafetyRulesList extends BasePage {

    @FindBy(id = "AssignSafetyRuleBtn")
    private WebElement assignSafetyRuleBtn;

    public boolean isSafetyRulesListPresent() {
        return CommonEvents.isPresent(assignSafetyRuleBtn);
    }
}
