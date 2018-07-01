package org.umssdiplo.automationv01.core.managepage.employee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/**
 * @Author: Lizeth Salazar
 */

public class EmployeeList extends BasePage {

    //Web Elements
    @FindBy(id = "NewEmployeeBtn")
    private WebElement newEmployeeButton;

    public EmployeeCreate clickNewEmployeeButton(){
        CommonEvents.clickButton(newEmployeeButton);
        return new EmployeeCreate();
    }

    public boolean isEmployeeListPresent(){
        return CommonEvents.isPresent(newEmployeeButton);
    }
}
