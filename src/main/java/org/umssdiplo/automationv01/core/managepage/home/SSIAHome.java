package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.audit.AuditList;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.managepage.menuheader.safetyMenu.SafetyMenu;
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

    @FindBy(id = "auditsMenu")
    private WebElement auditsMenu;

    @FindBy(id = "auditMenu")
    private WebElement auditMenu;

    @FindBy(id = "safetyHealthAdministrationId")
    private WebElement safetyMenu;

    public void clickOnPersonnelMenu() {
        CommonEvents.clickButton(personnelMenu);
    }

    public EmployeeList clickOnEmployeeMenu() {
        CommonEvents.clickButton(employeeMenu);
        return new EmployeeList();
    }

    public RoleList clickOnRoleMenu() {
        CommonEvents.clickButton(roleMenu);
        return new RoleList();
    }

    public AuditList clickAuditMenu() {
        CommonEvents.clickButton(auditsMenu);
        CommonEvents.clickButton(auditMenu);
        return new AuditList();
    }

    public SafetyMenu clickSafetyMenu() {
        CommonEvents.clickButton(safetyMenu);
        return new SafetyMenu();
    }
}
