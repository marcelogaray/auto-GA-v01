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

    @FindBy(name = "workItemClassificationId")
    private WebElement clasificationInput;

    @FindBy(id = "createItemBtn")
    private WebElement createItemBtn;

    public WorkItemCreate() {
        CommonEvents.isVisible(nameInput);
    }

    public void fillWorkItemUsingDataDriverTest() {
        fillName(DataDriverTest.readValues.getValue("WorkItem.create.name"));
        fillDescription(DataDriverTest.readValues.getValue("WorkItem.create.description"));
        fillClassification(DataDriverTest.readValues.getValue("WorkItem.create.classification"));
    }

    private void fillName(String name) {
        CommonEvents.setInputField(nameInput, name);
    }

    private void fillDescription(String description) {
        CommonEvents.setInputField(descriptionInput, description);
    }
    private void fillClassification(String workItemClassificationId) {
        CommonEvents.setInputField(clasificationInput, workItemClassificationId);
    }

    public ItemClassificationList clickSaveButton() {
        CommonEvents.clickButton(createItemBtn);
        return new ItemClassificationList();
    }
}
