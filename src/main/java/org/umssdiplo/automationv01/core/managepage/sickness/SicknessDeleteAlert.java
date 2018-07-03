/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.sickness;

import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SicknessDeleteAlert extends BasePage {

    private String sicknessDescription;

    public SicknessDeleteAlert(String sicknessDescription) {
        this.sicknessDescription = sicknessDescription;
        CommonEvents.waitForAlertVisible();
    }

    public String getSicknessDescription() {
        return sicknessDescription;
    }

    public SicknessList clickAcceptButton() {
        CommonEvents.clickAlertAcceptButton();
        try {
            //because, when alert popup is closed, old list page is in background, so sleep to refresh
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error in sleep thread..." + e);
        }
        return new SicknessList();
    }
}
