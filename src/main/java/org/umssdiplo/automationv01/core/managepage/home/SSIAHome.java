package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.managepage.personlProtectionEquipment.PpeClassificationList;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/**
 * @Author: Lizeth Salazar
 * This class will be used for everyone
 */

public class SSIAHome extends BasePage {

    @FindBy(id = "personnelMenu")
    private WebElement personnelMenu;

    @FindBy(id = "ppeMenu")
    private WebElement ppeMenu;

    @FindBy(id = "employeeMenu")
    private WebElement employeeMenu;

    @FindBy(id = "roleMenu")
    private WebElement roleMenu;

    @FindBy(id = "ppeClassificationSubMenu")
    private WebElement ppeClassificationSubMenu;

    public void clickOnPersonnelMenu(){
        CommonEvents.clickButton(personnelMenu);
    }

    public void clickOnPpeMenu(){
        CommonEvents.clickButton(ppeMenu);
    }

    public EmployeeList clickOnEmployeeMenu(){
        CommonEvents.clickButton(employeeMenu);
        return new EmployeeList();
    }

    public RoleList clickOnRoleMenu() {
        CommonEvents.clickButton(roleMenu);
        return new RoleList();
    }

    public PpeClassificationList clickOnPpeClassificationSubMenu() {
        CommonEvents.clickButton(ppeClassificationSubMenu);
        return new PpeClassificationList();
    }
}
