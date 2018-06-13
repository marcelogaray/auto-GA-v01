package org.umssdiplo.automationv01.core.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyAccessor {
    private static PropertyAccessor PropertyAccessor;
    private Properties properties;

    private PropertyAccessor(){
        try(FileInputStream fileInputStream = new FileInputStream("gradle.properties")) {
            properties = new Properties();
            properties.load(fileInputStream);
        }catch (FileNotFoundException fe){
            throw new RuntimeException(fe);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static PropertyAccessor getInstance(){
        if(PropertyAccessor == null){
            PropertyAccessor = new PropertyAccessor();
        }
        return PropertyAccessor;
    }
}
