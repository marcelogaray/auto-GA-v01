package org.umssdiplo.automationv01.core.managepage.functionmanual;

import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class DeleteFunctionManual extends BasePage {

    private String manualName;

    public  DeleteFunctionManual(String manualName){
        this.manualName = manualName;
        CommonEvents.waitForAlertVisible();
    }

    public String getManualName() {
        return manualName;
    }

    public FunctionManual clickAcceptManualButton() {
        CommonEvents.clickAlertAcceptButton();
        try {
            //because, when alert popup is closed, old list page is in background, so sleep to refresh
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error in sleep thread..." + e);
        }
        return new FunctionManual();
    }


}
