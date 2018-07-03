package org.umssdiplo.automationv01.core.managepage.functionmanual;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FunctionManual extends BasePage {

    @FindBy(id = "manualTable")
    private WebElement functionManual;

    @FindBy(id = "NewManual")
    private WebElement newManualButtonn;

    @FindBy(id="manualEditBtn")
    private WebElement editManualButton;

    @FindBy(xpath = "//table[@id='manualTable']/descendant::tr[last()]/descendant::button[contains(concat(' ', normalize-space(@class), ' '), ' deleteBtn ')]")
    private WebElement deleteManualButton;

    @FindBy(xpath = "//table[@id='manualTable']/descendant::tr[last()]/td[count(//table[@id='manualTable']/descendant::th[text()='id'])]")
    private WebElement lastManualName;

    public boolean isFunctionalManualTableDisplayed() {
        return CommonEvents.isVisible(functionManual);
    }

    public CreateFunctionManual clickNewManualButton(){
        CommonEvents.clickButton(newManualButtonn);
        return new CreateFunctionManual();
    }

    public EditFunctionManual clickEditManualButton(){
        CommonEvents.clickButton(editManualButton);
        return new EditFunctionManual();
    }

    public DeleteFunctionManual clickDeleteManualButton() {
        String manualName = getLastRoleNameInTable();
        CommonEvents.clickButton(deleteManualButton);
        return new DeleteFunctionManual(manualName);
    }

    public String getLastRoleNameInTable() {
        return lastManualName.getText();
    }
}