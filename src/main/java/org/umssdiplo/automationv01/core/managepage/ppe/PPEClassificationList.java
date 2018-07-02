/**
 * @author Walker Colina
 */
package org.umssdiplo.automationv01.core.managepage.ppe;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class PPEClassificationList extends BasePage {

    @FindBy(id = "btnNewPpeClassification")
    private WebElement newPPEClassificationButton;

    @FindBy(className = "container")
    private WebElement ppeClassificationContainer;

    @FindBy(xpath = "//table[@id='tblPpeClassification']/descendant::tr[last()]/td[count(//table[@id='tblPpeClassification']/descendant::th[text()='Name'])]")
    private WebElement lastPPEClassificationName;

    public PPEClassificationList() {
        CommonEvents.isVisible(ppeClassificationContainer);
    }

    public boolean isPPEClassificationListPresent() {
        return CommonEvents.isPresent(newPPEClassificationButton);
    }

    public PPEClassificationCreate clickNewPPEClassification() {
        CommonEvents.clickButton(newPPEClassificationButton);
        return new PPEClassificationCreate();
    }

    public String getLastPPEClassificationNameInTable() {
        return CommonEvents.getTextContent(lastPPEClassificationName);
    }
}