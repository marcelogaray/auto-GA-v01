package org.umssdiplo.automationv01.core.managepage.functionmanual;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class FunctionManual extends BasePage {

    @FindBy(id = "manualTable")
    private WebElement functionManual;


    public boolean searchFunctionManualTable() {
        return CommonEvents.isPresent(functionManual);
    }
}
