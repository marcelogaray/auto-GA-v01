/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.role;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.SSIAResourceManager;

public class RoleCreate extends BasePage {

    @FindBy(name = "name")
    private WebElement nameInput;

    @FindBy(name = "description")
    private WebElement descriptionInput;

    @FindBy(id = "saveRoleBtn")
    private WebElement saveRoleButton;

    public RoleCreate() {
        CommonEvents.isVisible(nameInput);
    }

    public void fillRole() {
        fillName(SSIAResourceManager.i.getKey("Role.create.name"));
        fillDescription(SSIAResourceManager.i.getKey("Role.create.description"));
    }

    private void fillName(String name) {
        CommonEvents.setInputField(nameInput, name);
    }

    private void fillDescription(String description) {
        CommonEvents.setInputField(descriptionInput, description);
    }

    public RoleList clickSaveButton() {
        CommonEvents.clickButton(saveRoleButton);
        return new RoleList();
    }
}
