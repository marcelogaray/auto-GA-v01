/**
 * @author Walker Colina
 */
package org.umssdiplo.automationv01.core.managepage.ppe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class PPEList extends BasePage {

    @FindBy(id = "btnNewPpe")
    private WebElement newPPEButton;

    @FindBy(className = "container")
    private WebElement ppeContainer;

    @FindBy(xpath = "//table[@id='tblPpe']/descendant::tr[last()]/td[count(//table[@id='tblPpe']/descendant::th[text()='Name'])]")
    private WebElement lastPPEName;

    public PPEList() {
        CommonEvents.isVisible(ppeContainer);
    }

    public boolean isPPEListPresent() {
        return CommonEvents.isPresent(newPPEButton);
    }

    public PPECreate clickNewPPE() {
        CommonEvents.clickButton(newPPEButton);
        return new PPECreate();
    }

    public PPECancelCreate clickNewPPE(){
        CommonEvents.clickButton(newPPEButton);
        return new PPECancelCreate();
    }

    public String getLastPPENameInTable() {
        return CommonEvents.getTextContent(lastPPEName);
    }
}
