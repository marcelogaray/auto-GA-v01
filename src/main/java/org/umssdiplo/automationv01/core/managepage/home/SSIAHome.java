package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/**
 * @Author: Lizeth Salazar
 * This class will be used for everyone
 */

public class SSIAHome extends BasePage {

    @FindBy(id = "personnelMenu")
    private WebElement personnelMenu;

    @FindBy(id = "employeeMenu")
    private WebElement employeeMenu;

    public void clickOnPersonnelMenu(){
        CommonEvents.clickButton(personnelMenu);
    }

    public EmployeeList clickOnEmployeeMenu(){
        CommonEvents.clickButton(employeeMenu);
        return new EmployeeList();
    }

}
