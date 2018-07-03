package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.audit.AuditList;
import org.umssdiplo.automationv01.core.managepage.audit.ReportAuditPeriodicity;
import org.umssdiplo.automationv01.core.managepage.audit.SafetyRulesList;
import org.umssdiplo.automationv01.core.managepage.department.DepartmentList;
import org.umssdiplo.automationv01.core.managepage.employee.EmployeeList;
import org.umssdiplo.automationv01.core.managepage.functionmanual.FunctionManual;
import org.umssdiplo.automationv01.core.managepage.menuheader.safetyMenu.SafetyMenu;
import org.umssdiplo.automationv01.core.managepage.menuheader.workItemsMenu.ItemClassificationMenu;
import org.umssdiplo.automationv01.core.managepage.ppe.PPEAssignedList;
import org.umssdiplo.automationv01.core.managepage.role.RoleList;
import org.umssdiplo.automationv01.core.managepage.menuheader.workItemsMenu.WorkItemsMenu;
import org.umssdiplo.automationv01.core.managepage.ppe.ExistingPPEList;
import org.umssdiplo.automationv01.core.managepage.ppe.PPEClassificationList;
import org.umssdiplo.automationv01.core.managepage.ppe.PPEList;
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

    @FindBy(id = "departmentMenu")
    private WebElement departmentMenu;

    @FindBy(id = "roleMenu")
    private WebElement roleMenu;

    @FindBy(id = "auditsMenu")
    private WebElement auditsMenu;

    @FindBy(id = "auditMenu")
    private WebElement auditMenu;

    @FindBy(id = "safetyHealthAdministrationId")
    private WebElement safetyMenu;

    @FindBy(id = "workItemMenu")
    private WebElement workItemMenu;

    @FindBy(id = "workItemSubMenu")
    private WebElement workItemSubMenu;

    @FindBy(id = "manualMenu")
    private WebElement manualMenu;

    @FindBy(id = "contenedor")
    private WebElement ssiaHomeContainer;

    @FindBy(id = "newItemClass")
    private WebElement newItemClass;

    @FindBy(id = "reportAuditMenu")
    private WebElement reportAuditMenu;

    @FindBy(id = "safetyRuleMenu")
    private WebElement safetyRulesMenu;

    @FindBy(id = "ppeClassificationSubMenu")
    private WebElement ppeClassificationSubMenu;

    @FindBy(id = "ppeSubMenu")
    private WebElement ppeSubMenu;

    @FindBy(id = "existingPpeSubMenu")
    private WebElement existingPpeSubMenu;

    @FindBy(id = "existingPpeAssignedSubMenu")
    private WebElement existingPpeAssignedSubMenu;

    public void clickPersonnelMenu() {
        CommonEvents.clickButton(personnelMenu);
    }

    public void clickPPEMenu() {
        CommonEvents.clickButton(ppeMenu);
    }

    public EmployeeList clickEmployeeMenu() {
        CommonEvents.clickButton(employeeMenu);
        return new EmployeeList();
    }

    public DepartmentList clickDepartmentMenu() {
        CommonEvents.clickButton(departmentMenu);
        return new DepartmentList();
    }

    public RoleList clickRoleMenu() {
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

    public WorkItemsMenu clickWorkItemsMenu() {
        CommonEvents.clickButton(workItemMenu);
        return new WorkItemsMenu();
    }

    public SSIAHome() {
        CommonEvents.isVisible(ssiaHomeContainer);
    }

    public FunctionManual clickManualMenu() {
        CommonEvents.clickButton(manualMenu);
        return new FunctionManual();
    }

    public ItemClassificationMenu clickItemClassMenu() {
        CommonEvents.clickButton(workItemMenu);
        CommonEvents.clickButton(newItemClass);
        return new ItemClassificationMenu();
    }

    public ReportAuditPeriodicity clickReportAuditPeriodicityMenu() {
        CommonEvents.clickButton(auditsMenu);
        CommonEvents.clickButton(reportAuditMenu);
        return new ReportAuditPeriodicity();
    }

    public SafetyRulesList clickSafetyRulesMenu() {
        CommonEvents.clickButton(auditsMenu);
        CommonEvents.clickButton(safetyRulesMenu);
        return new SafetyRulesList();

    }

    public PPEClassificationList clickPPEClassificationSubMenu() {
        CommonEvents.clickButton(ppeClassificationSubMenu);
        return new PPEClassificationList();
    }

    public PPEList clickPPESubMenu() {
        CommonEvents.clickButton(ppeSubMenu);
        return new PPEList();
    }

    public ExistingPPEList clickExistingPpeSubMenu() {
        CommonEvents.clickButton(existingPpeSubMenu);
        return new ExistingPPEList();
    }

    public PPEAssignedList clickExistingPPEAssignedSubMenu() {
        CommonEvents.clickButton(existingPpeAssignedSubMenu);
        return new PPEAssignedList();
    }
}
