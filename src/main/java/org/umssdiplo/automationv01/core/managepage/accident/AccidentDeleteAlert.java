package org.umssdiplo.automationv01.core.managepage.accident;

import org.umssdiplo.automationv01.core.utils.CommonEvents;

/*
Created on 30/6/18
@author: HENRYBC
*/
public class AccidentDeleteAlert {

    private String accidentDescription;

    public AccidentDeleteAlert(String accidentDescription) {
        this.accidentDescription = accidentDescription;
        CommonEvents.waitForAlertVisible();
    }

    public String getAccidentDescription() {
        return accidentDescription;
    }

    public AccidentList clickAcceptButton() {
        CommonEvents.clickAlertAcceptButton();
        try {
            //because, when alert popup is closed, old list page is in background, so sleep to refresh
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error in sleep thread..." + e);
        }
        return new AccidentList();
    }
}
