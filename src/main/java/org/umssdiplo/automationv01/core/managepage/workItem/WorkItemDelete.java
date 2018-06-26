package org.umssdiplo.automationv01.core.managepage.workItem;

import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class WorkItemDelete extends BasePage {

    private String workItemName;

    public WorkItemDelete(String workItemName) {
        this.workItemName = workItemName;
        CommonEvents.waitForAlertVisible();
    }

    public String getRoleName() {
        return workItemName;
    }

    public WorkItemList clickAcceptButton() {
        CommonEvents.clickAlertAcceptButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error in sleep thread..." + e);
        }
        return new WorkItemList();
    }
}
