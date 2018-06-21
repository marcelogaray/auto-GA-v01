/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.utils;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class SSIAResourceManager {

    private static final String BUNDLE = "SSIAResource";

    public static final SSIAResourceManager i = new SSIAResourceManager();

    private SSIAResourceManager() {
    }

    public String getKey(String key) {
        String value = "???" + key + "???";
        ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE);
        try {
            value = resourceBundle.getString(key);
        } catch (MissingResourceException e) {
            return value;
        }
        return value;
    }
}
