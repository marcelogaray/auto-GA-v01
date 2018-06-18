package org.umssdiplo.automationv01.core.managepage.workItem;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.Constants;

/**
 * @author Neyber Rojas Zapata
 */
public class WorkItemList extends BasePage {

    public static final String WORKITEM_LIST_PATH = Constants.SSIA_BASE_URL + "/workItemList";

    public static void load() {
        ManageDriver.getInstance().getWebDriver().navigate().to(WORKITEM_LIST_PATH);
    }
}
