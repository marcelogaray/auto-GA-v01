package org.umssdiplo.automationv01.core.managepage.workItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

public class WorkItemCreate extends BasePage {

    @FindBy(name = "name")
    private WebElement nameInput;

    @FindBy(name = "description")
    private WebElement descriptionInput;

    @FindBy(id = "createItemBtn")
    private WebElement createItemBtn;

    public WorkItemCreate() {
        CommonEvents.isVisible(nameInput);
    }

    public void fillWorkItemUsingDataDriverTest() {
        fillName(DataDriverTest.readValues.getValue("WorkItem.create.name"));
        fillDescription(DataDriverTest.readValues.getValue("WorkItem.create.description"));
    }

    private void fillName(String name) {
        CommonEvents.setInputField(nameInput, name);
    }

    private void fillDescription(String description) {
        CommonEvents.setInputField(descriptionInput, description);
    }

    public WorkItemList clickSaveButton() {
        CommonEvents.clickButton(createItemBtn);
        return new WorkItemList();
    }
}
