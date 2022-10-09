package com.selenium_automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
* Get configuration properties values
*/
public class GetConfigProp {

    //path of configuration.properties
    private final static String ConfigProp_path= ".\\src\\test\\resources\\configuration.properties";
    
    //Get configuration properties values
    public static String getConfigPropData(String value) 
    {
        String data = null;

        //Properties object
        Properties prop = new Properties();
        
        //FileInputStream for get data
        FileInputStream fis;

        try 
        {
            //passing path of configuration.properties
            fis = new FileInputStream(ConfigProp_path);
            prop.load(fis);
            //store configuration.properties value in data variable
            data = prop.getProperty(value);

            //close connection
            fis.close();

        }catch(IOException e)
        {
            e.printStackTrace();
        }
        
        //return configuration.properties data
        return data;
    }
}
