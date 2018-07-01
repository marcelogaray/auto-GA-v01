/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.role;

import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RoleDeleteAlert extends BasePage {

    private String roleName;

    public RoleDeleteAlert(String roleName) {
        this.roleName = roleName;
        CommonEvents.waitForAlertVisible();
    }

    public String getRoleName() {
        return roleName;
    }

    public RoleList clickAcceptButton() {
        CommonEvents.clickAlertAcceptButton();
        try {
            //because, when alert popup is closed, old list page is in background, so sleep to refresh
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error in sleep thread..." + e);
        }
        return new RoleList();
    }
}
