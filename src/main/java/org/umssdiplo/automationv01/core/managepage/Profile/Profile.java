package org.umssdiplo.automationv01.core.managepage.Profile;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.PropertyAccessor;

public class Profile extends BasePage {

    @FindBy(xpath = "/html/body/div[2]/aside/div/div[2]/div/div[1]/div/a")
    //(xpath="/html/body/div/form[1]/button")
    private WebElement profileField;

    public void clickProfile() {
        CommonEvents.clickButton(profileField);
        System.out.println("el valor de mi xpath es"+profileField);
    }
}
