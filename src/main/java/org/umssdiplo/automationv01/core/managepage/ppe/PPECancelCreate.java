/**
 * @author Walker Colina
 */
package org.umssdiplo.automationv01.core.managepage.ppe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

public class PPECancelCreate extends BasePage {

    @FindBy(className = "container")
    private WebElement ppeContainer;

    @FindBy(id = "txtPpeName")
    private WebElement nameTextInput;

    @FindBy(id = "txtPpeDescription")
    private WebElement descriptionTextInput;

    @FindBy(id = "cbxPpeClassification")
    private WebElement ppeClassificationSelectOption;

    @FindBy(id = "btnPpeSave")
    private WebElement saveButton;

    @FindBy(id = "btnPpeCancel")
    private WebElement cancelButton;

    public PPECancelCreate() {
        CommonEvents.isPresent(saveButton);
    }

    public void fillPPEUsingDataDriverTest() {
        fillName(DataDriverTest.readValues.getValue("PPE.create.name"));
        fillDescription(DataDriverTest.readValues.getValue("PPE.create.description"));
        selectOptionPPEClassification();
    }

    private void fillName(String name) {
        CommonEvents.setInputField(nameTextInput, name);
    }

    private void fillDescription(String description) {
        CommonEvents.setInputField(descriptionTextInput, description);
    }

    private void selectOptionPPEClassification() {
        Select selectPolicyName = new Select(ppeClassificationSelectOption);
        selectPolicyName.selectByIndex(1);
    }

    public PPEList clickSaveButton() {
        CommonEvents.clickButton(saveButton);
        return new PPEList();
    }

    public PPEList clickCancelButton() {
        CommonEvents.clickButton(cancelButton);
        return new PPEList();
    }
}
