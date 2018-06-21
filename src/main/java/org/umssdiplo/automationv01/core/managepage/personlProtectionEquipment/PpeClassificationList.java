/**
 * @author Walker Colina
 */
package org.umssdiplo.automationv01.core.managepage.personlProtectionEquipment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class PpeClassificationList extends BasePage {

    @FindBy(id = "btnNewPpeClassification")
    private WebElement newPpeClassificationButton;

    public boolean isPpeClassificationListPresent() {
        return CommonEvents.isPresent(newPpeClassificationButton);
    }
}
