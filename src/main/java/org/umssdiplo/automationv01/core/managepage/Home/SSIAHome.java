package org.umssdiplo.automationv01.core.managepage.Home;

import org.openqa.selenium.By;
import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.Constants;

/**
 * @Author: Lizeth Salazar
 * This class will be used for everyone
 */

public class SSIAHome extends BasePage {
    public static final String SSIA_HOME_PATH = Constants.SSIA_BASE_URL;

    public static void load() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(SSIA_HOME_PATH);
        ManageDriver.getInstance().getWebDriver().manage().window().maximize();
    }

    public static void clickOnPersonnelMenu(){
        ManageDriver.getInstance().getWebDriver().findElement(By.id("personnelMenu")).click();
    }

    public static void clickOnEmployeeMenu(){
        ManageDriver.getInstance().getWebDriver().findElement(By.id("employeeMenu")).click();
    }
}
