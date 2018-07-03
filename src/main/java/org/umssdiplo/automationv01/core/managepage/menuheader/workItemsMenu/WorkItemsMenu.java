package org.umssdiplo.automationv01.core.managepage.menuheader.workItemsMenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.workItem.ItemClassificationList;
import org.umssdiplo.automationv01.core.managepage.workItem.WorkItemList;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class WorkItemsMenu extends BasePage {

    @FindBy(id = "workItemMenu")
    private WebElement workItemMenu;

    public WorkItemList clickWorkItemtMenu() {
        CommonEvents.clickButton(workItemMenu);
        return new WorkItemList();
    }
    @FindBy(id = "workItemClassificationMenu")
    private WebElement workItemClassificationMenu;

    public ItemClassificationList clickItemClassificationtMenu() {
        CommonEvents.clickButton(workItemClassificationMenu);
        return new ItemClassificationList();
    }

}
