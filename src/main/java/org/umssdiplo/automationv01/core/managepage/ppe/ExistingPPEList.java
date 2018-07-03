/**
 * @author Walker Colina
 */
package org.umssdiplo.automationv01.core.managepage.ppe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ExistingPPEList extends BasePage {

    @FindBy(id = "btnNewExistingPpe")
    private WebElement newExistingPpe;

    @FindBy(className = "container")
    private WebElement ppeContainer;

    public ExistingPPEList() {
        CommonEvents.isVisible(ppeContainer);
    }

    public boolean isExistingPPEListPresent() {
        return CommonEvents.isPresent(newExistingPpe);
    }
}
