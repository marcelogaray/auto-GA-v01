/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.sickness;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class SicknessList extends BasePage {

    @FindBy(id = "newSicknessBtn")
    private WebElement newSicknessButton;

    @FindBy(xpath = "//table[@id='sicknessTable']/descendant::tr[last()]/td[count(//table[@id='sicknessTable']/descendant::th[text()='description']/preceding-sibling::th)+1]")
    private WebElement lastSicknessDescription;

    public boolean isSicknessListPresent() {
        return CommonEvents.isPresent(newSicknessButton);
    }

    public SicknessCreate clickNewSicknessButton() {
        CommonEvents.clickButton(newSicknessButton);
        return new SicknessCreate();
    }

    public String getLastSicknessDescriptionInTable() {
        return CommonEvents.getTextContent(lastSicknessDescription);
    }
}
