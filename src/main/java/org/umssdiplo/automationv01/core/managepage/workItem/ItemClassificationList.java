package org.umssdiplo.automationv01.core.managepage.workItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class ItemClassificationList extends BasePage {

    @FindBy(id = "newItemClass")
    private WebElement newItemClass;

    public ItemClassificationList() {
        CommonEvents.isVisible(newItemClass);
    }

    public boolean isItemClassListPresent() {
        return CommonEvents.isPresent(newItemClass);
    }
    public ItemClassificationCreate clickNewCreateItemButton() {
        CommonEvents.clickButton(newItemClass);
        return new ItemClassificationCreate();
    }
}
