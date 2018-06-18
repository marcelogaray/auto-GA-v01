/**
 * @author: Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.role;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.Constants;

public class RoleList extends BasePage {
    public static final String ROLE_LIST_PATH = Constants.SSIA_BASE_URL + "/roleList";

    public static void load() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(ROLE_LIST_PATH);
    }
}
