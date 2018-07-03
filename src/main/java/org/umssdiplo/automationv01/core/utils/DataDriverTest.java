/**
 * @author Miguel Rojas
 */
package org.umssdiplo.automationv01.core.utils;

import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataDriverTest {

    private static Logger LOGGER = Logger.getLogger(DataDriverTest.class.getName());

    private static final String BUNDLE = "SSIAResource";

    public static final DataDriverTest readValues = new DataDriverTest();

    private DataDriverTest() {
    }

    public String getValue(String key) {
        String value = "???" + key + "???";
        ResourceBundle resourceBundle = ResourceBundle.getBundle(BUNDLE);
        try {
            value = resourceBundle.getString(key);
        } catch (MissingResourceException e) {
            LOGGER.log(Level.INFO, "Not found value for key: " + key, e);
            return value;
        }
        return value;
    }

}


