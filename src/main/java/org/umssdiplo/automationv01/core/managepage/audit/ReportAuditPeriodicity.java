package org.umssdiplo.automationv01.core.managepage.audit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/**
 * @author Neyber Rojas Zapata
 */
public class ReportAuditPeriodicity extends BasePage {

    @FindBy(id = "ReportAuditSafetyTable")
    private WebElement reportAuditSafetyTable;

    public boolean isReportAuditPeriodicityPresent() {
        return CommonEvents.isPresent(reportAuditSafetyTable);
    }
}
