/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.role;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class RoleList extends BasePage {

    @FindBy(id = "newRoleBtn")
    private WebElement newRoleButton;

    @FindBy(xpath = "//*[@id='roleTable']/tbody/tr[last()]/td[1]")
    private WebElement lastRoleName;

    public boolean isRoleListPresent() {
        return CommonEvents.isPresent(newRoleButton);
    }

    public RoleCreate clickOnNewRoleButton() {
        CommonEvents.clickButton(newRoleButton);
        return new RoleCreate();
    }

    public String getLastRoleNameInTable() {
        return lastRoleName.getText();
    }
}
