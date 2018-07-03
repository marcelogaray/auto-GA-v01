package org.umssdiplo.automationv01.core.managepage.menuheader.workItemsMenu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.workItem.ItemClassificationList;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ItemClassificationMenu extends BasePage {

    @FindBy(id = "workItemClassificationMenu")
    private WebElement workItemClassificationMenu;

    public ItemClassificationList clickItemClassificationtMenu() {
        CommonEvents.clickButton(workItemClassificationMenu);
        return new ItemClassificationList();
    }



}
