package org.umssdiplo.automationv01.core.managepage.workItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class WorkItemsMenu extends BasePage {

    @FindBy(id = "workItemMenu")
    private WebElement workItemMenu;

    public WorkItemList clickAccidentMenu() {
        CommonEvents.clickButton(workItemMenu);
        return new WorkItemList();
    }

}
