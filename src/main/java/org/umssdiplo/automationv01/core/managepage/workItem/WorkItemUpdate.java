package org.umssdiplo.automationv01.core.managepage.workItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

public class WorkItemUpdate extends BasePage {

    @FindBy(name = "name")
    private WebElement nameInput;

    @FindBy(name = "description")
    private WebElement descriptionInput;

    @FindBy(id = "updateBtn")
    private WebElement updateWorkItemButton;

    @FindBy(id = "saCategoryListFieldId")
    private WebElement saCategoryListField;

    public WorkItemUpdate() {
        CommonEvents.isVisible(nameInput);
    }

    public void updateWorkItemUsingDataDriverTest() {

        setName(DataDriverTest.readValues.getValue("WorkItem.update.name"));
        setDescription(DataDriverTest.readValues.getValue("WorkItem.update.description"));
        CommonEvents.selectOptionFieldByValue(saCategoryListField, "3");
    }

    private void setName(String name) {
        CommonEvents.setInputField(nameInput, name);
    }

    private void setDescription(String description) {
        CommonEvents.setInputField(descriptionInput, description);
    }

    public WorkItemList clickUpdateButton() {
        CommonEvents.clickButton(updateWorkItemButton);
        return new WorkItemList();
    }


}