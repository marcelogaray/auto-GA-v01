package org.umssdiplo.automationv01.core.managepage.employee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

/**
 * @Author: Lizeth Salazar
 */
public class EmployeeCreate extends BasePage {

    @FindBy(id = "SaveEmployeeBtn")
    private WebElement saveBtn;

    public EmployeeCreate(){
        CommonEvents.isVisible(saveBtn);
    }

    public void clickSaveEmployeeBtn(){
        CommonEvents.clickButton(saveBtn);
    }

    public String isRequiredErrorDisplayed(){
        return CommonEvents.getTextFromWindowsAlert();
    }

    public void clickOKInAlert(){
        CommonEvents.clickOKInWindowsAlert();
    }
}
