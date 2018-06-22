/**
 * @author Linet Torrico
 */
package org.umssdiplo.automationv01.core.managepage.workItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class WorkItemList extends BasePage {

    @FindBy(id = "newWorkBtn")
    private WebElement newWorkButton;

    public WorkItemList(WebElement newWorkButton) {
        this.newWorkButton = newWorkButton;
    }

    public boolean isWorkItemListPresent() {
        return CommonEvents.isPresent(newWorkButton);
    }
}
