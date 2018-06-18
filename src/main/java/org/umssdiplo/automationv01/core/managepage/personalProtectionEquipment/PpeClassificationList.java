/**
 * @author: Walker Colina
 */
package org.umssdiplo.automationv01.core.managepage.personalProtectionEquipment;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.Constants;

public class PpeClassificationList extends BasePage {
    public static final String PPECLASSIFICATION_LIST_PATH = Constants.SSIA_BASE_URL + "/ppeClassificationList";

    public static void load() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PPECLASSIFICATION_LIST_PATH);
    }
}