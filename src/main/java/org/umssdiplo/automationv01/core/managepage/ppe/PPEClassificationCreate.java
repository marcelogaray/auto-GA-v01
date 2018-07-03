/**
 * @author Walker Colina
 */
package org.umssdiplo.automationv01.core.managepage.ppe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

public class PPEClassificationCreate extends BasePage {

    @FindBy(className = "container")
    private WebElement ppeClassificationContainer;

    @FindBy(id = "txtPpeClassificationName")
    private WebElement nameTextInput;

    @FindBy(id = "txtPpeClassificationDescription")
    private WebElement descriptionTextInput;

    @FindBy(id = "btnPpeClassificationSave")
    private WebElement saveButton;

    @FindBy(id = "btnPpeClassificationCancel")
    private WebElement cancelButton;

    public PPEClassificationCreate() {
        CommonEvents.isVisible(saveButton);
    }

    public void fillPPEClassificationUsingDataDriverTest() {
        fillName(DataDriverTest.readValues.getValue("PPEClassification.create.name"));
        fillDescription(DataDriverTest.readValues.getValue("PPEClassification.create.description"));
    }

    public void fillPPEClassificationtoCancelUsingDataDriverTest() {
        fillName(DataDriverTest.readValues.getValue("PPEClassification.cancelCreate.name"));
        fillDescription(DataDriverTest.readValues.getValue("PPEClassification.cancelCreate.description"));
    }

    private void fillName(String name) {
        CommonEvents.setInputField(nameTextInput, name);
    }

    private void fillDescription(String description) {
        CommonEvents.setInputField(descriptionTextInput, description);
    }

    public PPEClassificationList clickSaveButton() {
        CommonEvents.clickButton(saveButton);
        return new PPEClassificationList();
    }

    public PPEClassificationList clickCancelButton() {
        CommonEvents.clickButton(cancelButton);
        return new PPEClassificationList();
    }
}