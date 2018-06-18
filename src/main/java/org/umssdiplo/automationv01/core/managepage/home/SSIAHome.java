/**
 * @author: Miguel Rojas
 */
package org.umssdiplo.automationv01.core.managepage.home;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.Constants;

public class SSIAHome extends BasePage {
    public static final String HOME_PATH = Constants.SSIA_BASE_URL;

    public static void load() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(HOME_PATH);
    }
}
