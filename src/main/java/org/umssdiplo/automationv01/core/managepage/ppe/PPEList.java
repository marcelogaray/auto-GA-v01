/**
 * @author Walker Colina
 */
package org.umssdiplo.automationv01.core.managepage.ppe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class PPEList extends BasePage {

    @FindBy(id = "btnNewPpe")
    private WebElement newPPEButton;

    @FindBy(className = "container")
    private WebElement ppeContainer;

    public PPEList() {
        CommonEvents.isPresent(ppeContainer);
    }

    public boolean isPPEListPresent() {
        return CommonEvents.isPresent(newPPEButton);
    }
}
