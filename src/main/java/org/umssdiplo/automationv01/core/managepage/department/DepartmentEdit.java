package org.umssdiplo.automationv01.core.managepage.department;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class DepartmentEdit extends BasePage {
    @FindBy(id = "UpdateDepartmentBtn")
    private WebElement updateBtn;

    @FindBy(id = "CancelDepartmentBtn")
    private WebElement cancelBtn;

    @FindBy(id = "nameInput")
    private WebElement nameTextBox;

    @FindBy(id = "descriptionInput")
    private WebElement descriptionTextBox;

    public DepartmentList clickUpdateDepartmentBtn(){
        CommonEvents.clickButton(updateBtn);
        return new DepartmentList();
    }

    public DepartmentList clickCancelDepartmentBtn(){
        CommonEvents.clickButton(cancelBtn);
        return new DepartmentList();
    }

    public void fillNameInput(String departmentName){
        CommonEvents.setInputField(nameTextBox, departmentName);
    }

    public void fillDescriptionInput(String departmentDescription){
        CommonEvents.setInputField(descriptionTextBox, departmentDescription);
    }
}
