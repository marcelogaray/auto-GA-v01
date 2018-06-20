package org.umssdiplo.automationv01.core.managepage.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.Constants;

/**
 * @Author: Lizeth Salazar
 * This class will be used for everyone
 */

public class SSIAHome extends BasePage {
    public static final String SSIA_HOME_PATH = Constants.SSIA_BASE_URL;

    // Web Elements
    @FindBy(id = "personnelMenu")
    private WebElement personnelMenu;

    @FindBy(id = "employeeMenu")
    private WebElement employeeMenu;

    public static void load() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(SSIA_HOME_PATH);
        ManageDriver.getInstance().getWebDriver().manage().window().maximize();
    }

    public static void clickOnPersonnelMenu(){
        CommonEvents.clickButton((new SSIAHome()).getPersonnelMenu());
    }

    public static void clickOnEmployeeMenu(){
        CommonEvents.clickButton((new SSIAHome()).getEmployeeMenu());
    }

    public WebElement getPersonnelMenu() {
        return personnelMenu;
    }

    public WebElement getEmployeeMenu() {
        return employeeMenu;
    }
}
