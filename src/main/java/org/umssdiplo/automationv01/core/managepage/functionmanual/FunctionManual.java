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


    public boolean isFuntionalManualtableDisplayed() {
        return CommonEvents.isPresent(functionManual);
    }

    public CreateFunctionManual clickNewManualButton(){
        CommonEvents.clickButton(newManualButtonn);
        return new CreateFunctionManual();
    }

    public EditFunctionManual clickEditManualButton(){
        CommonEvents.clickButton(editManualButton);
        return new EditFunctionManual();
    }
}