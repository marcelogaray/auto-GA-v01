/**
 * @author Walker Colina
 */
package org.umssdiplo.automationv01.core.managepage.ppe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

public class PPECreate extends BasePage {

    @FindBy(className = "container")
    private WebElement ppeContainer;

    @FindBy(id = "txtPpeName")
    private WebElement nameTextInput;

    @FindBy(id = "txtPpeDescription")
    private WebElement descriptionTextInput;

    @FindBy(id = "btnPpeSave")
    private WebElement saveButton;

    public PPECreate() {
        CommonEvents.isPresent(saveButton);
    }

    public void fillPPEUsingDataDriverTest() {
        fillName(DataDriverTest.readValues.getValue("PPE.create.name"));
        fillDescription(DataDriverTest.readValues.getValue("PPE.create.description"));
    }

    private void fillName(String name) {
        CommonEvents.setInputField(nameTextInput, name);
    }

    private void fillDescription(String description) {
        CommonEvents.setInputField(descriptionTextInput, description);
    }

    public PPEList clickSaveButton() {
        CommonEvents.clickButton(saveButton);
        return new PPEList();
    }
}
