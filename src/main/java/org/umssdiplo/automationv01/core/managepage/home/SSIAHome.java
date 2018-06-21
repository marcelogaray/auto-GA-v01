package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.accident.AccidentList;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;
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

    @FindBy(id = "roleMenu")
    private WebElement roleMenu;

    @FindBy(id = "safetyHealthAdministrationId")
    private WebElement safetyMenu;

    @FindBy(id = "accidentMenu")
    private WebElement accidentMenu;

    public void clickOnPersonnelMenu(){
        CommonEvents.clickButton(personnelMenu);
    }

    public EmployeeList clickOnEmployeeMenu(){
        CommonEvents.clickButton(employeeMenu);
        return new EmployeeList();
    }

    public RoleList clickOnRoleMenu() {
        CommonEvents.clickButton(roleMenu);
        return new RoleList();
    }

    public void clickOnSafetyMenu() {
        CommonEvents.clickButton(safetyMenu);
    }

    public AccidentList clickOnAccidentMenu() {
        CommonEvents.clickButton(accidentMenu);
        return new AccidentList();
    }
}
