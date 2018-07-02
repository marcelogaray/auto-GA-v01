/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.role;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

public class RoleUpdate extends BasePage {

    @FindBy(name = "name")
    private WebElement nameInput;

    @FindBy(name = "description")
    private WebElement descriptionInput;

    @FindBy(id = "updateRoleBtn")
    private WebElement updateRoleButton;

    public RoleUpdate() {
        CommonEvents.isVisible(nameInput);
    }

    public void updateRoleUsingDataDriverTest() {
        setName(DataDriverTest.readValues.getValue("Role.update.name"));
        setDescription(DataDriverTest.readValues.getValue("Role.update.description"));
    }

    private void setName(String name) {
        CommonEvents.setInputField(nameInput, name);
    }

    private void setDescription(String description) {
        CommonEvents.setInputField(descriptionInput, description);
    }

    public RoleList clickUpdateButton() {
        CommonEvents.clickButton(updateRoleButton);
        return new RoleList();
    }
}
