/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.sickness;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.DataDriverTest;

public class SicknessUpdate extends BasePage {

    @FindBy(name = "description")
    private WebElement descriptionInput;

    @FindBy(name = "whereOccurred")
    private WebElement whereOccurredInput;

    @FindBy(name = "totalDaysOutOfWork")
    private WebElement totalDaysOutOfWorkInput;

    @FindBy(name = "totalDaysRestrictedTransferredWork")
    private WebElement totalDaysRestrictedTransferredInput;

    @FindBy(name = "saCategoryId")
    private WebElement saCategorySelect;

    @FindBy(name = "saTypeId")
    private WebElement saTypeSelect;

    @FindBy(id = "updateBtn")
    private WebElement updateButton;

    public SicknessUpdate() {
        CommonEvents.isVisible(descriptionInput);
    }

    public void updateSicknessUsingDataDriverTest() {
        fillDescriptionInput(DataDriverTest.readValues.getValue("Sickness.update.description"));
        fillWhereOccurredInput(DataDriverTest.readValues.getValue("Sickness.update.whereOccurred"));
        fillTotalDaysOutOfWorkInput(DataDriverTest.readValues.getValue("Sickness.update.totalDaysOutOfWork"));
        fillTotalDaysRestrictedTransferredInput(DataDriverTest.readValues.getValue("Sickness.update.totalDaysRestrictedTransferred"));
        fillSaCategorySelect(DataDriverTest.readValues.getValue("Sickness.update.saCategory"));
        fillSaTypeSelect(DataDriverTest.readValues.getValue("Sickness.update.saType"));
    }

    private void fillDescriptionInput(String description) {
        CommonEvents.setInputField(descriptionInput, description);
    }

    private void fillWhereOccurredInput(String whereOccurred) {
        CommonEvents.setInputField(whereOccurredInput, whereOccurred);
    }

    private void fillTotalDaysOutOfWorkInput(String totalDaysOutOfWork) {
        CommonEvents.setInputField(totalDaysOutOfWorkInput, totalDaysOutOfWork);
    }

    private void fillTotalDaysRestrictedTransferredInput(String totalDaysRestrictedTransferred) {
        CommonEvents.setInputField(totalDaysRestrictedTransferredInput, totalDaysRestrictedTransferred);
    }

    private void fillSaCategorySelect(String saCategory) {
        CommonEvents.setSelectFieldByText(saCategorySelect, saCategory);
    }

    private void fillSaTypeSelect(String saType) {
        CommonEvents.setSelectFieldByText(saTypeSelect, saType);
    }

    public SicknessList clickUpdateButton() {
        CommonEvents.clickButton(updateButton);
        return new SicknessList();
    }
}
