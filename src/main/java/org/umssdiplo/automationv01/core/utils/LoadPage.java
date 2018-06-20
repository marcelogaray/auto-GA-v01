package org.umssdiplo.automationv01.core.utils;

import org.umssdiplo.automationv01.core.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.managepage.home.SSIAHome;

public final class LoadPage {
    public static SSIAHome SSIAHomePage() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getSsiaBaseUrl());
        return new SSIAHome();
    }
}
