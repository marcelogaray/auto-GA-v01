package org.umssdiplo.automationv01.core.managepage.department;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/**
 * @Author: Lizeth Salazar
 */

public class DepartmentList extends BasePage {

    @FindBy(id = "NewDeparmentBtn")
    private WebElement newDepartmentButton;

    @FindBy(xpath = "//table//tbody//tr[last()]//td//button[@id='editDepartmentBtn']")
    private WebElement editDepartmentButton;

    @FindBy(id = "deleteDeparmentBtn")
    private WebElement deleteDepartmentButton;

    public DepartmentCreate clickNewDepartmentButton(){
        CommonEvents.clickButton(newDepartmentButton);
        return new DepartmentCreate();
    }

    public boolean isDepartmentListPresent(){
        return CommonEvents.isPresent(newDepartmentButton);
    }

    public boolean isDepartmentNamePresent(String departmentName){
        return CommonEvents.isTextPresent(departmentName);
    }

    public DepartmentEdit clickEditDepartmentButton(){
        CommonEvents.clickButton(editDepartmentButton);
        return new DepartmentEdit();
    }
}
