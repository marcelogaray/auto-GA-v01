package org.umssdiplo.automationv01.core.managepage.workItem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class WorkItemList extends BasePage {

    @FindBy(id = "newWorkBtn")
    private WebElement newWorkButton;

    @FindBy(xpath = "//table[@id='ppeTable']/descendant::tr[last()]/td[count(//table[@id='ppeTable']/descendant::th[text()='Name'])]")
    private WebElement lastWorkItemName;

    @FindBy(xpath = "//table[@id='ppeTable']/descendant::tr[last()]/descendant::button[contains(concat(' ', normalize-space(@class), ' '), ' deleteBtn ')]")
    private WebElement deleteButton;

    @FindBy(xpath = "//table[@id='ppeTable']/descendant::tr[last()]/td[count(//table[@id='ppeTable']/descendant::th[text()='Name'])]")
    private WebElement lastRoleName;


    public WorkItemList() {
        CommonEvents.isVisible(newWorkButton);
    }

    public boolean isWorkItemListPresent() {
        return CommonEvents.isPresent(newWorkButton);
    }

    public WorkItemCreate clickNewCreateItemButton() {
        CommonEvents.clickButton(newWorkButton);
        return new WorkItemCreate();
    }
    public WorkItemDelete clickDeleteButton() {
        String workItemName = getLastWorkItemNameInTable();
        CommonEvents.clickButton(deleteButton);
        return new WorkItemDelete(workItemName);
    }


    public String getLastWorkItemNameInTable() {
        return lastWorkItemName.getText();
    }


}
