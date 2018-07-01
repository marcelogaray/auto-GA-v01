package org.umssdiplo.automationv01.core.managepage.audit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/**
 * @author Neyber Rojas Zapata
 */
public class AuditList extends BasePage {

    // Web Elements
    @FindBy(id = "NewAuditBtn")
    private WebElement newAuditButton;

    public boolean isAuditListPresent() {
        return CommonEvents.isPresent(newAuditButton);
    }

    public AuditCreate clickNewAuditButton() {
        CommonEvents.clickButton(newAuditButton);
        return new AuditCreate();
    }
}
