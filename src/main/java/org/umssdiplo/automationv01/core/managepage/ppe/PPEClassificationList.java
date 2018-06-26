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

    @FindBy (className = "container")
    private WebElement ppeClassificationContainer;

    public PPEClassificationList(){
        CommonEvents.isPresent(ppeClassificationContainer);
    }

    public boolean isPPEClassificationListPresent() {
        return CommonEvents.isPresent(newPPEClassificationButton);
    }
}
