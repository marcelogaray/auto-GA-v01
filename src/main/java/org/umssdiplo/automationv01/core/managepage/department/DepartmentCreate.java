package org.umssdiplo.automationv01.core.managepage.department;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/**
 * @Author: Lizeth Salazar
 */
public class DepartmentCreate extends BasePage {

    @FindBy(id = "SaveDepartmentBtn")
    private WebElement saveBtn;

    @FindBy(id = "CancelDepartmentBtn")
    private WebElement cancelBtn;

    @FindBy(id = "nameInput")
    private WebElement nameTextBox;

    @FindBy(id = "descriptionInput")
    private WebElement descriptionTextBox;

    public DepartmentList clickSaveDepartmentBtn(){
        CommonEvents.clickButton(saveBtn);
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
