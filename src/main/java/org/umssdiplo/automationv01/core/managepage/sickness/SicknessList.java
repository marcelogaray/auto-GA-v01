/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.sickness;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SicknessList extends BasePage {

    @FindBy(id = "newSicknessBtn")
    private WebElement newSicknessButton;

    public boolean isSicknessListPresent() {
        return CommonEvents.isPresent(newSicknessButton);
    }
}
