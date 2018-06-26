/**
 * @author Walker Colina
 */
package org.umssdiplo.automationv01.core.managepage.ppe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class PPEAssignedList extends BasePage {

    @FindBy(id = "btnNewExistingPpeAssigned")
    private WebElement newExistingPpeAssignedButton;

    @FindBy(className = "container")
    private WebElement ppeContainer;

    public PPEAssignedList() {
        CommonEvents.isPresent(ppeContainer);
    }

    public boolean isPPEAssignedListPresent() {
        return CommonEvents.isPresent(newExistingPpeAssignedButton);
    }
}
